package parabitccasbharat;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.util.concurrent.Exchanger;

import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.WindowConstants;


public class QrCapture<T> extends JDialog implements Closeable {

    private static final long serialVersionUID = 1L;

    private QrCapture(JDialog jDialog) {
        super(jDialog ,true);
        addEverything();
    }

    private QrCapture(JFrame jFrame) {
        super(jFrame ,true);
        addEverything();
    }

    private Webcam webcam = null;
    private BufferedImage image = null;
    private Result result = null;

    private void addEverything() {
        this.setLayout(new BorderLayout());
        this.setSize(600, 400);
        this.setTitle("Capture");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        this.addWindowListener(new WindowAdapter() {

                @Override
                public void windowClosing(WindowEvent e) {
                        close();
                }
        });
        
        webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.QVGA.getSize());
        webcam.open();
        
        this.add(new WebcamPanel(webcam),BorderLayout.CENTER);
        
        final Thread daemon = new Thread(() -> {
            while (isVisible()) {
                read();
            }
        });
        
        daemon.setDaemon(true);
        daemon.start();
        
        setLocationRelativeTo(null);
    }

    public static<E> QrCapture getInstance(E parent){
        if(parent instanceof JFrame){
            return new QrCapture((JFrame)parent);
        }else{
            return new QrCapture((JDialog)parent);
        }
    }

    private static BinaryBitmap toBinaryBitmap(BufferedImage image) {
            return new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(image)));
    }

    private void read() {

            if (!webcam.isOpen()) {
                    return;
            }
            if ((image = webcam.getImage()) == null) {
                    return;
            }

            try {
                    result = new MultiFormatReader().decode(toBinaryBitmap(image));
            } catch (NotFoundException e) {
                    return; // fall thru, it means there is no QR code in image
            }

            if (result != null) {
                result.getText();
                webcam.close();
                dispose();
            }
    }

    public String getResult() throws InterruptedException {
        if(result == null){
            return null;
        }
        return result.getText();
    }
    
    @Override
    public void close() {
        webcam.close();
        System.out.println("closing");
        System.out.println("close");
    }
}
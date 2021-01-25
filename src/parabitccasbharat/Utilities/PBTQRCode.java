
package parabitccasbharat.Utilities;

import Models.PBTAadhar;
import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import parabitccasbharat.QrCapture;

public class PBTQRCode {
    String valueFromQr = null;
    QrCapture frame;
    private Exchanger<String> exchanger;

    public PBTQRCode() {
        this.exchanger = new Exchanger<String>();
        frame = QrCapture.getInstance(null);
        frame.setVisible(true);
    }
    
    public void StartWebCam() throws InterruptedException {
        final Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    try{
                        valueFromQr = frame.getResult();
                        System.out.println(valueFromQr);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                };
        });
        thread.start();
        thread.join();
    }
    
    public static void main(String[] args){
        PBTQRCode pbtqrCode = new PBTQRCode();
        pbtqrCode.getAadhar();
    }
    
    public PBTAadhar getAadhar(){
        try {
            this.StartWebCam();
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
        String uid,name,gender,dateofbirth,careof,building,street,landmark,vtcame,popname,distname,subdistname,statename,pincode;
        uid = getValues("uid");
        name = getValues("name");
        gender = getValues("gender");
        dateofbirth = getValues("dateofbirth");
        careof = getValues("careof");
        building = getValues("building");
        street = getValues("street");
        landmark = getValues("landmark");
        vtcame = getValues("vtcame");
        popname = getValues("popname");
        distname = getValues("distname");
        subdistname = getValues("subdistname");
        statename = getValues("statename");
        pincode = getValues("pincode");
        return new PBTAadhar(uid, name, gender, dateofbirth, careof, building, street, landmark, vtcame, popname, distname, subdistname, statename, pincode);
    }
    
    private String getValues(String valueOf){
        Pattern pattern = Pattern.compile(valueOf + "=\"(.[^\"]*)\"");
        Matcher matcher = pattern.matcher(valueFromQr);
        if(matcher.find()){
            System.out.println(matcher.group(1));
            return matcher.group(1);
        }
        return null;
    }
}

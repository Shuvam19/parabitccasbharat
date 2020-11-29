/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingSummary;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "pbtemployeetable2", catalog = "parabitccasbharat", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pbtemployeetable2.findAll", query = "SELECT p FROM Pbtemployeetable2 p")
    , @NamedQuery(name = "Pbtemployeetable2.findBySNo", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.sNo = :sNo")
    , @NamedQuery(name = "Pbtemployeetable2.findByCeid", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.ceid = :ceid")
    , @NamedQuery(name = "Pbtemployeetable2.findByCRepEmpID", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.cRepEmpID = :cRepEmpID")
    , @NamedQuery(name = "Pbtemployeetable2.findByGeid", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.geid = :geid")
    , @NamedQuery(name = "Pbtemployeetable2.findByEmpANo", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.empANo = :empANo")
    , @NamedQuery(name = "Pbtemployeetable2.findByEmpName", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.empName = :empName")
    , @NamedQuery(name = "Pbtemployeetable2.findByGrade", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.grade = :grade")
    , @NamedQuery(name = "Pbtemployeetable2.findByEmpDesig", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.empDesig = :empDesig")
    , @NamedQuery(name = "Pbtemployeetable2.findByEmpMob", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.empMob = :empMob")
    , @NamedQuery(name = "Pbtemployeetable2.findByEmpOffMob", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.empOffMob = :empOffMob")
    , @NamedQuery(name = "Pbtemployeetable2.findByEmail", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.email = :email")
    , @NamedQuery(name = "Pbtemployeetable2.findByUserID", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.userID = :userID")
    , @NamedQuery(name = "Pbtemployeetable2.findByPass", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.pass = :pass")
    , @NamedQuery(name = "Pbtemployeetable2.findByPin", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.pin = :pin")
    , @NamedQuery(name = "Pbtemployeetable2.findByAreaCity", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.areaCity = :areaCity")
    , @NamedQuery(name = "Pbtemployeetable2.findByAreaDist", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.areaDist = :areaDist")
    , @NamedQuery(name = "Pbtemployeetable2.findByAreaState", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.areaState = :areaState")
    , @NamedQuery(name = "Pbtemployeetable2.findByControlCentreNo", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.controlCentreNo = :controlCentreNo")
    , @NamedQuery(name = "Pbtemployeetable2.findByComputerNo", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.computerNo = :computerNo")
    , @NamedQuery(name = "Pbtemployeetable2.findByOtp", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.otp = :otp")
    , @NamedQuery(name = "Pbtemployeetable2.findByNote", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.note = :note")
    , @NamedQuery(name = "Pbtemployeetable2.findByPerCommt", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.perCommt = :perCommt")
    , @NamedQuery(name = "Pbtemployeetable2.findByStatus", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.status = :status")
    , @NamedQuery(name = "Pbtemployeetable2.findByPreference", query = "SELECT p FROM Pbtemployeetable2 p WHERE p.preference = :preference")})
public class Pbtemployeetable2 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SNo")
    private Integer sNo;
    @Column(name = "CEID")
    private String ceid;
    @Column(name = "CRepEmpID")
    private String cRepEmpID;
    @Column(name = "GEID")
    private String geid;
    @Column(name = "EmpANo")
    private String empANo;
    @Column(name = "EmpName")
    private String empName;
    @Column(name = "Grade")
    private Integer grade;
    @Column(name = "EmpDesig")
    private String empDesig;
    @Column(name = "EmpMob")
    private String empMob;
    @Column(name = "EmpOffMob")
    private String empOffMob;
    @Column(name = "Email")
    private String email;
    @Column(name = "UserID")
    private String userID;
    @Column(name = "Pass")
    private String pass;
    @Column(name = "PIN")
    private String pin;
    @Column(name = "AreaCity")
    private String areaCity;
    @Column(name = "AreaDist")
    private String areaDist;
    @Column(name = "AreaState")
    private String areaState;
    @Column(name = "ControlCentreNo")
    private String controlCentreNo;
    @Column(name = "ComputerNo")
    private String computerNo;
    @Lob
    @Column(name = "EmpPhoto")
    private byte[] empPhoto;
    @Column(name = "Otp")
    private String otp;
    @Column(name = "Note")
    private String note;
    @Column(name = "PerCommt")
    private String perCommt;
    @Column(name = "Status")
    private String status;
    @Column(name = "Preference")
    private String preference;

    public Pbtemployeetable2() {
    }

    public Pbtemployeetable2(Integer sNo) {
        this.sNo = sNo;
    }

    public Integer getSNo() {
        return sNo;
    }

    public void setSNo(Integer sNo) {
        Integer oldSNo = this.sNo;
        this.sNo = sNo;
        changeSupport.firePropertyChange("SNo", oldSNo, sNo);
    }

    public String getCeid() {
        return ceid;
    }

    public void setCeid(String ceid) {
        String oldCeid = this.ceid;
        this.ceid = ceid;
        changeSupport.firePropertyChange("ceid", oldCeid, ceid);
    }

    public String getCRepEmpID() {
        return cRepEmpID;
    }

    public void setCRepEmpID(String cRepEmpID) {
        String oldCRepEmpID = this.cRepEmpID;
        this.cRepEmpID = cRepEmpID;
        changeSupport.firePropertyChange("CRepEmpID", oldCRepEmpID, cRepEmpID);
    }

    public String getGeid() {
        return geid;
    }

    public void setGeid(String geid) {
        String oldGeid = this.geid;
        this.geid = geid;
        changeSupport.firePropertyChange("geid", oldGeid, geid);
    }

    public String getEmpANo() {
        return empANo;
    }

    public void setEmpANo(String empANo) {
        String oldEmpANo = this.empANo;
        this.empANo = empANo;
        changeSupport.firePropertyChange("empANo", oldEmpANo, empANo);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        String oldEmpName = this.empName;
        this.empName = empName;
        changeSupport.firePropertyChange("empName", oldEmpName, empName);
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        Integer oldGrade = this.grade;
        this.grade = grade;
        changeSupport.firePropertyChange("grade", oldGrade, grade);
    }

    public String getEmpDesig() {
        return empDesig;
    }

    public void setEmpDesig(String empDesig) {
        String oldEmpDesig = this.empDesig;
        this.empDesig = empDesig;
        changeSupport.firePropertyChange("empDesig", oldEmpDesig, empDesig);
    }

    public String getEmpMob() {
        return empMob;
    }

    public void setEmpMob(String empMob) {
        String oldEmpMob = this.empMob;
        this.empMob = empMob;
        changeSupport.firePropertyChange("empMob", oldEmpMob, empMob);
    }

    public String getEmpOffMob() {
        return empOffMob;
    }

    public void setEmpOffMob(String empOffMob) {
        String oldEmpOffMob = this.empOffMob;
        this.empOffMob = empOffMob;
        changeSupport.firePropertyChange("empOffMob", oldEmpOffMob, empOffMob);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        String oldUserID = this.userID;
        this.userID = userID;
        changeSupport.firePropertyChange("userID", oldUserID, userID);
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        String oldPass = this.pass;
        this.pass = pass;
        changeSupport.firePropertyChange("pass", oldPass, pass);
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        String oldPin = this.pin;
        this.pin = pin;
        changeSupport.firePropertyChange("pin", oldPin, pin);
    }

    public String getAreaCity() {
        return areaCity;
    }

    public void setAreaCity(String areaCity) {
        String oldAreaCity = this.areaCity;
        this.areaCity = areaCity;
        changeSupport.firePropertyChange("areaCity", oldAreaCity, areaCity);
    }

    public String getAreaDist() {
        return areaDist;
    }

    public void setAreaDist(String areaDist) {
        String oldAreaDist = this.areaDist;
        this.areaDist = areaDist;
        changeSupport.firePropertyChange("areaDist", oldAreaDist, areaDist);
    }

    public String getAreaState() {
        return areaState;
    }

    public void setAreaState(String areaState) {
        String oldAreaState = this.areaState;
        this.areaState = areaState;
        changeSupport.firePropertyChange("areaState", oldAreaState, areaState);
    }

    public String getControlCentreNo() {
        return controlCentreNo;
    }

    public void setControlCentreNo(String controlCentreNo) {
        String oldControlCentreNo = this.controlCentreNo;
        this.controlCentreNo = controlCentreNo;
        changeSupport.firePropertyChange("controlCentreNo", oldControlCentreNo, controlCentreNo);
    }

    public String getComputerNo() {
        return computerNo;
    }

    public void setComputerNo(String computerNo) {
        String oldComputerNo = this.computerNo;
        this.computerNo = computerNo;
        changeSupport.firePropertyChange("computerNo", oldComputerNo, computerNo);
    }

    public byte[] getEmpPhoto() {
        return empPhoto;
    }

    public void setEmpPhoto(byte[] empPhoto) {
        byte[] oldEmpPhoto = this.empPhoto;
        this.empPhoto = empPhoto;
        changeSupport.firePropertyChange("empPhoto", oldEmpPhoto, empPhoto);
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        String oldOtp = this.otp;
        this.otp = otp;
        changeSupport.firePropertyChange("otp", oldOtp, otp);
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        String oldNote = this.note;
        this.note = note;
        changeSupport.firePropertyChange("note", oldNote, note);
    }

    public String getPerCommt() {
        return perCommt;
    }

    public void setPerCommt(String perCommt) {
        String oldPerCommt = this.perCommt;
        this.perCommt = perCommt;
        changeSupport.firePropertyChange("perCommt", oldPerCommt, perCommt);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        String oldPreference = this.preference;
        this.preference = preference;
        changeSupport.firePropertyChange("preference", oldPreference, preference);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sNo != null ? sNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pbtemployeetable2)) {
            return false;
        }
        Pbtemployeetable2 other = (Pbtemployeetable2) object;
        if ((this.sNo == null && other.sNo != null) || (this.sNo != null && !this.sNo.equals(other.sNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TestingSummary.Pbtemployeetable2[ sNo=" + sNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

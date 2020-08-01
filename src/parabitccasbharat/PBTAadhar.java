package parabitccasbharat;

public class PBTAadhar {
    private String uid;
    private String name;
    private String gender;
    private String dateofbirth;
    private String careof;
    private String building;
    private String street;
    private String landmark;
    private String vtcame;
    private String popname;
    private String distname;
    private String subdistname;
    private String statename;
    private String pincode;

    public PBTAadhar(String uid, String name, String gender, String dateofbirth, String careof, String building, String street, String landmark, String vtcame, String popname, String distname, String subdistname, String statename, String pincode) {
        this.uid = uid;
        this.name = name;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.careof = careof;
        this.building = building;
        this.street = street;
        this.landmark = landmark;
        this.vtcame = vtcame;
        this.popname = popname;
        this.distname = distname;
        this.subdistname = subdistname;
        this.statename = statename;
        this.pincode = pincode;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getCareof() {
        return careof;
    }

    public String getBuilding() {
        return building;
    }

    public String getStreet() {
        return street;
    }

    public String getLandmark() {
        return landmark;
    }

    public String getVtcame() {
        return vtcame;
    }

    public String getPopname() {
        return popname;
    }

    public String getDistname() {
        return distname;
    }

    public String getSubdistname() {
        return subdistname;
    }

    public String getStatename() {
        return statename;
    }

    public String getPincode() {
        return pincode;
    }
    
    public Boolean isNull(){
        return this.uid == null;
    }
}

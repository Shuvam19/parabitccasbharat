/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class PBTDataOfEmployee {
    String ceid;
    String crepempid;
    String name;
    int grade;
    String pincode;
    String areacity;
    String areadist;
    String areastate;
    String mobno;

    public PBTDataOfEmployee(String ceid, String crepempid, String name, int grade, String pincode, String areacity, String areadist, String areastate, String mobno) {
        this.ceid = ceid;
        this.crepempid = crepempid;
        this.name = name;
        this.grade = grade;
        this.pincode = pincode;
        this.areacity = areacity;
        this.areadist = areadist;
        this.areastate = areastate;
        this.mobno = mobno;
    }

    public String getCeid() {
        return ceid;
    }

    public void setCeid(String ceid) {
        this.ceid = ceid;
    }

    public String getCrepempid() {
        return crepempid;
    }

    public void setCrepempid(String crepempid) {
        this.crepempid = crepempid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAreacity() {
        return areacity;
    }

    public void setAreacity(String areacity) {
        this.areacity = areacity;
    }

    public String getAreadist() {
        return areadist;
    }

    public void setAreadist(String areadist) {
        this.areadist = areadist;
    }

    public String getAreastate() {
        return areastate;
    }

    public void setAreastate(String areastate) {
        this.areastate = areastate;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }


    
    
}

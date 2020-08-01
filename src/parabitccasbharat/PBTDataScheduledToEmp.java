
package parabitccasbharat;

public class PBTDataScheduledToEmp {
    int Sno;
    String ceid;
    String crepempid;
    String ward;
    String cityvill;
    String subdist;
    String dist;
    String state;
    String workdone;
    String toppopulation;

    public PBTDataScheduledToEmp(int Sno, String ceid, String crepempid, String ward, String cityvill, String subdist, String dist, String state, String workdone, String toppopulation) {
        this.Sno = Sno;
        this.ceid = ceid;
        this.crepempid = crepempid;
        this.ward = ward;
        this.cityvill = cityvill;
        this.subdist = subdist;
        this.dist = dist;
        this.state = state;
        this.workdone = workdone;
        this.toppopulation = toppopulation;
    }
    

    public int getSno() {
        return Sno;
    }

    public void setSno(int Sno) {
        this.Sno = Sno;
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

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCityvill() {
        return cityvill;
    }

    public void setCityvill(String cityvill) {
        this.cityvill = cityvill;
    }

    public String getSubdist() {
        return subdist;
    }

    public void setSubdist(String subdist) {
        this.subdist = subdist;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWorkdone() {
        return workdone;
    }

    public void setWorkdone(String workdone) {
        this.workdone = workdone;
    }

    public String getToppopulation() {
        return toppopulation;
    }

    public void setToppopulation(String toppopulation) {
        this.toppopulation = toppopulation;
    }

    @Override
    public String toString() {
        return "PBTDataScheduledToEmp{" + "Sno=" + Sno + ", ceid=" + ceid + ", crepempid=" + crepempid + ", ward=" + ward + ", cityvill=" + cityvill + ", subdist=" + subdist + ", dist=" + dist + ", state=" + state + ", workdone=" + workdone + ", toppopulation=" + toppopulation + '}';
    }
    
    
    

    
}

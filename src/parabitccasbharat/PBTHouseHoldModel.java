package parabitccasbharat;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PBTHouseHoldModel {
    private String hh_sno;
    private String hl_sno;
    private String ucid;
    private String fsno;
    private String stut;
    private String dist;
    private String tehsil;
    private String townvillage;
    private String wardno;
    private String hnoadd;
    private String pincode;
    private String empenumno;
    private String rcardno;
    private String rcardtype;
    private String uid;
    private String gconsumerno;
    private String drivlicno;
    private String armsuino;
    private String birthcertno;
    private String marrcertno;
    private String policeverno;
    private String sssmid;
    private String name;
    private String reltohead;
    private String headuid;
    private String headregmobno;
    private String mobno;
    private String altphoneno;
    private String email;
    private String gender;
    private String dob;
    private String age;
    private String wt;
    private String ht;
    private String veg;
    private String homefood;
    private String outsidefood;
    private String sleephrs;
    private String health_checkup;
    private String addiction;
    private String bmi;
    private String stem_cell_id;
    private String bgroup;
    private String vid;
    private String passport;
    private String pancardno;
    private String ifsc;
    private String bankaccno;
    private String netbank;
    private String mobbank;
    private String pensionid;
    private String religion;
    private String community;
    private String category;
    private String cast;
    private String marstatus;
    private String apromarriageage;
    private String pwd;
    private String pwdid;
    private String mtongue;
    private String rwlang;
    private String homelang;
    private String litstatus;
    private String cedustatus;
    private String cinstnmcity;
    private String cinsttype;
    private String techdeg;
    private String nontechdeg;
    private String nccnss;
    private String jobseek;
    private String cworkstat;
    private String workcategory;
    private String workingsector;
    private String natureofwork;
    private String icsno;
    private String occupation;
    private String workexp;
    private String specdescription;
    private String specexp;
    private String proflicno;
    private String busiregno;
    private String income;
    private String itr;
    private String distfrmworkplace;
    private String modoftravel;
    private String nri;
    private String foreignadd;
    private String birthplacewithstatecountry;
    private String pmtstut;
    private String pmtdist;
    private String pmttehsil;
    private String pmttownvillage;
    private String pmtwardno;
    private String pmthnoadd;
    private String pmtpincode;
    private String rsnofmig;
    private String durofmig;
    private String chdnsurv;
    private String chdnevenborn;
    private String noofchdnalivelastyr;
    private String chronicdisease;
    private String sport;
    private String yoga;
    private String spiritual;
    private String meditation;
    private String ratyourhealth;
    private String filldate;
    private String timein;
    private String timeout;
    private String note;
    private String comment;
    private String status;

    public PBTHouseHoldModel() {
    }

    public String getHh_sno() {
        return hh_sno;
    }

    public void setHh_sno(String hh_sno) {
        this.hh_sno = hh_sno;
    }

    public String getHl_sno() {
        return hl_sno;
    }

    public void setHl_sno(String hl_sno) {
        this.hl_sno = hl_sno;
    }

    public String getUcid() {
        return ucid;
    }

    public void setUcid(String ucid) {
        this.ucid = ucid;
    }

    public String getFsno() {
        return fsno;
    }

    public void setFsno(String fsno) {
        this.fsno = fsno;
    }

    public String getStut() {
        return stut;
    }

    public void setStut(String stut) {
        this.stut = stut;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getTehsil() {
        return tehsil;
    }

    public void setTehsil(String tehsil) {
        this.tehsil = tehsil;
    }

    public String getTownvillage() {
        return townvillage;
    }

    public void setTownvillage(String townvillage) {
        this.townvillage = townvillage;
    }

    public String getWardno() {
        return wardno;
    }

    public void setWardno(String wardno) {
        this.wardno = wardno;
    }

    public String getHnoadd() {
        return hnoadd;
    }

    public void setHnoadd(String hnoadd) {
        this.hnoadd = hnoadd;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEmpenumno() {
        return empenumno;
    }

    public void setEmpenumno(String empenumno) {
        this.empenumno = empenumno;
    }

    public String getRcardno() {
        return rcardno;
    }

    public void setRcardno(String rcardno) {
        this.rcardno = rcardno;
    }

    public String getRcardtype() {
        return rcardtype;
    }

    public void setRcardtype(String rcardtype) {
        this.rcardtype = rcardtype;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getGconsumerno() {
        return gconsumerno;
    }

    public void setGconsumerno(String gconsumerno) {
        this.gconsumerno = gconsumerno;
    }

    public String getDrivlicno() {
        return drivlicno;
    }

    public void setDrivlicno(String drivlicno) {
        this.drivlicno = drivlicno;
    }

    public String getArmsuino() {
        return armsuino;
    }

    public void setArmsuino(String armsuino) {
        this.armsuino = armsuino;
    }

    public String getBirthcertno() {
        return birthcertno;
    }

    public void setBirthcertno(String birthcertno) {
        this.birthcertno = birthcertno;
    }

    public String getMarrcertno() {
        return marrcertno;
    }

    public void setMarrcertno(String marrcertno) {
        this.marrcertno = marrcertno;
    }

    public String getPoliceverno() {
        return policeverno;
    }

    public void setPoliceverno(String policeverno) {
        this.policeverno = policeverno;
    }

    public String getSssmid() {
        return sssmid;
    }

    public void setSssmid(String sssmid) {
        this.sssmid = sssmid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReltohead() {
        return reltohead;
    }

    public void setReltohead(String reltohead) {
        this.reltohead = reltohead;
    }

    public String getHeaduid() {
        return headuid;
    }

    public void setHeaduid(String headuid) {
        this.headuid = headuid;
    }

    public String getHeadregmobno() {
        return headregmobno;
    }

    public void setHeadregmobno(String headregmobno) {
        this.headregmobno = headregmobno;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getAltphoneno() {
        return altphoneno;
    }

    public void setAltphoneno(String altphoneno) {
        this.altphoneno = altphoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getVeg() {
        return veg;
    }

    public void setVeg(String veg) {
        this.veg = veg;
    }

    public String getHomefood() {
        return homefood;
    }

    public void setHomefood(String homefood) {
        this.homefood = homefood;
    }

    public String getOutsidefood() {
        return outsidefood;
    }

    public void setOutsidefood(String outsidefood) {
        this.outsidefood = outsidefood;
    }

    public String getSleephrs() {
        return sleephrs;
    }

    public void setSleephrs(String sleephrs) {
        this.sleephrs = sleephrs;
    }

    public String getHealth_checkup() {
        return health_checkup;
    }

    public void setHealth_checkup(String health_checkup) {
        this.health_checkup = health_checkup;
    }

    public String getAddiction() {
        return addiction;
    }

    public void setAddiction(String addiction) {
        this.addiction = addiction;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getStem_cell_id() {
        return stem_cell_id;
    }

    public void setStem_cell_id(String stem_cell_id) {
        this.stem_cell_id = stem_cell_id;
    }

    public String getBgroup() {
        return bgroup;
    }

    public void setBgroup(String bgroup) {
        this.bgroup = bgroup;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPancardno() {
        return pancardno;
    }

    public void setPancardno(String pancardno) {
        this.pancardno = pancardno;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getBankaccno() {
        return bankaccno;
    }

    public void setBankaccno(String bankaccno) {
        this.bankaccno = bankaccno;
    }

    public String getNetbank() {
        return netbank;
    }

    public void setNetbank(String netbank) {
        this.netbank = netbank;
    }

    public String getMobbank() {
        return mobbank;
    }

    public void setMobbank(String mobbank) {
        this.mobbank = mobbank;
    }

    public String getPensionid() {
        return pensionid;
    }

    public void setPensionid(String pensionid) {
        this.pensionid = pensionid;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getMarstatus() {
        return marstatus;
    }

    public void setMarstatus(String marstatus) {
        this.marstatus = marstatus;
    }

    public String getApromarriageage() {
        return apromarriageage;
    }

    public void setApromarriageage(String apromarriageage) {
        this.apromarriageage = apromarriageage;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdid() {
        return pwdid;
    }

    public void setPwdid(String pwdid) {
        this.pwdid = pwdid;
    }

    public String getMtongue() {
        return mtongue;
    }

    public void setMtongue(String mtongue) {
        this.mtongue = mtongue;
    }

    public String getRwlang() {
        return rwlang;
    }

    public void setRwlang(String rwlang) {
        this.rwlang = rwlang;
    }

    public String getHomelang() {
        return homelang;
    }

    public void setHomelang(String homelang) {
        this.homelang = homelang;
    }

    public String getLitstatus() {
        return litstatus;
    }

    public void setLitstatus(String litstatus) {
        this.litstatus = litstatus;
    }

    public String getCedustatus() {
        return cedustatus;
    }

    public void setCedustatus(String cedustatus) {
        this.cedustatus = cedustatus;
    }

    public String getCinstnmcity() {
        return cinstnmcity;
    }

    public void setCinstnmcity(String cinstnmcity) {
        this.cinstnmcity = cinstnmcity;
    }

    public String getCinsttype() {
        return cinsttype;
    }

    public void setCinsttype(String cinsttype) {
        this.cinsttype = cinsttype;
    }

    public String getTechdeg() {
        return techdeg;
    }

    public void setTechdeg(String techdeg) {
        this.techdeg = techdeg;
    }

    public String getNontechdeg() {
        return nontechdeg;
    }

    public void setNontechdeg(String nontechdeg) {
        this.nontechdeg = nontechdeg;
    }

    public String getNccnss() {
        return nccnss;
    }

    public void setNccnss(String nccnss) {
        this.nccnss = nccnss;
    }

    public String getJobseek() {
        return jobseek;
    }

    public void setJobseek(String jobseek) {
        this.jobseek = jobseek;
    }

    public String getCworkstat() {
        return cworkstat;
    }

    public void setCworkstat(String cworkstat) {
        this.cworkstat = cworkstat;
    }

    public String getWorkcategory() {
        return workcategory;
    }

    public void setWorkcategory(String workcategory) {
        this.workcategory = workcategory;
    }

    public String getWorkingsector() {
        return workingsector;
    }

    public void setWorkingsector(String workingsector) {
        this.workingsector = workingsector;
    }

    public String getNatureofwork() {
        return natureofwork;
    }

    public void setNatureofwork(String natureofwork) {
        this.natureofwork = natureofwork;
    }

    public String getIcsno() {
        return icsno;
    }

    public void setIcsno(String icsno) {
        this.icsno = icsno;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWorkexp() {
        return workexp;
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp;
    }

    public String getSpecdescription() {
        return specdescription;
    }

    public void setSpecdescription(String specdescription) {
        this.specdescription = specdescription;
    }

    public String getSpecexp() {
        return specexp;
    }

    public void setSpecexp(String specexp) {
        this.specexp = specexp;
    }

    public String getProflicno() {
        return proflicno;
    }

    public void setProflicno(String proflicno) {
        this.proflicno = proflicno;
    }

    public String getBusiregno() {
        return busiregno;
    }

    public void setBusiregno(String busiregno) {
        this.busiregno = busiregno;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getItr() {
        return itr;
    }

    public void setItr(String itr) {
        this.itr = itr;
    }

    public String getDistfrmworkplace() {
        return distfrmworkplace;
    }

    public void setDistfrmworkplace(String distfrmworkplace) {
        this.distfrmworkplace = distfrmworkplace;
    }

    public String getModoftravel() {
        return modoftravel;
    }

    public void setModoftravel(String modoftravel) {
        this.modoftravel = modoftravel;
    }

    public String getNri() {
        return nri;
    }

    public void setNri(String nri) {
        this.nri = nri;
    }

    public String getForeignadd() {
        return foreignadd;
    }

    public void setForeignadd(String foreignadd) {
        this.foreignadd = foreignadd;
    }

    public String getBirthplacewithstatecountry() {
        return birthplacewithstatecountry;
    }

    public void setBirthplacewithstatecountry(String birthplacewithstatecountry) {
        this.birthplacewithstatecountry = birthplacewithstatecountry;
    }

    public String getPmtstut() {
        return pmtstut;
    }

    public void setPmtstut(String pmtstut) {
        this.pmtstut = pmtstut;
    }

    public String getPmtdist() {
        return pmtdist;
    }

    public void setPmtdist(String pmtdist) {
        this.pmtdist = pmtdist;
    }

    public String getPmttehsil() {
        return pmttehsil;
    }

    public void setPmttehsil(String pmttehsil) {
        this.pmttehsil = pmttehsil;
    }

    public String getPmttownvillage() {
        return pmttownvillage;
    }

    public void setPmttownvillage(String pmttownvillage) {
        this.pmttownvillage = pmttownvillage;
    }

    public String getPmtwardno() {
        return pmtwardno;
    }

    public void setPmtwardno(String pmtwardno) {
        this.pmtwardno = pmtwardno;
    }

    public String getPmthnoadd() {
        return pmthnoadd;
    }

    public void setPmthnoadd(String pmthnoadd) {
        this.pmthnoadd = pmthnoadd;
    }

    public String getPmtpincode() {
        return pmtpincode;
    }

    public void setPmtpincode(String pmtpincode) {
        this.pmtpincode = pmtpincode;
    }

    public String getRsnofmig() {
        return rsnofmig;
    }

    public void setRsnofmig(String rsnofmig) {
        this.rsnofmig = rsnofmig;
    }

    public String getDurofmig() {
        return durofmig;
    }

    public void setDurofmig(String durofmig) {
        this.durofmig = durofmig;
    }

    public String getChdnsurv() {
        return chdnsurv;
    }

    public void setChdnsurv(String chdnsurv) {
        this.chdnsurv = chdnsurv;
    }

    public String getChdnevenborn() {
        return chdnevenborn;
    }

    public void setChdnevenborn(String chdnevenborn) {
        this.chdnevenborn = chdnevenborn;
    }

    public String getNoofchdnalivelastyr() {
        return noofchdnalivelastyr;
    }

    public void setNoofchdnalivelastyr(String noofchdnalivelastyr) {
        this.noofchdnalivelastyr = noofchdnalivelastyr;
    }

    public String getChronicdisease() {
        return chronicdisease;
    }

    public void setChronicdisease(String chronicdisease) {
        this.chronicdisease = chronicdisease;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getYoga() {
        return yoga;
    }

    public void setYoga(String yoga) {
        this.yoga = yoga;
    }

    public String getSpiritual() {
        return spiritual;
    }

    public void setSpiritual(String spiritual) {
        this.spiritual = spiritual;
    }

    public String getMeditation() {
        return meditation;
    }

    public void setMeditation(String meditation) {
        this.meditation = meditation;
    }

    public String getRatyourhealth() {
        return ratyourhealth;
    }

    public void setRatyourhealth(String ratyourhealth) {
        this.ratyourhealth = ratyourhealth;
    }

    public String getFilldate() {
        return filldate;
    }

    public void setFilldate(String filldate) {
        this.filldate = filldate;
    }

    public String getTimein() {
        return timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PBTHouseHoldModel{" + "hh_sno=" + hh_sno + ", hl_sno=" + hl_sno + ", ucid=" + ucid + ", fsno=" + fsno + ", stut=" + stut + ", dist=" + dist + ", tehsil=" + tehsil + ", townvillage=" + townvillage + ", wardno=" + wardno + ", hnoadd=" + hnoadd + ", pincode=" + pincode + ", empenumno=" + empenumno + ", rcardno=" + rcardno + ", rcardtype=" + rcardtype + ", uid=" + uid + ", gconsumerno=" + gconsumerno + ", drivlicno=" + drivlicno + ", armsuino=" + armsuino + ", birthcertno=" + birthcertno + ", marrcertno=" + marrcertno + ", policeverno=" + policeverno + ", sssmid=" + sssmid + ", name=" + name + ", reltohead=" + reltohead + ", headuid=" + headuid + ", headregmobno=" + headregmobno + ", mobno=" + mobno + ", altphoneno=" + altphoneno + ", email=" + email + ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", wt=" + wt + ", ht=" + ht + ", veg=" + veg + ", homefood=" + homefood + ", outsidefood=" + outsidefood + ", sleephrs=" + sleephrs + ", health_checkup=" + health_checkup + ", addiction=" + addiction + ", bmi=" + bmi + ", stem_cell_id=" + stem_cell_id + ", bgroup=" + bgroup + ", vid=" + vid + ", passport=" + passport + ", pancardno=" + pancardno + ", ifsc=" + ifsc + ", bankaccno=" + bankaccno + ", netbank=" + netbank + ", mobbank=" + mobbank + ", pensionid=" + pensionid + ", religion=" + religion + ", community=" + community + ", category=" + category + ", cast=" + cast + ", marstatus=" + marstatus + ", apromarriageage=" + apromarriageage + ", pwd=" + pwd + ", pwdid=" + pwdid + ", mtongue=" + mtongue + ", rwlang=" + rwlang + ", homelang=" + homelang + ", litstatus=" + litstatus + ", cedustatus=" + cedustatus + ", cinstnmcity=" + cinstnmcity + ", cinsttype=" + cinsttype + ", techdeg=" + techdeg + ", nontechdeg=" + nontechdeg + ", nccnss=" + nccnss + ", jobseek=" + jobseek + ", cworkstat=" + cworkstat + ", workcategory=" + workcategory + ", workingsector=" + workingsector + ", natureofwork=" + natureofwork + ", icsno=" + icsno + ", occupation=" + occupation + ", workexp=" + workexp + ", specdescription=" + specdescription + ", specexp=" + specexp + ", proflicno=" + proflicno + ", busiregno=" + busiregno + ", income=" + income + ", itr=" + itr + ", distfrmworkplace=" + distfrmworkplace + ", modoftravel=" + modoftravel + ", nri=" + nri + ", foreignadd=" + foreignadd + ", birthplacewithstatecountry=" + birthplacewithstatecountry + ", pmtstut=" + pmtstut + ", pmtdist=" + pmtdist + ", pmttehsil=" + pmttehsil + ", pmttownvillage=" + pmttownvillage + ", pmtwardno=" + pmtwardno + ", pmthnoadd=" + pmthnoadd + ", pmtpincode=" + pmtpincode + ", rsnofmig=" + rsnofmig + ", durofmig=" + durofmig + ", chdnsurv=" + chdnsurv + ", chdnevenborn=" + chdnevenborn + ", noofchdnalivelastyr=" + noofchdnalivelastyr + ", chronicdisease=" + chronicdisease + ", sport=" + sport + ", yoga=" + yoga + ", spiritual=" + spiritual + ", meditation=" + meditation + ", ratyourhealth=" + ratyourhealth + ", filldate=" + filldate + ", timein=" + timein + ", timeout=" + timeout + ", note=" + note + ", comment=" + comment + ", status=" + status + '}';
    }
    
    
    public String toInsertQuery() {
        return "Insert into `pbtcensus_household` values (" + getNullOrValue(hh_sno) + "," +getNullOrValue(hl_sno) + "," +getNullOrValue(ucid) + "," +getNullOrValue(fsno) + "," +getNullOrValue(stut) + "," +getNullOrValue(dist) + "," +getNullOrValue(tehsil) + "," +getNullOrValue(townvillage) + "," +getNullOrValue(wardno) + "," +getNullOrValue(hnoadd) + "," +getNullOrValue(pincode) + "," +getNullOrValue(empenumno) + "," +getNullOrValue(rcardno) + "," +getNullOrValue(rcardtype) + "," +getNullOrValue(uid) + "," +getNullOrValue(gconsumerno) + "," +getNullOrValue(drivlicno) + "," +getNullOrValue(armsuino) + "," +getNullOrValue(birthcertno) + "," +getNullOrValue(marrcertno) + "," +getNullOrValue(policeverno) + "," +getNullOrValue(sssmid) + "," +getNullOrValue(name) + "," +getNullOrValue(reltohead) + "," +getNullOrValue(headuid) + "," +getNullOrValue(headregmobno) + "," +getNullOrValue(mobno) + "," +getNullOrValue(altphoneno) + "," +getNullOrValue(email) + "," +getNullOrValue(gender) + "," +getNullOrValue(dob) + "," +getNullOrValue(age) + "," +getNullOrValue(wt) + "," +getNullOrValue(ht) + "," +getNullOrValue(veg) + "," +getNullOrValue(homefood) + "," +getNullOrValue(outsidefood) + "," +getNullOrValue(sleephrs) + "," +getNullOrValue(health_checkup) + "," +getNullOrValue(addiction) + "," +getNullOrValue(bmi) + "," +getNullOrValue(stem_cell_id) + "," +getNullOrValue(bgroup) + "," +getNullOrValue(vid) + "," +getNullOrValue(passport) + "," +getNullOrValue(pancardno) + "," +getNullOrValue(ifsc) + "," +getNullOrValue(bankaccno) + "," +getNullOrValue(netbank) + "," +getNullOrValue(mobbank) + "," +getNullOrValue(pensionid) + "," +getNullOrValue(religion) + "," +getNullOrValue(community) + "," +getNullOrValue(category) + "," +getNullOrValue(cast) + "," +getNullOrValue(marstatus) + "," +getNullOrValue(apromarriageage) + "," +getNullOrValue(pwd) + "," +getNullOrValue(pwdid) + "," +getNullOrValue(mtongue) + "," +getNullOrValue(rwlang) + "," +getNullOrValue(homelang) + "," +getNullOrValue(litstatus) + "," +getNullOrValue(cedustatus) + "," +getNullOrValue(cinstnmcity) + "," +getNullOrValue(cinsttype) + "," +getNullOrValue(techdeg) + "," +getNullOrValue(nontechdeg) + "," +getNullOrValue(nccnss) + "," +getNullOrValue(jobseek) + "," +getNullOrValue(cworkstat) + "," +getNullOrValue(workcategory) + "," +getNullOrValue(workingsector) + "," +getNullOrValue(natureofwork) + "," +getNullOrValue(icsno) + "," +getNullOrValue(occupation) + "," +getNullOrValue(workexp) + "," +getNullOrValue(specdescription) + "," +getNullOrValue(specexp) + "," +getNullOrValue(proflicno) + "," +getNullOrValue(busiregno) + "," +getNullOrValue(income) + "," +getNullOrValue(itr) + "," +getNullOrValue(distfrmworkplace) + "," +getNullOrValue(modoftravel) + "," +getNullOrValue(nri) + "," +getNullOrValue(foreignadd) + "," +getNullOrValue(birthplacewithstatecountry) + "," +getNullOrValue(pmtstut) + "," +getNullOrValue(pmtdist) + "," +getNullOrValue(pmttehsil) + "," +getNullOrValue(pmttownvillage) + "," +getNullOrValue(pmtwardno) + "," +getNullOrValue(pmthnoadd) + "," +getNullOrValue(pmtpincode) + "," +getNullOrValue(rsnofmig) + "," +getNullOrValue(durofmig) + "," +getNullOrValue(chdnsurv) + "," +getNullOrValue(chdnevenborn) + "," +getNullOrValue(noofchdnalivelastyr) + "," +getNullOrValue(chronicdisease) + "," +getNullOrValue(sport) + "," +getNullOrValue(yoga) + "," +getNullOrValue(spiritual) + "," +getNullOrValue(meditation) + "," +getNullOrValue(ratyourhealth) + "," +getNullOrValue(filldate) + "," +getNullOrValue(timein) + "," +getNullOrValue(timeout) + "," +getNullOrValue(note) + "," +getNullOrValue(comment) + "," +getNullOrValue(status) + ")";
    }
    
    public void getDataFromAadhar(String aadhar){
        String query = "Select * from `pbtcensus_household` where uid = '" + aadhar + "'";
        ParabitDBC db = new ParabitDBC();
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next()){
                hh_sno = db.rs1.getString("hh_sno");
                hl_sno = db.rs1.getString("hl_sno");
                ucid = db.rs1.getString("ucid");
                fsno = db.rs1.getString("fsno");
                stut = db.rs1.getString("stut");
                dist = db.rs1.getString("dist");
                tehsil = db.rs1.getString("tehsil");
                townvillage = db.rs1.getString("townvillage");
                wardno = db.rs1.getString("wardno");
                hnoadd = db.rs1.getString("hnoadd");
                pincode = db.rs1.getString("pincode");
                empenumno = db.rs1.getString("empenumno");
                rcardno = db.rs1.getString("rcardno");
                rcardtype = db.rs1.getString("rcardtype");
                uid = db.rs1.getString("uid");
                gconsumerno = db.rs1.getString("gconsumerno");
                drivlicno = db.rs1.getString("drivlicno");
                armsuino = db.rs1.getString("armsuino");
                birthcertno = db.rs1.getString("birthcertno");
                marrcertno = db.rs1.getString("marrcertno");
                policeverno = db.rs1.getString("policeverno");
                sssmid = db.rs1.getString("sssmid");
                name = db.rs1.getString("name");
                reltohead = db.rs1.getString("reltohead");
                headuid = db.rs1.getString("headuid");
                headregmobno = db.rs1.getString("headregmobno");
                mobno = db.rs1.getString("mobno");
                altphoneno = db.rs1.getString("altphoneno");
                email = db.rs1.getString("email");
                gender = db.rs1.getString("gender");
                dob = db.rs1.getString("dob");
                age = db.rs1.getString("age");
                wt = db.rs1.getString("wt");
                ht = db.rs1.getString("ht");
                veg = db.rs1.getString("veg");
                homefood = db.rs1.getString("homefood");
                outsidefood = db.rs1.getString("outsidefood");
                sleephrs = db.rs1.getString("sleephrs");
                health_checkup = db.rs1.getString("health_checkup");
                addiction = db.rs1.getString("addiction");
                bmi = db.rs1.getString("bmi");
                stem_cell_id = db.rs1.getString("stem_cell_id");
                bgroup = db.rs1.getString("bgroup");
                vid = db.rs1.getString("vid");
                passport = db.rs1.getString("passport");
                pancardno = db.rs1.getString("pancardno");
                ifsc = db.rs1.getString("ifsc");
                bankaccno = db.rs1.getString("bankaccno");
                netbank = db.rs1.getString("netbank");
                mobbank = db.rs1.getString("mobbank");
                pensionid = db.rs1.getString("pensionid");
                religion = db.rs1.getString("religion");
                community = db.rs1.getString("community");
                category = db.rs1.getString("category");
                cast = db.rs1.getString("cast");
                marstatus = db.rs1.getString("marstatus");
                apromarriageage = db.rs1.getString("apromarriageage");
                pwd = db.rs1.getString("pwd");
                pwdid = db.rs1.getString("pwdid");
                mtongue = db.rs1.getString("mtongue");
                rwlang = db.rs1.getString("rwlang");
                homelang = db.rs1.getString("homelang");
                litstatus = db.rs1.getString("litstatus");
                cedustatus = db.rs1.getString("cedustatus");
                cinstnmcity = db.rs1.getString("cinstnmcity");
                cinsttype = db.rs1.getString("cinsttype");
                techdeg = db.rs1.getString("techdeg");
                nontechdeg = db.rs1.getString("nontechdeg");
                nccnss = db.rs1.getString("nccnss");
                jobseek = db.rs1.getString("jobseek");
                cworkstat = db.rs1.getString("cworkstat");
                workcategory = db.rs1.getString("workcategory");
                workingsector = db.rs1.getString("workingsector");
                natureofwork = db.rs1.getString("natureofwork");
                icsno = db.rs1.getString("icsno");
                occupation = db.rs1.getString("occupation");
                workexp = db.rs1.getString("workexp");
                specdescription = db.rs1.getString("specdescription");
                specexp = db.rs1.getString("specexp");
                proflicno = db.rs1.getString("proflicno");
                busiregno = db.rs1.getString("busiregno");
                income = db.rs1.getString("income");
                itr = db.rs1.getString("itr");
                distfrmworkplace = db.rs1.getString("distfrmworkplace");
                modoftravel = db.rs1.getString("modoftravel");
                nri = db.rs1.getString("nri");
                foreignadd = db.rs1.getString("foreignadd");
                birthplacewithstatecountry = db.rs1.getString("birthplacewithstatecountry");
                pmtstut = db.rs1.getString("pmtstut");
                pmtdist = db.rs1.getString("pmtdist");
                pmttehsil = db.rs1.getString("pmttehsil");
                pmttownvillage = db.rs1.getString("pmttownvillage");
                pmtwardno = db.rs1.getString("pmtwardno");
                pmthnoadd = db.rs1.getString("pmthnoadd");
                pmtpincode = db.rs1.getString("pmtpincode");
                rsnofmig = db.rs1.getString("rsnofmig");
                durofmig = db.rs1.getString("durofmig");
                chdnsurv = db.rs1.getString("chdnsurv");
                chdnevenborn = db.rs1.getString("chdnevenborn");
                noofchdnalivelastyr = db.rs1.getString("noofchdnalivelastyr");
                chronicdisease = db.rs1.getString("chronicdisease");
                sport = db.rs1.getString("sport");
                yoga = db.rs1.getString("yoga");
                spiritual = db.rs1.getString("spiritual");
                meditation = db.rs1.getString("meditation");
                ratyourhealth = db.rs1.getString("ratyourhealth");
                filldate = db.rs1.getString("filldate");
                timein = db.rs1.getString("timein");
                timeout = db.rs1.getString("timeout");
                note = db.rs1.getString("note");
                comment = db.rs1.getString("comment");
                status = db.rs1.getString("status");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean insert() {
        if(uid.isEmpty() || uid==null){
            return false;
        }else {
            String query = this.toInsertQuery();
            ParabitDBC db = new ParabitDBC();
            try {
                db.stm.execute(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return true;
        }
    }
    
    public Map<String, Object> toHashMap() {
        Field fields[] = this.getClass().getDeclaredFields();
        Map<String, Object> map = new HashMap<>();
        for (Field field : fields) {
            try {
                String name = field.getName();
                field.setAccessible(true);
                Object value = field.get(this);
                if(value!=null){
                    map.put(name, value);
                }
                map.put(name, value);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }
        return map;
    }
    
    public String toUpdateQuery(Map<String, Object> map) {
        String query = "Update `pbtcensus_household` set ";
        int size = map.size();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            query = query + key + "='" + value + "'";
            size--;
            if(size!=0){
                query = query + ", ";
            }
        }
        query = query + " where ";
        return query;
    }
    
    private String getNullOrValue(Object name){
        if(name==null)
            return null;
        else
            return " '" + name + "' ";
    }
   
}

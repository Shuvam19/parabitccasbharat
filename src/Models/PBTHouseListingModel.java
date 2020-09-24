/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import DB.ParabitDBC;

/**
 *
 * @author acer
 */
public class PBTHouseListingModel {
    private String empenumno;
    private int hl_sno;
    private int hh_sno;
    private int ucid;
    private int fsno;
    private String stut;
    private String dist;
    private String tehsil;
    private String townvillage;
    private String wardno;
    private String hnoadd;
    private String pincode;
    private int owspofhouse;
    private int typeofhouse;
    private int roof;
    private int floor;
    private int wall;
    private String dwellingroom;
    private String fndyrofhouse;
    private String cndtofhouse;
    private String useofhouse;
    private String plotarea;
    private String builtuparea;
    private String nooftrees;
    private String noofprottrees;
    private String typeofdomanimalwithno;
    private String typeofpetanimalwithno;
    private String latilongi;
    private String ownername;
    private String ownerphnno;
    private String nomarrcoup;
    private int mainsrcdrwater;
    private int mainsrclight;
    private int altsrcoflight;
    private int accessof_l;
    private int typeof_l;
    private String drainagesys;
    private String wtrharv;
    private int bathfact;
    private String swimmingpool;
    private int kitchen;
    private int cookfuel;
    private String radio;
    private String fm;
    private int tv;
    private int tvsig;
    private String refrigerator;
    private int coolheatfact;
    private int pc;
    private int telebroadband;
    private String mob;
    private int bicycle;
    private int r2wheel;
    private int r4wheel;
    private int tnocommveh;
    private String parkingfact;
    private String lift;
    private String escalator;
    private String helipad;
    private String gendiss;
    private String firstaidkit;
    private String g_insu;
    private String nhospdist;
    private int deathin10years;
    private String reasonofdeath;
    private String deathagegroup;
    private String smartsecuritysystem;
    private String cctvipadress;
    private int fireextinguisher;
    private String firealarm;
    private String privatesecurityguard;
    private int privatelicensearms;
    private String burglaralarm;
    private String expectation;
    private String filldate;
    private String timein;
    private String timeout;
    private String note;
    private String comment;
    private String status;

    public String getEmpenumno() {
        return empenumno;
    }

    public void setEmpenumno(String empenumno) {
        this.empenumno = empenumno;
    }

    public int getHl_sno() {
        return hl_sno;
    }

    public void setHl_sno(int hl_sno) {
        this.hl_sno = hl_sno;
    }

    public int getHh_sno() {
        return hh_sno;
    }

    public void setHh_sno(int hh_sno) {
        this.hh_sno = hh_sno;
    }

    public int getUcid() {
        return ucid;
    }

    public void setUcid(int ucid) {
        this.ucid = ucid;
    }

    public int getFsno() {
        return fsno;
    }

    public void setFsno(int fsno) {
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

    public int getOwspofhouse() {
        return owspofhouse;
    }

    public void setOwspofhouse(int owspofhouse) {
        this.owspofhouse = owspofhouse;
    }

    public int getTypeofhouse() {
        return typeofhouse;
    }

    public void setTypeofhouse(int typeofhouse) {
        this.typeofhouse = typeofhouse;
    }

    public int getRoof() {
        return roof;
    }

    public void setRoof(int roof) {
        this.roof = roof;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getWall() {
        return wall;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }

    public String getDwellingroom() {
        return dwellingroom;
    }

    public void setDwellingroom(String dwellingroom) {
        this.dwellingroom = dwellingroom;
    }

    public String getFndyrofhouse() {
        return fndyrofhouse;
    }

    public void setFndyrofhouse(String fndyrofhouse) {
        this.fndyrofhouse = fndyrofhouse;
    }

    public String getCndtofhouse() {
        return cndtofhouse;
    }

    public void setCndtofhouse(String cndtofhouse) {
        this.cndtofhouse = cndtofhouse;
    }

    public String getUseofhouse() {
        return useofhouse;
    }

    public void setUseofhouse(String useofhouse) {
        this.useofhouse = useofhouse;
    }

    public String getPlotarea() {
        return plotarea;
    }

    public void setPlotarea(String plotarea) {
        this.plotarea = plotarea;
    }

    public String getBuiltuparea() {
        return builtuparea;
    }

    public void setBuiltuparea(String builtuparea) {
        this.builtuparea = builtuparea;
    }

    public String getNooftrees() {
        return nooftrees;
    }

    public void setNooftrees(String nooftrees) {
        this.nooftrees = nooftrees;
    }

    public String getNoofprottrees() {
        return noofprottrees;
    }

    public void setNoofprottrees(String noofprottrees) {
        this.noofprottrees = noofprottrees;
    }

    public String getTypeofdomanimalwithno() {
        return typeofdomanimalwithno;
    }

    public void setTypeofdomanimalwithno(String typeofdomanimalwithno) {
        this.typeofdomanimalwithno = typeofdomanimalwithno;
    }

    public String getTypeofpetanimalwithno() {
        return typeofpetanimalwithno;
    }

    public void setTypeofpetanimalwithno(String typeofpetanimalwithno) {
        this.typeofpetanimalwithno = typeofpetanimalwithno;
    }

    public String getLatilongi() {
        return latilongi;
    }

    public void setLatilongi(String latilongi) {
        this.latilongi = latilongi;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnerphnno() {
        return ownerphnno;
    }

    public void setOwnerphnno(String ownerphnno) {
        this.ownerphnno = ownerphnno;
    }

    public String getNomarrcoup() {
        return nomarrcoup;
    }

    public void setNomarrcoup(String nomarrcoup) {
        this.nomarrcoup = nomarrcoup;
    }

    public int getMainsrcdrwater() {
        return mainsrcdrwater;
    }

    public void setMainsrcdrwater(int mainsrcdrwater) {
        this.mainsrcdrwater = mainsrcdrwater;
    }

    public int getMainsrclight() {
        return mainsrclight;
    }

    public void setMainsrclight(int mainsrclight) {
        this.mainsrclight = mainsrclight;
    }

    public int getAltsrcoflight() {
        return altsrcoflight;
    }

    public void setAltsrcoflight(int altsrcoflight) {
        this.altsrcoflight = altsrcoflight;
    }

    public int getAccessof_l() {
        return accessof_l;
    }

    public void setAccessof_l(int accessof_l) {
        this.accessof_l = accessof_l;
    }

    public int getTypeof_l() {
        return typeof_l;
    }

    public void setTypeof_l(int typeof_l) {
        this.typeof_l = typeof_l;
    }

    public String getDrainagesys() {
        return drainagesys;
    }

    public void setDrainagesys(String drainagesys) {
        this.drainagesys = drainagesys;
    }

    public String getWtrharv() {
        return wtrharv;
    }

    public void setWtrharv(String wtrharv) {
        this.wtrharv = wtrharv;
    }

    public int getBathfact() {
        return bathfact;
    }

    public void setBathfact(int bathfact) {
        this.bathfact = bathfact;
    }

    public String getSwimmingpool() {
        return swimmingpool;
    }

    public void setSwimmingpool(String swimmingpool) {
        this.swimmingpool = swimmingpool;
    }

    public int getKitchen() {
        return kitchen;
    }

    public void setKitchen(int kitchen) {
        this.kitchen = kitchen;
    }

    public int getCookfuel() {
        return cookfuel;
    }

    public void setCookfuel(int cookfuel) {
        this.cookfuel = cookfuel;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public int getTv() {
        return tv;
    }

    public void setTv(int tv) {
        this.tv = tv;
    }

    public int getTvsig() {
        return tvsig;
    }

    public void setTvsig(int tvsig) {
        this.tvsig = tvsig;
    }

    public String getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(String refrigerator) {
        this.refrigerator = refrigerator;
    }

    public int getCoolheatfact() {
        return coolheatfact;
    }

    public void setCoolheatfact(int coolheatfact) {
        this.coolheatfact = coolheatfact;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getTelebroadband() {
        return telebroadband;
    }

    public void setTelebroadband(int telebroadband) {
        this.telebroadband = telebroadband;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public int getBicycle() {
        return bicycle;
    }

    public void setBicycle(int bicycle) {
        this.bicycle = bicycle;
    }

    public int getR2wheel() {
        return r2wheel;
    }

    public void setR2wheel(int r2wheel) {
        this.r2wheel = r2wheel;
    }

    public int getR4wheel() {
        return r4wheel;
    }

    public void setR4wheel(int r4wheel) {
        this.r4wheel = r4wheel;
    }

    public int getTnocommveh() {
        return tnocommveh;
    }

    public void setTnocommveh(int tnocommveh) {
        this.tnocommveh = tnocommveh;
    }

    public String getParkingfact() {
        return parkingfact;
    }

    public void setParkingfact(String parkingfact) {
        this.parkingfact = parkingfact;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public String getEscalator() {
        return escalator;
    }

    public void setEscalator(String escalator) {
        this.escalator = escalator;
    }

    public String getHelipad() {
        return helipad;
    }

    public void setHelipad(String helipad) {
        this.helipad = helipad;
    }

    public String getGendiss() {
        return gendiss;
    }

    public void setGendiss(String gendiss) {
        this.gendiss = gendiss;
    }

    public String getFirstaidkit() {
        return firstaidkit;
    }

    public void setFirstaidkit(String firstaidkit) {
        this.firstaidkit = firstaidkit;
    }

    public String getG_insu() {
        return g_insu;
    }

    public void setG_insu(String g_insu) {
        this.g_insu = g_insu;
    }

    public String getNhospdist() {
        return nhospdist;
    }

    public void setNhospdist(String nhospdist) {
        this.nhospdist = nhospdist;
    }

    public int getDeathin10years() {
        return deathin10years;
    }

    public void setDeathin10years(int deathin10years) {
        this.deathin10years = deathin10years;
    }

    public String getReasonofdeath() {
        return reasonofdeath;
    }

    public void setReasonofdeath(String reasonofdeath) {
        this.reasonofdeath = reasonofdeath;
    }

    public String getDeathagegroup() {
        return deathagegroup;
    }

    public void setDeathagegroup(String deathagegroup) {
        this.deathagegroup = deathagegroup;
    }

    public String getSmartsecuritysystem() {
        return smartsecuritysystem;
    }

    public void setSmartsecuritysystem(String smartsecuritysystem) {
        this.smartsecuritysystem = smartsecuritysystem;
    }

    public String getCctvipadress() {
        return cctvipadress;
    }

    public void setCctvipadress(String cctvipadress) {
        this.cctvipadress = cctvipadress;
    }

    public int getFireextinguisher() {
        return fireextinguisher;
    }

    public void setFireextinguisher(int fireextinguisher) {
        this.fireextinguisher = fireextinguisher;
    }

    public String getFirealarm() {
        return firealarm;
    }

    public void setFirealarm(String firealarm) {
        this.firealarm = firealarm;
    }

    public String getPrivatesecurityguard() {
        return privatesecurityguard;
    }

    public void setPrivatesecurityguard(String privatesecurityguard) {
        this.privatesecurityguard = privatesecurityguard;
    }

    public int getPrivatelicensearms() {
        return privatelicensearms;
    }

    public void setPrivatelicensearms(int privatelicensearms) {
        this.privatelicensearms = privatelicensearms;
    }

    public String getBurglaralarm() {
        return burglaralarm;
    }

    public void setBurglaralarm(String burglaralarm) {
        this.burglaralarm = burglaralarm;
    }

    public String getExpectation() {
        return expectation;
    }

    public void setExpectation(String expectation) {
        this.expectation = expectation;
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
        return "PBTHouseListingModel{" + "empenumno=" + empenumno + ", hl_sno=" + hl_sno + ", hh_sno=" + hh_sno + ", ucid=" + ucid + ", fsno=" + fsno + ", stut=" + stut + ", dist=" + dist + ", tehsil=" + tehsil + ", townvillage=" + townvillage + ", wardno=" + wardno + ", hnoadd=" + hnoadd + ", pincode=" + pincode + ", owspofhouse=" + owspofhouse + ", typeofhouse=" + typeofhouse + ", roof=" + roof + ", floor=" + floor + ", wall=" + wall + ", dwellingroom=" + dwellingroom + ", fndyrofhouse=" + fndyrofhouse + ", cndtofhouse=" + cndtofhouse + ", useofhouse=" + useofhouse + ", plotarea=" + plotarea + ", builtuparea=" + builtuparea + ", nooftrees=" + nooftrees + ", noofprottrees=" + noofprottrees + ", typeofdomanimalwithno=" + typeofdomanimalwithno + ", typeofpetanimalwithno=" + typeofpetanimalwithno + ", latilongi=" + latilongi + ", ownername=" + ownername + ", ownerphnno=" + ownerphnno + ", nomarrcoup=" + nomarrcoup + ", mainsrcdrwater=" + mainsrcdrwater + ", mainsrclight=" + mainsrclight + ", altsrcoflight=" + altsrcoflight + ", accessof_l=" + accessof_l + ", typeof_l=" + typeof_l + ", drainagesys=" + drainagesys + ", wtrharv=" + wtrharv + ", bathfact=" + bathfact + ", swimmingpool=" + swimmingpool + ", kitchen=" + kitchen + ", cookfuel=" + cookfuel + ", radio=" + radio + ", fm=" + fm + ", tv=" + tv + ", tvsig=" + tvsig + ", refrigerator=" + refrigerator + ", coolheatfact=" + coolheatfact + ", pc=" + pc + ", telebroadband=" + telebroadband + ", mob=" + mob + ", bicycle=" + bicycle + ", r2wheel=" + r2wheel + ", r4wheel=" + r4wheel + ", tnocommveh=" + tnocommveh + ", parkingfact=" + parkingfact + ", lift=" + lift + ", escalator=" + escalator + ", helipad=" + helipad + ", gendiss=" + gendiss + ", firstaidkit=" + firstaidkit + ", g_insu=" + g_insu + ", nhospdist=" + nhospdist + ", deathin10years=" + deathin10years + ", reasonofdeath=" + reasonofdeath + ", deathagegroup=" + deathagegroup + ", smartsecuritysystem=" + smartsecuritysystem + ", cctvipadress=" + cctvipadress + ", fireextinguisher=" + fireextinguisher + ", firealarm=" + firealarm + ", privatesecurityguard=" + privatesecurityguard + ", privatelicensearms=" + privatelicensearms + ", burglaralarm=" + burglaralarm + ", expectation=" + expectation + ", filldate=" + filldate + ", timein=" + timein + ", timeout=" + timeout + ", note=" + note + ", comment=" + comment + ", status=" + status + '}';
    }

    public String toInsertQuery(){
        return "Insert into `pbtcensus_houselisting` valsues( " + getNullOrValue(empenumno) + "," +getNullOrValue(hl_sno) + "," +getNullOrValue(hh_sno) + "," +getNullOrValue(ucid) + "," +getNullOrValue(fsno) + "," +getNullOrValue(stut) + "," +getNullOrValue(dist) + "," +getNullOrValue(tehsil) + "," +getNullOrValue(townvillage) + "," +getNullOrValue(wardno) + "," +getNullOrValue(hnoadd) + "," +getNullOrValue(pincode) + "," +getNullOrValue(owspofhouse) + "," +getNullOrValue(typeofhouse) + "," +getNullOrValue(roof) + "," +getNullOrValue(floor) + "," +getNullOrValue(wall) + "," +getNullOrValue(dwellingroom) + "," +getNullOrValue(fndyrofhouse) + "," +getNullOrValue(cndtofhouse) + "," +getNullOrValue(useofhouse) + "," +getNullOrValue(plotarea) + "," +getNullOrValue(builtuparea) + "," +getNullOrValue(nooftrees) + "," +getNullOrValue(noofprottrees) + "," +getNullOrValue(typeofdomanimalwithno) + "," +getNullOrValue(typeofpetanimalwithno) + "," +getNullOrValue(latilongi) + "," +getNullOrValue(ownername) + "," +getNullOrValue(ownerphnno) + "," +getNullOrValue(nomarrcoup) + "," +getNullOrValue(mainsrcdrwater) + "," +getNullOrValue(mainsrclight) + "," +getNullOrValue(altsrcoflight) + "," +getNullOrValue(accessof_l) + "," +getNullOrValue(typeof_l) + "," +getNullOrValue(drainagesys) + "," +getNullOrValue(wtrharv) + "," +getNullOrValue(bathfact) + "," +getNullOrValue(swimmingpool) + "," +getNullOrValue(kitchen) + "," +getNullOrValue(cookfuel) + "," +getNullOrValue(radio) + "," +getNullOrValue(fm) + "," +getNullOrValue(tv) + "," +getNullOrValue(tvsig) + "," +getNullOrValue(refrigerator) + "," +getNullOrValue(coolheatfact) + "," +getNullOrValue(pc) + "," +getNullOrValue(telebroadband) + "," +getNullOrValue(mob) + "," +getNullOrValue(bicycle) + "," +getNullOrValue(r2wheel) + "," +getNullOrValue(r4wheel) + "," +getNullOrValue(tnocommveh) + "," +getNullOrValue(parkingfact) + "," +getNullOrValue(lift) + "," +getNullOrValue(escalator) + "," +getNullOrValue(helipad) + "," +getNullOrValue(gendiss) + "," +getNullOrValue(firstaidkit) + "," +getNullOrValue(g_insu) + "," +getNullOrValue(nhospdist) + "," +getNullOrValue(deathin10years) + "," +getNullOrValue(reasonofdeath) + "," +getNullOrValue(deathagegroup) + "," +getNullOrValue(smartsecuritysystem) + "," +getNullOrValue(cctvipadress) + "," +getNullOrValue(fireextinguisher) + "," +getNullOrValue(firealarm) + "," +getNullOrValue(privatesecurityguard) + "," +getNullOrValue(privatelicensearms) + "," +getNullOrValue(burglaralarm) + "," +getNullOrValue(expectation) + "," +getNullOrValue(filldate) + "," +getNullOrValue(timein) + "," +getNullOrValue(timeout) + "," +getNullOrValue(note) + "," +getNullOrValue(comment) + "," +getNullOrValue(status) + ",";
    }    

    private String getNullOrValue(Object name){
        if(name==null)
            return null;
        else
            return " '" + name + "' ";
    }

    public void getFromhlsno(int hlsno) {
        String query = "Select * from `pbtcensus_houselisting` where hl_sno = '" + hlsno + "'";
        getData(query);
    }

    private void getData(String query) {
        ParabitDBC db = new ParabitDBC();
        try {
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next()){
                    empenumno = db.rs1.getString("empenumno");
                    hl_sno = db.rs1.getInt("hl_sno");
                    hh_sno = db.rs1.getInt("hh_sno");
                    ucid = db.rs1.getInt("ucid");
                    fsno = db.rs1.getInt("fsno");
                    stut = db.rs1.getString("stut");
                    dist = db.rs1.getString("dist");
                    tehsil = db.rs1.getString("tehsil");
                    townvillage = db.rs1.getString("townvillage");
                    wardno = db.rs1.getString("wardno");
                    hnoadd = db.rs1.getString("hnoadd");
                    pincode = db.rs1.getString("pincode");
                    owspofhouse = db.rs1.getInt("owspofhouse");
                    typeofhouse = db.rs1.getInt("typeofhouse");
                    roof = db.rs1.getInt("roof");
                    floor = db.rs1.getInt("floor");
                    wall = db.rs1.getInt("wall");
                    dwellingroom = db.rs1.getString("dwellingroom");
                    fndyrofhouse = db.rs1.getString("fndyrofhouse");
                    cndtofhouse = db.rs1.getString("cndtofhouse");
                    useofhouse = db.rs1.getString("useofhouse");
                    plotarea = db.rs1.getString("plotarea");
                    builtuparea = db.rs1.getString("builtuparea");
                    nooftrees = db.rs1.getString("nooftrees");
                    noofprottrees = db.rs1.getString("noofprottrees");
                    typeofdomanimalwithno = db.rs1.getString("typeofdomanimalwithno");
                    typeofpetanimalwithno = db.rs1.getString("typeofpetanimalwithno");
                    latilongi = db.rs1.getString("latilongi");
                    ownername = db.rs1.getString("ownername");
                    ownerphnno = db.rs1.getString("ownerphnno");
                    nomarrcoup = db.rs1.getString("nomarrcoup");
                    mainsrcdrwater = db.rs1.getInt("mainsrcdrwater");
                    mainsrclight = db.rs1.getInt("mainsrclight");
                    altsrcoflight = db.rs1.getInt("altsrcoflight");
                    accessof_l = db.rs1.getInt("accessof_l");
                    typeof_l = db.rs1.getInt("typeof_l");
                    drainagesys = db.rs1.getString("drainagesys");
                    wtrharv = db.rs1.getString("wtrharv");
                    bathfact = db.rs1.getInt("bathfact");
                    swimmingpool = db.rs1.getString("swimmingpool");
                    kitchen = db.rs1.getInt("kitchen");
                    cookfuel = db.rs1.getInt("cookfuel");
                    radio = db.rs1.getString("radio");
                    fm = db.rs1.getString("fm");
                    tv = db.rs1.getInt("tv");
                    tvsig = db.rs1.getInt("tvsig");
                    refrigerator = db.rs1.getString("refrigerator");
                    coolheatfact = db.rs1.getInt("coolheatfact");
                    pc = db.rs1.getInt("pc");
                    telebroadband = db.rs1.getInt("telebroadband");
                    mob = db.rs1.getString("mob");
                    bicycle = db.rs1.getInt("bicycle");
                    r2wheel = db.rs1.getInt("r2wheel");
                    r4wheel = db.rs1.getInt("r4wheel");
                    tnocommveh = db.rs1.getInt("tnocommveh");
                    parkingfact = db.rs1.getString("parkingfact");
                    lift = db.rs1.getString("lift");
                    escalator = db.rs1.getString("escalator");
                    helipad = db.rs1.getString("helipad");
                    gendiss = db.rs1.getString("gendiss");
                    firstaidkit = db.rs1.getString("firstaidkit");
                    
                    g_insu = db.rs1.getString("g_insu");
                    nhospdist = db.rs1.getString("nhospdist");
                    deathin10years = db.rs1.getInt("deathin10years");
                    reasonofdeath = db.rs1.getString("reasonofdeath");
                    deathagegroup = db.rs1.getString("deathagegroup");
                    
                    smartsecuritysystem = db.rs1.getString("smartsecuritysystem");
                    cctvipadress = db.rs1.getString("cctvipadress");
                    fireextinguisher = db.rs1.getInt("fireextinguisher");
                    firealarm = db.rs1.getString("firealarm");
                    privatesecurityguard = db.rs1.getString("privatesecurityguard");
                    privatelicensearms = db.rs1.getInt("privatelicensearms");
                    burglaralarm = db.rs1.getString("burglaralarm");
                    expectation = db.rs1.getString("expectation");
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
        String query = "Update `pbtcensus_houselisting` set ";
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
        query = query + " where hl_sno ='" + hl_sno + "'";
        return query;
    }
    
    public void update(String query){
        ParabitDBC db = new ParabitDBC();
        try {
            db.stm.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

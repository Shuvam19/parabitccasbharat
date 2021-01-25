/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DB.ParabitDBC;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author acer
 */
public class PBTIndustry {
    private Integer ICSNo;
    private Integer RegWith;
    private String RegNo;
    private String NameOfBusiness;
    private String CompANo;
    private String CompOwnrANo;
    private Date CompRegDate;
    private Integer OfficeType;
    private String FSSAINo;
    private String EnvCertNo;
    private String AreaOfComp;
    private Integer TurnOverOfComp;
    private String FnlProdOfComp;
    private String PrsntCEOofComp;
    private Integer NoOfMaleEmp;
    private Integer NoOfFemEMp;
    private Integer NoOfOtherEmp;
    private Integer MinSalOfComp;
    private Integer MaxSalOfComp;
    private Integer NoOfShift;
    private String ExportProd;
    private String GSTNo;
    private String MainSrcLight;
    private String MainSrc_WatForIndus;
    private String MainSrc_DrnkWat_inIndus;
    private Integer NoOfWash_inIndus;
    private String AvbOfCant;
    private String NearestPS;
    private String NearestHsp;
    private String NearestFireBrgd;
    private String NearestRail;
    private String NearestBusStp;
    private String NearestArprt;
    private String NearestTrnsprtAr;
    private String AvbOfMedFac_InsdComp;

    public Integer getIcsno(){
            return ICSNo;
    }

    public void setIcsno(Integer ICSNo){
            this.ICSNo=ICSNo;
    }

    public Integer getRegwith(){
            return RegWith;
    }

    public void setRegwith(Integer RegWith){
            this.RegWith=RegWith;
    }

    public String getRegno(){
            return RegNo;
    }

    public void setRegno(String RegNo){
            this.RegNo=RegNo;
    }

    public String getNameofbusiness(){
            return NameOfBusiness;
    }

    public void setNameofbusiness(String NameOfBusiness){
            this.NameOfBusiness=NameOfBusiness;
    }

    public String getCompano(){
            return CompANo;
    }

    public void setCompano(String CompANo){
            this.CompANo=CompANo;
    }

    public String getCompownrano(){
            return CompOwnrANo;
    }

    public void setCompownrano(String CompOwnrANo){
            this.CompOwnrANo=CompOwnrANo;
    }

    public Date getCompregdate(){
            return CompRegDate;
    }

    public void setCompregdate(Date CompRegDate){
            this.CompRegDate=CompRegDate;
    }

    public Integer getOfficetype(){
            return OfficeType;
    }

    public void setOfficetype(Integer OfficeType){
            this.OfficeType=OfficeType;
    }

    public String getFssaino(){
            return FSSAINo;
    }

    public void setFssaino(String FSSAINo){
            this.FSSAINo=FSSAINo;
    }

    public String getEnvcertno(){
            return EnvCertNo;
    }

    public void setEnvcertno(String EnvCertNo){
            this.EnvCertNo=EnvCertNo;
    }

    public String getAreaofcomp(){
            return AreaOfComp;
    }

    public void setAreaofcomp(String AreaOfComp){
            this.AreaOfComp=AreaOfComp;
    }

    public Integer getTurnoverofcomp(){
            return TurnOverOfComp;
    }

    public void setTurnoverofcomp(Integer TurnOverOfComp){
            this.TurnOverOfComp=TurnOverOfComp;
    }

    public String getFnlprodofcomp(){
            return FnlProdOfComp;
    }

    public void setFnlprodofcomp(String FnlProdOfComp){
            this.FnlProdOfComp=FnlProdOfComp;
    }

    public String getPrsntceoofcomp(){
            return PrsntCEOofComp;
    }

    public void setPrsntceoofcomp(String PrsntCEOofComp){
            this.PrsntCEOofComp=PrsntCEOofComp;
    }

    public Integer getNoofmaleemp(){
            return NoOfMaleEmp;
    }

    public void setNoofmaleemp(Integer NoOfMaleEmp){
            this.NoOfMaleEmp=NoOfMaleEmp;
    }

    public Integer getNooffememp(){
            return NoOfFemEMp;
    }

    public void setNooffememp(Integer NoOfFemEMp){
            this.NoOfFemEMp=NoOfFemEMp;
    }

    public Integer getNoofotheremp(){
            return NoOfOtherEmp;
    }

    public void setNoofotheremp(Integer NoOfOtherEmp){
            this.NoOfOtherEmp=NoOfOtherEmp;
    }

    public Integer getMinsalofcomp(){
            return MinSalOfComp;
    }

    public void setMinsalofcomp(Integer MinSalOfComp){
            this.MinSalOfComp=MinSalOfComp;
    }

    public Integer getMaxsalofcomp(){
            return MaxSalOfComp;
    }

    public void setMaxsalofcomp(Integer MaxSalOfComp){
            this.MaxSalOfComp=MaxSalOfComp;
    }

    public Integer getNoofshift(){
            return NoOfShift;
    }

    public void setNoofshift(Integer NoOfShift){
            this.NoOfShift=NoOfShift;
    }

    public String getExportprod(){
            return ExportProd;
    }

    public void setExportprod(String ExportProd){
            this.ExportProd=ExportProd;
    }

    public String getGstno(){
            return GSTNo;
    }

    public void setGstno(String GSTNo){
            this.GSTNo=GSTNo;
    }

    public String getMainsrclight(){
            return MainSrcLight;
    }

    public void setMainsrclight(String MainSrcLight){
            this.MainSrcLight=MainSrcLight;
    }

    public String getMainsrc_watforindus(){
            return MainSrc_WatForIndus;
    }

    public void setMainsrc_watforindus(String MainSrc_WatForIndus){
            this.MainSrc_WatForIndus=MainSrc_WatForIndus;
    }

    public String getMainsrc_drnkwat_inindus(){
            return MainSrc_DrnkWat_inIndus;
    }

    public void setMainsrc_drnkwat_inindus(String MainSrc_DrnkWat_inIndus){
            this.MainSrc_DrnkWat_inIndus=MainSrc_DrnkWat_inIndus;
    }

    public Integer getNoofwash_inindus(){
            return NoOfWash_inIndus;
    }

    public void setNoofwash_inindus(Integer NoOfWash_inIndus){
            this.NoOfWash_inIndus=NoOfWash_inIndus;
    }

    public String getAvbofcant(){
            return AvbOfCant;
    }

    public void setAvbofcant(String AvbOfCant){
            this.AvbOfCant=AvbOfCant;
    }

    public String getNearestps(){
            return NearestPS;
    }

    public void setNearestps(String NearestPS){
            this.NearestPS=NearestPS;
    }

    public String getNearesthsp(){
            return NearestHsp;
    }

    public void setNearesthsp(String NearestHsp){
            this.NearestHsp=NearestHsp;
    }

    public String getNearestfirebrgd(){
            return NearestFireBrgd;
    }

    public void setNearestfirebrgd(String NearestFireBrgd){
            this.NearestFireBrgd=NearestFireBrgd;
    }

    public String getNearestrail(){
            return NearestRail;
    }

    public void setNearestrail(String NearestRail){
            this.NearestRail=NearestRail;
    }

    public String getNearestbusstp(){
            return NearestBusStp;
    }

    public void setNearestbusstp(String NearestBusStp){
            this.NearestBusStp=NearestBusStp;
    }

    public String getNearestarprt(){
            return NearestArprt;
    }

    public void setNearestarprt(String NearestArprt){
            this.NearestArprt=NearestArprt;
    }

    public String getNearesttrnsprtar(){
            return NearestTrnsprtAr;
    }

    public void setNearesttrnsprtar(String NearestTrnsprtAr){
            this.NearestTrnsprtAr=NearestTrnsprtAr;
    }

    public String getAvbofmedfac_insdcomp(){
            return AvbOfMedFac_InsdComp;
    }

    public void setAvbofmedfac_insdcomp(String AvbOfMedFac_InsdComp){
            this.AvbOfMedFac_InsdComp=AvbOfMedFac_InsdComp;
    }
    
    public String toUpdateQuery(Map<String, Object> map) {
        String query = "Update `pbtindustry` set ";
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
        query = query + " where ICSNo ='" + ICSNo + "'";
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

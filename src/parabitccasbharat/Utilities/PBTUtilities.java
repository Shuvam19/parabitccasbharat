package parabitccasbharat.Utilities;

import DB.ParabitDBC;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PBTUtilities {
    //Instance Variables
    static ParabitDBC db = new ParabitDBC();
    
    //Array 
    public static List<String> bicycleDetails;
    public static List<String> domesticAnimalDetails;
    public static List<String> petAnimalDetails;
    public static List<String> religionDetails;
    public static List<String> categoryDetails;
    public static List<String> bloodGroupDetails;
    public static List<String> cEducationDetails;
    public static List<String> workSectorDetails;
    public static List<String> natureOfWorkDetails;
    public static List<String> modeOfTravelDetails;
    public static List<String> ownerShipDetails;
    public static List<String> chronicDiseaseDetails;
    public static List<String> roofDetails;
    public static List<String> wallDetails;
    public static List<String> floorDetails;
    public static List<String> houseCondDetails;
    public static List<String> drinkingWaterDetails;
    public static List<String> lightSourceDetails;
    public static List<String> latrineDetails;
    public static List<String> latrinetypeDetails;
    public static List<String> bathingDetails;
    private static List<String> kitchenDetails;
    private static List<String> cookFuelDetails;
    private static List<String> tvDetails;
    private static List<String> tvSigDetails;
    private static List<String> heatFacilityDetails;
    private static List<String> pcDetails;
    private static List<String> teleBroadBandDetails;
    private static List<String> phoneDetails;
    private static List<String> geneticDiseaseDetails;
    private static List<String> useOfHouseDetails;
    private static List<String> martialDetails;
    private static List<String> regWithDetails;
    

    public static String getReligion(String religion) {
        if(isNull(religionDetails)){
            religionDetails = new ArrayList<>();
            addDataInArray(religionDetails,"typeofreligion");
        }
        return religionDetails.get(Integer.parseInt(religion) - 1);
    }

    public static String getCategory(String category) {
        if(isNull(categoryDetails)){
            categoryDetails = new ArrayList<>();
            addDataInArray(categoryDetails, "workcategory");
        }
        return categoryDetails.get(Integer.parseInt(category) - 1);
    }

    public static String getBloodGroup(String bgroup) {
        if(isNull(bloodGroupDetails)){
            bloodGroupDetails = new ArrayList<>();
            addDataInArray(bloodGroupDetails, "bloodgroup");
        }
        return bloodGroupDetails.get(Integer.parseInt(bgroup) - 1);
    }

    public static String getCEduStatus(String cedustatus) {
        if(isNull(cEducationDetails)){
            cEducationDetails = new ArrayList<>();
            addDataInArray(cEducationDetails, "cedustatus");
        }
        return cEducationDetails.get(Integer.parseInt(cedustatus) - 1);
    }

    public static String getWorkSector(int workingsector) {
        if(isNull(workSectorDetails)){
            workSectorDetails = new ArrayList<>();
            addDataInArray(workSectorDetails, "workingsector");
        }
        return workSectorDetails.get(workingsector - 1);
    }

    public static String getNatureWork(int natureofwork) {
        if(isNull(natureOfWorkDetails)){
            natureOfWorkDetails = new ArrayList<>();
            addDataInArray(natureOfWorkDetails, "natureofwork");
        }
        return natureOfWorkDetails.get(natureofwork - 1);
    }

    public static String getModOfTravel(String modoftravel) {
        if(isNull(modeOfTravelDetails)){
            modeOfTravelDetails = new ArrayList<>();
            addDataInArray(modeOfTravelDetails, "modoftravel");
        }
        return modeOfTravelDetails.get(Integer.parseInt(modoftravel) - 1);
    }
    
    public static String getOwspStOfHouse(int owspstofhouse) {
        if(isNull(ownerShipDetails)){
            ownerShipDetails = new ArrayList<>();
            addDataInArray(ownerShipDetails, "owspstofhouse");
        }
        return ownerShipDetails.get(owspstofhouse - 1);
    }
    
    public static String getTypesofchronicdisease(String typesofchronicdisease) {
        if(isNull(chronicDiseaseDetails)){
            chronicDiseaseDetails = new ArrayList<>();
            addDataInArray(chronicDiseaseDetails, "typesofchronicdisease");
        }
        return chronicDiseaseDetails.get(Integer.parseInt(typesofchronicdisease) - 1);
    }
    
    public static String getRoof(int roof) {
        if(isNull(roofDetails)){
            roofDetails = new ArrayList<>();
            addDataInArray(roofDetails, "roof");
        }
        return roofDetails.get(roof - 1);
    }
   
    public static String getWall(int wall) {
        if(isNull(wallDetails)){
            wallDetails = new ArrayList<>();
            addDataInArray(wallDetails, "wall");
        }
        return wallDetails.get(wall - 1);
    }
    
    public static String getFloor(int floor) {
        if(isNull(floorDetails)){
            floorDetails = new ArrayList<>();
            addDataInArray(floorDetails, "floor");
        }
        return floorDetails.get(floor - 1);
    }
    
    public static String getCndtOfHouse(String cndtofhouse) {
        if(isNull(houseCondDetails)){
            houseCondDetails = new ArrayList<>();
            addDataInArray(houseCondDetails, "cndtofhouse");
        }
        return houseCondDetails.get(Integer.parseInt(cndtofhouse) - 1);
    }
    
    public static String getMainSrcDrWater(String mainsrcdrwater) {
        if(isNull(drinkingWaterDetails)){
            drinkingWaterDetails = new ArrayList<>();
            addDataInArray(drinkingWaterDetails, "mainsrcdrwater");
        }
        return drinkingWaterDetails.get(Integer.parseInt(mainsrcdrwater) - 1);
    }
    
    public static String getLight_source(String light_source) {
        if(isNull(lightSourceDetails)){
            lightSourceDetails = new ArrayList<>();
            addDataInArray(lightSourceDetails, "light_source");
        }
        return lightSourceDetails.get(Integer.parseInt(light_source) - 1);
    }
    
    public static String getAccessoflatrine(int accessoflatrine) {
        if(isNull(latrineDetails)){
            latrineDetails = new ArrayList<>();
            addDataInArray(latrineDetails, "accessoflatrine");
        }
        return latrineDetails.get(accessoflatrine - 1);
    }
    
    public static String getTypesoflatrine(int typesoflatrine) {
        if(isNull(latrinetypeDetails)){
            latrinetypeDetails = new ArrayList<>();
            addDataInArray(latrinetypeDetails, "typesoflatrine");
        }
        return latrinetypeDetails.get(typesoflatrine - 1);
    }
    
    public static String getBathingfacility(int bathingfacility) {
        if(isNull(bathingDetails)){
            bathingDetails = new ArrayList<>();
            addDataInArray(bathingDetails, "bathingfacility");
        }
        return bathingDetails.get(bathingfacility - 1);
    }
    
    public static String getKitchen(int kitchen) {
        if(isNull(kitchenDetails)){
            kitchenDetails = new ArrayList<>();
            addDataInArray(kitchenDetails, "kitchen");
        }
        return kitchenDetails.get(kitchen - 1);
    }
    
    public static String getCookfuel(int cookfuel) {
        if(isNull(cookFuelDetails)){
            cookFuelDetails = new ArrayList<>();
            addDataInArray(cookFuelDetails, "cookfuel");
        }
        return cookFuelDetails.get(cookfuel - 1);
    }

    public static String getTv(String tv) {
        if(isNull(tvDetails)){
            tvDetails = new ArrayList<>();
            addDataInArray(tvDetails, "tv");
        }
        return tvDetails.get(Integer.parseInt(tv) - 1);
    }

    public static String getTvsig(String tvsig) {
        if(isNull(tvSigDetails)){
            tvSigDetails = new ArrayList<>();
            addDataInArray(tvSigDetails, "tvsig");
        }
        return tvSigDetails.get(Integer.parseInt(tvsig) - 1);
    }

    public static String getCoolheatfact(String coolheatfact) {
        if(isNull(heatFacilityDetails)){
            heatFacilityDetails = new ArrayList<>();
            addDataInArray(heatFacilityDetails, "coolheatfact");
        }
        return heatFacilityDetails.get(Integer.parseInt(coolheatfact) - 1);
    }

    public static String getPc(String pc) {
        if(isNull(pcDetails)){
            pcDetails = new ArrayList<>();
            addDataInArray(pcDetails, "pc");
        }
        return pcDetails.get(Integer.parseInt(pc) - 1);
    }

    public static String getTelebroadband(String telebroadband) {
        if(isNull(teleBroadBandDetails)){
            teleBroadBandDetails = new ArrayList<>();
            addDataInArray(teleBroadBandDetails, "telebroadband");
        }
        return teleBroadBandDetails.get(Integer.parseInt(telebroadband) - 1);
    }

    public static String getPhone(String phone) {
        if(isNull(phoneDetails)){
            phoneDetails = new ArrayList<>();
            addDataInArray(phoneDetails, "phone");
        }
        return phoneDetails.get(Integer.parseInt(phone) - 1);
    }

    public static String getTypesofgeneticdisease(String typesofgeneticdisease) {
        if(isNull(geneticDiseaseDetails)){
            geneticDiseaseDetails = new ArrayList<>();
            addDataInArray(geneticDiseaseDetails, "typesofgeneticdisease");
        }
        return geneticDiseaseDetails.get(Integer.parseInt(typesofgeneticdisease) - 1);
    }
    
    public static String getUseofhouse(String useofhouse) {
        if(isNull(useOfHouseDetails)){
            useOfHouseDetails = new ArrayList<>();
            addDataInArray(useOfHouseDetails, "useofhouse");
        }
        return useOfHouseDetails.get(Integer.parseInt(useofhouse) - 1);
    }
    
    public static String getMarital_status(String marital_status) {
        if(isNull(martialDetails)){
            martialDetails = new ArrayList<>();
            addDataInArray(martialDetails, "marital_status");
        }
        return martialDetails.get(Integer.parseInt(marital_status) - 1);
    }
    
    public static String getBicycle(int bicycle){
        if(isNull(bicycleDetails)){
            bicycleDetails = new ArrayList<>();
            addDataInArray(bicycleDetails,"typesofbicycle");
        }
        return bicycleDetails.get(bicycle - 1);
    }
    
    public static String getDomesticAnimals(String animal){
        if(isNull(domesticAnimalDetails)){
            domesticAnimalDetails = new ArrayList<>();
            addDataInArray(domesticAnimalDetails,"domesticanimal");
        }
        return domesticAnimalDetails.get(Integer.parseInt(animal) - 1);
    }
    
    public static String getPetAniamls(String petanimal){
        if(isNull(petAnimalDetails)){
            petAnimalDetails = new ArrayList<>();
            addDataInArray(petAnimalDetails,"petanimal");
        }
        return petAnimalDetails.get(Integer.parseInt(petanimal) - 1);
    }
    
    public static String getRegWith(String regwith) {
        if(isNull(regWithDetails)){
            regWithDetails = new ArrayList<>();
            addDataInArray(regWithDetails, "regwith");
        }
        return regWithDetails.get(Integer.parseInt(regwith) - 1);
    }

    private static boolean isNull(List<String> arrayList) {
        return arrayList == null;
    }

    private static void addDataInArray(List<String> arrayList, String tablename) {
        String query = "SELECT * FROM " + tablename;
        try {
            db.rs1 = db.stm.executeQuery(query);
            while (db.rs1.next()) {
                arrayList.add(db.rs1.getString(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
   
}

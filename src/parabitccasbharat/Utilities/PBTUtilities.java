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
    static List<String> bicycleDetails;
    static List<String> domesticAnimalDetails;
    static List<String> petAnimalDetails;

    public static String getReligion(String religion) {
        switch(religion){
            case "1": return "Hindu";
            case "2": return "Muslim";
            case "3": return "Christian";
            case "4": return "Sikh";
            case "5": return "Buddhist";
            case "6": return "Jain";
            case "7": return "Zoroastrian";
            default: return "Others/Religion Not Specified";
        }
    }

    public static String getCategory(String category) {
        switch(category){
            case "1": return "General";
            case "2": return "Other Backward Classes (OBC)";
            case "3": return "Scheduled Tribes (ST)";
            case "4": return "Physically Handicapped (Blind, Deaf & Dumb and OPH)";
            case "5": return "Scheduled Castes (SC)";
            case "6": return "Economically Weaker Section (EWS)";
            default: return "Others";
        }
    }

    public static String getBloodGroup(String bgroup) {
        switch(bgroup){
            case "1": return "O+";
            case "2": return "A+";
            case "3": return "B+";
            case "4": return "AB+";
            case "5": return "O-";
            case "6": return "A-";
            case "7": return "B-";
            default: return "AB-";
        }
    }

    public static String getCEduStatus(String cedustatus) {
        switch(cedustatus){
            case "1": return "School";
            case "2": return "College";
            case "3": return "Vocational";
            case "4": return "Special Institute for disabled";
            case "5": return "Literacy Status";
            case "6": return "Other Institution";
            case "7": return "Attended Before";
            default: return "Never Attended";
        }
    }

    public static String getWorkSector(int workingsector) {
        switch(workingsector){
            case 1: return "Goverment Sector";
            case 2: return "Priate Sector";
            case 3: return "Business";
            default: return "Freelancer";
        }
    }

    public static String getNatureWork(int natureofwork) {
        switch(natureofwork){
            case 1: return "Primary";
            case 2: return "Manufacturing";
            case 3: return "Gas,Water Supply";
            case 4: return "Construction";
            case 5: return "Trade";
            default: return "Service";
        }
    }

    public static String getModOfTravel(String modoftravel) {
        switch(modoftravel){
            case "1": return "On Foot";
            case "2": return "Bicycle";
            case "3": return "Moped/Scooter/MotorCycle";
            case "4": return "Car/Jeep/Van";
            case "5": return "Tempo/AutoRickshaw/Taxi";
            case "6": return "Bus";
            case "7": return "Train / Metro";
            case "8": return "Water Transport";
            case "9": return "Water Taxi";
            case "10": return "Air Transport";
            case "11": return "Air Taxi";
            default: return "Animal Transport";
        }
    }
    
    public static String getOwspStOfHouse(int owspstofhouse) {
        switch(owspstofhouse){
            case 1: return "Owned";
            case 2: return "Rented but has Own House Elsewhere";
            case 3: return "Rented and not Own Any House";
            default : return "Any Other";
        }
    }
    
    public static String getTypesofchronicdisease(String typesofchronicdisease) {
        switch(typesofchronicdisease){
            case "1": return "Addison's disease";
            case "2": return "Asthma";
            case "3": return "Bronchiectasis";
            case "4": return "Cardiac failure";
            case "5": return "Cardiomyopathy";
            case "6": return "Chronic obstructive pulmonary disorder";
            case "7": return "Chronic renal disease";
            case "8": return "Coronary artery disease";
            case "9": return "Crohn's disease";
            case "10": return "Diabetes insipidus";
            case "11": return "Diabetes mellitus types 1 & 2";
            case "12": return "Dysrhythmias ";
            case "13": return "Epilepsy";
            case "14": return "Glaucoma";
            case "15": return "Haemophilia";
            case "16": return "Hyperlipidaemia";
            case "17": return "Hypertension";
            case "18": return "Hypothyroidism";
            case "19": return "Multiple sclerosis";
            case "20": return "Parkinson's disease";
            case "21": return "Rheumatoid arthritis";
            case "22": return "Schizophrenia";
            case "23": return "Systemic lupus erythematosus";
            case "24": return "Ulcerative colitis";
            default : return "Bipolar Mood Disorder";
        }
    }
    
    public static String getRoof(int roof) {
        switch(roof){
            case 1: return "Grass/Thatch/Bamboo/Wood/Mud";
            case 2: return "Plastic/Polythene";
            case 3: return "Handmade Tiles";
            case 4: return "Machine made Tiles";
            case 5: return "Burnt Brick";
            case 6: return "Stone";
            case 7: return "Slate";
            case 8: return "G.I/Metal/Asbestos sheets";
            case 9: return "Concrete";
            default : return "Glass";
        }
    }
   
    public static String getWall(int wall) {
        switch(wall){
            case 1: return "Grass/Thatch/Bamboo";
            case 2: return "Plastic/Polythene";
            case 3: return "Mud/Unburnt brick";
            case 4: return "Wood";
            case 5: return "Stone not packed with mortar";
            case 6: return "Stone packed with mortar";
            case 7: return "G.I/Metal/Asbestos Sheets";
            case 8: return "Burnt Brick";
            case 9: return "Concrete";
            case 10: return "Glass";
            default : return "PVC";
        }
    }
    
    public static String getFloor(int floor) {
        switch(floor){
            case 1: return "Mud";
            case 2: return "Wood/Bamboo";
            case 3: return "Burnt Brick";
            case 4: return "Mosaic";
            case 5: return "Floor Tiles";
            case 6: return "Cement";
            case 7: return "Stone - Granite";
            case 8: return "Stone - Marble ";
            case 9: return "Stone - Kota";
            case 10: return "Stone";
            default : return "Glass";
        }
    }
    
    public static String getCndtOfHouse(String cndtofhouse) {
        switch(cndtofhouse){
            case "1": return "Good";
            case "2": return "Livable";
            default : return "Non Livable";
        }
    }
   
    public static String getDomesticAnimal(String domesticanimal) {
        switch(domesticanimal){
            case "1": return "Bee";
            case "2": return "Buffaloes";
            case "3": return "Camle";
            case "4": return "Chicken";
            case "5": return "Cow";
            case "6": return "Crab";
            case "7": return "Deer";
            case "8": return "Donkey";
            case "9": return "Dove";
            case "10": return "Duck";
            case "11": return "Elephant";
            case "12": return "Fish";
            case "13": return "Goat";
            case "14": return "Horse";
            case "15": return "Mule";
            case "16": return "Pig";
            case "17": return "Sheep";
            case "18": return "Shrimp";
            case "19": return "Turkey";
            default : return "Yalk";
        }
    }
    
    public static String getPetAnimal(String petanimal) {
        switch(petanimal){
            case "1": return "Bird";
            case "2": return "Cat";
            case "3": return "Dog";
            case "4": return "Fish";
            case "5": return "Hamster";
            case "6": return "Mouse";
            case "7": return "Rabbit";
            default : return "Turtle";
        }
    }
    
    public static String getMainSrcDrWater(String mainsrcdrwater) {
        switch(mainsrcdrwater){
            case "1": return "Tap water from treated source";
            case "2": return "Tap water from untreated source";
            case "3": return "Well";
            case "4": return "Hand Pump";
            case "5": return "Tubewell/Borehole";
            case "6": return "Spring";
            case "7": return "River/Canal";
            case "8": return "Tank/Pond/Lake";
            case "9": return "Packaged/bottled water";
            default : return "Machine";
        }
    }
    
    public static String getLight_source(String light_source) {
        switch(light_source){
            case "1": return "Solar Panels";
            case "2": return "Wind Turbines";
            case "3": return "Running Water";
            case "4": return "Portable Generator";
            case "5": return "Inverter";
            case "6": return "Standby Generator";
            case "7": return "Industrial Generator";
            case "8": return "Wired Electricity";
            case "9": return "Kerosene";
            case "10": return "Gas";
            default : return "Candle ";
        }
    }
    
    public static String getAccessoflatrine(int accessoflatrine) {
        switch(accessoflatrine){
            case 1: return "Exclusively for Household use only";
            case 2: return "Shared with other Household";
            case 3: return "Public Latrine";
            default : return "Open";
        }
    }
    
    public static String getTypesoflatrine(int typesoflatrine) {
        switch(typesoflatrine){
            case 1: return "Flush / Pour flush connected to Piped Sewer System";
            case 2: return "Flush / Pour flush connected to Septic Tank";
            case 3: return "Flush / Pour flush connected to Other System";
            case 4: return "Twin pit latrin with Slab / Ventilated improved pit";
            case 5: return "Twin pit latrin without Slab / Open pit";
            case 6: return "Single pit latrine with Slab / Ventilated improved pit";
            case 7: return "Single pit latrine without Slab / Open pit";
            case 8: return "Service latrine Night Soil removed by Human";
            case 9: return "Service latrine Night Soil serviced by Animals";
            default : return "Night Soil disposed into Open Drain";
        }
    }
    
    public static String getBathingfacility(int bathingfacility) {
        switch(bathingfacility){
            case 1: return "Bathroom";
            case 2: return "Enclosure without Roof";
            default : return "No";
        }
    }
    
    public static String getKitchen(int kitchen) {
        switch(kitchen){
            case 1: return "Cooking In Kitchen";
            case 2: return "Cooking Inside House But Not In Kitchen";
            case 3: return "Cooking In Open/Outside House";
            default : return "No Cooking";
        }
    }
    
    public static String getCookfuel(int cookfuel) {
        switch(cookfuel){
            case 1: return "Firwood";
            case 2: return "Crop Residue";
            case 3: return "Cowdung Cake";
            case 4: return "Coal/Lignite/Charcoal";
            case 5: return "Kerosene";
            case 6: return "LPG/PNG";
            case 7: return "Induction";
            case 8: return "Microwave Owen";
            case 9: return "Bio-Gas";
            case 10: return "Solar";
            default : return "AnyOther";
        }
    }

    public static String getTv(String tv) {
        switch(tv){
            case "1": return "LED";
            case "2": return "LCD";
            case "3": return "Plasma";
            case "4": return "OLED";
            case "5": return "QLED";
            case "6": return "DLP";
            case "7": return "DLD";
            case "8": return "MICRO LED";
            case "9": return "3DTV";
            default: return "Direct View";
        }
    }

    public static String getTvsig(String tvsig) {
        switch(tvsig){
            case "1": return "DDFreeDish";
            case "2": return "Cable";
            case "3": return "DTH";
            default : return "WebTV";
        }
    }

    public static String getCoolheatfact(String coolheatfact) {
        switch(coolheatfact){
            case "1": return "Fan";
            case "2": return "Cooler";
            case "3": return "Air Conditioner/AC";
            case "4": return "Fan and Cooler";
            case "5": return "Cooler and AC";
            case "6": return "Fan and AC";
            case "7": return "Fan and Cooler and AC";
            case "8": return "Heat Pump";
            case "9": return "Indirect Direct Evaporating Cooling System (IDEC)";
            case "10": return "Cooling Towers";
            case "11": return "Air Cooling Unit";
            case "12": return "Roof Cooling";
            case "13": return "Centralized AC";
            case "14": return "Centralized Cooler";
            case "15": return "Heater";
            case "16": return "Furnace";
            default : return "Centralized Heating System";
        }
    }

    public static String getPc(String pc) {
        switch(pc){
            case "1": return "Laptop";
            case "2": return "Desktop";
            case "3": return "Tablet";
            case "4": return "Pocket PC";
            case "5": return "Utra Mobile PC";
            case "6": return "Laptop,Desktop";
            case "7": return "Laptop,Tablet";
            case "8": return "Laptop,PocketPC";
            case "9": return "Laptop,Ultra mobile PC";
            case "10": return "Desktop,Tablet";
            case "11": return "Desktop,PocketPC";
            case "12": return "Desktop,Ultra Mobile PC";
            case "13": return "Tablet,Ultra Mobile PC";
            case "14": return "Tablet,Pocket PC";
            case "15": return "Pocket PC,Ultra Mobile PC";
            case "16": return "Laptop,Desktop,Tablet";
            case "17": return "Laptop,Desktop,PocketPC";
            case "18": return "Laptop,Desktop,Ultr Mobile PC";
            case "19": return "Laptop,Tablet,PocketPC";
            case "20": return "Laptop,Tablet,Ultra Mobile PC";
            case "21": return "Laptop,PocketPC,Ultra Mobile PC";
            case "22": return "Desktop,Tablet,PocketPC";
            case "23": return "Desktop,Tablet,Ultra Mobile PC";
            case "24": return "Desktop,PocketPC,Ultra Mobile PC";
            case "25": return "Tablet,PocketPC,Ultra Mobile PC";
            case "26": return "Laptop,Desktop,Tablet,PocketPC";
            case "27": return "Laptop,Desktop,Tablet,Ultra Mobile PC";
            case "28": return "Laptop,Tablet,PocketPC,Ultra Mobile PC,";
            case "29": return "Laptop,Desktop,PocketPC,Ultra Mobile PC";
            case "30": return "Desktop,Tablet,PocketPC,Ultra Mobile PC";
            default : return "Laptop,Desktop,Tablet,PocketPC,Ultra Mobile PC";
        }
    }

    public static String getTelebroadband(String telebroadband) {
        switch(telebroadband){
            case "1": return "Telephone";
            case "2": return "DSL Broadband";
            case "3": return "Cable Modem";
            case "4": return "Fiber";
            case "5": return "Wireless";
            case "6": return "Satellite";
            case "7": return "Broadband over Power Lines";
            case "8": return "Telephone, DSL";
            case "9": return "Telephone,  Cable Modem";
            case "10": return "Telephone, Fiber";
            case "11": return "Telephone, Wireless";
            case "12": return "Telephone,Satellite";
            default : return "Telephone,Broadband over Power Line";
        }
    }

    public static String getPhone(String phone) {
        switch(phone){
            case "1": return "Feature Phone";
            case "2": return "Smart Phone";
            case "3": return "Telephone";
            case "4": return "Feature Phone, Telephone";
            case "5": return "Feature Phone, Smart Phone";
            case "6": return "Smart Phone,Telephone";
            default : return "Feature Phone, Smart Phone, Telephone";
        }
    }

    public static String getTypesofgeneticdisease(String typesofgeneticdisease) {
        switch(typesofgeneticdisease){
            case "1": return "Cystic Fibrosis";
            case "2": return "Fanconi Anemia";
            case "3": return "Hartnup's Disease";
            case "4": return "Kartagener's Syndrome";
            case "5": return "Pyruvate Dehydrogenase Deficiency";
            case "6": return "Xeroderma Pigmentosum";
            case "7": return "Autosomal Dominant Disorders";
            case "8": return "Carbohydrate Metabolism Defect";
            case "9": return "Chromosomal";
            case "10": return "Sex chromosome";
            case "11": return "Connective Tissue disease";
            case "12": return "Glycogen Storage Disease";
            case "13": return "Hemophilia";
            case "14": return "Immune deficiency ";
            case "15": return "Combined Deficiency";
            case "16": return "Phagocyte Deficiency";
            case "17": return "T-Cell Deficiency";
            case "18": return "B-Cell Deficiency";
            case "19": return "Lysosomal Storage Disease";
            case "20": return "Nitrogen Metabolism Defect";
            case "21": return "RBC Disease";
            default : return "Renal";
        }
    }
    
    public static String getUseofhouse(String useofhouse) {
        switch(useofhouse){
            case "1": return "Residence";
            case "2": return "Residence-cum-other use";
            case "3": return "Shop/Office";
            case "4": return "School/College";
            case "5": return "Hotel/Lodge/Guest house";
            case "6": return "Hospital/Dispensary";
            case "7": return "Factory/Workshop/Workshed";
            case "8": return "Place of worship";
            case "9": return "Other non-residential use";
            default : return "Vacant";
        }
    }
    
    public static String getMarital_status(String marital_status) {
        switch(marital_status){
            case "1": return "Never Married";
            case "2": return "Currently Married";
            case "3": return "Widowed";
            case "4": return "Separated";
            default : return "Divorced";
        }
    }
    
    public static String getBicycle(int bicycle){
        if(isNull(bicycleDetails)){
            bicycleDetails = new ArrayList<>();
            addDataInArray(bicycleDetails,"typesofbicycle");
        }
        return bicycleDetails.get(bicycle);
    }

    private static boolean isNull(List<String> arrayList) {
        return arrayList == null;
    }

    private static void addDataInArray(List<String> arrayList, String tablename) {
        String query = "SELECT * FROM " + tablename;
        try {
            db.rs1 = db.stm.executeQuery(query);
            int next = 0;
            while (db.rs1.next()) {
                arrayList.add(db.rs1.getString(2));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static String getDomesticAnimals(int bicycle){
        if(isNull(domesticAnimalDetails)){
            domesticAnimalDetails = new ArrayList<>();
            addDataInArray(domesticAnimalDetails,"domesticanimal");
        }
        return bicycleDetails.get(bicycle);
    }
    
    public static String getPetAniamls(int bicycle){
        if(isNull(petAnimalDetails)){
            petAnimalDetails = new ArrayList<>();
            addDataInArray(petAnimalDetails,"petanimal");
        }
        return bicycleDetails.get(bicycle);
    }
}

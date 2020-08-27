package parabitccasbharat;

public class PBTUtilities {

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

    static String getCategory(String category) {
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

    static String getBloodGroup(String bgroup) {
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

    static String getCEduStatus(String cedustatus) {
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

    static String getWorkSector(int workingsector) {
        switch(workingsector){
            case 1: return "Goverment Sector";
            case 2: return "Priate Sector";
            case 3: return "Business";
            default: return "Freelancer";
        }
    }

    static String getNatureWork(int natureofwork) {
        switch(natureofwork){
            case 1: return "Primary";
            case 2: return "Manufacturing";
            case 3: return "Gas,Water Supply";
            case 4: return "Construction";
            case 5: return "Trade";
            default: return "Service";
        }
    }

    static String getModOfTravel(String modoftravel) {
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
    
    
}

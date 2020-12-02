
package parabitccasbharat.Utilities;

public class Queries {

    public static String getStateQuery() {
        return "SELECT DISTINCT states FROM `pbtstates5`";
    }

    public static String getDistOfStateQuery(String state) {
        return "SELECT DISTINCT District FROM `pbtstates5` WHERE States = '" + state + "'";
    }

    public static String getCityOfDistrictQuery(String district) {
        return "SELECT DISTINCT SubDist FROM `pbtstates5`WHERE District = '" + district + "'";
    }
    
//    public static class PopCountQuery{
//        private static String mainQuery = "";
//        private static boolean isFirstAdded = false;
//    }

    public static String getBloodGroupQuery() {
        return "SELECT BloodGroup FROM `bloodgroup`";
    }

    public static String getMartialStatusQuery() {
        return "SELECT Current_Marital_Status FROM `marital_status`";
    }
}

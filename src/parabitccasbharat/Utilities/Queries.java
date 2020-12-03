
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
    
    public static class PopCountQuery{
        private String mainQuery = "";
        private boolean isFirst = true;
        private void isFirstAdded(){
            if(isFirst){
                isFirst = false;
                mainQuery += " WHERE ";
            }else
                mainQuery += " AND ";
        }
        public String getQuery(){
            return mainQuery;
        }
        public void removeWholeQuery(){
            mainQuery = "";
        }
        public void addState(String state){
            isFirstAdded();
            mainQuery += " PmtStUt = '" + state + "'";
        }
    }

    public static String getBloodGroupQuery() {
        return "SELECT BloodGroup FROM `bloodgroup`";
    }

    public static String getMartialStatusQuery() {
        return "SELECT Current_Marital_Status FROM `marital_status`";
    }
}

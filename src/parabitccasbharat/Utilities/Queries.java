
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
    
}

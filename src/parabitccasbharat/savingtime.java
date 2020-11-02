/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

/**
 *
 * @author acer
 */
public class savingtime {
//    static int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
//    public static void main(String[] args) {
//        int totExtra = 0;
//        for(int i=1900;i<=1999;i++){
//            for(int j=0;j<12;j++){
//                int extra = 0;
//                if(j==2){
//                    if(i%4==0){
//                        extra = 29 % 7;
//                    }else{
//                        extra = arr[j] % 7;
//                    }
//                }else{
//                    extra =  arr[j] % 7;
//                }
//                totExtra += extra; 
//            }
//        }
//        totExtra %= totExtra % 7;
//        System.out.println(getDay(totExtra));
//    }
//    static String getDay(int day){
//        switch(day){
//            case 0: return "Monday";
//            case 1: return "Tuesday";
//            case 2: return "Wednesday";
//            case 3: return "Thrusday";
//            case 4: return "Friday";
//            case 5: return "Saturday";
//            default : return "Sunday";
//        }
//    }
}
/*{
    static int arr[];
    public static void main(String[] args) {
        int sum = 0;
        arr = new int[1000000];
        for(int i = 0;i<1000000;i++){
            if(isPrime(i)){
                if(sum+i>1000000){
                    break;
                }
                sum+=i;
            }
        }
        System.out.println(sum);
    }
//        for(int i=0;i<12;i++){
//            String s = sc.nextLine();
//            String[] arr = s.split(" ");
//            String ans = "case \"" + arr[3] + "\" : return " + arr[5];
//            System.out.println(ans);
//        }
//        String table[] = {"useofhouse","tv","tvsig","coolheatfact","pc","telebroadband","phone","typesofgeneticdisease"};
//        String table2[] = {"Accessof_l","Typeof_l","Bathfact","Kitchen","Cookfuel"};
//        for(int i=0;i<table2.length;i++){
//            solve(table[i]);
//            //solve2(table2[i]);
//        }
    public static void solve(String table){
        ParabitDBC db = new ParabitDBC();
        String query = "Select * From `" + table + "`";
        System.out.println("\n    static String get" + tofirst(table) + "(String " + table +") {");
        try {
            db.rs1 = db.stm.executeQuery(query);
            System.out.println("        switch("+table+"){");
            while(db.rs1.next()){
                String key = db.rs1.getString(1);
                String value = db.rs1.getString(2);
                String ans = "            case \""+ key + "\": return \"" + value + "\";";
                System.out.println(ans);
            }
            System.out.println("        }\n" + "    }");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static String tofirst(String table) {
        return table.substring(0, 1).toUpperCase() + table.substring(1);
    }

    private static void solve2(String s) {
        String s2 = "        PBT" + s + " frame = new PBT" +s + "(houselistingdata);\n" +
"        frame.setVisible(true);\n" +
"        this.condnofhouse.setText(PBTUtilities.get" +s + "(houselistingdata.get" + s+ "()));\n" +
"        updatemap.put(\"" + s+ "\", houselistingdata.get" +s + "());";
        System.out.println(s2);
    }

    private static boolean isPrime(int n) {
        if(n==0 || n== 1){
            return true;
        }
        if(arr[n]!=-1){
            return true;
        }
      for(int i=2;i<=Math.sqrt(n-1);i++){  
       if(n%i==0){    
        return false;            
       }      
      }
      return true;
    }
    
}*/

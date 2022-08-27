
import java.util.ArrayList;
import java.util.Scanner;

public class HesabBiHesab2 {
    static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfTrans = keyboard.nextInt();
        ArrayList<String[]> trans = new ArrayList<>();
        for(int i = 0 ; i < numberOfTrans;i++){
            String dOrW = keyboard.next();
            if(dOrW.equals("DEP")){
                trans.add(new String[]{dOrW,keyboard.next(),keyboard.next()});
            }else {
                trans.add(new String[]{dOrW,keyboard.next(),keyboard.next(),keyboard.next()});
            }
        }
        ArrayList<String[]> sortedTrans = new ArrayList<>();
        int size = trans.size();
        for(int i = 0 ; i < size;i++){
            String[] min=null;
            String minTime = "99:99";
            int index =0;
            for(int j = 0 ; j < trans.size();j++){
                if(lesserTime(trans.get(j)[2],minTime)){
                    minTime = trans.get(j)[2];
                    min = trans.get(j);
                    index = j;
                }
            }
            sortedTrans.add(min);
            trans.remove(index);
        }

//        for(String[] strings:sortedTrans){
//            for (String s:strings){
//                System.out.print(s+" ");
//            }
//            System.out.println();
//        }
        int depositAmount =0;
        int okWithdraws = 0;
        int max = 0;
        boolean ok = true;
        for(String[] strings:sortedTrans){
            if(strings[0].equals("DEP")){
                depositAmount += Integer.parseInt(strings[1]);
            }else if(strings[0].equals("WIT") && strings[3].equals("OK")){
                okWithdraws += Integer.parseInt(strings[1]);
            }else if(strings[0].equals("WIT") && strings[3].equals("FAIl")){
                if(max == 0 || max > Integer.parseInt(strings[1])){
                    max = Integer.parseInt(strings[1]);
                }
            }
        }
        if(max != 0 && max < depositAmount){
            System.out.println("DOROGHE");
        }else {
            int min = Math.abs(depositAmount - okWithdraws);
            System.out.println(min);
        }
    }
    static boolean lesserTime(String time1,String time2){
        int hour1 = Integer.parseInt(""+time1.charAt(0)+time1.charAt(1));
        int min1 = Integer.parseInt(""+time1.charAt(3)+time1.charAt(4));
        int hour2 = Integer.parseInt(""+time2.charAt(0)+time2.charAt(1));
        int min2 = Integer.parseInt(""+time2.charAt(3)+time2.charAt(4));
        if(hour1 < hour2){
            return true;
        }else if(hour1 > hour2){
            return false;
        }else {
            if(min1 < min2){
                return true;
            }else {
                return false;
            }
        }
    }
}

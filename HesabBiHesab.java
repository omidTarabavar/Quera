
import java.util.ArrayList;
import java.util.Scanner;

public class HesabBiHesab {
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
        int money = 0;
        int max = 0;
        int min = 0;
        boolean ok = true;
        for(String[] strings:sortedTrans){
            if(strings[0].equals("DEP")){
                if(max != 0){
                    if(max > Integer.parseInt(strings[1])){
                        max -= Integer.parseInt(strings[1]);
                    }else {
                        max = 0;
                    }
                }
                money += Integer.parseInt(strings[1]);
            }
            else {
                if(strings[3].equals("OK")){
                    if(money < Integer.parseInt(strings[1])){
                        if(max != 0 && Integer.parseInt(strings[1] )>= max){
                            System.out.println("DOROGHE");
                            ok = false;
                        }
                        else {
                            if(max != 0 && Integer.parseInt(strings[1]) < max){
                                max = Integer.parseInt(strings[1]);
                            }
                            min += Integer.parseInt(strings[1]) - money;
                            money = 0;
                        }
                    }else {
                        money -= Integer.parseInt(strings[1]);
                    }
                }
                else if(strings[3].equals("FAIL")){
                    if(money >= Integer.parseInt(strings[1])){
                        System.out.println("DOROGHE");
                        ok = false;
                    }else {
                        if(max == 0 || (max > Integer.parseInt(strings[1]))){
                            max = Integer.parseInt(strings[1]);
                        }
                    }
                }
            }
        }
        if(ok){
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

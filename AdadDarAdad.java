import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class AdadDarAdad {
    public static void main(String[] args) {
        int result = 0;
        Scanner keyboard =new Scanner(System.in);
        String input= keyboard.next();
        int primeNum = keyboard.nextInt();
        for(int i = 0 ; i < input.length();i++){
            for(int j = i+1 ; j <= input.length();j++){
                String sub = input.substring(i,j);
                if(sub.length()>9) {
                    if (divBig(sub, primeNum)) {
                        result += 1;
                    }
                }else {
                    if(Integer.parseInt(sub) % primeNum == 0){
                        result += 1;
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static boolean divBig(String numBig,int smallNum){
        String temp = "";
        for(int i = 0 ; i < numBig.length();i++){
            temp += numBig.charAt(i);
            if(Integer.parseInt(temp) < smallNum){
                if(i == numBig.length()-1){
                    break;
                }
            }else {
                int numTemp = Integer.parseInt(temp);
                if(numTemp % smallNum == 0){
                    temp ="";
                }else {
                    temp = (numTemp % smallNum)+"";
                }
            }
        }
        for(int i = 0 ; i < temp.length();i++){
            if(temp.charAt(i) != '0'){
                return false;
            }
        }
        return true;
    }
}

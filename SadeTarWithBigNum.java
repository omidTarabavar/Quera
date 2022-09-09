import java.util.ArrayList;
import java.util.Scanner;

public class SadeTarWithBigNum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1 = keyboard.nextInt();
        double num2 = keyboard.nextInt();
        double num3 = keyboard.nextInt();
        double num4 = keyboard.nextInt();
        double sum = num1+num2+num3+num4;
        double avg = (num1+num2+num3+num4)/4;
        double max = (Math.max(Math.max(num1,num2),Math.max(num3,num4)));
        double min = (Math.min(Math.min(num1,num2),Math.min(num3,num4)));
        int signsHolder = 1;
        if(num1 < 0){
            signsHolder *= -1;
            num1 *= -1;
        }
        if(num2 < 0){
            signsHolder *= -1;
            num2 *= -1;
        }
        if(num3 < 0){
            signsHolder *= -1;
            num3 *= -1;
        }
        if(num4 < 0){
            signsHolder *= -1;
            num4 *= -1;
        }
        String product = bigNumMul(""+((int)(num1*num2)),""+((int)(num3*num4)));
        if(signsHolder < 0){
            product = "-"+product;
        }
        System.out.println("Sum : "+fixString(sum));
        System.out.println("Average : "+fixString(avg));
        System.out.println("Product : "+product+".000000");
        System.out.println("MAX : "+fixString(max));
        System.out.println("MIN : "+fixString(min));
    }
    static String bigNumMul(String num1,String num2){
        ArrayList<String> comp = new ArrayList<>();
        String ans = "";
        for(int i = num2.length()-1 ; i >= 0 ;i--){
            int carry = 0;
            String newAns = ans;
            for(int j = num1.length()-1;j >=0 ;j--){
                int temp = (num2.charAt(i)-'0')*(num1.charAt(j)-'0')+carry;
                if(temp >= 10){
                    carry = temp/10;
                    newAns = (temp%10)+newAns;
                }else {
                    carry = 0;
                    newAns = temp+newAns;
                }
            }
            if(carry != 0){
                newAns = carry + newAns;
            }
            ans += "0";
            comp.add(newAns);
        }
        String result = "";
        for(String num:comp){
            result = bigNumSum(result,num);
        }
        return result;
    }
    static String bigNumSum(String num1,String num2){
        String result ="";
        if(num1.length() > num2.length()){
            num2 = fixSmallerNum((num1.length()-num2.length()),num2);
        }else if(num2.length() > num1.length()){
            num1 = fixSmallerNum((num2.length()-num1.length()),num1);
        }
        int carry = 0;
        for(int i = num1.length()-1 ; i >= 0 ;i--){
            int temp = ((num1.charAt(i)-'0')+(num2.charAt(i)-'0'))+carry;
            if(temp >= 10){
                carry = 1;
                result = ""+(temp-10)+result;
            }else {
                carry = 0;
                result = ""+temp+result;
            }
        }
        return result;
    }
    static String fixSmallerNum(int diff,String num){
        String result = "";
        for(int i = 0 ; i < diff;i++){
            result += "0";
        }
        result += num;
        return result;
    }
    static String fixString(double num){
        boolean flag = false;
        if(num % 1 == 0){
            return ""+(int)num+".000000";
        }else {

            if(num <0){
                flag = true;
                num *= -1;
            }
            String decimal = ("" + (num % 1)).substring(1);
            String temp = decimal;
            for(int i = 0 ; i < (7-decimal.length());i++){
                temp += "0";
            }
            if(flag){
                return "-"+((int)num)+temp;
            }
            return ""+((int)num)+temp;
        }
    }
}

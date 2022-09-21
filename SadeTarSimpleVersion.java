import java.util.Scanner;

public class SadeTarSimpleVersion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1 = keyboard.nextInt();
        double num2 = keyboard.nextInt();
        double num3 = keyboard.nextInt();
        double num4 = keyboard.nextInt();
        double sum = num1+num2+num3+num4;
        double avg = (num1+num2+num3+num4)/4;
        double product = num1*num2*num3*num4;
        double max = (Math.max(Math.max(num1,num2),Math.max(num3,num4)));
        double min = (Math.min(Math.min(num1,num2),Math.min(num3,num4)));
        System.out.println("Sum : "+fixString(sum));
        System.out.println("Average : "+fixString(avg));
        System.out.println("Product : "+fixString(product));
        System.out.println("MAX : "+fixString(max));
        System.out.println("MIN : "+fixString(min));
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

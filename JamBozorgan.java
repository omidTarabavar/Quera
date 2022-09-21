import java.util.Scanner;

public class JamBozorgan {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String num1 = keyboard.next();
        char func = keyboard.next().charAt(0);
        String num2 = keyboard.next();
        if(func =='+'){
            System.out.println(sum(num1,num2));
        }else {
            System.out.println(mul(num1,num2));
        }

    }
    static String mul(String num1,String num2){
        String biggerNum = biggerNum(num1,num2);
        String smallerNum = smallerNum(num1,num2);
        int numOfZeros = howManyZeros(smallerNum);
        String temp = "";
        for(int i = 0 ; i< numOfZeros;i++){
            temp += '0';
        }
        return biggerNum+temp;
    }
    static String sum(String num1,String num2){
        if(num1.length() == num2.length()){
            return '2'+num1.substring(1);
        }
        String biggerNum = biggerNum(num1,num2);
        String smallerNum = smallerNum(num1,num2);
        int numOfZeros = howManyZeros(smallerNum);
        int index = biggerNum.length()-(numOfZeros+1);
        return biggerNum.substring(0,index)+'1'+biggerNum.substring(index+1);
    }
    static int howManyZeros(String smallerNum){
        int result = 0;
        for(int i = 0 ; i < smallerNum.length();i++){
            if(smallerNum.charAt(i) == '0'){
                result += 1;
            }
        }
        return result;
    }
    static String biggerNum(String num1,String num2){
        if(num1.length() > num2.length()){
            return num1;
        }else {
            return num2;
        }
    }
    static String smallerNum(String num1,String num2){
        if(num1.length() < num2.length()){
            return num1;
        }else {
            return num2;
        }
    }
}

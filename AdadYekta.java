import java.util.Scanner;

public class AdadYekta {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int amount =keyboard.nextInt();
        int[] numArray = new int[amount];
        fillArray(numArray);
        System.out.println(sumOfSingulars(numArray));

    }
    public static int sumOfSingulars(int[] array){
        int[] numArr = new int[2];
        for(int i = 0 ; i < array.length;i++){
            int count = 0;
            for(int j = 0 ;j<array.length;j++){
                if(array[i] == array[j]){
                    count += 1;
                }
            }
            if(count == 1){
                if(numArr[0] == 0){
                    numArr[0]=array[i];
                }else {
                    numArr[1] = array[i];
                    numArr[0] = findXor(numArr[0],numArr[1]);
                }
            }
        }
        return numArr[0];
    }
    public static void fillArray(int[] array){
        for(int i = 0 ; i< array.length;i++){
            array[i] = Integer.parseInt(keyboard.next());
        }
    }
    public static int findXor(int num1,int num2){
        String num1Binary = convertToBinary(num1);
        String num2Binary = convertToBinary(num2);
        if(num1Binary.length() != num2Binary.length()){
            if(num1Binary.length() < num2Binary.length()){
                num1Binary = fixSizeBinary(num1Binary,num2Binary);
            }else {
                num2Binary = fixSizeBinary(num1Binary,num2Binary);
            }
        }
        String result = "";
        for(int i = 0 ; i<num1Binary.length();i++){
            if(num1Binary.charAt(i) == num2Binary.charAt(i)){
                result +='0';
            }else {
                result +='1';
            }
        }
        return convertToDecimal(result);
    }
    public static String convertToBinary(int num){
        String result ="";
        int maxPower = 0;
        while (Math.pow(2,maxPower+1)<=num){
            maxPower+=1;
        }
        int temp = num;
        for(int i= maxPower;i >= 0;i--){
            if(temp - Math.pow(2,i) >= 0){
                result +="1";
                temp = (int)(temp - Math.pow(2,i));
            }else {
                result += "0";
            }
        }
        return result;
    }

    public static String fixSizeBinary(String num1,String num2){
        String smallerOne = findBsmallBinaryNum(num1,num2);
        int gap = Math.abs(num1.length() - num2.length());
        String addition="";
        for(int i = 0 ; i < gap ;i++){
            addition +="0";
        }
        return addition+smallerOne;
    }
    public static String findBsmallBinaryNum(String num1,String num2){
        if(num1.length() < num2.length()){
            return num1;
        }
        else return num2;
    }
    public static int convertToDecimal(String binaryNum){
        int result = 0;
        int power= binaryNum.length()-1;
        for(int i=0;i<binaryNum.length();i++){
            if(binaryNum.charAt(i) == '1'){
                result += Math.pow(2,power);
            }
            power -= 1;
        }
        return result;
    }
}

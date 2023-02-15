import java.util.Scanner;

public class SadganKhaste {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input1 = keyboard.next();
        String input2 = keyboard.next();
        int num1 = reverseNum(Integer.parseInt(input1));
        int num2= reverseNum(Integer.parseInt(input2));
        if(num1 > num2){
            System.out.println(input2+" < "+input1);
        }else if(num1 < num2){
            System.out.println(input1+" < "+input2);
        }else {
            System.out.println(input1+" = "+input2);
        }

    }
    static int reverseNum(int num){
        int result = 0;
        for(int i = 0 ; i < 3 ;i++){
            result *= 10;
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}

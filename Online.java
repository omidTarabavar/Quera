import java.util.Scanner;

public class Online {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        int result;
        if(num % 2 ==0){
            result = 13 + (num * 13);
        }
        else {
            result = 1401 - ( num * 13);
            result *= -1;
        }
        System.out.println(result);
    }
}

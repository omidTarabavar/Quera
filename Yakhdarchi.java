import java.util.Scanner;

public class Yakhdarchi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temp = keyboard.nextInt();
        if(temp > 100){
            System.out.println("Steam");
        }else if(temp >= 0){
            System.out.println("Water");
        }else {
            System.out.println("Ice");
        }
    }
}

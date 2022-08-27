import java.util.Scanner;

public class kolerYaBokhari {
    static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfInput = keyboard.nextInt();
        for(int i = 0 ;i < numberOfInput;i++){
            int temp = keyboard.nextInt();
            if(temp> 15){
                System.out.println("cooler");
            }else {
                System.out.println("heater");
            }
        }
    }
}

import java.util.Scanner;

public class KomakBeCopy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        String message = keyboard.next();
        for(int i=0;i < num;i++){
            System.out.print("copy of ");
        }
        System.out.print(message);
    }
}

import java.util.Scanner;

public class MorabahaVaMoshkelatEghtesadi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();
        double total= 0;
        for(int i = 0 ; i < n ; i++){
            total += keyboard.nextInt();
        }
        System.out.println((int)(n-(total/k)));
    }
}

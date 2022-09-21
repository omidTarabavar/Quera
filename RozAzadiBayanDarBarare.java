import java.util.Scanner;

public class RozAzadiBayanDarBarare {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(keyboard.nextInt() % 2 == 0 ? "Bala Barare":"Payin Barare");
    }
}

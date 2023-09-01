import java.util.Scanner;

public class DivarKeshi {
    public static void main(String[] args) {
        long a,b;
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextLong();
        b = keyboard.nextLong();
        System.out.println(a % b);
    }
}

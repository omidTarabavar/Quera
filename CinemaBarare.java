import java.util.Scanner;

public class CinemaBarare {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        long a = keyboard.nextLong();
        long b = keyboard.nextLong();
        System.out.println(Math.min(a, b));
    }
}

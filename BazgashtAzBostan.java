import java.util.Scanner;

public class BazgashtAzBostan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int x1 = keyboard.nextInt();
        int y1 = keyboard.nextInt();
        System.out.println((x1 - x) > 0? "Right":"Left");
    }
}

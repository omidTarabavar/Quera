import java.util.Scanner;

public class Behtarin {
    public static void main(String[] args) {
        String s = "quera is the best platform.";
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        System.out.println((int)s.charAt(num-1));
    }
}

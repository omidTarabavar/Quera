import java.util.Scanner;

public class ModiriatZamanNima {
    public static void main(String[] args) {
        int w, s, i;
        Scanner keyboard = new Scanner(System.in);
        w = keyboard.nextInt();
        s = keyboard.nextInt();
        i = keyboard.nextInt();
        System.out.println(24 - (w + s - i));
    }
}

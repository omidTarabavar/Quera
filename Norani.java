import java.util.Scanner;

public class Norani {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String s1 = keyboard.next();
        String s2 = keyboard.next();
        int dif = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                dif++;
        }
        if (dif % 2 == 0)
            System.out.println(dif / 2);
        else
            System.out.println("NO");
    }
}

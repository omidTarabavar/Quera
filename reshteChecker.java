import java.util.Scanner;

public class reshteChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String string1 = keyboard.next();
        String string2 = keyboard.next();
        if(string1.charAt(0) == string2.charAt(string2.length()-1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

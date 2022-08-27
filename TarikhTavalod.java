import java.util.Scanner;

public class TarikhTavalod {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        String input = keyboard.next();
        System.out.println("saal:"+input.substring(0,2));
        System.out.println("maah:"+input.substring(2,4));
    }
}

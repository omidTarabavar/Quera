import java.util.Scanner;

public class SoalZard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String s = "W";
        int n = keyboard.nextInt();
        for(int i = 1 ; i <= n ; i++){
            s += "o";
        }
        s += "w!";
        System.out.println(s);
    }
}

import java.util.Scanner;

public class DebugShayeste {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String s = "";
        for(int i = 0 ; i < n;i++){
            s += "q";
        }
        System.out.println(s);
    }
}

import java.util.Scanner;

public class pow2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(findNextPow2(keyboard.nextInt()));
    }
    static int findNextPow2(int n){
        int a = 1;
        while (a < n){
            a *= 2;
        }
        return a;
    }
}

import java.util.Scanner;

public class TekrarCodeCopy {
    public static void main(String[] args) {
        char[] chars = {'c','o','d','e','c','u','p','6'};
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        System.out.println(chars[(n-1)%8]);
    }
}

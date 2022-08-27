import java.util.Scanner;

public class Factoriel {
    static int fac(int n){
        int result = 1;
        for(int i = 1 ; i <= n;i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(fac(keyboard.nextInt()));
    }
}


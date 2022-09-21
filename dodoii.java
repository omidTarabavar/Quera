import java.util.Scanner;

public class dodoii {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        System.out.println(isPrime(num) ? "NO":"YES");
    }
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2 ; i < n ; i++){
            if(n != 2 && n % i == 0){
                return false;
            }
        }
        return true;
    }
}

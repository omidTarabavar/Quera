import java.util.Scanner;

public class Zojiat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        if(isPrime(n) && isOdd(n)){
            System.out.println("zoj");
        }else {
            System.out.println("fard");
        }
    }
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i< n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    static boolean isOdd(int n){
        return n % 2 != 0;
    }
}

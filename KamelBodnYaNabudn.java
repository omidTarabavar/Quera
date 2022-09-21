import java.util.Scanner;

public class KamelBodnYaNabudn {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        if(isPrime(keyboard.nextInt())){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    static boolean isPrime(int num){
        int sumOfCounters = 0;
        for(int i = 1;i<num;i++){
            if(num % i ==0){
                sumOfCounters += i;
            }
        }
        return sumOfCounters == num;
    }

}

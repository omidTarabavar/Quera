import java.util.Scanner;

public class SharjMobile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(sumNums(n));
    }
    static int sumNums(int n){
        int result = n;
        if(n == 0){
            return 0;
        }else {
            result += sumNums(n-1);
        }
        return result;
    }
}

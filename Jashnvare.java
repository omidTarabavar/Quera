import java.util.Scanner;

public class Jashnvare {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for(int i = 2 ; i <= n;i++){
            if(n % i == 0){
                System.out.println(n / i);
                break;
            }
        }
    }
}

import java.util.Scanner;

public class SabaVaSoalSade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double n = keyboard.nextInt();
        int k = keyboard.nextInt();
        for(int i = 0 ; i < k ;i++){
            n = n/2;
        }
        if(n < 0 && ((int) n != n)){
            System.out.println((int) (n-1));
        }else {
            System.out.println((int) n);
        }
    }
}

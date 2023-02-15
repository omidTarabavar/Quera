import java.util.Scanner;

public class MashghEmshabBagher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int D1 = keyboard.nextInt();
        int D2 = keyboard.nextInt();
        int D3 = keyboard.nextInt();
        if((D1 == 0 || D2 == 0 || D3 == 0) || ((D1+D2+D3) != 180)){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}

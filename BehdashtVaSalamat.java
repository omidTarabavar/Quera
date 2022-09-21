import java.util.Scanner;

public class BehdashtVaSalamat {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int x = keyboard.nextInt();
        int n = keyboard.nextInt();
        if(n == 0){
            System.out.println("20");
        }else if(n ==7){
            System.out.println(x);
        }else {
            x -= n;
            if(x < 0){
                System.out.println("0");
            }else {
                System.out.println(x);
            }
        }
    }
}

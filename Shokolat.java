import java.util.Scanner;

public class Shokolat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String num1 = keyboard.next();
        String num2 = keyboard.next();
        if(Integer.parseInt(num1)% Integer.parseInt(num2) == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

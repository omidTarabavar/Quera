import java.util.Scanner;

public class adadFisaghoresi {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        a *= a;
        b *= b;
        c *= c;
        if(a+b == c || a+c == b || b+c == a){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}

import java.util.Scanner;

public class SiblTirandazi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int p = keyboard.nextInt();
        if(p == 0) System.out.println("out");
        else if(p <= 6) System.out.println("white");
        else if(p <= 10) System.out.println("black");
    }
}

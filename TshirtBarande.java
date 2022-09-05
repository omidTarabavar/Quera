import java.util.Scanner;

public class TshirtBarande {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int sarshaneXL = keyboard.nextInt();
        int ghadXL = keyboard.nextInt();
        System.out.println(keyboard.nextInt() > sarshaneXL ? "no":keyboard.nextInt() > ghadXL ? "no":"yes");
    }
}

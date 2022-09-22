import java.util.Scanner;

public class TamirDivar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int r = keyboard.nextInt();
        int dx = keyboard.nextInt();
        int dy = keyboard.nextInt();
        boolean checkX = (x<= dx) && (dx <= (x+r));
        boolean checkY = ((y-r) <= dy) && (dy <= y);
        System.out.println(checkX && checkY ? "Mahdi":"Parsa");
    }
}

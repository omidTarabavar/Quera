import java.util.Scanner;

public class DoNoghteKhat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int col1 = keyboard.nextInt();
        int row1 = keyboard.nextInt();
        int col2 = keyboard.nextInt();
        int row2 = keyboard.nextInt();
        if(col1 == col2) System.out.println("Vertical");
        else if(row1 == row2) System.out.println("Horizontal");
        else System.out.println("Try again");
    }
}

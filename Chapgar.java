import java.util.Scanner;

public class Chapgar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        boolean turn = true;
        for(int h = 0 ; h < 3; h++) {
            for (int i = 0; i <  n; i++) {
                boolean turnRow = turn;
                for (int j = 0; j < 3; j++) {
                    if (turnRow) {
                        for (int k = 0; k < m; k++) {
                            System.out.print("X");
                        }
                        turnRow = false;
                    } else {
                        for (int k = 0; k < m; k++) {
                            System.out.print(".");
                        }
                        turnRow = true;
                    }
                }
                System.out.println();
            }
            turn = !turn;
        }
    }
}

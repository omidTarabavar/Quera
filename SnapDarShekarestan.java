import java.util.Scanner;

public class SnapDarShekarestan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0 ; i< n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                board[i][j] = keyboard.nextInt();
            }
        }
        int totalAmount = 0;
        for(int k = 0 ; k < m ; k++){
            totalAmount +=board[keyboard.nextInt()-1][keyboard.nextInt()-1];
        }
        System.out.println(totalAmount);
    }
}

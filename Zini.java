import java.util.Scanner;

public class Zini {
    static int[][] board;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        board = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                board[i][j] = keyboard.nextInt();
            }
        }
        System.out.println(findZini());

    }
    static int findZini(){
        int result = 0;
        for(int i = 1 ; i < board.length-1;i++){
            for(int j = 1 ; j < board[i].length-1;j++){
                int num = board[i][j];
                boolean halat1 = num > board[i][j+1] && num > board[i][j-1] && num < board[i+1][j] && num < board[i-1][j];
                boolean halat2 = num < board[i][j+1] && num < board[i][j-1] && num > board[i+1][j] && num > board[i-1][j];
                if(halat1 || halat2)
                    result += 1;
            }
        }
        return result;
    }
}

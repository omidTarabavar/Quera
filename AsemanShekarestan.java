import java.util.Scanner;

public class AsemanShekarestan {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        char[][] board = new char[n][m];
        for(int i = 0; i < n ; i++){
            String input =keyboard.next();
            for(int j = 0 ; j < m ; j++){
                board[i][j] = input.charAt(j);
            }
        }
        int totalStars = 0;
        for(int k = 0 ; k < n ; k++){
            for(int l = 0 ; l < m ;l++){
                if(board[k][l]=='*'){
                    totalStars += 1;
                }
            }
        }
        System.out.println(totalStars);
    }
}

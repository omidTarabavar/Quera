import java.util.Scanner;

public class MaarDarJadval {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt(); int m = keyboard.nextInt();
        int[][] table = new int[n][m];
        int item = 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    table[i][j] = item;
                    item++;
                }
            }
            else {
                for (int j = m - 1; j >= 0; j--) {
                    table[i][j] = item;
                    item++;
                }
            }
            for(int k = 0; k < m; k++)
                System.out.print(table[i][k] +" ");
            System.out.println();
        }
    }
}

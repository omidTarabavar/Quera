import java.util.Arrays;
import java.util.Scanner;

public class ZarbMatrisha {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = (keyboard.nextInt());
        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[b][c];
        for(int i = 0 ; i < matrix1.length;i++){
            for(int j = 0 ; j < matrix1[i].length;j++){
                matrix1[i][j] = keyboard.nextInt();
            }
        }
        for(int i = 0 ; i< matrix2.length;i++){
            for(int j = 0 ; j< matrix2[i].length;j++){
                matrix2[i][j] = keyboard.nextInt();
            }
        }
        int[][] matrixResult = new int[a][c];
        for(int i = 0 ; i< matrixResult.length;i++){
            for(int j = 0 ; j< matrixResult[i].length;j++){
                int num = 0;
                for(int k = 0 ; k<b;k++){
                    num += matrix1[i][k] * matrix2[k][j];
                }
                matrixResult[i][j] = num;
            }
        }
        chapMatrix(matrixResult);
    }
    static void chapMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0 ; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

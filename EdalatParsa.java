import java.util.Arrays;
import java.util.Scanner;

public class EdalatParsa {
    static int[][] array;
    static Scanner keyboard = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        n = keyboard.nextInt();
        array = new int[n][n];
        int k = keyboard.nextInt();
        fixArrIfWeCan(n,k);

        for(int i = 0 ; i < array.length;i++){
            for(int j = 0 ; j < array[i].length;j++){
                if(checkRow(j,i,k) && checkCol(i,j,k)){
                    array[i][j] += 1;
                }
            }
        }
        printArr();
    }
    static void fixArrIfWeCan(int n,int k){
        int m = k/n;
        for(int i = 0 ; i < array.length;i++){
            for(int j = 0 ; j < array[i].length;j++){
                array[i][j] = m;
            }
        }
    }

    static void printArr(){
        for(int i = 0 ; i< n;i++){
            for(int j = 0 ; j< n;j++){
                System.out.print(array[i][j]);
                if(j != n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static boolean checkCol(int row,int col,int k){
        int sum=0;
        for(int i = 0 ; i< array.length;i++){
            if(i == row){
                sum += array[i][col] + 1;
            }else {
                sum += array[i][col];
            }
        }
        return sum <= k;
    }
    static boolean checkRow(int col , int row,int k){
        int sum = 0;
        for(int j = 0 ; j < array.length;j++){
            if(j == col){
                sum += array[row][j]+1;
            }else {
                sum += array[row][j];
            }
        }
        return sum <= k;
    }

}

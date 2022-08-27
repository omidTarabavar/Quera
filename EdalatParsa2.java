import java.util.Arrays;
import java.util.Scanner;

public class EdalatParsa2 {
    static int[][] array;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int n = keyboard.nextInt();
        array = new int[n][n];
        int k = keyboard.nextInt();
        fixArrIfWeCan(n,k);
        while (!checkFinish(k)){
            for(int i = 0 ; i < array.length;i++){
                array[i][i] += 1;
            }
            if(!checkFinish(k)){
                for(int i = n-1;i>=0;i--){
                    array[i][i] += 1;
                }
            }
        }
        printArr();
    }
    static void fixArrIfWeCan(int n,int k){
        int m = 1;
        if(m * n <= k){
            for(int i = 0 ; i < array.length;i++){
                Arrays.fill(array[i],m);
            }
            m += 1;
        }
    }
    static void makeCopy(int[][] arr1,int[][] arr2){
        for(int i = 0 ; i < arr1.length;i++){
            for(int j= 0 ; j< arr1[i].length;j++){
                arr2[i][j] = arr1[i][j];
            }
        }
    }
    static void printArr(){
        for(int i = 0 ; i< array.length;i++){
            for(int j = 0 ; j< array[i].length;j++){
                System.out.print(array[i][j]);
                if(j != array[i].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static boolean checkFinish(int k){
        for(int i = 0 ; i < array.length;i++){
            int sumOfRow = 0;
            for(int j = 0 ; j < array[i].length;j++){
                sumOfRow += array[i][j];
            }
            if(sumOfRow != k){
                return false;
            }
        }
        for(int j = 0 ; j< array[0].length;j++){
            int sumOfCol=0;
            for(int i = 0 ; i < array.length;i++){
                sumOfCol += array[i][j];
            }
            if(sumOfCol != k){
                return false;
            }
        }
        return true;
    }
    static boolean checkRow(int[][] checkArr,int col,int k){
        int sum = 0 ;
        for(int i = 0 ; i< checkArr.length;i++){
            sum += checkArr[i][col];
        }
        if(sum <= k){
            return true;
        }else {
            return false;
        }
    }
    static boolean checkCol(int[][] checkArr,int row,int k){
        int sum = 0;
        for(int j = 0 ; j< checkArr[0].length;j++){
            sum += checkArr[row][j];
        }
        if(sum <= k){
            return true;
        }else {
            return false;
        }
    }
}

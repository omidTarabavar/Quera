import java.util.Arrays;
import java.util.Scanner;

public class Eparsa {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();
        int[] satr = new int[n];
        Arrays.fill(satr,(k/n));
        int shift = 1;
        for(int i = 0 ; i< (k%n);i++){
            satr[i] += 1;
        }
        printArr(satr);
        for(int i = 0 ; i < n-1;i++){
            int[] temp = satr.clone();
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    temp[0] = satr[j];
                } else {
                    temp[j + 1] = satr[j];
                }
            }
            printArr(temp);
            satr = temp.clone();
        }
    }
    static void printArr(int[] arr){
        for(int i = 0 ; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

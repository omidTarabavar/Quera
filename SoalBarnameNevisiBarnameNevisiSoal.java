import java.util.Scanner;

public class SoalBarnameNevisiBarnameNevisiSoal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String[] inputs = new String[n];
        for(int i = 0 ; i < n ; i ++){
            inputs[i] = keyboard.next();
        }
        for(int j = n-1;j >= 0 ; j--){
            System.out.print(inputs[j]+" ");
        }
    }
}

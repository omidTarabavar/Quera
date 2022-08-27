import java.util.Scanner;

public class ChapMoraba {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for(int i = 1 ; i<= n;i++){
            if(i == 1 || i == n){
                for(int j= 1 ; j <= n ;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.print("*");
                for(int k = 1 ; k < n-1;k++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}

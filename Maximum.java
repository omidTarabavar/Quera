import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int max = 0;
        for(int i = 0 ; i < n ;i++){
            int num = keyboard.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}

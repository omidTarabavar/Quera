import java.util.Scanner;

public class KharDarChamanFaravone {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int l = keyboard.nextInt();
        int time = 0;
        for(int i = 0 ; i < l ;i++){
            if(i % 2 == 0){
                time += a;
            }else {
                time += b;
            }
        }
        System.out.println(time);
    }
}

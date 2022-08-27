import java.util.Scanner;

public class BazeAzmoni {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int s = keyboard.nextInt();
        int f = keyboard.nextInt();
        int l = keyboard.nextInt();
        int x = keyboard.nextInt();
        if(x < s){
            System.out.println("exam did not started!");
        }else if(x >= f){
            System.out.println("exam finished!");
        }else if((f-x) < l){
            System.out.println(f-x);
        }else {
            System.out.println(l);
        }
    }
}

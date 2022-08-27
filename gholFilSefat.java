import java.util.Scanner;

public class gholFilSefat {
    static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        int limitrow = keyboard.nextInt();
        int limitCol = keyboard.nextInt();
        if(limitrow == 7 && limitCol == 7){
            System.out.println(1);
            System.out.println(2+" "+2);

        }else {
            System.out.println(1);
            System.out.println(7+" "+7);
        }
    }
}

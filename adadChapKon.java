import java.util.Scanner;

public class adadChapKon {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String input = keyboard.next();
        for(int i = 0 ; i< input.length();i++){
            int num = input.charAt(i)-'0';
            System.out.print(num+": ");
            for(int j =0  ; j < num ;j++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}

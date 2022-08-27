import java.util.Scanner;

public class handsfreeha {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String handsFree1 = keyboard.nextLine();
        String handsFree2 = keyboard.nextLine();
        if((handsFree1.charAt(0) == handsFree1.charAt(2)) || (handsFree2.charAt(0) == handsFree2.charAt(2))){
            System.out.println("YES");
        }else if((handsFree1.charAt(0) == handsFree2.charAt(2)) || (handsFree1.charAt(2) == handsFree2.charAt(0))){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

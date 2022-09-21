import java.util.Scanner;

public class HamayeshZendegiBehtar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radif = keyboard.nextInt();
        int shomareSandali = keyboard.nextInt();
        String outPut = "";
        String dir ="";
        if(shomareSandali >= 1 && shomareSandali <= 10){
            System.out.println("Right "+(10-radif+1)+" "+(shomareSandali));
        }else {
            System.out.println("Left "+(10-radif+1)+" "+(20-shomareSandali+1));
        }
    }
}

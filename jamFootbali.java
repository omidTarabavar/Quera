import java.util.Scanner;

public class jamFootbali {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numOfInput = keyboard.nextInt();
        for(int i = 1 ; i <= numOfInput ; i++){
            int persRaft = keyboard.nextInt();
            int estRaft = keyboard.nextInt();
            int persBargasht = keyboard.nextInt();
            int estBargasht = keyboard.nextInt();
            int persTotal = persRaft + persBargasht;
            int estTotal = estRaft + estBargasht;
            if(persTotal > estTotal){
                System.out.println("perspolis");
            }else if(estTotal > persTotal){
                System.out.println("esteghlal");
            }else {
                if(persBargasht > estRaft){
                    System.out.println("perspolis");
                }else if(persBargasht < estRaft){
                    System.out.println("esteghlal");
                }else {
                    System.out.println("penalty");
                }
            }
        }
    }
}

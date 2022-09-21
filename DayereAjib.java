import java.util.Scanner;

public class DayereAjib {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int k = keyboard.nextInt();
        int turns = 0;
        int currentPos= 1;
        while (true){
            if(currentPos+k > n){
                currentPos = (currentPos+k)-n;
            }else {
                currentPos += k;
            }
            turns += 1;
            if(currentPos == 1){
                break;
            }
        }
        System.out.println(turns);
    }
}

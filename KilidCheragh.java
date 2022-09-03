import java.util.Scanner;

public class KilidCheragh {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int lastResult = keyboard.nextInt();
        int totalChanges = 0;
        for(int i = 0 ; i < n-1 ;i++){
            int state = keyboard.nextInt();
            if(lastResult != state){
                totalChanges += 1;
            }
            lastResult = state;
        }
        System.out.println(totalChanges);
    }
}

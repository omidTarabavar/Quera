import java.util.ArrayList;
import java.util.Scanner;

public class ChapBarAks {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        while (true){
            int num = keyboard.nextInt();
            if(num != 0){
                numList.add(num);
            }
            else {
                break;
            }
        }
        for(int i = numList.size()-1;i>= 0 ;i--){
            System.out.println(numList.get(i));
        }
    }
}

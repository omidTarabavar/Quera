import java.util.ArrayList;
import java.util.Scanner;

public class HendoneKhori {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<>();
        int n = keyboard.nextInt();
        for(int i=0;i<n;i++){
            int[] numArr = {i,keyboard.nextInt()};
            list.add(numArr);
        }
        while (list.size() != 1){
            if(list.get(0)[1] > list.get(1)[1]){
                list.remove(1);
            }else if(list.get(1)[1] > list.get(0)[1]){
                list.remove(0);
            }
        }
        System.out.println(list.get(0)[0]+1);
    }
}

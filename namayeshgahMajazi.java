import java.util.Arrays;
import java.util.Scanner;

public class namayeshgahMajazi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int k = keyboard.nextInt();
        String[] ghorfeha = new String[8];
        Arrays.fill(ghorfeha,".......");
        for(int i = 0 ; i< k ;i++){
            ghorfeha[i] = "ghorfe"+(i+1);
        }
        int index = 0;
        for(int i = 0 ; i < 4 ;i++){
            System.out.println("########.......########");
            System.out.println("#"+ghorfeha[index]+"......."+ghorfeha[index+1]+"#");
            index += 2;
        }
        System.out.println("#######################");
    }
}

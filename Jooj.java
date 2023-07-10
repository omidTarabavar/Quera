import java.util.ArrayList;
import java.util.Scanner;

public class Jooj {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        int n = keyboard.nextInt();
        if(n > 2) {
            int first = keyboard.nextInt();
            int second = keyboard.nextInt();
            for (int i = 2; i < n; i++) {
                int third = keyboard.nextInt();
                if (second > first && second > third) {
                    System.out.println("Ey baba :(");
                    return;
                }
                first = second;
                second = third;
            }
        }
        System.out.println("Bah Bah! Ajab jooji!");
    }

}

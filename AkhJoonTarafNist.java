import java.util.ArrayList;
import java.util.Scanner;

public class AkhJoonTarafNist {
    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        weekDays.add("shanbe");
        weekDays.add("1shanbe");
        weekDays.add("2shanbe");
        weekDays.add("3shanbe");
        weekDays.add("4shanbe");
        weekDays.add("5shanbe");
        weekDays.add("jome");
        for(int i = 0 ; i < 3 ;i++){
            int n = keyboard.nextInt();
            for(int j = 0 ; j < n ;j++){
                String input = keyboard.next();
                if(weekDays.contains(input)) weekDays.remove(input);
            }
        }
        System.out.println(weekDays.size());
    }
}

import java.util.Scanner;

public class yekSaat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hour = keyboard.nextInt();
        int min = keyboard.nextInt();
        hour = 11 - hour + 1;
        min = 60 - min;
        if(hour == 12) hour = 0;
        if(min == 60) min = 0;
        System.out.print((hour < 10 ? "0"+hour:hour)+":");
        System.out.print(min < 10 ? "0"+min:min);
    }
}

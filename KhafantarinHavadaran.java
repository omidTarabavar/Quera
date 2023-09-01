import java.util.Scanner;

public class KhafantarinHavadaran {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String txt = keyboard.next();
        int max = 0, cur = 0;
        for(int i =0; i < txt.length(); i++){
            if(txt.charAt(i) == '1')
                cur = 0;
            else {
                cur++;
                if(cur >= max)
                    max = cur;
            }
        }
        System.out.println(max);
    }
}

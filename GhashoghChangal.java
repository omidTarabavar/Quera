import java.util.Scanner;

public class GhashoghChangal {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String input = keyboard.next();
        for(int i = 0 ; i < input.length()-n;i++){
            if(input.charAt(i) == input.charAt(i+n)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

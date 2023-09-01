import java.util.Scanner;

public class CharAdad {
    public static void main(String[] args) {
        int n,a,b,c,d,ans=0;
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        d = keyboard.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % a == 0 || i % b == 0 || i % c == 0 || i % d == 0)
                ans++;
        }
        System.out.println(ans);
    }
}

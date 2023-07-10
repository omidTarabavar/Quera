import java.util.Scanner;

public class MamorMakhfi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int sum = 0;
        int min = keyboard.nextInt();
        sum += min;
        for(int i = 1 ; i < n;i++){
            int num = keyboard.nextInt();
            if(num < min)
                min = num;
            sum += num;
        }
        int hadeaghl = Math.max(sum - (n-1)*100,0);
        int hadaxr = min;
        System.out.println(hadeaghl+" "+hadaxr);
    }
}

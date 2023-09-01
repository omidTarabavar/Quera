import java.util.Scanner;

public class AdadShebhBinary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        System.out.println(powOfTwo(sumOfDivs(n)) ? 1:0);
    }

    private static boolean powOfTwo(int x){
        double temp = 0,i = 0;
        while (temp < x){
            temp = Math.pow(2,i);
            i++;
        }
        return temp == x && x != 0;
    }
    private static int sumOfDivs(int n){
        int res = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0)
                res += i;
        }
        return res;
    }
}

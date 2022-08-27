import java.util.Scanner;

public class KashiKari {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int total = 0;
        for(int i = 0 ; i <= n ; i += 2){
            int groupOfoghi = i/2;
            int amodi = n-(i);
            double sorat = fac(amodi + groupOfoghi);
            double makhraj = fac(amodi) * fac(groupOfoghi);
            total += sorat/makhraj;
        }

        System.out.println(total);
    }
    static double fac(int a){
        double result =1;
        for(int i = 1 ; i <=a;i++){
            result *= i;
        }
        return  result;
    }
}

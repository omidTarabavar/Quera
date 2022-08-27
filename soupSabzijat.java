import java.util.Scanner;

public class soupSabzijat {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int n = keyboard.nextInt();
        double k = keyboard.nextDouble();
        double s = keyboard.nextDouble();
        if(n*k <= s){
            System.out.println("Kafie!");
        }else {
            System.out.println("Na! yeki bayad bere sabzi bekhare");
        }
    }
}

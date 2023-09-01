import java.util.Scanner;

public class Ekhtelas {
    public static void main(String[] args) {
        int n,amount = 0;
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        for(int i = 0; i < n; i++){
            String tempName = keyboard.next();
            int tempAmount = keyboard.nextInt();
            if(tempAmount >= amount){
                name = tempName;
                amount = tempAmount;
            }
        }
        System.out.println(name);
    }
}

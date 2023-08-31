import java.util.Scanner;

public class SoghatMarcopolo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int t = keyboard.nextInt();
        for(int n = 0; n < t; n++){
            int soghati = 0;
            int i = keyboard.nextInt();
            for(int s = 0; s < i; s++){
                String c1 = keyboard.next();
                String c2 = keyboard.next();
                if(soghati > 0){
                    if(c1.equals("copy_paste") || c2.equals("copy_paste"))
                        soghati *= 2;
                    else
                        soghati += 1;
                }else {
                    if(c1.equals("buy_one") || c2.equals("buy_one"))
                        soghati += 1;
                }
            }
            System.out.println(soghati);
        }
    }
}

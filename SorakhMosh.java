import java.util.Scanner;

public class SorakhMosh {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x1 = keyboard.nextInt();
        int x2 = keyboard.nextInt();
        int distance = x1-x2;
        String outPut = "";
        if(distance > 0){
            for(int i = 0 ; i< distance;i++){
                outPut += "L";
            }
        }else if(distance < 0){
            for(int i = 0 ; i < (-1)*distance ; i++){
                outPut += "R";
            }
        }else {
            outPut ="Saal Noo Mobarak!";
        }
        System.out.println(outPut);
    }
}

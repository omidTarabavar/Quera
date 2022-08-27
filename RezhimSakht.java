import java.util.Scanner;

public class RezhimSakht {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        int red=0;
        int yellow=0;
        int green=0;
        for(int i = 0 ; i < input.length();i++){
            if(input.charAt(i)=='R'){
                red += 1;
            }else if(input.charAt(i)=='Y'){
                yellow += 1;
            }else if(input.charAt(i)=='G'){
                green += 1;
            }
        }
        if((red >= 2 && yellow >= 2) || (red >= 3) || (green == 0)){
            System.out.println("nakhor lite");
        }else {
            System.out.println("rahat baash");
        }
    }
}

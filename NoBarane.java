import java.util.Scanner;

public class NoBarane {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int result = 0;
        for(int i = 0 ; i < 5 ;i++){
            if(keyboard.nextInt() >= 80){
                result += 1;
            }
        }
        System.out.println(result >= 3 ? "Mamma mia!":result>=1? "Mamma mia!!":"Mamma mia!!!");
    }
}

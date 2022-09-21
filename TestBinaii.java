import java.util.Scanner;

public class TestBinaii {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int length = keyboard.nextInt();
        String correctedInput = keyboard.next();
        String input = keyboard.next();
        int result = 0;
        for(int i = 0 ; i < length;i++){
            if(correctedInput.charAt(i) != input.charAt(i))
                result +=1;
        }
        System.out.println(result);
    }
}

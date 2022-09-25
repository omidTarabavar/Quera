import java.util.Arrays;
import java.util.Scanner;

public class KalameKalame {
    static char[] vowels = {'a','e','i','o','u'};
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        int counter = 0;
        for(int i = 0 ; i < input.length();i++){
            if(contains(input.charAt(i))){
                counter += 1;
            }
        }
        System.out.println((int)Math.pow(2,counter));
    }
    static boolean contains(char character){
        for(char charInVowels:vowels){
            if(charInVowels == character){
                return true;
            }
        }
        return false;
    }
}

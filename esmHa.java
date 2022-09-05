import java.util.ArrayList;
import java.util.Scanner;

public class esmHa {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int max = 0;
        for(int i = 0 ; i< n ; i++){
            int numOfUnique = uniqueChar(keyboard.next());
            if(numOfUnique > max) max = numOfUnique;
        }
        System.out.println(max);
    }
    static int uniqueChar(String name){
        ArrayList<Character> characterArrayList = new ArrayList<>();
        int result = 0;
        for(int i = 0; i< name.length();i++){
            if(!characterArrayList.contains(name.charAt(i))){
                result += 1;
                characterArrayList.add(name.charAt(i));
            }
        }
        return result;
    }
}

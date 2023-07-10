import java.util.Scanner;

public class GholBano {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.next();
        String revName= "";
        for(int i = name.length()-1;i>=0;i--){
            revName +=name.charAt(i);
        }
        System.out.println(revName);
    }
}

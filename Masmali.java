import java.util.Scanner;

public class Masmali {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String inp = keyboard.next();
        int numOfO = Guest(inp);
        int numOfIO = n-Guest(inp);
        int result = fac(numOfO+numOfIO)/(fac(numOfO)*fac(numOfIO));
        System.out.println(result);
    }
    static int Guest(String inp){
        int result = 0;
        for(int i = 0 ; i < inp.length();i++){
            if(inp.charAt(i) == 'I'){
                result +=1;
            }else{
                result -=1;
            }
        }
        return result;
    }
    static int fac(int x){
        if(x == 1 || x == 0){
            return 1;
        }
        return x*fac(x-1);
    }
}

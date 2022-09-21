import java.util.Scanner;

public class Takraghami {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String num = keyboard.next();
        System.out.println(sumOfNums(num));
    }
    static int sumOfNums(String num){
        int result =0;
        for(int i = 0 ;i<num.length();i++){
            result += (num.charAt(i)-'0');
        }
        String res =""+result;
        if(res.length()>1){
            result = sumOfNums(res);
        }
        return result;

    }
}

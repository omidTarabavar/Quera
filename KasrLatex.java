import java.util.Scanner;

public class KasrLatex {
    static Scanner keyboard = new Scanner(System.in);
    static int[] indexArr = new int[1];
    public static void main(String[] args) {
        int N = keyboard.nextInt();
        String result = "1";
        int count = 1;
        int m = 1;
        String temp="";
        for(int i = 1 ; i< N;i++) {
                for (int j = 0; j < result.length(); j++) {

                    if (findCount(result,count,j)) {
                        result = fixString(result,j+indexArr[0],m);
                        count += 1;
                        m += 2;
                        if(count == Math.pow(2,i)){
                            break;

                        }
                    }
                }

        }
        System.out.println(result);

    }
    static boolean findCount(String input,int count,int index){
        String temp = ""+count;
        if(input.charAt(index) == temp.charAt(0)){
            for(int j = 1; j < temp.length();j++){
                if(temp.charAt(j) != input.charAt(index+j)){
                    return false;
                }
            }
        }else {
            return false;
        }
        indexArr[0] = temp.length() - 1;
        return true;
    }
    static String fixString(String input,int index,int m){
        String result = "";
        String temp = input;
        for(int i = 0 ;i<input.length();i++){
            if(i == index){
                result += input.charAt(index)+"+\\frac{"+(m+1)+"}{"+(m+2)+"}";

            }else {
                result += input.charAt(i);
            }
        }
        return result;
    }
}

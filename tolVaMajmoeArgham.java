import java.util.Scanner;

public class tolVaMajmoeArgham {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int m = keyboard.nextInt();
        int s = keyboard.nextInt();
        if (m == 1 && s==0){
            System.out.println("0 0");
            return;
        }
        int minNum = -1;
        int maxNum = -1;
        int starting = startingPoint(m);
        boolean flag = true;
        for(int i = starting ; i< starting*10;i++){
            if(sumOfNumbers(i) == s){
                if(flag){
                    minNum = i;
                    flag = false;
                }else {
                    maxNum = i;
                }
            }
        }
        System.out.println(minNum+" "+maxNum);
    }
    static int startingPoint(int m){
        int result = 1;
        for(int i = 1 ; i< m;i++){
            result *= 10;
        }
        return result;
    }
    static int sumOfNumbers(int num){
        String a = ""+num;
        int sum = 0;
        for(int i = 0 ; i < a.length();i++){
            sum += a.charAt(i)-48;
        }
        return sum;
    }
}

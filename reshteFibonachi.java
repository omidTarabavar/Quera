import java.util.Scanner;

public class reshteFibonachi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfNums = keyboard.nextInt();
        for(int i = 1; i<=numberOfNums;i++){
            if(findIfItsFib(i)){
                System.out.print('+');
            }else {
                System.out.print('-');
            }
        }
    }
    static boolean findIfItsFib(int a){
        int number = 1;
        int count=1;
        while (number < a){
            number = findFib(count);
            count +=1;
        }
        if(number==a){
            return true;
        }
        return false;
    }
    static int findFib(int n){
        if(n == 1 || n ==2){
            return 1;
        }else {
            return findFib(n-1)+findFib(n-2);
        }
    }
}

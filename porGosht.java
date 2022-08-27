import java.util.Scanner;

public class porGosht {
    static Scanner keyboard= new Scanner(System.in);
    public static void main(String[] args) {
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        int totalGosht1 = 0;
        int totalGosht2 = 0;
        for(int i = 1 ; i <=2 ; i++){
            for(int j=1;j<=n;j++){
                String input = keyboard.next();
                for(int k = 0;k<m;k++){
                    if(input.charAt(k)=='*'){
                        if(i==1){
                            totalGosht1 += 1;
                        }else {
                            totalGosht2 += 1;
                        }
                    }
                }
            }
        }
        System.out.print(totalGosht1+" "+totalGosht2);
    }
}

import java.util.Scanner;

public class OlaghGavNama {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        int t =keyboard.nextInt();
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int currentTime = 0;
        int numOfAr=0;
        int numOfMa=0;
        boolean flag=  true;
        while (currentTime < t){
            if(flag){
                numOfAr +=1;
                currentTime += 1;
                if(currentTime < t){
                    currentTime += a;
                }
            }else {
                numOfMa +=1;
                currentTime +=1;
                if(currentTime < t){
                    currentTime += b;
                }
            }
            flag = !flag;
        }
        System.out.println(numOfAr+" "+numOfMa);
    }
}

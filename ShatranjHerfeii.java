import java.util.Scanner;

public class ShatranjHerfeii {
    public static void main(String[] args) {
        int[] pieces = {1,1,2,2,2,8};
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<pieces.length;i++){
            System.out.print((pieces[i]-keyboard.nextInt())+" ");
        }
    }
}

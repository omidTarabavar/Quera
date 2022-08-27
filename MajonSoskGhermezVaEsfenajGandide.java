import java.util.Scanner;

public class MajonSoskGhermezVaEsfenajGandide {
    static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int d = keyboard.nextInt();
        int m = keyboard.nextInt();
        int sod1 = (-1)*a+(c*m);
        int sod2 = (-1)*b+(d*m);
        boolean sodKoli = sod1 > sod2;
        int finalPrice1 = a+(c*m);
        int finalPrice2 = b+(d*m);
        if(finalPrice1 > finalPrice2){
            if(sod1 > sod2){
                System.out.println("Eyval baba!");
            }else {
                System.out.println("Naaa, eshtebahe!");
            }
        }else if(finalPrice2 > finalPrice1){
            if (sod2 > sod1) {
                System.out.println("Eyval baba!");
            }else {
                System.out.println("Naaa, eshtebahe!");
            }
        }
    }
}

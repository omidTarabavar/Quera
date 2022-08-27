import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String input = keyboard.next();
        String output;
        String hour = input.substring(0,2);
        String amOrPm = input.substring(input.length()-2,input.length());
        if(Integer.parseInt(hour) == 12 && amOrPm.equals("AM")) {
            hour = "00";
        }else if(amOrPm.equals("PM") && Integer.parseInt(hour) != 12){
            int temp = Integer.parseInt(hour)+12;
            hour = ""+temp;
        }
        System.out.println(hour+input.substring(2,input.length()-2));
    }

}

import java.util.Scanner;

public class TeamKeshi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int teams = 0;
        for(int i = 0 ; i < 3 ; i ++ ){
            int ai = keyboard.nextInt();
            int bi = keyboard.nextInt();
            teams += Math.min(ai,bi);
        }
        System.out.println(teams);
    }
}

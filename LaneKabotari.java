import java.util.Scanner;
public class LaneKabotari {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int m = keyboard.nextInt();
		System.out.println(n > m ? "Yes" : "No");
	}

}
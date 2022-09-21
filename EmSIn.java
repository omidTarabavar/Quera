import java.util.Scanner;

public class EmSIn {
    public static void main(String[] args) {
        String[] haftSinArr = {"sir","serke","somagh","senjed","sib","sabze","samano"};
        Scanner keyboard = new Scanner(System.in);
        int numOfItems = keyboard.nextInt();
        for(int i = 0; i < numOfItems;i++){
            System.out.println(haftSinArr[i]);
        }
    }
}

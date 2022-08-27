import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SSS {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = keyboard.nextInt();
        fillArrayList(numbers,n);


        System.out.println(numbers);

    }
    static void fillArrayList(ArrayList<Integer> arrayList,int n){
        for (int i = 0 ; i < n ;i++){
            arrayList.add(1);
        }
    }
}

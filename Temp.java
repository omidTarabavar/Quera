import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        ArrayList<int[]> nums= new ArrayList<>();
        int[] numbs = {1,2,3,4};
        int[] b = {1,3,2,4};
        nums.add(numbs);
        Arrays.sort(b);
        System.out.println(nums.contains(b));
        for(int[] nu:nums){
            if(Arrays.equals(nu, b)){
                System.out.println(1);
            }
        }
    }
}

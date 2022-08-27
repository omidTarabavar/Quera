import java.util.Arrays;
import java.util.Scanner;

public class SharayetSeganeSoltani2 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        Arrays.fill(nums,1);
        nums[nums.length-1] = 0;
        boolean canContinue = true;
        while (canContinue){
            nums[nums.length-1] += 1;
            canContinue = check(nums,n);
            if(canContinue && shart1(nums,n) && shart2(nums,n) && shart3(nums,n)){
                if(!checkPermutation(nums,n)){
                    chapDonbale(nums);
                    return;
                }
            }
        }
        System.out.println(-1);

    }
    static boolean check(int[] nums,int n){
        for(int i = nums.length-1;i >= 0 ;i--){
            if(nums[i] == n+1){
                if(i==0){
                    return false;
                }else {
                    nums[i-1] += 1;
                    for(int j = i ; j < nums.length;j++){
                        nums[j] = nums[i-1];
                    }
                }
            }
        }
        return true;
    }
    static void chapDonbale(int[] donbale){
        for(int num:donbale){
            System.out.print(num+" ");
        }
    }
    static boolean shart1(int[] donbale,int n){
        int result1 = n * (n+1)/2;
        int sum = 0;
        for(int num: donbale){
            sum += num;
        }
        return result1 == sum;
    }
    static boolean shart2(int[] donbale,int n){
        int result2 = n*(n+1)*(2*n+1)/6;
        int sum =0;
        for(int num:donbale){
            sum += (num*num);
        }
        return result2 == sum;
    }
    static boolean shart3(int[] donbale,int n){
        int result3 = (n*n)*(n+1)*(n+1)/4;
        int sum = 0;
        for(int num:donbale){
            sum += (num*num*num);
        }
        return result3 == sum;
    }
    static boolean checkPermutation(int[] donbale,int n){
        for(int i = 1 ; i <= n;i++){
            int count = 0;
            for(int j = 0 ; j < donbale.length;j++){
                if(donbale[j] == i){
                    count += 1;
                }
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SharayetSeganeSoltani {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<int[]> numbers = new ArrayList<>();
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        Arrays.fill(nums,1);
        nums[nums.length-1] = 0;
        boolean canContinue = true;
        while (canContinue){
            nums[nums.length-1] += 1;
            canContinue = check(nums,n);
            if(canContinue){
                int[] newNums = nums.clone();
                Arrays.sort(newNums);
                boolean shouldCheck = shouldCheck(newNums,numbers);
                if(shouldCheck){
                    if(shart1(nums) && shart2(nums) && shart3(nums)){
                        if(!checkPermutation(nums,n)){
                            chapDonbale(nums);
                            return;
                        }
                    }
                    save(nums,numbers);
//                    System.out.println(numbers.size());
                }
                // save

            }
        }
        System.out.println(-1);

    }


    static void save(int[] nums,ArrayList<int[]> numbers){
        numbers.add(nums.clone());
    }
    static boolean shouldCheck(int[] nums,ArrayList<int[]> numbers){
        if(numbers.size()==0){
            return true;
        }
        for(int[] arrNum:numbers){
            if(Arrays.equals(arrNum, nums)){
                return false;
            }
        }
        return true;
    }

    static int counter(int num,int[] arr){
        int counter = 0;
        for(int number:arr){
            if(number == num){
                counter += 1;
            }
        }
        return counter;
    }
    static boolean containsArr(int num,int[] arrNum){
        for(int numb:arrNum){
            if(num == numb){
                return true;
            }
        }
        return false;
    }
    static boolean check(int[] nums,int n){
        for(int i = nums.length-1;i >= 0 ;i--){
            if(nums[i] == n){
                if(i==0){
                    return false;
                }else {
                    nums[i-1] += 1;
                    nums[i] = 1;
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
    static boolean shart1(int[] donbale){
        int result1 = donbale.length * (donbale.length+1)/2;
        int sum = 0;
        for(int num: donbale){
            sum += num;
        }
        return result1 == sum;
    }
    static boolean shart2(int[] donbale){
        int result2 = donbale.length*(donbale.length+1)*(2*donbale.length+1)/6;
        int sum =0;
        for(int num:donbale){
            sum += (num*num);
        }
        return result2 == sum;
    }
    static boolean shart3(int[] donbale){
        int result3 = (donbale.length*donbale.length)*(donbale.length+1)*(donbale.length+1)/4;
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

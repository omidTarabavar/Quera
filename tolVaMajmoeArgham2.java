import java.util.Arrays;
import java.util.Scanner;

public class tolVaMajmoeArgham2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int m = keyboard.nextInt();
        int s = keyboard.nextInt();
        if(m == 1 && s == 0){
            System.out.println("0 0");
            return;
        }
        String min = "";
        String max = "";
        int[] test = new int[m];
        Arrays.fill(test,9);
        if(sumOfDigits(test)==s){
            min = arrToString(newInitLastNum(m,s));
            max = arrToString(newInitLastNum(m,s));
            System.out.println(min+" "+max);
            return;
        }
        int[] number = newInitNum(m,s);
        while (min.isEmpty()){
            if(sumOfDigits(number) == s){
                min = arrToString(number);
            }else {
                addToBig(number);
            }
            if(arrToString(number).equals("0")){
                min = "-1";
            }
        }
        number = newInitLastNum(m,s);

        while (max.isEmpty()){
            if(sumOfDigits(number)==s){
                max = arrToString(number);
            }else {
                subFromBig(number);
            }
            if(arrToString(number).equals("0")){
                max = "-1";
            }
        }
        System.out.println(min+" "+max);

    }
    static int[] newInitNum(int m,int s){
        int[] arr = new int[m];
        arr[0] = 1;
        int[] temp = arr.clone();
        for(int i =0;i<m;i++){
            for(int j = m-1;j >= i;j--){
                if(j == i){
                    int number = arr[j];
                    Arrays.fill(arr,0);
                    arr[j] = number + 1;
                    break;
                }
                temp[j] = 9;
                if(sumOfDigits(temp) <=s){
                    arr[j] = 9;
                }else {
                    for(int k = 0 ; k < 10 ;k++){
                        temp[j] = k;
                        if(sumOfDigits(temp) == s){
                            arr[j] = k;
                            return arr;
                        }
                    }
                }
            }
        }
        return arr;
    }

    static int[] newInitLastNum(int m,int s){
        int[] arr = new int[m];
        Arrays.fill(arr,9);
        int[] temp = arr.clone();
        for(int i = 0 ; i < m;i++){
            for(int j = m-1;j >= i;j--){
                if(j==i){
                    int number = arr[j];
                    Arrays.fill(arr,9);
                    arr[j] = number - 1;
                    break;
                }
                temp[j] = 0;
                if(sumOfDigits(temp) >= s){
                    arr[j] = 0;
                }else {
                    for(int k = 8; k >= 0;k--){
                        temp[j] = k;
                        if(sumOfDigits(temp) == s){
                            arr[j] = k;
                            return arr;
                        }
                    }
                    return arr;
                }
            }
        }
        return arr;
    }
    static void addToBig(int[] number){
        int carry = 1;
        for(int i = number.length-1;i >= 0;i--){
            int num = number[i];
            num += carry;
            if(num == 10){
                carry = 1;
                number[i] =0;
            }else {
                carry =0;
                number[i] = num;
            }
        }
    }
    static int sumOfDigits(int[] number){
        int sum = 0;
        for(int i = 0 ; i < number.length;i++){
            sum +=  number[i];
        }
        return sum;
    }
    static String arrToString(int[] number){
        String result = "";
        boolean findFirstDigit = false;
        for(int i = 0 ; i < number.length;i++){
            if(findFirstDigit){
                result += number[i];
            }else {
                if(number[i] != 0){
                    result += number[i];
                    findFirstDigit = true;
                }
            }
        }
        if(result.isEmpty()){
            return "0";
        }
        return result;
    }
    static void subFromBig(int[] number){
        int carry = -1;
        for(int i = number.length-1;i >=0;i--){
            int num = number[i];
            num += carry;
            if(num == -1){
                carry = -1;
                number[i] = 9;
            }else {
                carry =0;
                number[i] = num;
            }
        }
    }
}

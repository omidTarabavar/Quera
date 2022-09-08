import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hexanavardi {
    /*
    helped by : https://github.com/MohammadNPak/quera.ir/blob/master/%D9%87%DA%AF%D8%B2%D8%A7%D9%86%D9%88%D8%B1%D8%AF%DB%8C/python/main.py
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        for(int i = 0 ; i < n ; i ++){
            String input = keyboard.next();
            int[] abc = new int[3];
            countInput(input,abc);
            counter(abc);
        }
    }
    static void counter(int[] abc){
        int temp = Math.abs(abc[0])+Math.abs(abc[1])+Math.abs(abc[2]);
        while (true){
            if(abc[0] > 0 && abc[2] > 0){ // a >0 - c<0
                int add = Math.min(abc[0],abc[2]);
                abc[0] -= add;
                abc[2] -= add;
                abc[1] += add;
            }else if(abc[0] < 0 && abc[1] >0){ // a <0 - b > 0
                int add = Math.min(abc[0]*(-1),abc[1]);
                abc[0] += add;
                abc[1] -= add;
                abc[2] += add;
            }else if(abc[0] >0 && abc[1] < 0){ // a > 0 - b < 0
                int add = Math.min(abc[0],(abc[1]*-1));
                abc[0] -= add;
                abc[1] += add;
                abc[2] -= add;
            }else if(abc[0] < 0 && abc[2] <  0){ // a < 0 - c < 0
                int add = Math.min((-1)*abc[0],(-1)*abc[2]);
                abc[0] += add;
                abc[2] += add;
                abc[1] -= add;
            }else if(abc[1] < 0 && abc[2] > 0){ // b < 0 - c > 0
                int add = Math.min((-1)*abc[1],abc[2]);
                abc[1] += add;
                abc[2] -= add;
                abc[0] -= add;
            }else if(abc[1] >0 && abc[2] < 0){
                int add = Math.min(abc[1],(-1)*abc[2]);
                abc[0] += add;
                abc[1] -= add;
                abc[2] += add;
            }
            if((Math.abs(abc[0])+Math.abs(abc[1])+Math.abs(abc[2])) == temp){
                System.out.println(temp);
                break;
            }else {
                temp = (Math.abs(abc[0])+Math.abs(abc[1])+Math.abs(abc[2]));
            }
        }
    }
    static void countInput(String input,int[] abc){
        for(int i = 0 ; i < input.length();i++){
            switch (input.charAt(i)){
                case 'A':{
                    abc[0] += 1;
                    break;
                }
                case 'B':{
                    abc[1] +=1;
                    break;
                }case 'C':{
                    abc[2] += 1;
                    break;
                }case 'D':{
                    abc[0] -=1;
                    break;
                }case 'E':{
                    abc[1] -=1;
                    break;
                }case 'F':{
                    abc[2] -=1;
                    break;
                }
            }
        }
    }
}

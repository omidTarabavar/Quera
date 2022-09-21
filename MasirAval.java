import java.util.ArrayList;
import java.util.Scanner;

public class MasirAval {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] jadval;
        int t = keyboard.nextInt();
        for(int i = 1 ; i<=t  ;i++){
            int n = keyboard.nextInt();
            jadval = new int[n][n];
            ArrayList<Character> characters = new ArrayList<>();
            fillJadval(jadval);
            int[] startingPoint = {keyboard.nextInt(),keyboard.nextInt()};
            int[] endPoint = {keyboard.nextInt(),keyboard.nextInt()};
            jadval[startingPoint[0]][startingPoint[1]] = 0;
            while (true){
                if((startingPoint[0] - 1 >= 0) && (isPrime(jadval[startingPoint[0]-1][startingPoint[1]]))){
                    characters.add('U');
                    //
                    if((startingPoint[0]-1 == endPoint[0]) && (startingPoint[1] == endPoint[1])){
                        chapChars(characters);
                        break;
                    }
                    jadval[startingPoint[0]][startingPoint[1]] = 0;
                    startingPoint[0] -= 1;
                }else if((startingPoint[0] + 1 < n) && (isPrime(jadval[startingPoint[0]+1][startingPoint[1]]))){
                    characters.add('D');
                    if((startingPoint[0]+1 == endPoint[0]) && (startingPoint[1] == endPoint[1])){
                        chapChars(characters);
                        break;
                    }
                    jadval[startingPoint[0]][startingPoint[1]]=0;
                    startingPoint[0] += 1;
                }else if((startingPoint[1] - 1 >= 0) && (isPrime(jadval[startingPoint[0]][startingPoint[1]-1]))){
                    characters.add('L');
                    if((startingPoint[0] == endPoint[0]) && (startingPoint[1]-1 == endPoint[1])){
                        chapChars(characters);
                        break;
                    }
                    jadval[startingPoint[0]][startingPoint[1]] = 0;
                    startingPoint[1] -= 1;
                }else if((startingPoint[1] + 1 < n) && (isPrime(jadval[startingPoint[0]][startingPoint[1]+1]))){
                    characters.add('R');
                    if((startingPoint[0]== endPoint[0]) && (startingPoint[1]+1 == endPoint[1])){
                        chapChars(characters);
                        break;
                    }
                    jadval[startingPoint[0]][startingPoint[1]] = 0;
                    startingPoint[1] += 1;
                }else {
                    System.out.println("No Monaseb Masir!");
                    break;
                }
            }
        }

    }
    static void chapChars(ArrayList<Character> characters){
        for(Character character:characters){
            System.out.print(character);
        }
        System.out.println();
    }
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        if(n == 1 || n % 2 == 0 ){
            return false;
        }else {
            for(int i = 3 ; i< n ;i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void fillJadval(int[][] jadval){
        for(int i = 0 ; i < jadval.length;i++){
            for(int j = 0 ; j< jadval[i].length;j++){
                jadval[i][j] = keyboard.nextInt();
            }
        }
    }
}

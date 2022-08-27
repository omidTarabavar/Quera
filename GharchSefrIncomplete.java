import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GharchSefrIncomplete {
    static Scanner keyboard =new Scanner(System.in);
//    static int playerTurn =1;
    static int[] selectedMushrooms = new int[2];
    // playerMove = {{arrayOfMushroom1},{result1},{arrayOfMushroom2},{result2}...
    static ArrayList<int[]> player1MoveRecorderArr = new ArrayList<>();
    // playerMove = {{arrayOfMushroom1},{selected1_1,selected2_1,result1},...
    static ArrayList<int[]> player2MoveRecorderArr = new ArrayList<>();

    public static void main(String[] args) {
        int numberOfGames = keyboard.nextInt();
        for(int i =1 ; i <= numberOfGames ;i++){
            int num1 = keyboard.nextInt();
            int num2 = keyboard.nextInt();

            int[] player1Arr= new int[num1];
            initArr(player1Arr);
            int[] player2Arr = new int[num2];
            initArr(player2Arr);
            int result1 = game(1,player1Arr);
            int result2 = game(1,player2Arr);
            System.out.println(Math.min(result1,result2) +" "+Math.max(result1,result2));
        }
    }
    static void initArr(int[] playerArr){
        Arrays.fill(playerArr, 1);
    }
    static int game(int playerTurn,int[] mushrooms){
        if(playerTurn == 1) {
            boolean gameFinish = isFinished(mushrooms);
            if (gameFinish) {
                return mushrooms.length;
            }
        }
        if(playerTurn == 1) {
            if(mushrooms.length < 2){
                return mushrooms.length;
            }
            int[] maxArr= new int[0];
            int maxNumOfMushroom=0;
            for (int i = 0; i < mushrooms.length - 1; i++) {
                for(int j = i+1;j< mushrooms.length;j++){
                    selectedMushrooms[0] = mushrooms[i];
                    selectedMushrooms[1] = mushrooms[j];
                    int[] tempArr = removeItem(mushrooms,i,j);
                    int resultOfThisMove;
                    // search
                    int search = searchArrPlayer2(tempArr,selectedMushrooms[0],selectedMushrooms[1]);
                    if(search != 999){
                        resultOfThisMove = search;
                    }else {
                        resultOfThisMove= game(2,tempArr);
                        // save
                        int[] a = {selectedMushrooms[0],selectedMushrooms[1],resultOfThisMove};
                        player2MoveRecorderArr.add(tempArr);
                        player2MoveRecorderArr.add(a);
                    }
                    if(resultOfThisMove >= maxNumOfMushroom){
                        maxArr = tempArr;
                        maxNumOfMushroom =tempArr.length;
                    }

                }
            }
            return game(2,maxArr);
        }else {
            int[] minArr;
            int mushroomToAddBezan = selectedMushrooms[0]+selectedMushrooms[1];
            int[] bezanArr = bezanAdd(mushroomToAddBezan,mushrooms);
            // search array player 1
            int bezan;
            int searchBezan = searchArrPlayer1(bezanArr);
            if(searchBezan != 999){


                bezan = searchBezan;
            }else {
                bezan = game(1,bezanArr);
                // save array player1
                int[] a = {bezan};
                player1MoveRecorderArr.add(bezanArr);
                player1MoveRecorderArr.add(a);
            }
            int mushroomToAddBeshkan = Math.abs(selectedMushrooms[0]-selectedMushrooms[1]);
            int[] beshkanArr = beshkanAdd(mushroomToAddBeshkan,mushrooms);
            // search array player 1
            int searchBeshkan = searchArrPlayer1(beshkanArr);
            int beshkan;
            if(searchBeshkan != 999){
                beshkan = searchBeshkan;
            }else {
                beshkan = game(1,beshkanArr);
                // save array player1
                int[] b = {beshkan};
                player1MoveRecorderArr.add(beshkanArr);
                player1MoveRecorderArr.add(b);
            }
            if(bezan <= beshkan){
                minArr = bezanArr;
            }else {
                minArr = beshkanArr;
            }

            return game(1,minArr);
        }
    }

    static int searchArrPlayer2(int[] currentArr,int currentSelected1,int currentSelected2){
        for(int i = 0 ; i< player2MoveRecorderArr.size();i+=2){
            boolean ok = true;
            if(player2MoveRecorderArr.get(i).length==currentArr.length){
                for(int j = 0 ; j< player2MoveRecorderArr.get(i).length;j++){
                    if(player2MoveRecorderArr.get(i)[j] != currentArr[j]){
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    boolean check1 =player2MoveRecorderArr.get(i+1)[0] == currentSelected1 || player2MoveRecorderArr.get(i+1)[1] == currentSelected1;
                    boolean check2 = player2MoveRecorderArr.get(i+1)[0] == currentSelected2 || player2MoveRecorderArr.get(i+1)[1] == currentSelected2;
                    if(check1 && check2){
                        return player2MoveRecorderArr.get(i+1)[2];
                    }
                }
            }
        }
        return 999;
    }

    static int searchArrPlayer1(int[] currentArr){
        for(int i = 0 ; i < player1MoveRecorderArr.size();i+=2){
            boolean ok = true;
            if(player1MoveRecorderArr.get(i).length == currentArr.length){
                for (int j = 0; j < player1MoveRecorderArr.get(i).length; j++) {
                    if(player1MoveRecorderArr.get(i)[j] != currentArr[j]){
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    return player1MoveRecorderArr.get(i+1)[0];
                }
            }
        }
        return 999;
    }
    static int[] bezanAdd(int mushroomToAdd,int[] mushrooms){
        int[] tempArr = new int[mushrooms.length+1];
        System.arraycopy(mushrooms, 0, tempArr, 0, mushrooms.length);
        tempArr[mushrooms.length] = mushroomToAdd;
        return tempArr;
    }
    static int[] beshkanAdd(int mushroomToAdd,int[] mushrooms){
        int[] tempArr = new int[mushrooms.length+1];
        System.arraycopy(mushrooms, 0, tempArr, 0, mushrooms.length);
        tempArr[mushrooms.length] = mushroomToAdd;
        return tempArr;
    }

    static int[] removeItem(int[] firstArr,int removeIndex1,int removeIndex2){
        int[] result = new int[firstArr.length-2];
        int indexTracker=0;
        for(int i = 0 ; i < firstArr.length;i++){
            if(i != removeIndex1 && i != removeIndex2){
                result[indexTracker] = firstArr[i];
                indexTracker += 1;
            }
        }
        return result;
    }
    static boolean isFinished(int[] mushrooms){
        int sumOfHeight = 0;
        for (int mushroom : mushrooms) {
            sumOfHeight += mushroom;
        }
        if(sumOfHeight ==0){
            return true;
        }
        for(int mushroom:mushrooms){
            if(mushroom > (sumOfHeight-mushroom)){
                return true;
            }
        }
        return false;
    }
}

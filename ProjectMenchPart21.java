import java.util.ArrayList;
import java.util.Scanner;

public class ProjectMenchPart21 {
    public static class Piece{
        public int position;
        public String name;
        public Piece(String name){
            position = 1;
            this.name = name;
        }
    }
    static ArrayList<Integer> xKs = new ArrayList<>();
    static int A,B,m=0;
    static Scanner keyboard =new Scanner(System.in);
    static ArrayList<Integer> dices = new ArrayList<>();
    static ArrayList<Piece> activePiece = new ArrayList<>();
    public static void main(String[] args) {
        A = keyboard.nextInt();
        B = keyboard.nextInt();
        m = keyboard.nextInt();
        int q = keyboard.nextInt();
        for(int i = 0 ; i < q ;i++){
            String input = keyboard.next();
            switch (input){
                case "dice":{
                    dice();
                    break;
                }
                case "enter":{
                    enterPiece();
                    break;
                }
                case "move":{
                    movePiece();
                    break;
                }
                case "giveup":{
                    giveUp();
                    break;
                }
            }
        }
    }
    public static int get_dice(){
        if(xKs.size() == 0){
            xKs.add(B);
        }
        else {
            xKs.add((A*xKs.get(xKs.size()-1)+B) % m);
        }
        return (xKs.get(xKs.size()-1) % 6)+1;
    }
    static void dice(){
        if(dices.size() != 0){
            System.out.println("invalid dice rolling");
        }
        else {
            int thrownDice = 6;
            while (thrownDice == 6) {
                thrownDice = get_dice();
                dices.add(thrownDice);
            }
            System.out.println(printDices());
        }
    }
    static String printDices(){
        String result="";
        for(int i = 0 ; i < dices.size();i++){
            result += dices.get(i);
            if(i != dices.size()-1){
                result +=" ";
            }
        }
        return result;
    }
    static boolean searchThroughActivePieces(String pieceName){
        for(Piece pieces:activePiece){
            if(pieces.name.equals(pieceName)){
                return true;
            }
        }
        return false;
    }
    static boolean checkStartingPlace(){
        for(Piece piece:activePiece){
            if(piece.position==1){
                return false;
            }
        }
        return true;
    }
    static void enterPiece(){
        String piece = keyboard.next();
        if(!searchThroughActivePieces(piece)) {
            boolean foundSix = false;
            for (Integer integer : dices) {
                if (integer == 6) {
                    foundSix = true;
                    if(checkStartingPlace()) {
                        Piece pieceToAdd = new Piece(piece);
                        activePiece.add(pieceToAdd);
                        System.out.println(activePiece.get(activePiece.size()-1).position);
                        removeFromDice(6);
                        break;
                    }else {
                        System.out.println("busy starting cell");
                    }
                }
            }
            if (!foundSix) {
                System.out.println("you need six");
            }
        }else {
            System.out.println("that is in");
        }
    }
    static void removeFromDice(int dice){
        for(int i = 0; i< dices.size();i++){
            if(dices.get(i)==dice){
                dices.remove(i);
                break;
            }
        }
    }
    static boolean searchThroughDices(int move){
        for(Integer integer:dices){
            if(integer == move){
                return true;
            }
        }
        return false;
    }
    static Piece findPiece(String name){
        for(Piece piece:activePiece){
            if(piece.name.equals(name)){
                return piece;
            }
        }
        return null;
    }
    static boolean isItOccupied(int placeNum){
        for(Piece piece:activePiece){
            if(piece.position == placeNum){
                return true;
            }
        }
        return false;
    }
    static void movePiece(){
        String piece = keyboard.next();
        int move = keyboard.nextInt();
        if(searchThroughDices(move)){
            if(searchThroughActivePieces(piece)){

                    if(isItOccupied(findPiece(piece).position+move)){
                        System.out.println("destination is busy");
                    }else {
                        removeFromDice(move);
                        findPiece(piece).position += move;
                        System.out.println(findPiece(piece).position);
                    }

            }else {
                System.out.println("it is not in");
            }
        }else {
            System.out.println("invalid move");
        }
    }
    static void giveUp(){
        int size = dices.size();
        for(int i = 0 ; i< size;i++){
            dices.remove(0);
        }
    }
}

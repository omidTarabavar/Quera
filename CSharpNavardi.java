import java.util.ArrayList;
import java.util.Scanner;

public class CSharpNavardi {
    private static class Node{
        boolean flag;
        int value;
        ArrayList<Node> neighbors;
        Node(int value){
            this.value = value;
            neighbors = new ArrayList<>();
        }
        static void makeALink(Node node1,Node node2){
            node1.addNeighbors(node2);
            node2.addNeighbors(node1);
        }
        void addNeighbors(Node neighbor){
            neighbors.add(neighbor);
        }
        Node isInNeighbors(Node finish){
            for(Node node:neighbors){
                if(node.value == finish.value)
                    return node;
            }
            return null;
        }
    }
    static Node[][] board =new Node[2][2];

    public static void main(String[] args) {
        board[0][0] = new Node(1);
        board[0][1] = new Node(2);
        board[1][0] = new Node(3);
        board[1][1] = new Node(4);
        Node.makeALink(board[0][0],board[0][1]);
        Node.makeALink(board[0][0],board[1][0]);
        Node.makeALink(board[1][1],board[0][1]);
        Node.makeALink(board[1][1],board[1][0]);
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int m = keyboard.nextInt();
        int steps = 0;
        Node start = findNode(n);
        Node finish = findNode(m);
        if(n != m){
            Node current = start;
            while (current != null && current != finish){
                steps += 1;
                if(current.isInNeighbors(finish) != null){
                    current = current.isInNeighbors(finish);
                }else {
                    current.flag = true;
                    for(Node node : current.neighbors){
                        if(!node.flag)
                            current = node;
                    }
                }
            }
        }
        System.out.println(steps);
    }
    static Node findNode(int value){
        for(int i = 0 ; i < board.length;i++){
            for(int j = 0 ; j < board[i].length;j++){
                if(board[i][j].value == value){
                    return board[i][j];
                }
            }
        }
        return null;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Node{
        ArrayList<Node> hamsaye= new ArrayList<>();
        String color = "";
        int number;
        String status ="";
        public Node(int number){
            this.color="WHITE";
            this.number = number;
            this.status = "unchecked";
        }
    }

    static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfGraphs = keyboard.nextInt();
        for(int i = 1 ; i <=numberOfGraphs;i++){
            ArrayList<Node> blackNodes = new ArrayList<>();
            ArrayList<Node> nodes = new ArrayList<>();
            int numberOfNodes = keyboard.nextInt();
            int numberOfEdges = keyboard.nextInt();
            for(int k = 1 ; k <=numberOfNodes;k++){
                nodes.add(new Node(k));
            }
            for(int j = 1;j<= numberOfEdges;j++){
                Node firstNode = searchInArr(nodes,keyboard.nextInt());
                Node secondNode = searchInArr(nodes,keyboard.nextInt());
                firstNode.hamsaye.add(secondNode);
                secondNode.hamsaye.add(firstNode);
            }

            int max = 0;
                ArrayList<Node> tempBlackNodes = new ArrayList<>();
                for (int f = 0; f < nodes.size(); f++) {
                    for (Node node : nodes) {
                        if (node.hamsaye.size() == f) {
                            for(int p = 0 ; p < nodes.size();p++){
                                flaging(node, blackNodes,p);
                            }
                        }
                    }
                }



            System.out.println(blackNodes.size());
            for(Node node:blackNodes){
                System.out.print(node.number+" ");
            }
            System.out.println();
        }
    }
    static void resetNodes(ArrayList<Node> nodes){
        for(int i = 0 ; i < nodes.size();i++){
            nodes.get(i).color = "WHITE";
            nodes.get(i).status = "unchecked";
        }
    }
    static void flaging(Node node,ArrayList<Node> blackList,int numOfHamsaye){
        if(node.status.equals("unchecked") && node.hamsaye.size() == numOfHamsaye){
            if(checkHamsaye(node)){
                node.color = "BLACK";
                blackList.add(node);
            }
            node.status = "checked";
//            for(Node nodeHamsaye:node.hamsaye){
//                if(nodeHamsaye.status.equals("unchecked")){
//                    flaging(nodeHamsaye,blackList,numOfHamsaye);
//                }
//            }
        }
    }
    static Node searchInArr(ArrayList<Node> nodes,int number){
        for(Node node:nodes){
            if(node.number == number){
                return node;
            }
        }
        return null;
    }
    static boolean checkHamsaye(Node node){
        for(Node nodeHamsaye:node.hamsaye){
            if(nodeHamsaye.color.equals("BLACK")){
                return false;
            }
        }
        return true;
    }
}

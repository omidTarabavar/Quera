import java.util.*;

public class Assignment2 {
    // incomplete
    static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        int n = keyboard.nextInt();
        int[] A =new int[n];
        int[] B = new int[n];
        fillArray(A);
        fillArray(B);
        System.out.println(MatchingPairs(A,B));
    }
    static void fillArray(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            array[i] = keyboard.nextInt();
        }
        Arrays.sort(array);
    }
    static int MatchingPairs(int[] A,int[] B){
        ArrayList<int[]> matchinSet = findMatchingSet(A,B);
        ArrayList<int[]> disjoint = createDisjoint(matchinSet);
        return disjoint.size();
    }
    static ArrayList<int[]> createDisjoint (ArrayList<int[]> matchingSet){
        ArrayList<int[]> disjoint = new ArrayList<>();
        ArrayList<int[]> problematic = new ArrayList<>();
        for(int i = 0 ; i < matchingSet.size();i++){
            boolean ok = true;
            for(int j = 0 ; j < matchingSet.size();j++){
                if(j != i) {
                    if (matchingSet.get(i)[0] == matchingSet.get(j)[0] || matchingSet.get(i)[1] == matchingSet.get(j)[1]) {
                        ok = false;
                    }
                }
            }
            if(ok){
                disjoint.add(matchingSet.get(i));
            }else {
                problematic.add(matchingSet.get(i));
            }
        }
        for(int i = 0 ; i< problematic.size();i++) {
            int[] pair = problematic.get(i);
            boolean flag1 = true;
            boolean flag2 = false;
            for (int[] arr : disjoint) {
                if (arr[0] == pair[0] || arr[1] == pair[1]) {
                    flag1 = false;
                    break;
                }
            }
            if (flag1) {
                disjoint.add(pair);
                flag2 = true;
            }
            if (!flag2) {
                int temp = pair[0];
                pair[0] = pair[1];
                pair[1] = temp;
                boolean flag = true;
                for (int[] arr : disjoint) {
                    if (arr[0] == pair[0] || arr[1] == pair[1]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    disjoint.add(pair);
                }
            }
        }
        return disjoint;
    }
    static ArrayList<int[]> findMatchingSet(int[] A,int[] B){
        ArrayList<int[]> matchingSet = new ArrayList<>();
        for(int i = 0 ; i < A.length;i++){
            for(int j = 0 ; j < B.length;j++){
                if(A[i] == B[j]){
                    int[] pairs ={i,j};
                    matchingSet.add(pairs);
                }
            }
        }
        return matchingSet;
    }

}

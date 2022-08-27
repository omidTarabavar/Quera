import java.util.Scanner;

public class soalAliShahAli {
    public static void main(String[] args) {
        String name="ali";
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        String result="";
        for(int i =1 ; i <= number;i++){
            String temp="";
            for(int j =0 ;j<name.length();j++){
                if(name.charAt(j)=='a'){
                    temp += 'b';
                }else if (name.charAt(j) =='b'){
                    temp += "ab";
                }else {
                    temp += name.charAt(j);
                }
            }
            System.out.println("first temp: "+temp);
            name = temp;
            temp ="";
            for(int k=0;k<name.length();k++){
                if(name.charAt(k) =='a'){
                    temp += "aba";
                }else if(name.charAt(k)=='b'){
                    temp += "baabb";
                }else {
                    temp += name.charAt(k);
                }
            }
            name = temp;
            temp = "";
            for(int m = 0 ; m< name.length();m++){
                if(name.charAt(m) == 'a'){
                    temp += "cb";
                }else if(name.charAt(m) == 'b'){
                    temp += "ccaba";
                }else if (name.charAt(m) == 'c'){
                    temp += "ccb";
                }else {
                    temp += name.charAt(m);
                }
            }
            name = temp;
        }
        System.out.println(name);
    }
}

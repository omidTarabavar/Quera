import java.util.Scanner;

public class AzmonTesti {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        int numOfQuastions = keyboard.nextInt();
        String correctAnswers = keyboard.next();
        int numOfAnswerSheet = keyboard.nextInt();
        keyboard.nextLine();
        for(int i = 1 ; i<=numOfAnswerSheet;i++){
            int sheetResult=0;
            for(int j = 0;j<numOfQuastions;j++){
                String answer = keyboard.next();
                sheetResult += checkAnswer(answer,correctAnswers,j);
            }
            System.out.print("\n"+sheetResult);
        }
    }
    public static int checkAnswer(String answer,String correctAnswers,int questionNumber){
        String answerOrder = "ABCD";
        char userAnswer='\u0000';
        int numOfAnswers=0;
        for(int i= 0 ;i<4;i++){
            if(answer.charAt(i)=='#'){
                userAnswer = answerOrder.charAt(i);
                numOfAnswers += 1;
            }
        }
        if(numOfAnswers == 0){
            return 0;
        }else if(numOfAnswers > 1){
            return -1;
        }
        if(userAnswer == correctAnswers.charAt(questionNumber)){
            return 3;
        }
        return -1;
    }
}

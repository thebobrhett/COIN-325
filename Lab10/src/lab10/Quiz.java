/****************
Bob Rhett - Tuesday, March 3, 2015
  Class to define a quiz.
  Initial release
****************/
package lab10;

import java.util.Scanner;

public class Quiz {

    public static String giveQuiz() {
        Question quiz = new Question();
        
        for (int i = 1; i <= quiz.numQuestion(); i++) {
            quiz.askQuestion(i);
        }
        
        for (int i = 1; i <= quiz.numQuestion(); i++) {
             System.out.println(quiz.getQuestion(i));
        }
        
        return quiz.getGrade();
    }
    
    public String addQuestion(String newQ, String newA) {
        Scanner scan = new Scanner(System.in);
        Question quiz = new Question();
        if (newQ.equals("")) {
            System.out.println("Question?");
            newQ = scan.nextLine();
        }
        if (newA.equals("")) {
            System.out.println("Answer?");
            newA = scan.nextLine();
        }
        quiz.newQuestion(newQ, newA);
        return quiz.getQuestion(quiz.numQuestion());
    }
    
    public static void main(String[] args) {
        System.out.println(giveQuiz());
        
    }
}

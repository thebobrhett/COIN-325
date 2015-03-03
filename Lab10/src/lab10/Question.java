/****************
Bob Rhett - Tuesday, March 3, 2015
  Class to define test questions.
  Initial release
****************/
package lab10;

import java.util.Scanner;

public class Question {
    private String[] q = new String[25];
    private String[] a = new String[25];
    private String[] r = new String[25];

    /****************
    / Constructor to set up the questions
    ****************/
    public Question() {
        for (int i = 0; i < q.length; i++) {    //reinitialize the arrray
            q[i] = "";
            a[i] = "";
            r[i] = "";
        }

        //Add built-in questions
        q[0] = "What is 1 + 1?";
        a[0] = "2";
        q[1] = "Who is the best Star Trek Caption?";
        a[1] = "Kirk";
        q[2] = "Who shot first?";
        a[2] = "Han";
    }
    
    public int numQuestion() {
        //How many questions are there?
        int qMax = 0;
        for (int i = 0; i < q.length; i++) {
            if (!q[i].equals("")) {
                qMax++;
            }
        }
        return qMax;
    }
    
    public void newQuestion(String newQ, String newA) {
        //add a new question
        int nextQ = numQuestion();
        q[nextQ] = newQ;
        a[nextQ] = newA;
    }
    
    public void askQuestion(int nextQ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Question " + nextQ + ": " + q[nextQ - 1]);
        r[nextQ - 1] = scan.nextLine();
    }        
    
    public String getQuestion(int nextQ) {
        nextQ--;
        return q[nextQ] + ", Student response: " + r[nextQ] + ", Instructor's answer: " + a[nextQ];
    }
    
    public String getGrade() {
        int qAsked = 0;
        int qRight = 0;
        for (int i = 0; i < q.length; i++) {
            if (!q[i].equals("")) {
                qAsked++;
                if (a[i].equals(r[i])) {
                    qRight++;
                }
            }
        }
        return "Auto-grader: " + qRight + " out of " + qAsked;
    }
}

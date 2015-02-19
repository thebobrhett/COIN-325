/****************
Bob Rhett - Monday, February 9, 2015
  Program to roll a pair a gaming dice.
  Initial release
****************/
package lab05;
import java.util.Scanner;

public class PairOfDice {
   //-----------------------------------------------------------------
   //  Creates two Die objects. Rolls them when necessary.
   //  Adds the face values of the two dice.
   //-----------------------------------------------------------------
    public static void main(String[] args) {
        int num1, num2;
        boolean err = false;
                
        Die die1 = new Die();
        Die die2 = new Die();
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Input the value of the first die: ");
        num1 = scan.nextInt();
        
        if (num1 == -1)
            num1 = die1.roll();
        else if (num1 >= 1 && num1 <= 6)
            die1.setFaceValue(num1);
        else
            err = true;
            
        System.out.print("Input the value of the second die: ");
        num2 = scan.nextInt();
        
        if (num2 == -1)
            num2 = die2.roll();
        else if (num2 >= 1 && num2 <= 6)
            die2.setFaceValue(num2);
        else
            err = true;

        if (err == false)
            System.out.println("The sum is: " + (num1 + num2));
        else
            System.out.println("Error - You entered a value that is out of range.");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import javax.swing.JOptionPane;

/**
 * Bob Rhett - Thursday, February 19, 2015
 *   COIN-325-40 Lab 8
 *   Program to demonstrate use of dialog boxes.
 *   Initial release
 * @author Bob
 */
public class DialogSumProduct {
    public static void main(String[] args) {
        String numStr1, numStr2, strResult;
        int num1, num2, ok, again;
        do {
            numStr1 = JOptionPane.showInputDialog("Please enter the first integer: ");
            num1 = Integer.parseInt(numStr1);
            
            numStr2 = JOptionPane.showInputDialog("Please enter the second integer: ");
            num2 = Integer.parseInt(numStr2);
            
            JOptionPane.showMessageDialog(null, "The sum is: " + (num1 + num2) + "\n" + "The product is: " + (num1 * num2));
            
            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);
    }
    
}

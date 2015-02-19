/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import javax.swing.JFrame;

/**
* Bob Rhett - Tuesday, February 17, 2015
 *   COIN-325-40 Lab 7
 *   Program to display a random number.
 *   Initial release
 * @author Bob
 */
public class PushRandom {
    //****************
    // Creates and displays the program frame
    //****************
    public static void main (String[] args) {
        JFrame frame = new JFrame("Push Random");
        frame.add(new PushRandomPanel());
        
        //PushRandomPanel panel = new PushRandomPanel();
        //frame.getContentPane().add(panel);
        //frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

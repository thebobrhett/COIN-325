/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
 * Bob Rhett - Tuesday, February 17, 2015
 *   COIN-325-40 Lab 7
 *   Program to display a random number.
 *   Initial release
 * @author Bob
 */
public class PushRandomPanel extends JPanel {
    private int mResult;
    public JButton mPush;
    public JLabel mLabel;
    
    //****************
    // Constructor: Sets up the GUI
    //****************
    public PushRandomPanel() {
        mResult = 0;
        
        mPush = new JButton("Push Me!");
        mPush.addActionListener(new ButtonListener());
        
        mLabel = new JLabel();
                
        this.add(mPush);
        this.add(mLabel);
        
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 100));
    }
    
    //****************
    // A method to programatically push the button for testing
    //****************
    public void generateRandom() {
        mPush.doClick();
    }
    
    //****************
    // A method to return the current value of the random number.
    //****************
    public String getResult() {
        return mLabel.getText();
    }
    
    //****************
    // Listener for button push
    //****************
    private class ButtonListener implements ActionListener {
        //****************
        // Updates the number and label when the button is pushed
        //****************
        @Override
        public void actionPerformed(ActionEvent event) {
            Random generator = new Random();
            mResult = generator.nextInt(100) + 1;
            mLabel.setText("" + mResult);
        }
    }
}

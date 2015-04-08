/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.*;

/**
 *
 * @author Bob
 */
public class Success {
    public Success(String successMessage) {
        JFrame successFrame = new JFrame("Success");
        successPanel tempPanel = new successPanel(successMessage);
        successFrame.getContentPane().add(tempPanel);
        successFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        successFrame.pack();
        successFrame.setVisible(true);
    }

}

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
public class Error {

    public Error(String errMessage) {
        JFrame errFrame = new JFrame("Error");
        errPanel tempPanel = new errPanel(errMessage);
        errFrame.getContentPane().add(tempPanel);
        errFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        errFrame.pack();
        errFrame.setVisible(true);
    }
}

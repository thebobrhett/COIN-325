/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Bob
 */
public class SetPasswordPanel extends JPanel {
    JButton mOKButton, mCancelButton;
    JLabel mUsernameLabel, oldPasswordLabel, newPasswordLabel, cnfPasswordLabel;
    JTextField mUsername;
    JPasswordField oldPassword, newPassword, cnfPassword;
    public SetPasswordPanel() {
        mUsernameLabel = new JLabel("Username: ");
        mUsername = new JTextField(20);
        oldPasswordLabel = new JLabel("Old Password: ");
        oldPassword = new JPasswordField(20);
        newPasswordLabel = new JLabel("Password: ");
        newPassword = new JPasswordField(20);
        cnfPasswordLabel = new JLabel("Confirm Password: ");
        cnfPassword = new JPasswordField(20);
        mOKButton = new JButton("OK");
        mCancelButton = new JButton("Cancel");
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 232));

        this.add(mUsernameLabel);
        this.add(mUsername);
        this.add(oldPasswordLabel);
        this.add(oldPassword);
        this.add(newPasswordLabel);
        this.add(newPassword);
        this.add(cnfPasswordLabel);
        this.add(cnfPassword);
        this.add(mOKButton);
        this.add(mCancelButton);
        
        mOKButton.addActionListener(new OKListener());
        mCancelButton.addActionListener(new CancelListener());
    }
    
    private class OKListener implements ActionListener {
        // when the OK button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            Account resetPassword = new Account();
            resetPassword.setPassword(mUsername.getText(), oldPassword.getPassword(), newPassword.getPassword(), cnfPassword.getPassword());
        }
    }

    private class CancelListener implements ActionListener {
        // when the Cancel button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {

        }
    }
    
}

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
public class GetPasswordPanel extends JPanel {
    JButton mOKButton, mCancelButton;
    JLabel mUsernameLabel, oldPasswordLabel, newPasswordLabel, cnfPasswordLabel;
    JTextField mUsername;
    JPasswordField oldPassword, newPassword, cnfPassword;
    public GetPasswordPanel() {
        mUsernameLabel = new JLabel("Username: ");
        mUsername = new JTextField(20);
        mOKButton = new JButton("OK");
        mCancelButton = new JButton("Cancel");
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 92));

        this.add(mUsernameLabel);
        this.add(mUsername);
        this.add(mOKButton);
        this.add(mCancelButton);
        
        mOKButton.addActionListener(new OKListener());
        mCancelButton.addActionListener(new CancelListener());
    }
    
    private class OKListener implements ActionListener {
        // when the OK button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            Account forgotPassword = new Account();
            forgotPassword.getPassword(mUsername.getText());
        }
    }

    private class CancelListener implements ActionListener {
        // when the Cancel button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {

        }
    }
}

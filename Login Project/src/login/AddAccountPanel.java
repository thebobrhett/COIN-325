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
public class AddAccountPanel extends JPanel {
    JButton mOKButton, mCancelButton;
    JLabel mFnameLabel, mLnameLabel, mEmailLabel, mConfEmailLabel, newPasswordLabel, mConfPasswordLabel;
    JTextField mFname, mLname, mEmail, mConfEmail;
    JPasswordField newPassword, mConfPassword;
    JCheckBox mTermsAgree;
    public AddAccountPanel() {
        mFnameLabel = new JLabel("First name: ");
        mFname = new JTextField(20);
        mLnameLabel = new JLabel("Last name: ");
        mLname = new JTextField(20);
        mEmailLabel = new JLabel("Email: ");
        mEmail = new JTextField(20);
        mConfEmailLabel = new JLabel("Confirm Email: ");
        mConfEmail = new JTextField(20);
        newPasswordLabel = new JLabel("Password: ");
        newPassword = new JPasswordField(20);
        mConfPasswordLabel = new JLabel("Confirm Password: ");
        mConfPassword = new JPasswordField(20);
        mTermsAgree = new JCheckBox("I agree to the Terms & Conditions");
        mOKButton = new JButton("OK");
        mCancelButton = new JButton("Cancel");
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 258));

        this.add(mFnameLabel);
        this.add(mFname);
        this.add(mLnameLabel);
        this.add(mLname);
        this.add(mEmailLabel);
        this.add(mEmail);
        this.add(newPasswordLabel);
        this.add(newPassword);
        this.add(mConfPasswordLabel);
        this.add(mConfPassword);
        this.add(mTermsAgree);
        this.add(mOKButton);
        this.add(mCancelButton);
        
        mOKButton.addActionListener(new OKListener());
        mCancelButton.addActionListener(new CancelListener());

//Instantiate the new user
//            User currUser = new User(mUsername.getText(), mPassword.getPassword());
            
/*            if (currUser.getUID() == null) {
                System.out.println("Bad username or password");
                Error errPanel = new Error("Bad username of password");
            } else {
                //for testing
                System.out.println("The current user's username is " + currUser.getUsername());
                System.out.println("The current user's ID is " + currUser.getUID());
                System.out.println("The current user's name is " + currUser.getFname() + " " + currUser.getLname());
                Success successPanel = new Success("Valid login");
            }
*/
//            db.disconnect();
    }
    
    private class OKListener implements ActionListener {
        // when the OK button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            Account newAccount = new Account();
            newAccount.addAccount(mFname.getText(), mLname.getText(), mEmail.getText(), newPassword.getPassword(), mConfPassword.getPassword(), mTermsAgree.isSelected());
        }
    }

    private class CancelListener implements ActionListener {
        // when the Cancel button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {

        }
    }
}

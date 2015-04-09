/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bob
 */
public class LoginPanel extends JPanel {
    private JButton mLoginButton, mSetPassword, mGetPassword, mAddAccount;
    private JLabel mUsernameLabel, mPasswordLabel;
    private JTextField mUsername;
    private JPasswordField mPassword;
    private JCheckBox mRememberMe;

    //Constructor
    public LoginPanel() {
        String rememberedUsername = null;
        String rememberedPassword = null;
        Scanner cookie = null;
        try {
            cookie = new Scanner (new File("cookie.txt"));
            while (cookie.hasNext()) {
                rememberedUsername = cookie.nextLine();
                rememberedPassword = cookie.nextLine();
            }
            cookie.close();
        } catch (FileNotFoundException ex) {
            if (cookie != null) {
                cookie.close();
            }
        }
        
        mUsernameLabel = new JLabel("Username: ");
        if (rememberedUsername != null) {
            mUsername = new JTextField(rememberedUsername, 20);
        } else {
            mUsername = new JTextField(20);
        }
        mPasswordLabel = new JLabel("Password: ");
        if (rememberedPassword != null) {
            mPassword = new JPasswordField(rememberedPassword, 20);
            mRememberMe = new JCheckBox("Remember me");
            mRememberMe.setSelected(true);
        } else {
            mPassword = new JPasswordField(20);
            mRememberMe = new JCheckBox("Remember me");
        }
        mLoginButton = new JButton("Login");
        mSetPassword = new JButton("I want to change my password...");
        mGetPassword = new JButton("I forgot my password...");
        mAddAccount = new JButton("Create a new account...");
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 225));

        this.add(mUsernameLabel);
        this.add(mUsername);
        this.add(mPasswordLabel);
        this.add(mPassword);
        this.add(mRememberMe);
        this.add(mLoginButton);
        this.add(Box.createRigidArea(new Dimension(0,20)));
        this.add(mSetPassword);
        this.add(mGetPassword);
        this.add(mAddAccount);
        
        mLoginButton.addActionListener(new LoginListener());
        mSetPassword.addActionListener(new SetPasswordListener());
        mGetPassword.addActionListener(new GetPasswordListener());
        mAddAccount.addActionListener(new AddAccountListener());

    }
    private class LoginListener implements ActionListener {
        // when the login button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            Database db = new Database();
            db.connectRO();

            User currUser = new User(mUsername.getText(), mPassword.getPassword());
            
            if (currUser.getUID() == null) {
                System.out.println("Bad username or password");
                Error errPanel = new Error("Bad username of password");
            } else {
                //for testing
                System.out.println("The current user's username is " + currUser.getUsername());
                System.out.println("The current user's ID is " + currUser.getUID());
                System.out.println("The current user's name is " + currUser.getFname() + " " + currUser.getLname());
                Success successPanel = new Success("Valid login");
                if (mRememberMe.isSelected()) {
                    PrintWriter writer;
                    try {
                        writer = new PrintWriter("cookie.txt", "UTF-8");
                        writer.println(mUsername.getText());
                        //encrypt the password
                        writer.println(new String(mPassword.getPassword()));
                        writer.flush();
                        writer.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedEncodingException ex) {
                        Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        File cookie = new File("cookie.txt");
                        cookie.setWritable(true);
                        cookie.delete();
                    } catch(Exception ex) {
                        ex.printStackTrace();
                    }
    		}
            }
                    
        
/*            db.disconnect();
            if (conn == null) {
                System.out.println("Successfully disconnected from Database");
            }*/
        }
    }
    private class SetPasswordListener implements ActionListener {
        // when the Change Password button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            JFrame frame = new JFrame("Reset Password");
            frame.add(new SetPasswordPanel());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
    private class GetPasswordListener implements ActionListener {
        // when the Forgot Password button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            JFrame frame = new JFrame("Get Password");
            frame.add(new GetPasswordPanel());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);        }
    }
    private class AddAccountListener implements ActionListener {
        // when the Create New Account button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            JFrame frame = new JFrame("Add Account");
            frame.add(new AddAccountPanel());

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }

}

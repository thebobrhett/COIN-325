/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;

public class Login {
    /**
     *
     * @author Bob
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.add(new LoginPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    
}

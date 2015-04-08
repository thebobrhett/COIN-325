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
public class errPanel extends JPanel {

    public errPanel(String errMessage) {
        JLabel errLabel = new JLabel("Error: " + errMessage);
        JButton doneButton = new JButton("Done");
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.lightGray);
        this.setPreferredSize(new Dimension(300, 225));
        this.add(errLabel);
        this.add(doneButton);
        doneButton.addActionListener(new doneListener());
    }
    
    private class doneListener implements ActionListener {
        // when the Done button is pushed
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("Done");
//            errPanel.dispose();
        }
    }
}

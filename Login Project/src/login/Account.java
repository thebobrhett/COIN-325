/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static login.Database.conn;
import static login.User.rset;

/**
 *
 * @author Bob
 */
public class Account {
    static ResultSet rset = null;

    //Constructor
    public Account() {
        
    }
    
    public void addAccount(String fname, String lname, String username, char[] password, char[] confirmpassword, Boolean agree) {
        //Convert the passwords to strings
        String Password = new String(password);
        String ConfPassword = new String(confirmpassword);
        String errMessage = "";
        //Check for mistakes
        if (fname.equals("")) {
            //Error - no firstname
            errMessage = "The first name is required";
        }
        if (lname.equals("")) {
            //Error - no lastname
            errMessage = "The last name is required";
        }
        if (username.equals("")) {
            //Error - no username
            errMessage = "The Email address is required";
        } else {
            //be sure it has the form of a real email address
        }
        if (Password.equals("")) {
            //Error - no password
            errMessage = "A password is required";
        } else {
            if (!Password.equals(ConfPassword)) {
                //be sure passwords match
                errMessage = "The passwords must match";
            }
        }
        if (!agree) {
            errMessage = "You must agree to the Terms and Conditions";
        }

        if (errMessage.equals("")) {
            Database db = new Database();
            db.connectRW();

            String qryStr = "insert into inoutadmintest.members (username, password, firstname, lastname, email, createdby) values ('" + username + "', '" + Password + "', '" + fname + "', '" + lname + "', '" + username + "', '1');";

            try {
                Statement stmt = conn.createStatement();
                stmt.execute(qryStr);
                conn.close();
                Success successPanel = new Success("The account was created");
            } catch(SQLException ex) {
                //handle an existing account here
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("qryStr: " + qryStr);
                ex.printStackTrace();
            }
        } else {
            Error errPanel = new Error(errMessage);
        }
    }
}

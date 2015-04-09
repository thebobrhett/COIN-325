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
            errMessage = "An Email address is required";
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

    public void setPassword(String username, char[] oldPassword, char[] newPassword, char[] cnfPassword) {
        //Convert the passwords to strings
        String strOldPassword = new String(oldPassword);
        String strNewPassword = new String(newPassword);
        String strCnfPassword = new String(cnfPassword);
        
        String errMessage = "";
        //Check for mistakes
        if (username.equals("")) {
            //Error - no username
            errMessage = "The Email address is required";
        } else {
            //be sure it has the form of a real email address
        }
        if (strOldPassword.equals("")) {
            //Error - no password
            errMessage = "The old password is required";
        }
        if (strNewPassword.equals("")) {
            //Error - no password
            errMessage = "A new password is required";
        } else {
            if (!strNewPassword.equals(strCnfPassword)) {
                //be sure passwords match
                errMessage = "The new password must match";
            }
        }

        if (errMessage.equals("")) {
            Database db = new Database();
            db.connectRW();

            String qryStr = "update inoutadmintest.members set password = '" + strNewPassword + "' where username = '" + username + "' and password = '" + strOldPassword + "';";

            try {
                Statement stmt = conn.createStatement();
                stmt.execute(qryStr);
                conn.close();
                Success successPanel = new Success("The password was changed");
                /*Need more information on the smtp server to get this to work
                Properties props = System.getProperties();
                props.put("mail.smtps.host","relay-hosting.secureserver.net");
                props.put("mail.smtps.auth","true");
                Session session = Session.getInstance(props, null);
                Message msg = new MimeMessage(session);
                msg.setFrom(new InternetAddress("bob@bobrhett.com"));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("support@cloudinout.com", false));
                msg.setSubject("Password Reset");
                msg.setText("This message is confirmation that your password has been changed.");
                msg.setHeader("X-Mailer", "bob@bobrhett.com");
                msg.setSentDate(new Date());
                SMTPTransport t = (SMTPTransport)session.getTransport("smtps");
                t.connect("relay-hosting.secureserver.net", "bob@bobrhett.com", "Blanket38");
                t.sendMessage(msg, msg.getAllRecipients());
                System.out.println("Response: " + t.getLastServerResponse());
                t.close();*/
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

    public void getPassword(String username) {
        String errMessage = "";
        //Check for mistakes
        if (username.equals("")) {
            //Error - no username
            errMessage = "The Email address is required";
        } else {
            //be sure it has the form of a real email address
        }

        if (errMessage.equals("")) {
            Database db = new Database();
            db.connectRO();

            String qryStr = "select password, email from inoutadmintest.members where username = '" + username + "';";

            try {
                Statement stmt = conn.createStatement();
                rset = stmt.executeQuery(qryStr);
                if (rset.next()) {
                    Success successPanel = new Success("Your password is " + rset.getString("password"));
                }
                conn.close();
                /*Need more information on the smtp server to get this to work
                Properties props = System.getProperties();
                props.put("mail.smtps.host","relay-hosting.secureserver.net");
                props.put("mail.smtps.auth","true");
                Session session = Session.getInstance(props, null);
                Message msg = new MimeMessage(session);
                msg.setFrom(new InternetAddress("bob@bobrhett.com"));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("support@cloudinout.com", false));
                msg.setSubject("Password Reset");
                msg.setText("This message is confirmation that your password has been changed.");
                msg.setHeader("X-Mailer", "bob@bobrhett.com");
                msg.setSentDate(new Date());
                SMTPTransport t = (SMTPTransport)session.getTransport("smtps");
                t.connect("relay-hosting.secureserver.net", "bob@bobrhett.com", "Blanket38");
                t.sendMessage(msg, msg.getAllRecipients());
                System.out.println("Response: " + t.getLastServerResponse());
                t.close();*/
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

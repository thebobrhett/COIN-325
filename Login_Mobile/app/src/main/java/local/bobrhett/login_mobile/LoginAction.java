package local.bobrhett.login_mobile;

import android.widget.CheckBox;
import android.widget.EditText;
import android.app.Activity;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Bob on 4/28/2015.
 */
public class LoginAction extends Activity {
    // when the login button is pushed
    //@Override
    public void LoginAction() {
        Database db = new Database();
        db.connectRO();

        //setContentView(R.layout.activity_login);
        EditText Email = (EditText)findViewById(R.id.Email);
        EditText Password = (EditText)findViewById(R.id.Password);
        CheckBox RememberMe = (CheckBox)findViewById(R.id.RememberMe);
        TextView myNotification = (TextView)findViewById(R.id.notification);


        User currUser = new User(Email.getText(), Password.getText());

        if (currUser.getUID() == null) {
//            System.out.println("Bad username or password");
//            Error errPanel = new Error("Bad username of password");
        } else {
            //for testing
//            System.out.println("The current user's username is " + currUser.getUsername());
//            System.out.println("The current user's ID is " + currUser.getUID());
//            System.out.println("The current user's name is " + currUser.getFname() + " " + currUser.getLname());
            //Success successPanel = new Success("Valid login");
            myNotification.setText("Success: Logged in as " + currUser.getFname() + " " + currUser.getLname());
            if (RememberMe.isSelected()) {
                PrintWriter writer;
                try {
                    writer = new PrintWriter("cookie.txt", "UTF-8");
                    writer.println(Email.getText());
                    //encrypt the password
                    //writer.println(new String(Password.getText()));
                    writer.flush();
                    writer.close();
                } catch (FileNotFoundException ex) {
                    //Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedEncodingException ex) {
                    //Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    File cookie = new File("cookie.txt");
                    cookie.setWritable(true);
                    cookie.delete();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

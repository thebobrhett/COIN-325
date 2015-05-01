package local.bobrhett.login_mobile;

import android.app.Activity;
//import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText Email = (EditText)findViewById(R.id.Email);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void LoginButtonOnClick(View v) {
        Database db = new Database();
        db.connectRO();

        EditText Email = (EditText)findViewById(R.id.Email);
        EditText Password = (EditText)findViewById(R.id.Password);
        CheckBox RememberMe = (CheckBox)findViewById(R.id.RememberMe);
        TextView myNotification = (TextView)findViewById(R.id.notification);

        User currUser = new User(Email.getText(), Password.getText());

        if (currUser.getUID() == null) {

        } else {
            myNotification.setText("Success: Logged in as " + currUser.getFname() + " " + currUser.getLname());
            if (RememberMe.isSelected()) {
                PrintWriter writer;
                try {
                    writer = new PrintWriter("cookie.txt", "UTF-8");
                    writer.println(Email.getText());
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

    public void setPasswordButtonOnClick(View v) {
        Button setPasswordButton = (Button)findViewById(R.id.setPasswordButton);
        setPasswordButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Login.this, setpassword.class));
            }
        });
    }

    public void getPasswordButtonOnClick(View v) {
        Button getPasswordButton = (Button)findViewById(R.id.getPasswordButton);
        getPasswordButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Login.this, getpassword.class));
            }
        });
    }

    public void addAccountButtonOnClick(View v) {
        Button addAccountButton = (Button)findViewById(R.id.addAccountButton);
        addAccountButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Login.this, addaccount.class));
            }
        });
    }

}

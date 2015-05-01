package local.bobrhett.loginactivity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static local.bobrhett.loginactivity.Database.conn;
/**
 * Created by Bob on 4/28/2015.
 */
public class User {
    private String Username, Fname, Lname;
    private Integer uid;
    private Boolean enabled;
    static ResultSet rset = null;

    //Constructor
    public User(String mUsername, String mPassword) {
        String qryStr = "select * from inoutadmintest.members where username = '" + mUsername + "';";
        try {
            Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(qryStr);
            if (rset.next()) {
                //String password = new String(mPassword);
                if (rset.getString("password").equals(mPassword)) {
                    uid = rset.getInt("id");
                    Fname = rset.getString("firstname");
                    Lname = rset.getString("lastname");
                    enabled = rset.getBoolean("active");
                }
            }
        } catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("qryStr: " + qryStr);
            ex.printStackTrace();
        }
    }

    public void setUsername(String newUsername) {

    }

    public String getUsername() {
        return Username;
    }

    public void setFname(String newFname) {
        Fname = newFname;
    }

    public String getFname() {
        return Fname;
    }

    public void setLname(String newLname) {
        Lname = newLname;
    }

    public String getLname() {
        return Lname;
    }

    public void setUID(Integer newUID) {
        uid = newUID;
    }

    public Integer getUID() {
        return uid;
    }

    public void setEnabled() {

    }

    public void setDisabled() {

    }

    public Boolean getEnabled() {
        return enabled;
    }



}

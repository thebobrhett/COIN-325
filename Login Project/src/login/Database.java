/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bob
 */
public class Database {
    private final String dbname = "inoutadmintest.db.6602424.hostedresource.com";
    private final String mUserRO = "inoutadmintest";
    private final String mPassRO = "myAdmin49!";
    private final String mUserRW = "inoutadmintest";
    private final String mPassRW = "myAdmin49!";
    static Connection conn = null;
    
    public void connectRO() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://" + dbname + "?user=" + mUserRO + "&password=" + mPassRO);
            if (conn != null) {
                System.out.println("Connect Read-only Success");
            }

        } catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            ex.printStackTrace();
        } catch(Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public void connectRW() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://" + dbname + "?user=" + mUserRW + "&password=" + mPassRW);
            if (conn != null) {
                System.out.println("connect Read-write Success");
            }
        } catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            ex.printStackTrace();
        } catch(Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public ResultSet query(String query_string) {
        ResultSet rset = null;
        try {
            Statement stmt = conn.createStatement();
            rset = stmt.executeQuery(query_string);
        } catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            ex.printStackTrace();
        }
        return rset;
    }
    
    public void disconnect() {
        try {
            conn.close();
            conn = null;
        } catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            ex.printStackTrace();
        } catch(Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18;

/**
 *
 * @author Bob
 */
public class Employee {
    private String mName, mSSN, mBDay, mDiversity;
    
    Employee(String name, String SSN, String BDay, String Diversity) {
        mName = name;
        mSSN = SSN;
        mBDay = BDay;
        mDiversity = Diversity;
    }
    
    public String getKey() {
        return mSSN + mDiversity;
    }
    
    public String getname() {
        return mName;
    }

    public String getSSN() {
        return mSSN;
    }

    public String getBDay() {
        return mBDay;
    }

    public String getDiversity() {
        return mDiversity;
    }
}
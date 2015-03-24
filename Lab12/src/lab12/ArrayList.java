/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/* Bob Rhett - Tuesday, March 24, 2015
 *   A class to create an array
 *   and implement the interface methods of the List class.
 */
public class ArrayList implements List{
    Object[] list = new Object[10];
    
    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public void add(Object obj) {
        int count = 0;
        while (list[count] != null) {
            count++;
        }
        list[count] = obj;
    }

    @Override
    public int size() {
        int count = 0;
        while (list[count] != null) {
            count++;
        }
        return count;
    }
    
}

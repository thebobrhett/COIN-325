/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/* Bob Rhett - Tuesday, March 24, 2015
 *   An interface class for creating list methods.
 * 
 */
public interface List {
    public abstract Object get(int index);
    public abstract void add(Object obj);
    public abstract int size();
}

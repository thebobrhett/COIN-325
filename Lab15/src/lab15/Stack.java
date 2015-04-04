/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

/* Bob Rhett - Saturday, April 4, 2015
 *   Demonstration of an array stack
 * @param <T>
 */
public interface Stack<T> {
    
    //method to add element to top of stack
    public int push(T element);
    
    //method to remove element from top of stack
    //exception thrown if there are no elements on stack
    public T pop() throws EmptyCollectionException;
    
    //method to inspect element at top of stack
    //exception thrown if there are no elements on stack
    public T peek() throws EmptyCollectionException;

    //method to determine if the stack is empty
    public boolean isEmpty();
    
    //method to return the number of elements currently in the stack
    public int size();

    @Override
    public String toString();
}

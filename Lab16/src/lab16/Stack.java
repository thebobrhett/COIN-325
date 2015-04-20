/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author Bob
 * @param <T>
 */
public interface Stack<T> {
    //method to add element to top of stack
    public void push(T element);
    
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

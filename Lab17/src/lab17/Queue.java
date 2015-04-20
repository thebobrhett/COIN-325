/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

/**
 *
 * @author Bob
 */
public interface Queue<T> {
    //method to add element to the queue
    public void enqueue(T element);
    
    //method to remove element from the queue
    //exception thrown if there are no elements in the queue
    public T dequeue() throws EmptyCollectionException;

    //method to inspect first element in the queue
    //exception thrown if there are no elements in the queue
    public T first() throws EmptyCollectionException;
    
    //method to determine if the queue is empty
    public boolean isEmpty();
    
    //method to return the number of elements currently in the queue
    public int size();
    
    @Override
    public String toString();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

/**
 *
 * @author Bob
 */
public class ArrayStack<T> implements Stack<T> {
    private final int DEFAULT_CAPACITY = 10;
    private T[] myStack;
    private int mPosition;
    
    //Create an empty stack using the default capacity
    public ArrayStack() {
        myStack = (T[]) (new Object[DEFAULT_CAPACITY]);
        mPosition = 0;
    }
    
    @Override
    //Add an element to the top of the stack.
    //  Expand the stack if necessary.
    public int push(T element) {
        if (mPosition == myStack.length) {
            expandCapacity();
        }
        
        myStack[mPosition] = element;
        mPosition++;
        return mPosition;
    }
    
    //If the stack is full, double the size
    private void expandCapacity() {
        T[] largerArray = (T[]) (new Object[myStack.length*2]);
        
        for (int i = 0; i < myStack.length; i++) {
            largerArray[i] = myStack[i];
        }
        
        myStack = largerArray;
    }
    
    @Override
    public boolean isEmpty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (mPosition == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return mPosition;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (mPosition == 0) {
            throw new EmptyCollectionException("Empty");
        }
        mPosition--;
        T top = myStack[mPosition];
        myStack[mPosition] = null;
        return top;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (mPosition == 0) {
            throw new EmptyCollectionException("Empty");
        }
        T top = myStack[mPosition - 1];
        return top;
    }
    
    public int getCapacity() {
        return myStack.length;
    }
}

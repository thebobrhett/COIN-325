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
public class LinkedStack<T> implements Stack<T> {
    private int count;
    private LinkedNode<T> top;
    
    public LinkedStack() {
        count = 0;
        top = null;
    }

    @Override
    public void push(T element) {
        LinkedNode newNode = new LinkedNode();
        newNode.setElement(element);
        newNode.setNext(top);
        top = newNode;
        count++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if ( top == null ) {
            throw new EmptyCollectionException();
        }
        
        T result = top.getElement();
        top = top.getNext();
        count--;
        
        return result;
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if ( top == null ) {
            throw new EmptyCollectionException();
        }
        
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
    
    @Override
    public String toString() {
        String result = "<top of stack>\n";
        LinkedNode current = top;
        
        while (current != null) {
            result += current.getElement() + "\n";
            current = current.getNext();
        }
        
        return result + "<bottom of stack>";
    }
    
}

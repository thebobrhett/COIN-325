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
public class LinkedQueue<T> implements Queue<T>{
    private int mCount;
    private LinkedNode<T> mHead, mTail;
    
    public LinkedQueue () {
        mCount = 0;
        mHead = mTail = null;
    }
    
    @Override
    public void enqueue(T element) {
        LinkedNode<T> node = new LinkedNode<>();
        
        node.setElement(element);
        
        if (mHead == null) {
            mHead = node;
        } else {
            mTail.setNext(node);
        }
        
        mTail = node;
        mCount++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (mHead == null) {
            throw new EmptyCollectionException();
        }

        T result = mHead.getElement();
        mHead = mHead.getNext();
        mCount--;
        
        return result;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if (mHead == null) {
            throw new EmptyCollectionException();
        }
        
        return mHead.getElement();
    }

    @Override
    public boolean isEmpty() {
        return mCount == 0;
    }

    @Override
    public int size() {
        return mCount;
    }
}

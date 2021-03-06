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
public class CircularArrayQueue<T> implements Queue<T> {
    private final static int DEFAULT_CAPACITY = 100;
    private int mFront, mRear, mCount;
    private T[] mQueue;
    
    public CircularArrayQueue(int initialCapacity) {
        mFront = mRear = mCount = 0;
        mQueue = (T[]) (new Object[initialCapacity]);
    }
    
    public CircularArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void enqueue(T element) {
        if (size() == mQueue.length) {
            // The queue is full, just throw an exception!
            throw new UnsupportedOperationException("Array is out of space!");
        }
        
        mQueue[mRear] = element;
        mRear = (mRear + 1) % mQueue.length;
        mCount++;
    }

    @Override
    public T dequeue() throws EmptyCollectionException {
        if (mQueue == null) {
            throw new EmptyCollectionException();
        }

        T result = mQueue[mFront % mQueue.length];
        mFront = (mFront + 1) % mQueue.length;
        mCount--;
        
        return result;
    }

    @Override
    public T first() throws EmptyCollectionException {
        if (mQueue == null) {
            throw new EmptyCollectionException();
        }
        return mQueue[mFront];
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

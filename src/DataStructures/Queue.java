package DataStructures;

/**
 * A data structure that follows the first in first out principle implemented with an array.
 * 
 * Elements are removed in the order they were inserted (enqueued)
 * 
 * @author Haivan Benjamin
 */
public class Queue 
{
    int maxSize;
    int[] queueArr;
    int front;
    int rear;
    int size;
    
    public Queue(int maxSize)
    {
        this.maxSize = maxSize;
        this.queueArr = new int[maxSize];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    
    /**
     * Insert item into the queue. 
     * New elements are always added to the end.
     * 
     * @param data element to add to the queue
     */
    public void enqueue(int value) 
    {
        if (isFull()) 
        {
            throw new IllegalStateException("Queue is full");
        }

        queueArr[rear] = value;
        size++; // size invariant
        rear = (rear + 1) % maxSize; // movement invariant
    }
    
    /**
     * Removes the first element of the queue.
     * 
     * @return first element of the queue.
     */
    public int dequeue() 
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Queue is empty");
        }

        int value = queueArr[front];
        front = (front + 1) % maxSize; // movement invariant
        size--;                          // size invariant

        return value;
    }
    
    public boolean isFull()
    {
        return size == maxSize;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
}

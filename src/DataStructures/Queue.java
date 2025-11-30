package DataStructures;

/**
 *
 * @author Haivan Benjamin
 */
public class Queue 
{
    int maxSize;
    int[] queArr;
    int front;
    int rear;
    boolean isWrapped;
    
    public Queue(int maxSize)
    {
        this.maxSize = maxSize;
        this.queArr = new int[maxSize];
        this.front = -1;
        this.rear = -1;
        this.isWrapped = false;
    }
    
    public void enqueue(int data)
    {
        if(this.isEmpty()) 
        {
            front = 0;
            rear = front;
        }
        
        queArr[rear] = data;// add item to the back of the queue then increment where the end is
        
        if(front > 0)
        {
            rear = (rear + 1) % maxSize;
        }
        
        rear++;
        
        System.out.println("queue is full");
    }
    
    public int dequeue()
    {
        // 
        return 0;
    }
    
    public boolean isFull()
    {
        boolean isFull = rear == maxSize - 1;
        //boolean isFull2 = 
        return front > rear;
    }
    
    public boolean isEmpty()
    {
        return (front > rear && !isWrapped) || (front == -1 && rear == -1);
    }
    
}

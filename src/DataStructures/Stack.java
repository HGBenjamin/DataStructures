package DataStructures;

/**
 *
 * @author Haivan Benjamin
 */
public class Stack 
{
    int[] stackArr;
    int stackSize;
    int top;
    
    public Stack(int aStackSize)
    {
        this.stackSize = aStackSize;
        this.stackArr = new int[aStackSize];
        top = -1;
    }
    
    public int peek()
    {
        if(this.isEmpty()) throw new RuntimeException("Stack is empty");
        
        return this.stackArr[top];
    }
    
    public void push(int data) throws RuntimeException
    {
        if(this.isFull()) throw new RuntimeException("Stack is full");
        
        this.stackArr[++top] = data;
    }
    
    public int pop() throws RuntimeException
    {
        if(this.isEmpty()) throw new RuntimeException("Stack is empty");
        
        return this.stackArr[top--];
    }
    
    public boolean isFull()
    {
        return top == stackSize - 1;
    }
    
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    
}

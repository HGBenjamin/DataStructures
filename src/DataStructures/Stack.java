package DataStructures;

/**
 * A data structure that follows the Last In First Out principle. 
 *
 * @author Haivan Benjamin
 */
public class Stack 
{
    int[] stackArr;
    int maxSize;
    int top;// Index of where the next element will be pushed, NOT where the next element will be popped from. A decrement by 1 is where the next item should be popped from is.
    
    /**
     * Constructs an empty stack with the given capacity.
     * 
     * @param stackSize the maximum number of elements this stack can hold.
     */
    public Stack(int stackSize)
    {
        if(stackSize < 1) throw new IllegalArgumentException("Stack size cannot be less than 1.");
        this.maxSize = stackSize;
        this.stackArr = new int[stackSize];
        top = 0;
    }
    
    /**
     * Returns the element at the top of this stack without modifying the stack.
     * 
     * @return the top most element.
     * @throws IllegalStateException if the stack is empty
     */
    public int peek()
    {
        if(this.isEmpty()) throw new IllegalStateException("Stack is empty");
        
        return this.stackArr[top - 1];
    }
    
    /**
     * Always adds new element to the top of this stack.
     * 
     * @param data element to be added.
     * @throws IllegalStateException if this stack is full.
     */
    public void push(int data)
    {
        if(this.isFull()) throw new IllegalStateException("Stack is full");
        
        this.stackArr[top++] = data;
    }
    
    /**
     * Removes and returns the top most element in this stack.
     * 
     * @return the element that was most recently pushed.
     * @throws IllegalStateException if this stack is empty.
     */
    public int pop()
    {
        if(this.isEmpty()) throw new IllegalStateException("Stack is empty");
        
        return this.stackArr[--top];
    }
    
    /**
     * Indicates whether this stack has reached its maximum capacity.
     * 
     * @return true if this stack has reached its maximum capacity.
     */
    public boolean isFull()
    {
        return top == maxSize;
    }
    
    /**
     * Indicates whether this stack contains no elements.
     * 
     * @return true if this stack contains no elements.
     */
    public boolean isEmpty()
    {
        return top == 0;
    }
    
    
}

package DataStructures;

/**
 *
 * @author Haivan Benjamin
 */
public class LinkedList
{
     
    /**
    * Node class represents a data structure
    *
    * @author Haivan Benjamin
    */
    public static class Node 
    {
        int data;

        Node next;

        public Node(int aData)
        {
            this.data = aData;
            this.next = null;
        }

        public void display()
        {
            System.out.print("Data: " + data + " ");
        }
    }
    
    Node head;
    
    public LinkedList()
    {
        this.head = null;
    }
    
    public LinkedList(Node aHead)
    {
        this.head = aHead;
    }
    
    public Node findNode(int key)
    {
        if(this.isEmpty())
        {
            throw new RuntimeException("Empty linked list");
        }
        
        Node temp = head;
        
        while(temp != null)
        {
            if(temp.data == key)
            {
                System.out.println("Found");
                return temp;
            }
            
            temp = temp.next;
        }
        
        System.out.println("Not found");
        return null;
    }
    
    public void addFirst(int data)
  {
        if(this.isEmpty())
        {
            head = new Node(data);            
            return;
        }
        
        Node newNode = new Node(data);
        
        newNode.next = head;
        
        head = newNode;
    }
    
    public void addLast(int data)
    {
        if(this.isEmpty())
        {
            this.addFirst(data);
            return;
        }
        
        Node temp = head;
        Node newNode = new Node(data);
        
        while(temp.next != null)
        {
            temp = temp.next;
        }
        
        temp.next = newNode;
    }
    
    public Node deleteNode(int data)
    {
        if(this.isEmpty())
        {
            throw new RuntimeException("Empty linked list");
        }
        
        Node nodeToFind = findNode(data);
        
        if(nodeToFind == null)
        {
            return null;
        }
        
        Node current = head;
        Node previous = null;
        
        while(current.next != null && current.data != data)
        {
            previous = current;
            current = current.next;
        }
        
        
        
        return nodeToFind;
    }
    
    public Node reverse()
    {
        if(this.isEmpty())
        {
            throw new RuntimeException("Empty linked list");
        }
        
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        if(curr.next == null) return curr;
        
        do
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = next;
        }
        while(next != null);
        
        head = prev;
        
        return head;
    }
    
    public Node reverse1()
    {
        if(this.isEmpty()) throw new RuntimeException("Empty linked list");
        
        Node prev = null;
        Node curr = head;
        Node next = curr.next;
        
        while(next != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        
        curr.next = prev;
        
        head = curr;
        
        return head;
    }
    
    public void display()
    {
        Node temp = head;
        
        while(temp != null)
        {
            temp.display();
            temp = temp.next;
        }
    }
    
    public boolean isEmpty()
    {
        return this.head == null;
    }
}

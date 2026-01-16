package DataStructures;

/**
 * A linear data structure composed of nodes.
 * Each node stores an integer value and a reference to the next node in the sequence.
 * The list is accessed starting from a head node and terminates when a node's
 * next reference is null.
 * 
 * @author Haivan Benjamin
 */
public class LinkedList
{
    public static class Node 
    {
        int data;

        Node next;
        
        public Node()
        {
            next = null;
        }

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
    
    /**
     * Finds a node based on the key value provided.
     * 
     * @param key value of node to find
     * @return the node with the given key
     */
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
    
    /**
     * Inserts a node with value data at the beginning of the list.
     * 
     * @param data value of node to insert at begging of the list.
     */
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
    
    /**
     * Inserts a node with value data at the end of the list.
     * 
     * @param data value of node to insert at the end of the list.
     */
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
    
    /**
     * Deletes the <strong>first</strong> node with the value data.
     * 
     * @param data the value of the node to delete.
     * @return the node that will be deleted.
     */
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
    
    /**
     * Reverses the linked list, such that each node references the previous node. 
     * If a node is not preceded it references null.
     * 
     * @return the head of the reversed list.
     */
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
    
    /**
     * Displays each node's value in the linked list.
     */
    public void display()
    {
        Node temp = head;
        
        while(temp != null)
        {
            temp.display();
            temp = temp.next;
        }
    }
    
    /**
     * Checks if the linked list is empty.
     * 
     * @return whether the list is empty.
     */
    public boolean isEmpty()
    {
        return this.head == null;
    }
}

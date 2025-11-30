package DataStructures;

/**
 *
 * @author Haivan Benjamin
 */
public class BinaryTree
{

    /**
     *
     * @author Haivan Benjamin
     */
    public static class Node
    {

        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node()
        {
            leftChild = null;
            rightChild = null;
        }

        public Node(int data)
        {
            this();
            this.data = data;
        }

        public void displaySelf()
        {
            System.out.print(data);
        }

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public Node getLeftChild()
        {
            return leftChild;
        }

        public void setLeftChild(Node leftChild)
        {
            this.leftChild = leftChild;
        }

        public Node getRightChild()
        {
            return rightChild;
        }

        public void setRightChild(Node rightChild)
        {
            this.rightChild = rightChild;
        }

    }

    Node root;

    public BinaryTree()
    {
        root = null;
    }

    public BinaryTree(int data)
    {
        root = new Node(data);
    }

    public void insert(int data)
    {
        root = insert(root, data);
    }

    private Node insert(Node tempNode, int data)
    {
        if(tempNode == null)
        {
            return new Node(data);
        }

        if(data >= tempNode.getData())
        {
            tempNode.setRightChild(insert(tempNode.getRightChild(), data));
        }
        else
        {
            tempNode.setLeftChild(insert(tempNode.getLeftChild(), data));
        }

        return tempNode;
    }

    public void printPreOrder()
    {
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        node.displaySelf();
        System.out.print(" ");
        printPreOrder(node.getLeftChild());
        printPreOrder(node.getRightChild());
    }

    public void printInOrder()
    {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        printInOrder(node.getLeftChild());
        node.displaySelf();
        System.out.print(" ");
        printInOrder(node.getRightChild());
    }

    public void printPostOrder()
    {
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(Node node)
    {
        if(node == null)
        {
            return;
        }

        printPostOrder(node.getLeftChild());
        printPostOrder(node.getRightChild());
        node.displaySelf();
        System.out.print(" ");
    }

    public void delete(int value)
    {
        delete(root, value);
    }

    private Node delete(Node node, int value)
    {
        if(node == null)
        {
            return null;
        }

        if(value > node.getData())
        {
            node.setRightChild(delete(node.getRightChild(), value));
        }
        else if(value < node.getData())
        {
            node.setLeftChild(delete(node.getLeftChild(), value));
        }
        else // Found node
        {
            if(node.getLeftChild() == null)
            {
                return node.getRightChild();
            }
            else if(node.getRightChild() == null)
            {
                return node.getLeftChild();
            }
            else
            {
                Node successor = getInOrderSuccessor(node);
                node.setData(successor.getData());
                node.setRightChild(delete(node.getRightChild(), successor.getData()));
            }
        }

        return node;
    }

    private Node getInOrderSuccessor(Node node)
    {
        node = node.getRightChild();// Get the right subtree

        while(node != null && node.getLeftChild() != null)
        {
            node = node.getLeftChild();
        }

        return node;
    }

    public Node find(int data)
    {
        return find(root, data);
    }

    private Node find(Node tempNode, int target)
    {
        if(tempNode == null)
        {
            return null;
        }
        else if(target > tempNode.getData())
        {
            return find(tempNode.getRightChild(), target);
        }
        else if(target < tempNode.getData())
        {
            return find(tempNode.getLeftChild(), target);
        }
        else
        {
            return tempNode;
        }
    }
}

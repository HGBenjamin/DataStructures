/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DataStructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author haivanbenjamin
 */
public class BinaryTreeTest
{
    
    public BinaryTreeTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        int data = 0;
        BinarySearchTree instance = new BinarySearchTree();
        instance.insert(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPreOrder method, of class BinarySearchTree.
     */
    @Test
    public void testPrintPreOrder()
    {
        System.out.println("printPreOrder");
        BinarySearchTree instance = new BinarySearchTree();
        instance.printPreOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printInOrder method, of class BinarySearchTree.
     */
    @Test
    public void testPrintInOrder()
    {
        System.out.println("printInOrder");
        BinarySearchTree instance = new BinarySearchTree();
        instance.printInOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPostOrder method, of class BinarySearchTree.
     */
    @Test
    public void testPrintPostOrder()
    {
        System.out.println("printPostOrder");
        BinarySearchTree instance = new BinarySearchTree();
        instance.printPostOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BinarySearchTree.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
        int value = 0;
        BinarySearchTree instance = new BinarySearchTree();
        instance.delete(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class BinarySearchTree.
     */
    @Test
    public void testFind()
    {
        System.out.println("find");
        int data = 0;
        BinarySearchTree instance = new BinarySearchTree();
        BinarySearchTree.Node expResult = null;
        BinarySearchTree.Node result = instance.find(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

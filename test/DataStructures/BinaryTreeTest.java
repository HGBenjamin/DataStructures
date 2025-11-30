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
     * Test of insert method, of class BinaryTree.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        int data = 0;
        BinaryTree instance = new BinaryTree();
        instance.insert(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPreOrder method, of class BinaryTree.
     */
    @Test
    public void testPrintPreOrder()
    {
        System.out.println("printPreOrder");
        BinaryTree instance = new BinaryTree();
        instance.printPreOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printInOrder method, of class BinaryTree.
     */
    @Test
    public void testPrintInOrder()
    {
        System.out.println("printInOrder");
        BinaryTree instance = new BinaryTree();
        instance.printInOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPostOrder method, of class BinaryTree.
     */
    @Test
    public void testPrintPostOrder()
    {
        System.out.println("printPostOrder");
        BinaryTree instance = new BinaryTree();
        instance.printPostOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BinaryTree.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
        int value = 0;
        BinaryTree instance = new BinaryTree();
        instance.delete(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class BinaryTree.
     */
    @Test
    public void testFind()
    {
        System.out.println("find");
        int data = 0;
        BinaryTree instance = new BinaryTree();
        BinaryTree.Node expResult = null;
        BinaryTree.Node result = instance.find(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

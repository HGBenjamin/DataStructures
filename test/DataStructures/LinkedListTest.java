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
public class LinkedListTest
{
    
    public LinkedListTest()
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
     * Test of findNode method, of class LinkedList.
     */
    @Test
    public void testFindNode()
    {
        System.out.println("findNode");
        int key = 0;
        LinkedList instance = new LinkedList();
        LinkedList.Node expResult = null;
        LinkedList.Node result = instance.findNode(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFirst method, of class LinkedList.
     */
    @Test
    public void testAddFirst()
    {
        System.out.println("addFirst");
        int data = 0;
        LinkedList instance = new LinkedList();
        instance.addFirst(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLast method, of class LinkedList.
     */
    @Test
    public void testAddLast()
    {
        System.out.println("addLast");
        int data = 0;
        LinkedList instance = new LinkedList();
        instance.addLast(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNode method, of class LinkedList.
     */
    @Test
    public void testDeleteNode()
    {
        System.out.println("deleteNode");
        int data = 0;
        LinkedList instance = new LinkedList();
        LinkedList.Node expResult = null;
        LinkedList.Node result = instance.deleteNode(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverse method, of class LinkedList.
     */
    @Test
    public void testReverse()
    {
        System.out.println("reverse");
        LinkedList instance = new LinkedList();
        LinkedList.Node expResult = null;
        LinkedList.Node result = instance.reverse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverse1 method, of class LinkedList.
     */
    @Test
    public void testReverse1()
    {
        System.out.println("reverse1");
        LinkedList instance = new LinkedList();
        LinkedList.Node expResult = null;
        LinkedList.Node result = instance.reverse1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class LinkedList.
     */
    @Test
    public void testDisplay()
    {
        System.out.println("display");
        LinkedList instance = new LinkedList();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty()
    {
        System.out.println("isEmpty");
        LinkedList instance = new LinkedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

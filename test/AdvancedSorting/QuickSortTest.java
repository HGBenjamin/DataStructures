/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package AdvancedSorting;

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
public class QuickSortTest
{
    
    public QuickSortTest()
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
     * Test of quickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort_intArr()
    {
        System.out.println("quickSort");
        int[] arr = null;
        QuickSort.quickSort(arr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort_3args()
    {
        System.out.println("quickSort");
        int[] arr = null;
        int left = 0;
        int right = 0;
        QuickSort.quickSort(arr, left, right);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of partition method, of class QuickSort.
     */
    @Test
    public void testPartition()
    {
        System.out.println("partition");
        int[] arr = null;
        int pivot = 0;
        int left = 0;
        int right = 0;
        int expResult = 0;
        int result = QuickSort.partition(arr, pivot, left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

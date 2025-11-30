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
public class MergeSortTest
{
    
    public MergeSortTest()
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
     * Test of MergeSort method, of class MergeSort.
     */
    @Test
    public void testMergeSort()
    {
        System.out.println("MergeSort");
        int[] arr = null;
        int[] expResult = null;
        int[] result = MergeSort.MergeSort(arr);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Merge method, of class MergeSort.
     */
    @Test
    public void testMerge()
    {
        System.out.println("Merge");
        int[] lArr = null;
        int[] rArr = null;
        int[] expResult = null;
        int[] result = MergeSort.Merge(lArr, rArr);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

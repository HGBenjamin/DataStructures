package AdvancedSorting;

/**
 * Shell Sort implementation.
 *
 * <p>Shell Sort is an optimization of insertion sort.
 * Instead of maintaining a single sorted and unsorted portion,
 * it creates multiple sorted subarrays by sorting elements that
 * are a fixed gap (h-th) apart.</p>
 * 
 * <p><b>Time Complexity:</b> O(n^(3/2) <strong>Knuth's gap sequence</strong></p>
 * <p><b>Space Complexity:</b> O(n)</p>
 * <p><b>Stable:</b> Yes</p>
 *
 * @author Haivan Benjamin
 */
public class ShellSort 
{
    /**
     * Sorts the given array using the Shell sort algorithm.
     * The gap sequence used is h = h * 3 + 1.
     *
     * @param arr the array to be sorted
     */
    public static void sort(long[] arr)
    {
        int n = arr.length;
        int h = 1;
        
        // Compute the initial gap, h, the elements will have using the Knuth sequence h = h*3 + 1
        while(h <= n/3)
        {
            h = (h * 3) + 1;
        }
        
        int innerBound, outerBound;
        long tempNum;
        
        
        while(h > 0)// Keep sorting every (h)th element until h is less than or equal to 0
        {
            
            // This portion is essentially the modified insertion sort; insertion sorting elements h apart from each other
            for(outerBound = h; outerBound < n; outerBound++)
            {
                tempNum = arr[outerBound];
                innerBound = outerBound;
                
                // Comparing and possibly shifting every (h)th value until correct position is found
                while(innerBound > h - 1 && arr[innerBound - h] >= tempNum)
                {
                    arr[innerBound] = arr[innerBound - h];
                    
                    innerBound -= h;
                }
                
                arr[innerBound] = tempNum;
            }
            
            // Reduce gap for next iteration
            h = (h - 1)/3;            
        }
        
        // Array is sorted in non decreasing order
    }
}

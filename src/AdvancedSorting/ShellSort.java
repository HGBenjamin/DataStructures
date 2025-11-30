package AdvancedSorting;

/**
 *
 * @author Haivan Benjamin
 */
public class ShellSort 
{
    /**
     * Sorts the given array using the Shell sort algorithm.
     * <p>
     * Shell sort is a generalization of insertion sort that allows the exchange of elements far apart from each other. 
     * The algorithm starts by sorting elements that are a certain gap distance apart (denoted as <code>h</code>), 
     * and progressively reduces this gap until it becomes 1, at which point the array is fully sorted.
     * </p>
     *
     * @param arr the array to be sorted
     */
    public static void shellSort(long[] arr)
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

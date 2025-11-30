package SimpleSorting;

/**
 * Bubble Sort implementation.
 *
 * <p>Bubble Sort repeatedly steps through the list, compares adjacent
 * elements, and swaps them if they are in the wrong order. This process
 * repeats until no swaps are needed, which means the list is sorted.</p>
 *
 * <p><b>Time Complexity:</b> O(n²)</p>
 * <p><b>Space Complexity:</b> O(1) — in-place</p>
 * <p><b>Stable:</b> Yes</p>
 * 
 * <p>Non optimized version - no early termination</p>
 * 
 * @author Haivan Benjamin
 */
public class BubbleSort 
{
    /**
     * Sorts the given array using bubble sort.
     * 
     * @param unsArr the array to be sorted.
     */
    public static void sort(int[] unsArr)
    {
        // Perform multiple passes through the array
        for(int i = 0; i < unsArr.length; i++)
        {
            // Compare adjacent pairs
            for(int j = 0; j < unsArr.length - 1; j++)
            {
                // Swap adjacent elements if they are in the wrong order
                if(unsArr[j] > unsArr[j + 1])
                {
                    int temp = unsArr[j + 1];
                    
                    unsArr[j + 1] = unsArr[j];
                    
                    unsArr[j] = temp;
                }
            }
        }
    }
}

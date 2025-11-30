package SimpleSorting;

/**
 * Insertion Sort implementation.
 *
 * <p>Insertion Sort works by dividing the array into a sorted and an unsorted part.
 * It iteratively takes the first element from the unsorted part and inserts it 
 * into the correct position in the sorted part by shifting larger elements one
 * position to the right.</p>
 *
 * 
 *<p><b>Time Complexity:</b> O(n²)</p>
 * <p><b>Space Complexity:</b> O(1)</p>
 * <p><b>Stable:</b> No</p>
 *
 * @author Haivan Benjamin
 */
public class InsertionSort
{
    /**
     * Sorts the given array using insertion sort.
     * 
     * @param unsArr the array to be sorted
     */
    public static void sort(int[] unsArr)
    {
        // Expand sorted portion of array one element at a time
        for(int i = 1; i < unsArr.length; i++)
        {
            int temp = unsArr[i];
            int newIndex = i;
            
            // Shift elements in unsorted region to insert selected element
            for(int j = i; j > 0; j--)
            {
                int prev = unsArr[j - 1];
                
                if(prev >= temp)
                {
                    unsArr[j] = prev;
                    newIndex--;
                }
                
                if(prev < temp) break;
            }
            
            unsArr[newIndex] = temp;
        }
    }
}

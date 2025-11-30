package SimpleSorting;

/**
 * Selection Sort implementation.
 *
 * <p>Selection Sort works by repeatedly selecting the smallest element
 * from the unsorted portion of the list and moving it to the front.
 * This continues until the entire list is sorted.</p>
 *
 * <p><b>Time Complexity:</b> O(n²)</p>
 * <p><b>Space Complexity:</b> O(1)</p>
 * <p><b>Stable:</b> No</p>
 * 
 * @author Haivan Benjamin
 */
public class SelectionSort 
{
    
    /**
     * Sorts the given array using selection sort.
     * 
     * @param unsArr the array to be sorted
     */
    public static void sort(int[] unsArr)
    {
        // For each index select the smallest value in the unsorted region of the array and put it in the proper position
        for(int i = 0; i < unsArr.length - 1; i++)
        {
            int temp = unsArr[i];
            int min = unsArr[i];
            int indexOfMin = i;
            
            // Find smallest element in unsorted section
            for(int j = i + 1; j < unsArr.length; j++)
            {
                if(unsArr[j] < min)
                {
                    min = unsArr[j];
                    indexOfMin = j;
                }
            }
            
            // Insert the current smallest element into correct position
            unsArr[i] = min;
            unsArr[indexOfMin] = temp;
        }
    }
}

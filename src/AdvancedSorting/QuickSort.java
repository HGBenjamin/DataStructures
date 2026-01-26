package AdvancedSorting;

/**
 * Quick Sort implementation.
 * 
 * <p>Quick Sort is a divide-and-conquer sorting algorithm that works by
 * selecting a pivot element and partitioning the array so that elements
 * less than the pivot come before it and elements greater than the pivot
 * come after it. The algorithm then recursively sorts the two partitions.</p>
 * 
 * <p><b>Time Complexity:</b> Average case: O(n*log(n)), worst case: is O(n^2)</p>
 * <p><b>Space Complexity:</b> Average case: O(log(n)), worst case: O(n)</p>
 * <p><b>Stable:</b> Yes</p>
 * 
 * @author Haivan Benjamin
 */
public class QuickSort 
{
    /**
     * Sorts the given array using Quick Sort.
     * 
     * @param arr the array to be sorted.
     */
    public static void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    
    private static void quickSort(int[] arr, int left, int right)
    {
        if(right - left <= 0) return;
        
        int partition = partition(arr, arr[right], left, right);
        
        quickSort(arr, 0, partition - 1);
        quickSort(arr, partition + 1, right);
    }
    
    @SuppressWarnings("empty-statement")
    private static int partition(int[] arr, int pivot, int left, int right)
    {        
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        
        while(true)
        {
            while(leftPtr < right && arr[++leftPtr] < pivot);
            
            while(rightPtr > leftPtr && arr[--rightPtr] > pivot);
            
            if(leftPtr >= rightPtr) 
            {
                break;
            }
            
            int temp = arr[leftPtr];
            
            arr[leftPtr] = arr[rightPtr];
            arr[rightPtr] = temp;            
        }
        
        return leftPtr;
    }
    
}

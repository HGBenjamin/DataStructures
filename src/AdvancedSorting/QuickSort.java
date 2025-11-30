package AdvancedSorting;

/**
 *
 * @author Haivan Benjamin
 */
public class QuickSort 
{
    public static void quickSort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
    
    public static void quickSort(int[] arr, int left, int right)
    {
        if(right - left <= 0) return;
        
        int partition = partition(arr, arr[right], left, right);
        
        quickSort(arr, 0, partition - 1);
        quickSort(arr, partition + 1, right);
        
        
    }
    
    @SuppressWarnings("empty-statement")
    public static int partition(int[] arr, int pivot, int left, int right)
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

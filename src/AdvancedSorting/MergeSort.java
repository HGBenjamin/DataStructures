package AdvancedSorting;

/**
 * Merge Sort implementation.
 * 
 * <p> merge Sort is a divide and conquer algorithm.
 It divides the input array in half until it reaches single element sub arrays.
 Then it merges them in sorted order.</p>
 * 
 * <p><b>Time Complexity:</b> O(n * log(n))</p>
 * <p><b>Space Complexity:</b> O(n)</p>
 * <p><b>Stable:</b> Yes</p>
 * 
 * @author Haivan Benjamin
 */
public class MergeSort 
{
    
    /**
     * Sorts the given array using Merge Sort
     * 
     * @param arr array to be sorted.
     * @return a sorted array.
     */
    public static void sort(int[] arr)
    {
        mergeSort(arr, 0, arr.length - 1);
    }
    
    /**
     * Recursive function that's actually responsible for sorting using Merge Sort algorithm.
     * 
     * @param arr the array to be sorted.
     * @param leftBound the lower bound of the sub array.
     * @param rightBound the upper bound of the sub array. 
     */
    private static void mergeSort(int[] arr, int leftBound, int rightBound)
    {
        if(leftBound == rightBound) return;
        
        int mid = leftBound + (rightBound - leftBound) / 2;
        
        // Divide
        mergeSort(arr, leftBound, mid);
        mergeSort(arr, mid + 1, rightBound);
        
        // Conquer
        merge(arr, leftBound, mid, rightBound);
    }
    
    private static void merge(int[] arr, int leftBound, int mid, int rightBound)
    {
        int lSize = (mid - leftBound) + 1;
        int rSize = rightBound - mid;
        
        int[] lArr = new int[lSize];
        int[] rArr = new int[rSize];
        
        // Create temporary elements
        for(int i = 0; i < lSize; i++) lArr[i] = arr[leftBound + i];
        for(int i = 0; i < rSize; i++) rArr[i] = arr[mid + 1 + i];
        
        int i = 0, j = 0, k = leftBound;
        
        // Mege the temporary elements into the original array
        while(i < lSize && j < rSize)
        {
            if(lArr[i] <= rArr[j])
            {
                arr[k] = lArr[i];
                
                i++;
            }
            else
            {
                arr[k] = rArr[j];
                
                j++;
            }
            
            k++;
        }
        
        // Copy remaining elements in left array.
        while(i < lSize)
        {
            arr[k] = lArr[i];
                
            i++;
            k++;
        }
        
        // Copy remaining elements in right array.
        while(j < rSize)
        {
            arr[k] = rArr[j];
                
            j++;
            k++;
        }
    }
}
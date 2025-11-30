package AdvancedSorting;

/**
 *
 * @author Haivan Benjamin
 */
public class MergeSort 
{
    public static int[] MergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        
        int n = arr.length;
        int lLen = n/2;
        int rLen = n - lLen;
        
        int[] lArr = new int[lLen];
        int[] rArr = new int[rLen];
        
        for(int i = 0; i < lLen; i++)
        {
            lArr[i] = arr[i];
        }
        
        for(int i = lLen; i < n; i++)
        {
            int curInd = i - lLen;
            
            rArr[curInd] = arr[i];
        }
        
        lArr = MergeSort(lArr);
        lArr = MergeSort(rArr);
        
        return Merge(lArr, rArr);
    }
    
    public static int[] Merge(int[] lArr, int[] rArr)
    {
        int[] combine = new int[lArr.length + rArr.length];
        
        if(lArr == null)
        {
            return rArr;
        }
        
        if(rArr == null)
        {
            return lArr;
        }
        
        int i = 0, j = 0, k = 0;
        
        while(i < lArr.length && j < rArr.length)
        {
            if(lArr[i] <= rArr[j])
            {
                combine[k++] = lArr[i++];
            }
            else
            {
                combine[k++] = rArr[j++];
            }
        }
        
        while(i < lArr.length)
        {
            combine[k++] = lArr[i++];
        }
        
        while(j < rArr.length)
        {
            combine[k++] = rArr[j++];
        }
        
        return combine;
    }
}

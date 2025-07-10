package SimpleSorting;

/**
 *
 * @author Haivan Benjamin
 */
public class SelectionSort 
{
    public static int[] SelectionSort(int[] unsArr)
    {
        for(int i = 0; i < unsArr.length; i++)
        {
            int curNum = unsArr[i];
            
            int min = unsArr[i];
            int minIndex = i;
            
            // Finding the minimum
            for(int j = i; j < unsArr.length; j++)
            {
                if(unsArr[j] < min)
                {
                    min = unsArr[j];
                    minIndex = j;
                }
            }
            
            unsArr[i] = min;
            unsArr[minIndex] = curNum;
        }
        
        return unsArr;
    }
}

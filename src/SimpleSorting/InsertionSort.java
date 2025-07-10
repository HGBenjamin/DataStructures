package SimpleSorting;

/**
 *
 * @author Haivan Benjamin
 */
public class InsertionSort
{
    public static int[] InsertionSort(int[] unsArr)
    {
        int size = unsArr.length;
        
        for(int i = 1; i < size; i++)
        {
            int temp = unsArr[i];
            int newIndex = i;
            
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
        
        return unsArr;
    }
}

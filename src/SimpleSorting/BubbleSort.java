package SimpleSorting;

/**
 *
 * @author Haivan Benjamin
 */
public class BubbleSort 
{
    public static int[] BubbleSort(int[] unsArr)
    {
        for(int i = unsArr.length; i > 1; i--)
        {
            for(int j = 0; j < unsArr.length - 1; j++)
            {
                if(unsArr[j] > unsArr[j + 1])
                {
                    int temp = unsArr[j + 1];
                    
                    unsArr[j + 1] = unsArr[j];
                    
                    unsArr[j] = temp;
                }
            }
        }
        
        return unsArr;
    }
}

package SimpleSorting;

import java.util.Random;

/**
 *
 * @author Haivan Benjamin
 */
public class main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] unsArr = new int[20];

        Random rand = new Random();

        for(int i = 0; i < 20; i++)
        {
            unsArr[i] = rand.nextInt(-100, 101);
        }

        for(int nums : unsArr)
        {
            System.out.print(nums + " ");
        }

        System.out.println();

        //Place sorting algorithm here
        //BubbleSort.BubbleSort(unsArr);
        //SelectionSort.SelectionSort(unsArr);
        //InsertionSort.InsertionSort(unsArr);

        for(int nums : unsArr)
        {
            System.out.print(nums + " ");
        }
    }

}

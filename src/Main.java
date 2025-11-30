
import java.util.Random;
import AdvancedSorting.*;
import SimpleSorting.*;
import DataStructures.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.Instant;
import java.util.Arrays;

/**
 *
 * @author Haivan Benjamin
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] unsArr = {5, 2, 6, 20, 100, 53, 63, 894, 2351, 483, 483, 483, 483, 4, 3, 29, 96, 394, 34, 55, 77, 44, 88, 28, 39};
        
        for(int num : unsArr)
        {
            System.out.print(num + " ");
        }
        
        System.out.println();
        SelectionSort.sort(unsArr);
        
        for(int num : unsArr)
        {
            System.out.print(num + " ");
        }
    }
}

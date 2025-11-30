package Exercises;

/**
 *
 * @author Haivan Benjamin
 */
public class TowersOfHanoi 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        toi(3);
    }
    
    public static void toi(int n)
    {
        toi(n, "A", "B", "C");
    }
    
    private static void toi(int n, String source, String intermediate, String destination)
    {
        if(n == 1)
        {
            System.out.println("1: " + source + "->" + destination);
            return;
        }
        
        //Move n-1 pieces off of piece n to intermediate
        toi(n-1, source, destination, intermediate);
        
        //Move piece n to destination
        System.out.println(n + ": " + source + "->" + destination);
        
        //Move n-1 pieces back on to n
        toi(n-1, intermediate, source, destination);
    }

}

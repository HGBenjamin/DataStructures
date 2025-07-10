package MyDataStructures;

import java.util.Random;

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
        Stack s = new Stack(5);
        
        for(int i = 0; i < 5; i++)
        {
            int newNum = new Random().nextInt(-5, 6);
            System.out.println(newNum);
            s.push(newNum);
        }
        
        System.out.println("-----");
        
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}

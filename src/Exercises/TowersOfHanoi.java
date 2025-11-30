package Exercises;

import java.util.Scanner;

/**
 * Towers of Hanoi Implementation.
 * 
 * <p>The Towers of Hanoi is a classic puzzle. 
 * It involves three pegs and a stack of disks of different sizes. 
 * Note the disks don't have to just be disks, they can really be anything.
 * All the disks start on one peg, arranged from largest at the bottom 
 * to smallest at the top. The goal is to move the entire stack to another peg, 
 * following just two rules: only one disk can be moved at a time, 
 * and a larger disk can never be placed on top of a smaller one.</p>
 * 
 * <p><b>Time Complexity:</b> O(2^n)</p>
 *
 * @author Haivan Benjamin
 */
public class TowersOfHanoi 
{
    /**
     * Entry point for running Towers of Hanoi.
     * 
     * Prompts user for the number of disks then prints the sequence of moves.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n = 0;
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Number of \"disks\": ");
        
        while(true)
        {
            try
            {
                n = scnr.nextInt();
        
                break;
            }
            catch(Exception e)
            {
                System.out.println("Insert an integer please");
            }
        }
        
        System.out.println();
        System.out.println("\"disks\" are numbered from 1 (the smallest) to " + n + "(the largest).");
        System.out.println("Perform these moves to get " + n + " \"disks\" from A to C.");
        System.out.println();
        
        solve(n);
    }
    
    /**
     * Solves the Towers of Hanoi puzzle for {@code n} disks.
     * 
     * @param n number of disks to move.
     */
    public static void solve(int n)
    {
        solve(n, "A", "B", "C");
    }
    
    /**
     * Recursively moves {@code n} disks from the source peg to the destination peg.
     * 
     * <p>The algorithm works by:
     *  <ol>
     *      <li>Moving the top {@code n - 1} disks to the intermediate peg</li>
     *      <li>Moving the largest disk to the destination peg</li>
     *      <li>Moving the {@code n - 1} disks from the intermediate peg onto the largest disk</li>
     *  </ol>
     * </p>
     * 
     * @param n number of disks to move.
     * @param source starting location for disks.
     * @param intermediate temporary location disks are placed between moves.
     * @param destination location where disks will end up.
     */
    private static void solve(int n, String source, String intermediate, String destination)
    {
        // Base case: Only 1 disk - move it to destination.
        if(n == 1)
        {
            System.out.println("1: " + source + "->" + destination);
            return;
        }
        
        // Recursively move n-1 disks off of n to intermediate location
        solve(n-1, source, destination, intermediate);
        
        // Move disk n to its destination
        System.out.println(n + ": " + source + "->" + destination);
        
        // Move n-1 disks from intermediate back onto n
        solve(n-1, intermediate, source, destination);
    }

}

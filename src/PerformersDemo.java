/**
 * @author Marissa Gonçalves
 * Due Date: November 21, 2018
 * Runs and tests the Performers class, displaying the top ten scores from the game.
 */

public class PerformersDemo 
{

    /**
     * Runs and tests the Performers class.
     * @param args The classic name given for a String array of a main class.
     */ 
    public static void main(String[] args) 
    {

        
        //Create a new Performers binary tree
        Performers tree = new Performers();

        
        //Insert many values in the tree to test the insert(String name, int score) method
        tree.insert("Fry", 89);
        tree.insert("Bender", 25);
        tree.insert("Leela", 90);
        tree.insert("Zoidburg", 23);
        tree.insert("Amy", 34);
        tree.insert("Hermes", 96);
        tree.insert("Zapp", 123);
        tree.insert("Nibbler", 56);
        tree.insert("Calculon", 12);
        tree.insert("Hypnotoad", 189);
        tree.insert("Lrrr", 5);
        tree.insert("Scruffy", 28);

    
        //Print out all the title for all valid records from the Performers binary tree
        System.out.println("Top 10 Scores: ");
        
        
        //Skip a line in the program
        System.out.println();
        
       
        //Print the Performers binary tree by using in-order traversal
        tree.inOrder();
    
  
    
     }

    
}

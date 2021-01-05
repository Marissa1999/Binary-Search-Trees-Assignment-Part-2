/**
 * @author Marissa Gonçalves
 * Due Date: November 21, 2018
 * Displays the top ten performers in ascending order, by using a Binary Search Tree.
 * @param <E> The parameter of the TreeNode class which can define any type of value.
 */

public class Performers <E extends Comparable<Performers>>
{
    
    
    /**
     * The name of the specified performer.
     */
    private String name;
    
    
    
    /**
     * The score of the specified performer.
     */
    private int score;
    
    
    
    /**
     * The total number of elements in the Performers tree.
     */
    private int size;
    
    
    
    
    /**
     * The first node of the Performers tree.
     */
    private TreeNode<Performers> scoreRoot;
    
    
    
    
    /**
     * Creates an empty Performers tree.
     */
    public Performers() 
    {
       this.scoreRoot = null;
       this.size = 0;
    }
    
    
      
    
    /**
     * Sets the name and score to the implemented values in the parameter.
     * @param name The implemented name for the Performers record.
     * @param score The implemented score for the Performers record.
     */
    public Performers(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
  
    
    
    
    /**
     * Returns the name of the Performers record.
     * @return The name element of the Performers record.
     */
    public String getName()
    {
        return this.name;
    }
    
    
    
    
    /**
     * Returns the score of the Performers record.
     * @return The score element of the Performers record.
     */
    public int getScore()
    {
        return this.score;
    }
    

    
    
    /**
     * Returns the Performers record information from the Performers tree.
     * @return The String value of the necessary record information.
     */
    @Override
    public String toString() 
    {  
        return "Name: " + getName() + "\n" + "Score: " + getScore() + "\n";            
    }
    
     
     
    
     
    /**
     * Compares two Performers scores and orders by ascending order.
     * @param object The second Performers value to be compared with the other.
     * @return The integer value regarding the placement of scores in the tree.
     */
    public int compareTo(Performers object) 
    {
        return this.getScore() - object.getScore();
    }
    
    
    
    
    
    /**
     * Calls the recursive method to print the Performers tree nodes in in-order traversal.
     */
    public void inOrder() 
    {  
        inOrder(this.scoreRoot);       
    }
    
    
   
    
    
    /**
     * Prints the Performers tree nodes in in-order traversal.
     * @param node The element being traversed one at a time in the tree.
     */
    public void inOrder(TreeNode<Performers> node)
    {
        
        if (node == null)
        {
            return;
        }
        
        inOrder(node.left);
        System.out.println(node.element + " ");
        inOrder(node.right);
       
    }
    
    
    
    
     
    /**
     * Returns true if the element is added successfully.
     * @param e The value of the chosen Performers element to be inserted.
     * @return The boolean value indicating whether the element can be added to the Performers tree.
     */
    public boolean insert(Performers e) 
    {
       
        TreeNode<Performers> current = this.scoreRoot;
        TreeNode<Performers> parent = current;
        
        
        if(this.scoreRoot == null)
        {
            this.scoreRoot = new TreeNode(e);
        }
        
 
     else
     {
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                 parent = current;
                 current = current.right;
            }
                    
            else
            {
                return false;
            }
            
        }
        

        
        if(e.compareTo(parent.element) < 0)
        {
            parent.left = new TreeNode(e);
        }
        
        else
        {
            parent.right = new TreeNode(e);
        }
        
     } 
        
        this.size++;
        return true;

        
    }

    
    
    
    
    /**
     * Returns true if the element is removed from the Performers tree successfully.
     * @param e The value of the chosen Performers element to deleted.
     * @return The boolean value indicating whether the element can be deleted from the Performers tree.
     */
    public boolean delete(Performers e)
    {   
       
        TreeNode<Performers> current = this.scoreRoot;
        TreeNode<Performers> parent = current;
        
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            
            else if (e.compareTo(current.element) > 0)
            {
                parent = current;
                current = current.right;
            }
            
            else
            {
                break;
            }
           
        }  
            
        
          if(current == null)
          {        
              return false;          
          }
          
          
          
          if(current.left == null)
          {
              
              if(parent == null)
              {
                  this.scoreRoot = current.right;
              }
              
              else
              {
                  if(e.compareTo(parent.element) < 0)
                  {             
                      parent.left = current.right;   
                  }
                  
                  else
                  {
                      parent.right = current.right;
                  }
              }
              
          }
          
          
          else
          {
              
              TreeNode<Performers> parentOfRightMost = current;
              TreeNode<Performers> rightMost = current.left;
              
              
              
              while(rightMost.right != null)
              {  
                  parentOfRightMost = rightMost;
                  rightMost = rightMost.right;
              }
              
              
              current.element = rightMost.element;
              
              
              if(parentOfRightMost.right == rightMost)
              {
                  parentOfRightMost.right = rightMost.left;
              }
              
              else
              {
                  parentOfRightMost.left = rightMost.left;
              }
              
              
          }
           
          
        this.size--;
        return true;  
        
        
    }
    
   
    
    
    
    
    /**
     * Deletes the first record from the Performers tree.
     * @return The boolean value determining whether the first element was deleted successfully.
     */
    public boolean deleteFirst() 
    {
        
        TreeNode<Performers> current = this.scoreRoot;
        
        if(current == null)
        {
            return false;
        }
        
        while(current.left != null)
        {  
            current = current.left;   
        }
                 
        
        delete(current.element);
        return true;

    }
    
    
    
    
    
    
    /**
     * Adds a name and score pair to the Performers tree.
     * @param name The declaring name of the Performers record to be added.
     * @param score The declaring score of the Performers record to be added.
     */
    public void insert(String name, int score) 
    {
        
        insert(new Performers(name, score));
                 
        if(getSize() > 10)
        {
            deleteFirst();
        }

         
     }


    
    
    /**
     * Returns the number of elements in the Performers tree.
     * @return The total integer amount of elements in the tree.
     */
    public int getSize() 
    {
        return this.size;
    }
    

}

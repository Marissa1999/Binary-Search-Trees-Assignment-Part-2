/**
 * @author Marissa Gonçalves
 * Due Date: November 21, 2018
 * Initializes the left and right variables and sets the TreeNode element for the Performers Binary Search Tree.
 * @param <Performers> The parameter of the TreeNode class which can define the performers statistics.
 */

public class TreeNode<Performers> 
{
     
    
    /**
     * The performer value which a non-null node contains.
     */
    Performers element;
    
    /**
     * The first link that references the left child.
     */
    TreeNode<Performers> left;
    
    
    /**
     * The other link that references the right child.
     */
    TreeNode<Performers> right;
    
    
    
    /**
     * Sets the instance performer element value to the one specified in the parameter.
     * @param o The mentioned value in order to set the performer element value.
     */
    public TreeNode(Performers o)
    {
        this.element = o;
    }
    
    
 
}

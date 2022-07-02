/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11;

/**
 *
 * @author Jia Ming Ooi
 */
public class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;
    
    public TreeNode(){
        
    }
    
    public TreeNode (E o){
        element = o;
    }
}

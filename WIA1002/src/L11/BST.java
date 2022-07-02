/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11;

/**
 *
 * @author Jia Ming Ooi
 */
public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root;
    protected int size;

    public BST() {
        root = new TreeNode<>();
        size = 0;
    }
    
    public BST(E[] arr){
        for(E e: arr)
            insert(e);
    }
    
    public boolean search(E e){
        TreeNode<E> current = root; //start from the root
        while(current != null){
            if(e.compareTo(current.element)<0)
                current = current.left; //go left
            else if(e.compareTo(current.element)>0)
                current = current.right; //go right
            else //element matches current.element
                return true; //element is found
        }
        return false; //element is not in the tree
    }
    
    public boolean insert (E e){
        if(root == null)
            root = new TreeNode<>(e);
        else{
            //locate parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null){
                if(e.compareTo(current.element)<0){
                    parent = current;
                    current = current.left;
                }
                else if(e.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }
                else
                    return false;
            }
            if(e.compareTo(parent.element)<0)
                parent.left = new TreeNode<>(e);
            else
                parent.right = new TreeNode<>(e);
        }
        size++;
        return true;
    }
    
    public int getSize(){
        return size;
    }
    
    public int height(){
        if(root==null)
            return 0;
        else{
            TreeNode<E> node = root;
            //compute the depth of each subtree
            int lDepth = height(node.left);
            int rDepth = height(node.right);
            
            if(lDepth > rDepth)
                return lDepth;
            else
                return rDepth;
        }
    }
    
    private int height(TreeNode<E> node){
        if(node==null)
            return 0;
        else{
            //compute the depth of each subtree
            int lDepth = height(node.left);
            int rDepth = height(node.right);
            
            if(lDepth > rDepth)
                return lDepth+1;
            else
                return rDepth+1;
        }
    }
    
    public E getRoot(){
        return root.element;
    }
    
    public E minValue(){
        if(root==null)
            return null;
        else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null){
                parent = current;
                current = current.left;
            }
            return parent.element;
        }
    }
    
    public E maxValue(){
        if(root==null)
            return null;
        else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while(current != null){
                parent = current;
                current = current.right;
            }
            return parent.element;
        }
    }
    
    public java.util.ArrayList<TreeNode<E>> path(E e){
        if(root==null)
            return null;
        if(!search(e))
            return null;
        java.util.ArrayList<TreeNode<E>> path = new java.util.ArrayList<>();
        TreeNode<E> current = root;
        while(current != null){
            path.add(current);
            if(e.compareTo(current.element)<0)
                current = current.left;
            else if(e.compareTo(current.element)>0)
                current = current.right;
            else
                break;
        }
        return path;
    }
    
    public boolean delete(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        
        while(current != null){
            if(e.compareTo(current.element)<0){
                parent = current;
                current = current.left;
            }
            else if(e.compareTo(current.element)>0){
                parent = current;
                current = current.right;
            }
            else
                break;
        }
        
        if(current == null)
            return false;
        //Case 1: current has no left child
        if(current.left==null){
            if(parent == null)
                root = current.right;
            else{
                if(e.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        }
        //Case 2: current node has left child
        else{
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while(rightMost.right != null){
                parentOfRightMost =rightMost;
                rightMost = rightMost.right;
            }
            current.element = rightMost.element;
            //Eliminate rightMost node
            if(parentOfRightMost.right == rightMost)
                parentOfRightMost.right = rightMost.left;
            else //Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
        }
        size--;
        return true;
    }
    
    public boolean clear(){
        root = null;
        size = 0;
        return true;
    }
    
    protected void inorder(TreeNode<E> root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }
    
    protected void postorder(TreeNode<E> root){
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }
    
    protected void preorder(TreeNode<E> root){
        if(root==null)
            return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

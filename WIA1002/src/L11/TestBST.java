/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jia Ming Ooi
 */
public class TestBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        String data = Arrays.toString(arr).replace("[", "").replace("]", "");
        System.out.println("Input Data: " + data);
        
        BST<Integer> tree = new BST(arr);
        
        System.out.print("Inorder (sorted): ");
        tree.inorder(tree.root);
        System.out.println();
        
        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();
        
        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();
        
        System.out.println("Height of BST: " + tree.height());
        
        System.out.println("Root fot BST is: " + tree.getRoot());
        
        System.out.println("Check whether 10 is in the tree? " + tree.search(10));
        
        System.out.println("Delete 53" + tree.delete(53));
        
        System.out.print("Updated Inorder data (sorted): ");
        tree.inorder(tree.root);
        System.out.println();
        
        System.out.println("Min value: " + tree.minValue());
        
        System.out.println("Max value: " + tree.maxValue());
        
        System.out.print("A path from the root to 6 is: ");
        ArrayList path = tree.path(6);
        for(Object e: path){
            TreeNode<Integer> node = (TreeNode<Integer>)e;
            System.out.print(node.element + " ");
        }
    }
}

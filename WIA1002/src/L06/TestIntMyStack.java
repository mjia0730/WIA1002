/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06;

import java.util.Scanner;

/**
 *
 * @author Jia Ming Ooi
 */
public class TestIntMyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("a) Prompt user to enter an integer value.");
        int value = sc.nextInt();
        
        System.out.println("b) Push the values 1 through the user entered value onto the stack.");
        MyStack<Integer> stack = new MyStack<>();
        
        for(int i=1; i<=value; i++){
            stack.push(i);
        }
        
        System.out.println("c) Print the size of the stack.");
        System.out.println(stack.getSize());
        
        System.out.println("d) Display the contents of the stack by repeatedly calling pop() until the stack is empty.");
        
        while(stack.isEmpty() == false){
            System.out.println(stack.pop());
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06;


/**
 *
 * @author Jia Ming Ooi
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> stack1 = new MyStack<>();
        
        System.out.println("1) Following the given order, add elements, a b and c in the stack.");
        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        
        System.out.println("2) Print the stack");
        System.out.println(stack1.toString());
        
        System.out.println("3) Check if element ‘b’ is in the stack.");
        System.out.println(stack1.search('b'));
        
        System.out.println("4) Check if element ‘k’ is in the stack.");
        System.out.println(stack1.search('k'));
        
        MyStack<Integer> stack2 = new MyStack<>();
        
        System.out.println("1) Following the given order, add elements, 1 2 and 3 in the stack.");
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        
        System.out.println("2) Print the stack");
        System.out.println(stack2.toString());
        
        System.out.println("3) Check if element ‘6’ is in the stack.");
        System.out.println(stack2.search(6));
    }
}

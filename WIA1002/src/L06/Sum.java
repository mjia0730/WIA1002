/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06;

/**
 *
 * @author Jia Ming Ooi
 */
public class Sum {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        
        for(int i=0; i<=10; i++){
            stack.push(i);
        }
        
        int sum=0;
        
        for(int i=0; i<stack.getSize(); i++){
            sum += stack.pop();
        }
        
        System.out.println("Sum: " + sum);
    }
}

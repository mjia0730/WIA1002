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
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Character> stack1 = new MyStack<>();
        MyStack<Character> stack2 = new MyStack<>();
        
        String str = sc.next();
        
        for(int i=0; i<str.length(); i++){
            stack1.push(str.charAt(i));
        }
        
        for(int i=0; i<str.length()/2; i++){
            stack2.push(stack1.pop());
        }
        
        if(str.length()%2 != 0)
            stack1.pop();
        
        if(stack1.toString().equals(stack2.toString()))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
    }
}

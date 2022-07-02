/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07;

import java.util.Scanner;

/**
 *
 * @author Jia Ming Ooi
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        MyQueue<Character> list1 = new MyQueue<>();
        for(int i=0; i<str.length()/2; i++){
            list1.enqueue(str.charAt(i));
        }
        
        MyQueue<Character> list2 = new MyQueue<>();
        for(int i=str.length()/2; i<str.length(); i++){
            list2.enqueue(str.charAt(i));
        }
        
        if(str.length()%2!=0)
            list2.dequeue();
        
        String firstHalf="", secondHalf="";
        
        for(int i=0; i<list1.getSize(); i++){
            firstHalf += list1.getElement(i);
        }
        
        for(int i=list2.getSize()-1; i>=0; i--){
            secondHalf += list2.getElement(i);
        }
        
        if(firstHalf.equals(secondHalf))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is not a Palindrome");
    }
}

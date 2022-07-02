/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jia Ming Ooi
 */
public class MyQueue<E> {
    private java.util.LinkedList<E> list;
    
    public MyQueue(E[] e){
        list = new LinkedList<>(Arrays.asList(e));
    }
    
    public MyQueue(){
        list = new LinkedList<>();
    }
    
    public void enqueue(E e){
        list.add(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ");
        MyQueue<String> fruitQ = new MyQueue(new Object[]{"Durian", "Blueberry"});
        
        System.out.println("b. Then add new items in the following order: Apple, Orange, Grapes, Cherry. ");
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        
        System.out.println("c. Display the queue.");
        System.out.println(fruitQ.toString());
        
        System.out.println("d. Show the top item");
        System.out.println(fruitQ.peek());
        
        System.out.println("e. Get the queue size.");
        System.out.println(fruitQ.getSize());
        
        System.out.println("f. Delete Durian.");
        System.out.println(fruitQ.dequeue());
        
        System.out.println("g. Get item in index position of 2");
        System.out.println(fruitQ.getElement(2));
        
        System.out.println("h. Check whether the queue consists of Cherry");
        System.out.println(fruitQ.contains("Cherry"));
        
        System.out.println("i. Check whether the queue consists of Durian");
        System.out.println(fruitQ.contains("Durian"));
        
        System.out.println("j. Display the queue using the isEmpty() condition.");
        while(fruitQ.isEmpty() != true){
            System.out.println(fruitQ.dequeue());
        }
    }
}

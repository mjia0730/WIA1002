/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06;

/**
 *
 * @author Jia Ming Ooi
 */
public class MyStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();
    
    public void push(E o){
        list.add(o);
    }
    
    public E pop(){
        E object = list.get(list.size()-1);
        list.remove(list.size()-1);
        return object;
    }
    
    public E peek(){
        return list.get(list.size()-1);
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    } 
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public boolean search(E o){
        return list.contains(o);
    }
}

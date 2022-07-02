/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 * @param <E>
 */
public class SList<E> {
    int size = 0;
    SNode<E> head;
    SNode<E> tail;
    
    public void appendEnd(E e){
        
        if(tail == null)
            head = tail = new SNode<>(e);
        else{
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public E removeInitial(){
        if(head==null)
            return null;
        else{
            SNode<E> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        
        for(int i = 0; i<size; i++){
            if(current.element == e)
                return true;
            current = current.next;
        }
        
        return false;
    }
    
    public void clear(){
        SNode<E> temp = head;
        while(head!=null){
            temp = head.next;
            head.next = null;
            head = temp;
        }
        
        temp = null;
        tail.next = null;
        size=0;
    }
    
    public void display(){
        SNode<E> current = head;
        for(int i=0; i<size; i++){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
}

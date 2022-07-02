/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class StudentList<E> {
    int size=0;
    Node<E> head;
    Node<E> tail;
    
    public void add(E e){
        if(size==0)
            head = tail = new Node<>(e);
        else{
            Node<E> temp = new Node<>(e);
            tail.next = temp;
            tail = tail.next;
        }
        size++;
    }
    
    public E removeFirst(){
        if(head==null)
            return null;
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }
    
    public E removeLast(){
        if(tail == null)
            return null;
        else{
            Node<E> current = head;
            for(int i=1; i<size-1; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = null;
            tail = current;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index){
        if(index<0 || index>=size)
            return null;
        
        else if(index==0)
            return removeFirst();
        
        else if(index==size-1)
            return removeLast();
        
        else{
            Node<E> current = head;
            for(int i=1; i<index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = current.next.next;
            temp.next = null;
            size--;
            return temp.element;
        }
    }
    
    public void removeElement(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                remove(i);
            }
            current = current.next;
        }
    }
    
    public void printList(){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            System.out.print(current.element + ", ");
            current = current.next;
        }
        System.out.println();
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element==e)
                return true;
            current = current.next;
        }
        return false;
    }
    
    public void replace(E e, E newE){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                current.element = newE;
                break;
            }
            current = current.next;
        }
    }
}

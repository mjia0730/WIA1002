/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class DoubleLinkedList<E> {
    int size=0;
    DNode<E> head;
    DNode<E> tail;
    
    public void addFirst(E e){
        // create object temp and set pointer of the new node
        DNode<E> temp = new DNode<>(e, head, null);
        
        // set head.prev of current head to be linked to the new node
        if(head != null)
            head.prev = temp;
        
        //now temp becomes head
        head = temp;
        
        //if no tail, then temp set to be tail
        if(tail == null)
            tail = temp;
        
        //increase number of node
        size++;
        System.out.println("adding: " + e);
    }
    
    public void addLast(E e){
        // create object temp and set pointer of the previous node
        DNode<E> temp = new DNode<>(e, null, tail);
        
        // set tail.next to point to object temp
        if(tail != null)
            tail.next = temp;
        
        //now temp becomes tail
        tail = temp;
        
        //if no head, then temp set to be a head
        if(head==null)
            head = temp;
        
        //increase number of node
        size++;
        System.out.println("adding: " + e);
    }
    
    public void add(E e, int index){
        if(index<0 || index >size)
            throw new IndexOutOfBoundsException();
        else if(index ==0)
            addFirst(e);
        else if(index == size)
            addLast(e);
        else{
            /* set from head and begin traverse
             * stop at required position */
            DNode<E> temp = head;
            for(int i=1; i<=index; i++){
                temp = temp.next;
            }
            /* create object insert and set pointer of the next pointer
             * to the temp node and also set pointer of the prev pointer 
             * to the temp.prev node */
            DNode<E> insert = new DNode<>(e, temp, temp.prev);
            // set pointer 'next' of the node temp.prev to new node insert
            temp.prev.next = insert;
            // set pointer 'prev' of the node temp to new node insert
            temp.prev = insert;
            size++;
            System.out.println("adding: " + insert.element);
        }
    }
    
    public void iterateForeward(){
        System.out.println("iterating forward...");
        DNode<E> temp = head;
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward...");
        DNode<E> temp = tail;
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    public E removeFirst(){
        if(size==0)
            return null;
        DNode<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E removeLast(){
        if(size==0)
            return null;
        DNode<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }
    
    public E remove(int index){
        if(index<0 || index >= size)
            return null;
        else if(index == 0)
            return removeFirst();
        else if (index == size-1)
            return removeLast();
        else{
            DNode<E> temp = head;
            for(int i=1; i<=index; i++){
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            temp.next = null;
            temp.prev = null;
            size--;
            System.out.println("deleted: " + temp.element);
            return temp.element;
        }
    }
    
    public void clear(){
        System.out.println("successfully clear " + this.getSize() + " node(s)");
        DNode<E> temp = head;
        for(int i=0; i<size; i++){
            temp = head.next;
            head.next = head.prev = null;
            head = temp;
        }
        temp = null;
        tail.next = tail.prev = null;
        size=0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public void printSize(){
        System.out.println("size of current Doubly Linked List: " + this.size);
    }
}

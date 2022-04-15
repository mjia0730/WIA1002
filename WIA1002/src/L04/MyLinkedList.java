/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L04;

/**
 *
 * @author USER
 */
public class MyLinkedList<E> {
    int size = 0;
    Node<E> head;
    Node<E> tail;
    
    public MyLinkedList(){
        
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail==null)
            tail=head;
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if(tail == null)
            head = tail = newNode;
        else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
        if(index==0)
            addFirst(e);
        else if(index>=size)
            addLast(e);
        else{
            Node<E> current = head;     //i=1 because before this we already assign head(which is the first item i0) to current
                                        //here already consider one iteration
            for(int i=1; i<index; i++){ //stop one index before 
                current = current.next; //e.g. index = 2, the loop should stop at i=1, wont proceed to i=2
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            current.next.next = temp;
            size++;
        }
    }
    
    public E removeFirst(){
        if(size==0)
            return null;
        Node<E> temp = head;
        head = head.next;
        size--;
        if(head==null)
            tail=null;
        return temp.element;
    }
    
    public E removeLast(){
        if(size==0)
            return null;
        else if(size==1){
            Node<E> temp = tail;
            head=tail=null;
            size=0;
            return temp.element;
        }
        else{
            Node<E> current = head;
            for(int i=1; i<size-1; i++){    //this at the size need to minus 1 bczs need to stop at the second last index
                current = current.next;     //those with index given no need minus 1 because <index will stop at one place 
            }                               //before index but <size will stop the last value
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index){
        if(index<0 && index>=size)
            return null;
        else if(index==0)
            return removeFirst();
        else if(index==size-1)
            return removeLast();
        else{
            Node<E> previous = head;
            for(int i=1; i<index; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public void add(E e){
        if(size==0)
            addFirst(e);
        else
            addLast(e);
    }
    
    public boolean contains (E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element==e)
                return true;
            current = current.next;
        }
        return false;
    }
    
    public E get(int index){
        if(index<0 && index>=size)
            return null;
        else{
            Node<E> current = head;
            for(int i=0; i<index; i++){
                current = current.next;
            }
            return current.element;
        }
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public int indexOf(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element==e)
                return i;
            current = current.next;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        Node<E> current = head;
        int index = -1;
        for(int i=0; i<size; i++){
            if(current.element==e)
                index = i;
            current = current.next;
        }
        return index;
    }
    
    public E set(int index, E e){
        add(index, e);
        return remove(index+1);
    }
    
    public void clear(){
        while(size !=0){
            removeFirst();
        }
    }
    
    public void print(){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            System.out.println(current.element);
            current = current.next;
        }
    }
    
    public void reverse(){
        E[] array = (E[])new Object[size];
        Node<E> current = head;
        for(int i=0; i<size; i++){
            array[i] = current.element;
            current = current.next;
        }
        for(int i=size-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
    
    public E getMiddleValue(){
        return get((size-1)/2);
    }
}

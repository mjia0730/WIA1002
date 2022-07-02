/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class DNode<E> {
    E element;
    DNode<E> next;
    DNode<E> prev;
    
    public DNode(E e){
        this.element = e;
        this.next = null;
        this.prev = null;
    }
    
    public DNode(E e, DNode<E> n, DNode<E> p){
        this.element = e;
        this.next = n;
        this.prev = p;
    }
}

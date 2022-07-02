/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class Node<E> {
    E element;
    Node<E> next;
    
    public Node(E e){
        this.element = e;
        this.next = null;
    }
    
    public Node(E e, Node<E> n){
        this.element = e;
        this.next = n;
    }
}

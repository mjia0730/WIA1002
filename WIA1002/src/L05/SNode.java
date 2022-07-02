/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class SNode<E> {
    E element;
    SNode next;
    
    public SNode(E e){
        this.element = e;
        this.next = null;
    }
    
    public SNode(E e, SNode n){
        this.element = e;
        this.next = n;
    }
}

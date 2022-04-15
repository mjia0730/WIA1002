/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L04;

/**
 *
 * @author USER
 */
public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        
        System.out.println("Print all the elements in the list.");
        list.print();
        
        System.out.println("Reverse all the elements in the list.");
        list.reverse();
        
        System.out.println("Retrieve the number of elements in the list.");
        System.out.println(list.size);
        
        System.out.println("Retrieve the first and last value.");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        
        list.remove((list.size-1)/2);
        
        System.out.println("Retrieve the index location for the second and third value.");
        list.indexOf('b');
        list.indexOf('c');
        
        System.out.println("Checks if the list has the value ‘c’.");
        System.out.println(list.contains('c'));
        
        list.add(2, 'c');
        list.set(0, 'h');
        list.set(1, 'e');
        list.set(2, 'l');
        list.set(3, 'l');
        list.set(4, 'o');
        list.print();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);
        list.add(2, 2);
        list.remove(3);
        
        list.iterateForeward();
        list.iterateBackward();
        
        list.printSize();
        
        list.clear();
        System.out.println();
        
        list.printSize();
    }
}

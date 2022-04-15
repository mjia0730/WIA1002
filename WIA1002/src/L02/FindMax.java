/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 */
public class FindMax {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        String[] b = {"red", "green", "blue"};
        Circle[] c = {new Circle(3.0), new Circle(2.9), new Circle (5.9)};
        
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
        
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        
        for(int i=0; i<list.length; i++){
            if(list[i].compareTo(max) >= 0)
                max = list[i];
        }
        return max;
    }
}

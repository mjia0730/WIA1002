/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 */
public class Q01 {
    public static void main(String[] args) {
        //Part d
        StorePairGeneric<Integer> a = new StorePairGeneric<Integer>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<Integer>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<Integer>(6,3);
        
        //if string1 > string2, it returns positive number  
        //if string1 < string2, it returns negative number  
        //if string1 == string2, it returns 0  
        
        //Part e
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
    }
}

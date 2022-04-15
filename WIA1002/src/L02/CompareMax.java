/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 */
public class CompareMax {
    
    static <T extends Comparable<T>> T maximum(T a, T b, T c){
        if(a.compareTo(b) >= 0 && a.compareTo(c) >= 0)
            return a;
        
        else if(b.compareTo(a) >= 0 && b.compareTo(c) >= 0)
            return b;
        
        else
            return c;
    }
    
    public static void main(String[] args) {
        System.out.println(maximum(18, 18, 9));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 */
public class Q04 {
    static <T extends Comparable<T>> String minmax(T[] array){
        T max=array[0], min=array[0];
        
        for(int i=0; i<array.length; i++){
            if(array[i].compareTo(max) >= 0)
                max = array[i];
            if(array[i].compareTo(min)<=0)
                min = array[i];
        }
        
        return "Min = " + min + " Max = " + max;
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
        
    }
}

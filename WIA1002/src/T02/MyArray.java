/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02;

/**
 *
 * @author USER
 */
public class MyArray { //Q02
    public static void main(String[] args) {
        Integer[] integer = {1,2,3,4,5};
        String[] str = {"Jane", "Tom", "Bob"};
        Character[] ch = {'a', 'b', 'c'};
        
        MyArray.<Integer>print(integer);
        MyArray.print(str);
        MyArray.print(ch);
    }
    
    public static <E> void print(E[] list){
        for(int i=0; i<list.length; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

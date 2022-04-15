/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 */
public class Q02 {
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<String>();
        MyGeneric<Integer> intObj = new MyGeneric<Integer>(7);
        
        strObj.setE("MyGeneric");
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}

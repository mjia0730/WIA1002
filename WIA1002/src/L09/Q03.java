/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09;

/**
 *
 * @author Jia Ming Ooi
 */
public class Q03 {
    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
    }
    
    public static long exponent(int x, int y){
        if(y==1)
            return x;
        else
            return x*exponent(x, y-1);
    }
}

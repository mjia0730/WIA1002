/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02;

/**
 *
 * @author USER
 */
class Duo <A,B> { //Q05 & Q06
    A first;
    B second;
    
    Duo(A first, B second){
        this.first = first;
        this.second = second;
    }
    
    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("Square", 5);
        Duo<Double, Double> points = new Duo<Double, Double>(4.5, 5.5);
    }
}

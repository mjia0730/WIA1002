/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 * @param <C>
 */
public class Circle<C extends Comparable<C>> implements Comparable<Circle<C>> {
    private final C radius;
    
    public Circle(C radius){
        this.radius = radius;
    }
    
    @Override
    public int compareTo(Circle<C> obj) {
        return this.radius.compareTo(obj.radius);
    }
    
    @Override
    public String toString() {
        return "Circle radius: " + radius;
    }
}

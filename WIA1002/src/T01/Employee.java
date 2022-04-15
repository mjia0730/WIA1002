/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01;

/**
 *
 * @author USER
 */
public class Employee extends Person{
    public Employee() {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    
    //overloaded constructor
    public Employee(String s) {
        System.out.println(s);
    }
}

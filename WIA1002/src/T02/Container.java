/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02;

/**
 *
 * @author USER
 */
public class Container <T>{ //Q01
    private T t;
    public Container(){
        
    }
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
        Container<String> c1 = new Container<String>();
        Container<Integer> c2 = new Container<Integer>();
        
        c1.add("Java");
        c2.add(50);
        
        System.out.println(c1.retrieve());
        System.out.println(c2.retrieve());
    }
}

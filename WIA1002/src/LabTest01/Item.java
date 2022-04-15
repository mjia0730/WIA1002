/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author USER
 */
public class Item <E, T>{
    private E item; //information on flight
    private T price; //information on meal
    
    public Item(E item, T price){
        this.item = item;
        this.price = price;
    }
    
    public void setItem(E item){
        this.item = item;
    }
    
    public E getItem(){
        return item;
    }
    
    public void setPrice(T price){
        this.price = price;
    }
    
    public T getPrice(){
        return price;
    }
}

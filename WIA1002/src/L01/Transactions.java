/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Transactions {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transactions(char type, double amount, double balance,
            String description){
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setType(char type){
        this.type = type;
    }
    
    public char getType(){
        return type;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
}

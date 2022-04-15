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
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public Account(int id, double balance){
        setID(id);
        setBalance(balance);
        dateCreated = new Date();
    }
    
    public void setID (int id){
        this.id = id;
    }
    
    public int getID(){
        return id;
    }
    
    public void setBalance (double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setAnualInterestRate (double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public Date getDateCreated(){
        java.util.Date date = new java.util.Date();    
        dateCreated = date;
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    public double getMonthlyInterest(){
        return (annualInterestRate/12)*balance;
    }
    
    public void withdraw(int amount){
        balance-=amount;
    }
    
    public void deposits(int amount){
        balance+=amount;
    }
    
}

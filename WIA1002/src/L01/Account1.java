/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Account1{
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transactions> transactions;
    
    public Account1(){
        name = "";
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transactions>();
    }
    
    public Account1(int id, double balance){
        name = "";
        setID(id);
        setBalance(balance);
        dateCreated = new Date();
        transactions = new ArrayList<Transactions>();
    }
    
    public Account1(String name, int id, double balance){
        setName(name);
        setID(id);
        setBalance(balance);
        dateCreated = new Date();
        transactions = new ArrayList<Transactions>();
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
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
        transactions.add(new Transactions('W', amount, balance, 
			"Withdrawal from account"));
    }
    
    public void deposits(int amount){
        balance+=amount;
        transactions.add(new Transactions('D', amount, balance, 
			"Deposit to account"));
    }
    
    public ArrayList<Transactions> getTransactions(){
        return transactions;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01;

/**
 *
 * @author USER
 */
public class BankAccount implements Account{
    private int balance;
    
    public BankAccount(int balance){
        this.balance = balance;
    }
    
    public int getBalance(){
        return balance;
    }
    
    @Override
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    
    @Override
    public boolean withdraw(int amount){
        if(amount<balance){
            balance = balance - amount;
            return true;
        }
        else
            return false;
    }
    
}

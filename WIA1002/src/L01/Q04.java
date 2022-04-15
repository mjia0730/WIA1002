/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01;

/**
 *
 * @author USER
 */
public class Q04 {
    public static void main(String[] args) {
        // Create an Account1 object
        Account1 a = new Account1("George", 1122, 1000);
        
        // Set annual interest rate to 1.5%
        a.setAnualInterestRate(1.5);
        
        // Deposit $30, $40, and $50 to the account
        a.deposits(30);
        a.deposits(40);
        a.deposits(50);
        
        // withdraw $5, $4, and $2 from the account
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        
        //Print account summary
        System.out.println("       Account Summary"); 
	System.out.println("------------------------------------");
        System.out.println("Account holder name: " + a.getName());
        System.out.println("Interest Rate: " + a.getAnnualInterestRate());
        System.out.println("Balance: " + a.getBalance());
        System.out.println("List of Transactions");
        System.out.println("------------------------------------");
        for(int i=0; i<a.getTransactions().size(); i++){
            System.out.println("Date: " + a.getTransactions().get(i).getDate());
            System.out.println("Type: " + a.getTransactions().get(i).getType());
            System.out.println("Amount: " + a.getTransactions().get(i).getAmount());
            System.out.println("Balance: " + a.getTransactions().get(i).getBalance());
            System.out.println("Description: " + a.getTransactions().get(i).getDescription());
            System.out.println();
        }
    }
}

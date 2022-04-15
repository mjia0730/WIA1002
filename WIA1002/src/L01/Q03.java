/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01;

/**
 *
 * @author USER
 */
public class Q03 {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposits(3000);
        System.out.println(a.getBalance());
        System.out.println(a.getMonthlyInterest());
        System.out.println(a.getDateCreated());
    }
}

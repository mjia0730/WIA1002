/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01;

/**
 *
 * @author USER
 */
public class Q05 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(50000);
        System.out.println(b.getBalance());
        System.out.println(b.deposit(7000));
        System.out.println(b.withdraw(100000));
        System.out.println(b.getBalance());
    }
}

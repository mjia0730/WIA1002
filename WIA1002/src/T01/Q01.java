/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01;

/**
 *
 * @author USER
 */
public class Q01 {
    public static void main(String[] args) {
        Telephone[] t = new Telephone[5];
        
        t[0] = new Telephone("03", "79676300");
        t[1] = new Telephone("03", "79676301");
        t[2] = new Telephone("03", "79676302");
        t[3] = new Telephone("03", "79676303");
        t[4] = new Telephone("03", "79676304");
        
        for(int i=0; i<5; i++){
            System.out.println(t[i].makeFullNumber());
        }
        
        System.out.println("Number of Telephone objects: " + t[4].numberOfTelephoneObject);
    }
}

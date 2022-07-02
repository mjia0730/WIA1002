/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

/**
 *
 * @author Jia Ming Ooi
 */
public class TestSList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        
        //Append the following values individually: “Linked list, is, easy.”
        list.appendEnd("Linked");
        list.appendEnd("list,");
        list.appendEnd("is,");
        list.appendEnd("easy.");
        
        // Display these values. 
        list.display();
        
        //Remove the word “Linked list” and display the removed value. 
        System.out.println(list.removeInitial());
        System.out.println(list.removeInitial());
        
        // Check if ‘difficult’ is in the list. 
        System.out.println(list.contains("difficult"));
        
        //Clear the list
        list.clear();
    }
}

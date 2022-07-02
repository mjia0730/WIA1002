/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05;

import java.util.Scanner;

/**
 *
 * @author Jia Ming Ooi
 */
public class TestStudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList<String> list = new StudentList<>();
        System.out.println("Enter your student name lsit. Enter 'n' to end.....");
        String name = sc.nextLine();
        
        while(name.equals("n") == false){
            list.add(name);
            name = sc.nextLine();
        }
        
        System.out.println("You have entered the following students' name: ");
        list.printList();
        
        System.out.println("The number of students entered is: " + list.getSize());
        
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed");
        char rename = sc.next().charAt(0);
        sc.nextLine();
        
        if(rename== 'r'){
            System.out.println("Enter the existing student name that you want to rename: ");
            String existingName = sc.nextLine();
            
            System.out.println("Enter the new name: ");
            String newName = sc.nextLine();
            
            list.replace(existingName, newName);
            System.out.println("The new student list is: ");
            list.printList();
        }
        
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        char remove = sc.next().charAt(0);
        sc.nextLine();
        
        if(remove=='y'){
            System.out.println("Enter a student name to remove: ");
            String nameToRemove = sc.nextLine();
            list.removeElement(nameToRemove);
            System.out.println("The number of updated student is : " + list.getSize());
            System.out.println("The updated students list is : ");
            list.printList();
        }
        
        System.out.println("All student data captured complete. Thank you!");
    }
}

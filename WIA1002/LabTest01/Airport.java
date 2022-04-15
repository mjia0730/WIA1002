/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Airport {
    public static void main(String[] args) {
        Item<String, Integer> f1 = new Item<>("Business", 9032);
        Item<String, Integer> meal1 = new Item<>("Chicken Satay", 25);
        String[] crew1 = {"Sue", "Danial", "Lily"};
        Flight flight1 = new Flight("1201", "Khairul", "khairul@gmail.com", "012-9787765", "Singapore Airlines", "SQ804", f1, meal1, crew1);
        
        Item<String, Integer> f2 = new Item<>("Economy", 3176);
        Item<String, Integer> meal2 = new Item<>("Nasi Lemak", 13);
        String[] crew2 = {"Kyra", "Rose", "Syira"};
        Flight flight2 = new Flight("1202", "Jimmy", "jimmy@gmail.com", "019-2722398", "Qatar Airlines", "QT103", f2, meal2, crew2);
        
        Item<String, Integer> f3 = new Item<>("Business", 13210);
        Item<String, Integer> meal3 = new Item<>("Grilled Lamb", 39);
        String[] crew3 = {"Lingam", "Ronny", "Rudi", "Maria"};
        Flight flight3 = new Flight("1203", "Brandon", "brandon@gmail.com", "018-3234146", "Malaysia Airlines", "MH107", f3, meal3, crew3);
        
        ArrayList<Flight> f = new ArrayList<>();
        f.add(flight1);
        f.add(flight2);
        f.add(flight3);
        
        for(int i=0; i<f.size(); i++){
            System.out.println("Airline Name: " + f.get(i).getAirlineName());
            System.out.println("Flight Number: " + f.get(i).getFlightNum());
            System.out.println("Passenger Info: ");
            System.out.println("User ID: " + f.get(i).getUserID());
            System.out.println("Name: " + f.get(i).getName());
            System.out.println("Email: " + f.get(i).getEmail());
            System.out.println("Contact Num: " + f.get(i).getContactNum());
            System.out.println("[Item Name: " + f.get(i).getFlight().getItem());
            System.out.println("Item Price: RM" + f.get(i).getFlight().getPrice() + "]");
            System.out.println("[Item Name: " + f.get(i).getMeal().getItem());
            System.out.println("Item Price: RM" + f.get(i).getMeal().getPrice() + "]");
            
        }
        
        //Get the object with largest number of cabin crew
        int max=0;
        int index = 0;
        for(int i=0; i<f.size(); i++){
            if(f.get(i).numCabinCrew()>max){
                max = f.get(i).numCabinCrew();
                index = i;
            }
        }
        //Print the airline with the largest number of cabin crew
        if(f.get(index).getAirlineName()=="Singapore Airlines")
            System.out.println("Flight Singapore Airlines has a larger cabin crew than Flight Malaysia Airlines and Qatar Airlines.");
        else if(f.get(index).getAirlineName()=="Qatar Airlines")
            System.out.println("Flight Qatar Airlines has a larger cabin crew than Flight Malaysia Airlines and Singapore Airlines");
        else
            System.out.println("Flight Malaysia Airlines has a larger cabin crew than Flight Singapore Airlines and Qatar Airlines");
        
        System.out.println("The most expensive flight ticket is RM" + f.get(max(f)).flight.getPrice());
    }
    
    //max method
    public static <T extends Comparable<T>> int max(ArrayList<T> f){
        if(f.get(0).compareTo(f.get(1))>=0 && f.get(0).compareTo(f.get(2))>=0)
            return 0;
        else if(f.get(1).compareTo(f.get(0))>=0 && f.get(1).compareTo(f.get(2))>=0)
            return 1;
        else
            return 2;
    }
}

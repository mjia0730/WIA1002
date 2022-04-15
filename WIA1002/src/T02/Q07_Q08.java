/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Q07_Q08 { //Q07 & Q08
    public static void main(String[] args) {
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        
        //vehicle.add("car");
        //vehicle.add("bicycle");
        //numOfCars.add(45);
        //milesPerHour.add(75.5);
        //allTransportation(vehicle);
        //print(numOfCars);
        //print(milesPerHour);
    }
    
    static void allTransportation(ArrayList<?> a){ //Q07
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
    
    static void print(ArrayList<?> list){ //Q08
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

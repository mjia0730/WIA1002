/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author USER
 */
public class Flight extends Airline implements Comparable<Flight>{
    public Item flight;
    public Item meal;
    
    public Flight(String user_id, String name, String email, String contact_number, String airline_name, String flight_number, Item flight, Item meal, String[] cabincrew){
        super(user_id, name, email, contact_number, airline_name, flight_number, cabincrew);
        this.flight = flight;
        this.meal = meal;
    }
    
    public void setFlight(Item flight){
        this.flight = flight;
    }
    
    public Item getFlight(){
        return flight;
    }
    
    public void setMeal(Item meal){
        this.meal = meal;
    }
    
    public Item getMeal(){
        return meal;
    }
    //compareTo method to compare price of two flights
    @Override
    public int compareTo(Flight flight2){
        int price1 = (int)this.getFlight().getPrice();
        int price2 = (int)flight2.getFlight().getPrice();
        
        if(price1>price2)
            return 1;
        else if(price1==price2)
            return 0;
        else
            return -1;
    }
}

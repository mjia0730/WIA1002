/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author USER
 */
public class Airline extends Account{
    private String airline_name;
    private String flight_number;
    
    public Airline(String user_id, String name, String email, String contact_number, String airline_name, String flight_number, String[] cabincrew){
        super(user_id, name, email, contact_number);
        setCabinCrew(cabincrew); //send cabincrew to Account class
        this.airline_name = airline_name;
        this.flight_number = flight_number;
    }
    
    public void setAirlineName(String airline_name){
        this.airline_name = airline_name;
    }
    
    public String getAirlineName(){
        return airline_name;
    }
    
    public void setFlightNum(String flight_number){
        this.flight_number = flight_number;
    }
    
    public String getFlightNum(){
        return flight_number;
    }
}

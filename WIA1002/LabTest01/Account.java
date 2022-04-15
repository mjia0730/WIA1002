/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest01;

/**
 *
 * @author USER
 */
public class Account {
    private String user_id;
    private String name;
    private String email;
    private String contact_number;
    private String[] cabincrew;
    
    public Account(String user_id, String name, String email, String contact_number){
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
    }
    
    //assign the cabincrew from Airline class to this.cabincrew
    public void setCabinCrew(String[] cabincrew){
        this.cabincrew = cabincrew;
    }
    
    //get the number of cabin crew
    public int numCabinCrew(){
        return cabincrew.length;
    }
    
    public void setUserID(String user_id){
        this.user_id = user_id;
    }
    
    public String getUserID(){
        return user_id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setContactNum(String contact_number){
        this.contact_number = contact_number;
    }
    
    public String getContactNum(){
        return contact_number;
    }
}

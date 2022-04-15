/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T01;

/**
 *
 * @author USER
 */
public class Telephone {
    private String areaCode;
    private String number;
    static int numberOfTelephoneObject;
    
    public Telephone(String areaCode, String number){
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }
    
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    public String getAreaCode(){
        return this.areaCode;
    }
    
    public void setNumber(String number){
        this.number = number;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String makeFullNumber(){
        return getAreaCode() + "-" + getNumber();
    }
        
}

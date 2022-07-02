/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09;

/**
 *
 * @author Jia Ming Ooi
 */
public class Q01 {
    public static void main(String[] args) {
        System.out.println(substituteAI("Astronaut"));
    }
    
    public static String substituteAI(String str){
        if(str.length()==1){
            if(str.equals("a"))
                return "i";
            return Character.toString(str.charAt(0));
        }
        else{
            if(str.charAt(0)=='a')
                return 'i' + substituteAI(str.substring(1));
            return Character.toString(str.charAt(0)) + substituteAI(str.substring(1));
        }
    }
}

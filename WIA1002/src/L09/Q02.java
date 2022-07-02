/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09;

/**
 *
 * @author Jia Ming Ooi
 */
public class Q02 {
    public static void main(String[] args) {
        permuteString("", "ABC");
    }
    
    public static void permuteString(String a, String b){
        int n = b.length();
        if(n==0)
            System.out.println(a);
        else{
            for(int i=0; i<n; i++){
                permuteString(a+b.charAt(i), b.substring(0, i)+b.substring(i+1, n));
            }
        }
            
    }
}

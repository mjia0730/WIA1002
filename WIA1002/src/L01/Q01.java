/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Q01 {
    public static void main(String[] args) {
        //Part1 Part 2
        try{
            Scanner sc = new Scanner(new FileInputStream("OoiJiaMing_U2102759.txt"));
            
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
            
        }catch(IOException e){
            System.out.println("File not found");
        }
        //Part 3
        try{
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(new FileOutputStream("OoiJiaMing_U2102759.txt", true));
            
            pw.println();
            String s =sc.nextLine();
            String str = "";
            for(int i=0; i<s.length(); i++){
                str += Character.toString(s.charAt(i));
                if(s.charAt(i)=='.'){
                    pw.println(str);
                    str = "";
                }
            }
            pw.close();
            
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            Scanner sc = new Scanner(new FileInputStream("OoiJiaMing_U2102759.txt"));
            
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
            
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}

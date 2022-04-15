/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Q02 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("text1.txt"));
            int num=0;
            
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i)!= ',' || str.charAt(i)==' '){
                        num++;
                        System.out.print(str.charAt(i));
                    }
                }
                System.out.println();
                System.out.println(num);
                num = 0;
            }
            sc.close();
            
        }catch(IOException e){
            System.out.println("File not found");
        }
        
        try{
            Scanner sc = new Scanner(new FileInputStream("text2.txt"));
            int num=1;
            
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i)==',')
                        num++;
                    else
                        System.out.print(str.charAt(i));
                }
                System.out.println();
                System.out.println(num);
                num = 1;
            }
            sc.close();
            
        }catch(IOException e){
            System.out.println("File not found");
        }
        
        try{
            Scanner sc = new Scanner(new FileInputStream("text3.txt"));
            int num=1;
            
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i)== ';'){
                        num++;
                        System.out.print(" ");
                    }
                    else
                        System.out.print(str.charAt(i));
                }
                System.out.println();
                System.out.println(num);
                num = 1;
            }
            sc.close();
            
        }catch(IOException e){
            System.out.println("File not found");
        }
        
        try{
            Scanner sc = new Scanner(new FileInputStream("text4.txt"));
            int num=0;
            
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2' || str.charAt(i)=='3' ||
                            str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' ||
                            str.charAt(i)=='8' || str.charAt(i)=='9')
                        continue;
                    else{
                        num++;
                        System.out.print(str.charAt(i));
                    }
                }
                System.out.println();
                System.out.println(num);
                num = 0;
            }
            sc.close();
            
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}

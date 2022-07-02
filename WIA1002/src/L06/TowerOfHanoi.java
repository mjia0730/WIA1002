/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06;

import java.util.Scanner;

/**
 *
 * @author Jia Ming Ooi
 */
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MyStack<Integer> A = new MyStack<>();
        MyStack<Integer> B = new MyStack<>();
        MyStack<Integer> C = new MyStack<>();
        
        System.out.println("Number of Disks: ");
        int disks = sc.nextInt();
        
        for(int i=disks; i>0; i--){
            A.push(i);
        }
        
        int steps = (int)Math.pow(2, disks)-1;
        System.out.println(steps);
        
        while(steps>0){
            if (steps>0){
                // A and B
                if(A.isEmpty()==true && B.isEmpty()==true){

                }
                else if(A.isEmpty()==true && B.isEmpty()==false){
                    A.push(B.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(A.isEmpty()==false && B.isEmpty()==true){
                    B.push(A.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(A.peek().compareTo(B.peek())>0){
                    A.push(B.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(A.peek().compareTo(B.peek())<0){
                    B.push(A.pop());
                    display(A,B,C);
                    steps--;
                }
            }
            
            if(steps>0){
                //A and C
                if(A.isEmpty()==true && C.isEmpty()==true){

                }
                else if(A.isEmpty()==true && C.isEmpty()==false){
                    A.push(C.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(A.isEmpty()==false && C.isEmpty()==true){
                    C.push(A.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(A.peek().compareTo(C.peek())>0){
                    A.push(C.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(A.peek().compareTo(C.peek())<0){
                    C.push(A.pop());
                    display(A,B,C);
                    steps--;
                }
            }
            
            if(steps>0){
                //B and C
                if(B.isEmpty()==true && C.isEmpty()==true){

                }
                else if(B.isEmpty()==true && C.isEmpty()==false){
                    B.push(C.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(B.isEmpty()==false && C.isEmpty()==true){
                    C.push(B.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(B.peek().compareTo(C.peek())>0){
                    B.push(C.pop());
                    display(A,B,C);
                    steps--;
                }
                else if(B.peek().compareTo(C.peek())<0){
                    C.push(B.pop());
                    display(A,B,C);
                    steps--;
                }
            }
        }
    }
    
    public static void display(MyStack A, MyStack B, MyStack C){
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
        System.out.println("#################");
    }
}

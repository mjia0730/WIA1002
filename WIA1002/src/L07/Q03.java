/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07;

import java.util.Scanner;

/**
 *
 * @author Jia Ming Ooi
 */
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue<Integer> share = new MyQueue<>();
        MyQueue<Integer> price = new MyQueue<>();
        int gainLoss=0;
        while(true){
            System.out.println("Enter your query (In format 'Buy/Sell x shares at $y each'): ");
            String query = sc.nextLine();
            String[] qArray = query.split(" ");
            qArray[4] = qArray[4].replace("$", "");
            
            if(qArray[0].equals("Buy")){
                System.out.println("Buying now...");
                share.enqueue(Integer.parseInt(qArray[1]));
                price.enqueue(Integer.parseInt(qArray[4]));
                System.out.println("Queue for Share: " + share.toString());
                System.out.println("Queue for Price: " + price.toString());
            }
            else{
                System.out.println("Selling the shares now...");
                int sellNum = Integer.parseInt(qArray[1]);
                int sellPrice = Integer.parseInt(qArray[4]);
                while(sellNum>0 && share.isEmpty()==false){
                    if(sellNum<=share.getElement(0)){
                        gainLoss += (sellPrice-price.getElement(0))*sellNum;
                        share.enqueue(share.getElement(0)-sellNum);
                        sellNum=0;
                        share.dequeue();
                        for(int i=0; i<share.getSize()-1; i++){
                            share.enqueue(share.dequeue());
                        }
                        System.out.println("Total Capital Gain/Loss: " + gainLoss);
                    }
                    else{
                        gainLoss += (sellPrice-price.getElement(0))*share.getElement(0);
                        sellNum -= share.getElement(0);
                        share.dequeue();
                        price.dequeue();
                        System.out.println("Total Capital Gain/Loss: " + gainLoss);
                    }
                }
                
                System.out.println("Queue for Share: " + share.toString());
                System.out.println("Queue for Price: " + price.toString());
            }
            if(share.isEmpty()){
                System.out.println("No shares to sell!");
                break;
            }
        }
        System.out.println("Final Capital Gain/Loss: " + gainLoss);
    }
}

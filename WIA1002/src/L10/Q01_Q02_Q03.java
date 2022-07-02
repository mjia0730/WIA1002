/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10;

/**
 *
 * @author Jia Ming Ooi
 */
public class Q01_Q02_Q03 {
    public static void main(String[] args) {
        int[] arr = {45, 7, 2, 8, 19, 3};
        selectionSortSmallest(arr);
        selectionSortLargest(arr);
    }
    
    public static void selectionSortSmallest(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int minIndex = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]< min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }
    
    public static void selectionSortLargest(int[] arr){
        for(int i=0; i<arr.length; i++){
            int max = arr[i];
            int maxIndex = i;
            for(int j= i+1; j<arr.length; j++){
                if(arr[j]> max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            arr[maxIndex] = arr[i];
            arr[i] = max;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }
}

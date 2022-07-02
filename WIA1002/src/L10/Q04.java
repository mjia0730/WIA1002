/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10;

/**
 *
 * @author Jia Ming Ooi
 */
public class Q04 {
    public static void main(String[] args) {
        int[] arr = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(arr);
    }
    
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int currentElement = arr[i];
            int k;
            for(k = i-1; k>=0 && arr[k] > currentElement; k--){
                arr[k+1] = arr[k];
            }
            arr[k+1] = currentElement;
        }
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + "\t");
        }
        System.out.println();
    }
}

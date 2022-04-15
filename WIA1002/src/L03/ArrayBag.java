/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L03;

import java.lang.reflect.Array;
import java.util.Random;

/**
 *
 * @author USER
 * @param <T>
 */
public class ArrayBag <T> implements BagInterface<T>{
    
    private final int DEFAULT_CAPACITY = 25;
    private T[] bag = (T[]) new Object[DEFAULT_CAPACITY];
    private int numberOfEntries;
    
    @Override
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    @Override
    public boolean isFull(){
        return numberOfEntries==DEFAULT_CAPACITY;
    }
    
    @Override
    public boolean isEmpty(){
        return numberOfEntries==0;
    }
    
    @Override
    public boolean add(T newEntry){
        if(numberOfEntries < DEFAULT_CAPACITY){
            numberOfEntries++;
            bag[numberOfEntries-1] = newEntry;
            return true;
        }
        else
            return false;
    }
    
    @Override
    public T remove(){
        if(numberOfEntries != 0 ){
            Random r = new Random();
            int index = r.nextInt(numberOfEntries);
            T remove = bag[index];
            bag[index] = null;
            
            for(int i=index; i<numberOfEntries; i++){
                bag[i] = bag[i+1];
            }
            numberOfEntries--;
            return remove;
        }
        else
            return null;
    }
    
    @Override
    public boolean remove(T anEntry){
        int index = -1;
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i] == anEntry)
                index = i;
        }
        
        if(index == -1)
            return false;
        else{
            bag[index] = null;
            for(int i=index; i<numberOfEntries; i++){
                bag[i] = bag[i+1];
            }
            numberOfEntries--;
            return true;
        }
    }
    
    @Override
    public void clear(){
        for(int i=0; i<numberOfEntries; i++){
            bag[i] = null;
        }
        
        numberOfEntries = 0;
    }
    
    @Override
    public int getFrequencyOf(T anEntry){
        int frequency = 0;
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i]==anEntry)
                frequency++;
        }
        return frequency;
    }
    
    /**
     *
     * @param anEntry
     * @return
     */
    @Override
    public boolean contains(T anEntry){
        for(int i=0; i<numberOfEntries; i++){
            if(bag[i]==anEntry)
                return true;
        }
        return false;
    }
    
    @Override
    public T[] toArray(){
        T[] array = (T[]) new Object[numberOfEntries];
        System.arraycopy(bag, 0, array, 0, numberOfEntries);
        return array;
    }
    
    //Question 2
    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag){
        BagInterface<T> newBag = new ArrayBag();
        
        for(int i=0; i<this.toArray().length; i++){
            newBag.add((T) Array.get(this.toArray(), i));
        }
        
        for(int i=0; i<anotherBag.toArray().length; i++){
            newBag.add((T) Array.get(anotherBag.toArray(), i));
        }
        
        return newBag;
    }
    
    //Question 3
    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag){
        BagInterface<T> newBag = new ArrayBag();
        BagInterface<T> bag1;
        BagInterface<T> bag2;
        
        //assign smaller bag to bag1, bigger bag to bag2;
        if(this.getCurrentSize()<anotherBag.getCurrentSize()){
            bag1 = this;
            bag2 = anotherBag;
        }
        else{
            bag1 = anotherBag;
            bag2 = this;
        }
        
        for(int i=0; i<bag1.getCurrentSize(); i++){
            if (!newBag.contains(bag1.toArray()[i])) {
                if ((bag1.getFrequencyOf(bag1.toArray()[i])) != 0 && bag2.getFrequencyOf(bag1.toArray()[i]) != 0) {
                    if(bag1.getFrequencyOf(bag1.toArray()[i]) <= bag2.getFrequencyOf(bag1.toArray()[i])){
                        for (int j = 0; j < bag1.getFrequencyOf(bag1.toArray()[i]); j++) {
                            newBag.add(bag1.toArray()[i]);
                        }
                    }
                    else{
                        for (int j = 0; j < bag2.getFrequencyOf(bag1.toArray()[i]); j++) {
                            newBag.add(bag1.toArray()[i]);
                        }
                    }
                }
            } 
        }
        return newBag;
    }
    
    //Question 4
    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag){
        T[] commonItems = (T[])this.intersection(anotherBag).toArray();
        BagInterface<T> leftOver = new ArrayBag();

        //copy all items from this.bag to leftOver
        for(int i=0; i<this.toArray().length; i++){
            leftOver.add((T) Array.get(this.toArray(), i));
        }

        //remove intersect items from leftOver
        for(T commonItem : commonItems){
            leftOver.remove(commonItem);
        }

        return leftOver;
    }
   
    //Question 5
    public static void main(String[] args) {
        ArrayBag<String> bag1 = new ArrayBag();
        ArrayBag<String> bag2 = new ArrayBag();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        
        System.out.println("bag1: ");
        testAdd(bag1, contentsOfBag1);
        displayBag(bag1);
        System.out.println("bag2: ");
        testAdd(bag2, contentsOfBag2);
        displayBag(bag2);
        
        System.out.println("bag3, test the method union of bag1 and bag2");
        BagInterface<String> bag3 = bag1.union(bag2);
        displayBag(bag3);
        
        System.out.println("bag4, test the method intersection of bag1 and bag2");
        BagInterface<String> bag4 = bag1.intersection(bag2);
        displayBag(bag4);
        
        System.out.println("bag5, test the method difference of bag1 and bag2");
        BagInterface<String> bag5 = bag1.difference(bag2);
        displayBag(bag5);
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(String str : content){
            aBag.add(str);
        }
        Object[] src = aBag.toArray();
        String[] dest = new String[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);

        System.out.print("Adding ");
        for (String items : dest) {
            System.out.print(items + " ");
        }
        System.out.println();
    }
    
    private static void displayBag(BagInterface<String> aBag){
        System.out.println("The bag contains " + aBag.getCurrentSize() + " string(s), as follows:");
        Object[] src = aBag.toArray();
        String[] dest = new String[src.length];
        System.arraycopy(src, 0, dest, 0, src.length);
        for (String items : dest) {
            System.out.print(items + " ");
        }
        System.out.println();
        System.out.println();
    }

}

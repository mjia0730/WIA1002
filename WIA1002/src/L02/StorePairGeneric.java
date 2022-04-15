/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02;

/**
 *
 * @author USER
 * @param <S>
 */
public class StorePairGeneric <S extends Comparable<S>> implements Comparable<StorePairGeneric <S>>{
    //Part a
    private S first, second;
    
    public StorePairGeneric(S first, S second) {
        this.first = first;
        this.second = second;
    }
    
    public S getFirst() {
        return first;
    }
    
    public S getSecond() {
        return second;
    }
    
    public void setPair(S first, S second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    //Part b
    @Override
    public boolean equals(Object obj){
        StorePairGeneric <S> other = (StorePairGeneric <S>) obj;
        return this.first.equals(other.first);
    }
    
    //Part c
    @Override
    public int compareTo(StorePairGeneric<S> obj) {
        return this.first.compareTo(obj.first);
    }

}

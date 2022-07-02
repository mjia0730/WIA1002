/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L08;

import java.util.ArrayList;

/**
 *
 * @author Jia Ming Ooi
 */
public class Vertex <T extends Comparable<T>, N extends Comparable<N>>{
    int size=0;
    Vertex<T,N> head, tail;
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T,N> nextVertex;
    Edge<T,N> firstEdge;
    
    public Vertex(){
        vertexInfo = null;
        indeg=0;
        outdeg=0;
        nextVertex = null;
        firstEdge = null;
    }
    
    public Vertex(T vInfo, Vertex<T,N> next){
        vertexInfo = vInfo;
        indeg=0;
        outdeg=0;
        nextVertex = next;
        firstEdge = null;
    }
    
    
}

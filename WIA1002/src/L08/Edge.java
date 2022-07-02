/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L08;


/**
 *
 * @author Jia Ming Ooi
 */
public class Edge <T extends Comparable<T>, N extends Comparable<N>>{
    int size = 0;
    Edge<T,N> head;
    Edge<T,N> tail;
    Vertex<T,N> toVertex;
    N weight;
    Edge<T,N> nextEdge;
    
    public Edge(){
        toVertex = null;
        weight = null;
        nextEdge = null;
    }
    
    public Edge(Vertex<T,N> destination, N w, Edge<T,N> a){
        toVertex = destination;
        weight = w;
        nextEdge = a;
    }
    
}

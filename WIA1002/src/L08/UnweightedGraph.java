/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L08;

/**
 *
 * @author Jia Ming Ooi
 */
public class UnweightedGraph<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T,N> head;
    int size;
    
    public UnweightedGraph(){
        head=null;
        size=0;
    }
    
    public boolean hasVertex(T v){
        if(head==null)
            return false;
        Vertex<T,N> temp = head;
        while(temp!=null){
            if(temp.vertexInfo.compareTo(v)==0)
                return true;
            temp = temp.nextVertex;
        }
        return false;
    }
    
    public boolean addEdge(T source, T destination){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while(sourceVertex != null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex<T,N> destinationVertex = head;
                while(destinationVertex != null){
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        Edge<T,N> currentEdge = sourceVertex.firstEdge;
                        Edge<T,N> newEdge = new Edge<>(destinationVertex, null, currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    public boolean addUndirectedEdge(T source, T destination){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while(sourceVertex != null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex<T,N> destinationVertex = head;
                while(destinationVertex != null){
                    if(destinationVertex.vertexInfo.compareTo(destination)==0){
                        Edge<T,N> sourceCurrentEdge = sourceVertex.firstEdge;
                        Edge<T,N> sourceNewEdge = new Edge<>(destinationVertex, null, sourceCurrentEdge);
                        sourceVertex.firstEdge = sourceNewEdge;
                        Edge<T,N> destinationCurrentEdge = destinationVertex.firstEdge;
                        Edge<T,N> destinationNewEdge = new Edge<>(sourceVertex, null, destinationCurrentEdge);
                        destinationVertex.firstEdge = destinationNewEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        sourceVertex.indeg++;
                        destinationVertex.outdeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
}

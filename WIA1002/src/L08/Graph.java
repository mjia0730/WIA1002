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
public class Graph <T extends Comparable<T>, N extends Comparable<N>>{
    Vertex<T,N> head;
    int size;
    
    public Graph(){
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
    
    public int getIndeg(T v){
        if(hasVertex(v) == true){
            Vertex<T, N> temp = head;
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0)
                    return temp.indeg;
                temp = temp.nextVertex;
            }
        }
        return -1;
    }
    
    public int getOutdeg(T v){
        if(hasVertex(v) == true){
            Vertex<T, N> temp = head;
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0)
                    return temp.outdeg;
                temp = temp.nextVertex;
            }
        }
        return -1;
    }
    
    public boolean addVertex(T v){
        if(hasVertex(v)==false){
            Vertex<T,N> temp = head;
            Vertex<T,N> newVertex = new Vertex<>(v, null);
            if(head==null)
                head = newVertex;
            else{
                Vertex<T,N> previous = head;
                while(temp != null){
                    previous = temp;
                    temp = temp.nextVertex;
                }
                previous.nextVertex = newVertex;
            }
            size++;
            return true;
        }
        else
            return false;
    }
    
    public int getIndex(T v){
        Vertex<T,N> temp = head;
        int pos=0;
        while(temp != null){
            if(temp.vertexInfo.compareTo(v) == 0)
                return pos;
            temp = temp.nextVertex;
            pos++;
        }
        return -1;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public ArrayList<T> getAllVertexObjects(){
        ArrayList<T> list = new ArrayList<>();
        Vertex<T,N> temp = head;
        while(temp != null){
            list.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return list;
    }
    
    public T getVertex(int pos){
        if(pos>size-1 || pos<0)
            return null;
        Vertex<T,N> temp = head;
        for(int i=0; i<pos; i++){
            temp = temp.nextVertex;
        }
        return temp.vertexInfo;
    }
    
    public boolean hasEdge(T source, T destination){
        if(head==null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while(sourceVertex!=null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                while(currentEdge != null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return true;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    public boolean addEdge(T source, T destination, N w){
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
                        Edge<T,N> newEdge = new Edge<>(destinationVertex, w, currentEdge);
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
    
    public N getEdgeWeight(T source, T destination){
        N notFound = null;
        if(head==null)
            return notFound;
        if(!hasVertex(source) || !hasVertex(destination))
            return notFound;
        Vertex<T,N> sourceVertex = head;
        while(sourceVertex != null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                while(currentEdge!=null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        return currentEdge.weight;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return notFound;
    }
    
    public ArrayList<T> getNeighbours(T v){
        if(!hasVertex(v))
            return null;
        ArrayList<T> list = new ArrayList<>();
        Vertex<T,N> temp = head;
        while(temp != null){
            if(temp.vertexInfo.compareTo(v)==0){
                Edge<T,N> currentEdge = temp.firstEdge;
                while(currentEdge != null){
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return list;
    }
    
    public void printEdges(){
        Vertex<T,N> temp = head;
        while(temp != null){
            System.out.println("# " + temp.vertexInfo + ": ");
            Edge<T,N> currentEdge = temp.firstEdge;
            while(currentEdge != null){
                System.out.println("[" + temp.vertexInfo + ","
                + currentEdge.toVertex.vertexInfo + "]");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            temp = temp.nextVertex;
        }
    }
    
    //Q1
    public boolean addUndirectedEdge(T source, T destination, N w){
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
                        Edge<T,N> sourceNewEdge = new Edge<>(destinationVertex, w, sourceCurrentEdge);
                        sourceVertex.firstEdge = sourceNewEdge;
                        Edge<T,N> destinationCurrentEdge = destinationVertex.firstEdge;
                        Edge<T,N> destinationNewEdge = new Edge<>(sourceVertex, w, destinationCurrentEdge);
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
    
    //Q2
    public boolean removeEdge(T source, T destination){
        if(head == null)
            return false;
        if(!hasVertex(source) || !hasVertex(destination))
            return false;
        Vertex<T,N> sourceVertex = head;
        while(sourceVertex != null){
            if(sourceVertex.vertexInfo.compareTo(source)==0){
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                while(currentEdge.nextEdge != null){
                    //if nextEdge.vertexInfo == destination, break the loop
                    //so currentEdge stop before the edge want to be delete
                    if(currentEdge.nextEdge.toVertex.vertexInfo.compareTo(destination)==0)
                        break;
                    currentEdge = currentEdge.nextEdge;
                }
                //now currentEdge.next = destination
                currentEdge.nextEdge = currentEdge.nextEdge.nextEdge;   //currentEdge.next been removed
                return true;
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
}

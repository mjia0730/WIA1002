/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T04;

/**
 *
 * @author USER
 */
public class Q01 {
    /*
    a) Assume that a node class called Node<E> exist. Create two nodes called node1 and
    node2. Node1 contains alphabet ‘a’ and node2 contains alphabet ‘z’. Also, create 2
    references, head and tail. Let head points to node 1 and tail points to node 2.
        Node<Character> node1 = new Node<>('a');
        Node<Character> node2 = new Node<>('z');
        Node<Character> head = node1;
        Node<Character> tail = node2;
    b) Draw the nodes from (a).
        head-->firstNode  ---> node1        --->   node2        --->   lastNode <-- tail
            ************* | *************   |   *************   |   *************
            * element   * | * element   *   |   * element   *   |   * element   *
            * next      *-- * next      * --    * next      * --    * next      *
            *************   *************       *************       *************
    c) Write a statement/code for node1 accessing the node2. Modify 1(b) to show this.
        head.next = node2;
    d) Create a new node, firstNode. Add this new node at the first location of all existing
    nodes. Draw these nodes.
        Node<Character> firstNode = new Node<>('f');
    e) If we have no information about the status of a linked-list, what are the conditions we
    need to consider to perform the operation in (d)?
        We have to consider that whether the linked-list is empty or not
    f) Write a list of operations/steps/pseudocode needed to add the firstNode to the first
    location.
        firstNode.next = head;
        head = firstNode;
        increase size of linked-list by 1
        if (tail==null)
            tail = head
    g) Write codes to assign the firstNode to the first location.
        firstNode.next = head; 
        head = firstNode; 
        size++; 
        if (tail == null)
            tail = head;
    h) Repeat (d) – (f), for the following operations :
    i. addLast() – value of element, c
        //(d)
        Node<Character> lastNode = new Node<>('c');
        //(e)
        We have to consider that whether the linked-list is empty or not
        //(f)
        if(tail == null)
            head = tail = lastNode;
        else
            tail.next = lastNode;
            tail = lastNode;
        increase the size of linked-list by 1
    ii. add(int index, E e) – value of element, d
        //(d)
        Node<Character> newNode = new Node<>('d');
        //(e)
        We have to consider that whether the index is equal to 0 or equal or larger to the size of linked-list or
        or between 0 and the size of linked-list
        //(f)
        if(index==0)
            addFirst(newNode)
        else if(index>=size)
            addLast(newNode)
        else
            Node<E> current = head;
            for(int i=1; i<index; i++){
                current = current.next
            Node<E> temp = current.next
            current.next = newNode
            current.next.next = temp
        increase the size of linked-list by 1
    iii. removeFirst()
        //(d)
        //(e)
        We have to consider that whether the linked-list is empty or not. If empty, return null
        //(f)
        if(head == null)
            return null;
        else
            Node<E> temp = head
            head = head.next
            if(head==null)
                tail = null
        decrease the size of linked-list by 1
    iv. removeLast()
        //(d)
        //(e)
        We have to consider that whether the linked-list is empty or the linkedt-list only hace one node. 
        If empty, return null.
        //(f)
        if(tail == null)
            return null;
        else if(head==tail)
            head=tail=null
            size=0
        else
            Node<E> current = head
            for(int i=0; i<size-2; i++){
                current = current.next
            }
            tail = current
            tail.next - null
            decrease the size of linked-list by 1
    v. remove(int index) – remove at index 1
        //(d)
        //(e)
        We have to consider that whether the linked-list is in range or equal to 0 or greater or equal to the size 
        of the linked-list
        //(f)
        if(index==0)
            removeFirst(node);
        else if (index>= size)
            removeLast(node);
        else
            Node<E> current = head;
            for(int i=0; i<index-1; i++){
                current = current.next
            }
            Node<E> removed = current.next
            current.next = removed.next
            decrease the size of linked-list by 1
    */
}

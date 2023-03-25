/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

/**
 *
 * @author leste
 */
public class ListKeywordOBJ {
    private NodeKeywordOBJ head;
    private int length;

    public ListKeywordOBJ() {
        this.head = null;
        this.length = 0;    
    }

    public void setHead(NodeKeywordOBJ head) {
        this.head = head;
    }

    public NodeKeywordOBJ getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }
    
    
    public void insertEnd(NodeKeywordOBJ element) {
        NodeKeywordOBJ node = element;
        if (isEmpty()) {
            setHead(node);
        } else {
            NodeKeywordOBJ pointer = getHead();
            while (pointer.getNext() != null) {
               pointer = pointer.getNext();
            }
        pointer.setNext(node);
        }
        length++;
        }
        
    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void printList() {
        NodeKeywordOBJ pointer = getHead();
        if (isEmpty()) {
            System.out.println("La lista esta vacia");} else {
        while (pointer.getNext() != null) {
            System.out.println(pointer.getElement());
            pointer = pointer.getNext();
        }
        System.out.println(pointer.getElement());
        }
    }
   
}


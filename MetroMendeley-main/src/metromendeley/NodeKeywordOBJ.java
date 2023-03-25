/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

/**
 *
 * @author leste
 */
public class NodeKeywordOBJ {
    private KeyWordObject element;
    private NodeKeywordOBJ next;

    public NodeKeywordOBJ(KeyWordObject element) {
        this.next = null;
        this.element = element;
    }

    /**
     * @return the element
     */
    public KeyWordObject getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(KeyWordObject element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public NodeKeywordOBJ getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodeKeywordOBJ next) {
        this.next = next;
    } 
}

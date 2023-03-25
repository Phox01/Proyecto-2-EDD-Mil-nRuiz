/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metromendeley;

/**
 *
 * @author leste
 */
public class NodeObject {
    private infoObject element;
    private NodeObject next;

    public NodeObject(infoObject element) {
        this.next = null;
        this.element = element;
    }

    /**
     * @return the element
     */
    public infoObject getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(infoObject element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public NodeObject getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodeObject next) {
        this.next = next;
    } 
}

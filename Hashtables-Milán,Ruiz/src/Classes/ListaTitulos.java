/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author enriq
 */
public class ListaTitulos {

    private NodoTitulos primero;

    private int size;

    public ListaTitulos() {
        this.primero = null;

        this.size = 0;
    }

    public NodoTitulos getPrimero() {
        return primero;
    }

    public void setPrimero(NodoTitulos primero) {
        this.primero = primero;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public void InsertarPrimero(String info) {

        NodoTitulos node = new NodoTitulos(info);

        if (isEmpty()) {
            primero = node;

        } else {
            node.setSiguiente(primero);
            setPrimero(node);
        }

        size++;

    }

    public boolean buscarNodo(String dato) {

        NodoTitulos node = new NodoTitulos(dato);
        NodoTitulos pointer = getPrimero();
        while (pointer.getDato() != node.getDato() && null != pointer.getSiguiente()) {

            pointer = pointer.getSiguiente();
        }

        if (pointer.getDato() == node.getDato()) {

            return true;

        } else {
            return false;
        }
    }

    public void Imprimir() {
        NodoTitulos pointer = getPrimero();
        while (pointer != null) {

            System.out.println(pointer.getDato());
            pointer = pointer.getSiguiente();
        }

    }

}

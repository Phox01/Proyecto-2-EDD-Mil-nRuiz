/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author enriq
 */
public class ListaPalabrasClave {

    private NodoPalabrasClave primero;

    private int size;

    public ListaPalabrasClave() {
        this.primero = null;

        this.size = 0;
    }

    public NodoPalabrasClave getPrimero() {
        return primero;
    }

    public void setPrimero(NodoPalabrasClave primero) {
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

        boolean buleano = buscarNodo(info);

        NodoPalabrasClave node = new NodoPalabrasClave(info);

        if (isEmpty()) {
            primero = node;

        } else if (buscarNodo(info) == false) {
            node.setSiguiente(primero);
            setPrimero(node);
        }

        size++;

    }

    public boolean buscarNodo(String dato) {

        if (isEmpty()) {
            return false;
        } else {
            NodoPalabrasClave node = new NodoPalabrasClave(dato);
            NodoPalabrasClave pointer = getPrimero();
            while (pointer.getDato() != node.getDato() && null != pointer.getSiguiente()) {

                pointer = pointer.getSiguiente();
            }

            if (pointer.getDato() == node.getDato()) {

                return true;

            }
        }
        return false;

    }

    public void Imprimir() {
        NodoPalabrasClave pointer = getPrimero();
        while (pointer != null) {

            System.out.println(pointer.getDato());
            pointer = pointer.getSiguiente();
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author enriq
 */
public class NodoAutores {
        private NodoAutores siguiente;
    private String dato;
    
    public NodoAutores (String dato){
    this.dato= dato;
    this.siguiente= null;   
}  

    public NodoAutores getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAutores siguiente) {
        this.siguiente = siguiente;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

}

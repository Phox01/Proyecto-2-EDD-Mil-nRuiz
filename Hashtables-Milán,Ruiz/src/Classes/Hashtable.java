/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Hashtable {

    private Resumen[] array;
    private int size;
    private int elements;


    public Hashtable() {
        this.array = new Resumen[8009];
        this.size = 8009;
        this.elements=0;
    }

    public Resumen[] getArray() {
        return array;
    }

    public void setArray(Resumen[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int NumeroHashtable(String res) {//String titulo){

        int numero = 0;

        String titulo = res;
        for (int i = 0; i < titulo.length(); i++) {
            int contador = 0;

            contador = titulo.codePointAt(i);

            numero = numero + (contador * i);

        }

        numero = numero % 8009;

        return numero;
    }
    
    public void introduceInHashtable(Resumen resumen) {

        int numero = NumeroHashtable(resumen.getTitle());
        getArray()[numero] = resumen;
        elements++;

    }

    /**
     * @return the elements
     */
    public int getElements() {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(int elements) {
        this.elements = elements;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metromendeley;

import javax.swing.JOptionPane;


/**
 *
 * @author leste
 */

public class HashTable1 {
    Nodo tabla[];  //array de nodos
    int size; //número (se tomó 1000)
    
    public HashTable1(int size){
        this.size = size; 
        this.tabla = new Nodo[size]; 
        for (int i = 0; i < size; i++) {
            this.tabla[i] = null; 
        }
    }
    
    /**
     * 
     * @param title [String]: va a hacer las funciones
     *          de clave del objeto guardado en la tabla. 
     * 
     * @return index [int]: índice del objeto en el arreglo de nodos
     *          para la HashTable; es la posición del elemento en
     *          ese array. 
     */
    public int hashing(String title){
        
        int valor = 0;  
        //valor de la clave (nombre del animal) en 
        //código ASCII a ser modificado.
        
        int posicion = 1; 
        
        for (int i = 0; i < title.length(); i++) {
            
            
            if (title.codePointAt(i) == 32){
                valor += 0; 
                //En este caso no se suma nada, porque el código 
                //ASCII 32 hace referencia a un espacio (" "). 
                
            } else if (title.codePointAt(i) >= 48 && title.codePointAt(i) <= 57){
                valor += ((title.codePointAt(i) - 47) * posicion);
                
            } else if (title.codePointAt(i) >= 65 && title.codePointAt(i)<= 90){
                valor += ((title.codePointAt(i) - 54) * posicion);
                
            } else if (title.codePointAt(i) >= 97 && title.codePointAt(i) <= 122){
                valor += ((title.codePointAt(i) - 60) * posicion);
                
            }
            posicion++; 
        }
        
        
        int index = valor % size;
        /**
         * Index se refiere al índice del array del elemento.
         * De esta manera adaptamos el valor del nombre de la investigacion 
         * según código ASCII al tamaño de la tabla. 
         */
        return index; 
    }
    
    public void insertar(infoObject summary){
        int posicion = hashing(summary.getTitle()); 
        boolean existe = false; 
        if (this.tabla[posicion] != null){ 
            // si la posicion no está vacía, recorro los elementos
            //enlistados en esa misma posición. 
            
            Nodo temp = this.tabla[posicion];
            
            if (temp.getData().getTitle().equals(summary.getTitle())){
                existe = true; 
                JOptionPane.showMessageDialog(null, "Ya existe el elemento. No se agrega.");
                
            }
            
            while (temp.getNext() != null){
                temp = temp.getNext(); 
                if (temp.getData().equals(summary)){
                    existe = true;
                    JOptionPane.showMessageDialog(null, "Ya existe el elemento. No se agrega.");
                }
            }
            
            //aquí se agrega el nodo si y sólo si 
            //no se encuentra en la tabla anteriormente
            
            if (!existe){
                Nodo nuevo = new Nodo(summary); 
                temp.setNext(nuevo); 
//                System.out.println("    Añadimos: " + summary);
//                System.out.println("        En posición: " + posicion);
            }
            
        } else {
            Nodo nuevo = new Nodo(summary); 
            this.tabla[posicion] = nuevo;  
//            System.out.println("    Añadimos: " + summary);
//            System.out.println("        En posición: " + posicion);
        }
        
    }
    
    public Nodo buscar(infoObject summary){
        boolean existe = false; 
        int posicion = hashing(summary.getTitle()); 
        
        if (this.tabla[posicion] == null){
            return null;
        }
        
        Nodo temp = this.tabla[posicion];
        
        if (temp.getData().equals(summary)){
            existe = true; 
        }
            
//        } else {
//            while (temp.getNext() != null && !existe){
//                if (temp.getData().equals(summary)){
//                    existe = true; 
//                } else {
//                    temp = temp.getNext(); 
//                }
//            }
//        }
        
        if (existe){
            return temp; 
        } else {
            return null; 
        }
    }
    
    public boolean buscar2(infoObject summary){
        boolean existe = false; 
        int posicion = hashing(summary.getTitle()); 
        
        if (this.tabla[posicion] == null){
            return false;
        }
        
        Nodo temp = this.tabla[posicion];
        
        if (temp.getData().getTitle().equals(summary.getTitle())){
            existe = true; 
        } else {
            while (temp.getNext() != null && !existe){
                if (temp.getData().getTitle().equals(summary.getTitle())){
                    existe = true; 
                } else {
                    temp = temp.getNext(); 
                }
            }
        }
        return existe;
    }     
    
    public infoObject buscarObjeto(String title){ 
        int posicion = hashing(title); 
        if (this.tabla[posicion] == null){
            return null;
        }
        Nodo temp = this.tabla[posicion];
        
        return temp.getData();
    }   
    
    public void vaciar(){
        for (int i = 0; i < size; i++) {
            this.tabla[i] = null; 
        }
    }
    
    public void insertarClave(KeyWordObject elemento){
//            Inserta objeto de palabra clave con titulo para busqueda por palabra clave 01

        
    } 
}
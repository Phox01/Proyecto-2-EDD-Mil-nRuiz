/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author enriq
 */
public class HashTableTitulosAutores {
        private ListaTitulos[] array;
    
    private int size;

    public HashTableTitulosAutores() {
        this.array = new ListaTitulos[8009];
        this.size = 0;
    }

    public ListaTitulos[] getArray() {
        return array;
    }

    public void setArray(ListaTitulos[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    
        public int NumeroHashtableTituloAutores(String res){//String titulo){
        
          int numero =0;  
        
       String titulo= res;
    for (int i=0; i < titulo.length(); i++){
        int contador = 0;
        
        contador = titulo.codePointAt(i); 
        
        numero=numero + (contador*i);
       
    }
    
        numero=numero%8009;
        
        return numero;
    }
}

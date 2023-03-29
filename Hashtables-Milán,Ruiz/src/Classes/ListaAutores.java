/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author enriq
 */
public class ListaAutores {
      private NodoAutores primero;
    
    private int size;

    public ListaAutores() {
        this.primero = null;
        
        this.size=0;
    }

    public NodoAutores getPrimero() {
        return primero;
    }

    public void setPrimero(NodoAutores primero) {
        this.primero = primero;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
     public boolean isEmpty(){
        return primero==null;
    }
    
    
      public void InsertarPrimero(String info){
            
        
        
        
           if (buscarNodo(info)==false){ 
        NodoAutores node= new NodoAutores(info );
        
        if (isEmpty()){
            primero= node;
            
        }else  {
            node.setSiguiente(primero);
            setPrimero(node);
        }
        
        size++;
           }
        
    }
    
    
         public boolean buscarNodo(String dato){
             
             
             if (!isEmpty()){
         
         NodoAutores node= new NodoAutores(dato);
         NodoAutores pointer= getPrimero();
         while(null!=pointer.getSiguiente() && !pointer.getDato().equals(node.getDato()) ){
         
             
             pointer=pointer.getSiguiente();
         }
      
         if (pointer.getDato().equals(node.getDato())){
             
             
                 
                 return true;
                 
             }
         }
             return false;
     }
    
    
         public void Imprimir(){
         NodoAutores pointer= getPrimero();
         while(pointer!=null){
             
             System.out.println(pointer.getDato());
             pointer=pointer.getSiguiente();
         }
        
         }
    
    
    
      
}

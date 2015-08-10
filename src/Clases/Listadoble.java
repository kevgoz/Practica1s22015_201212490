/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gamusa
 */
public class Listadoble {
    
    private Nododoble cabecera;
    private Nododoble aux;
    
    public Listadoble()
    {
        this.cabecera = null;
    }
    
    public boolean esVacia()
    {
        return (cabecera == null);
    }
    
    public void insertarCabecera(String img, String nombre){
       Nododoble nuevo=new Nododoble(img,nombre);
        if(esVacia()){
            cabecera = nuevo;
        }
    }
    
     public void insertarInicio(String img, String nombre){
        Nododoble nuevo = new Nododoble(img, nombre);
        if(! esVacia()){
            nuevo.siguiente=cabecera;
            cabecera.anterior = nuevo;
            cabecera = nuevo;
            
        }
    }
     
     public void insertarFinal(String img, String nombre){
        Nododoble nuevo = new Nododoble(img, nombre);
        Nododoble aux = cabecera;
        if(esVacia())
            insertarCabecera(img,nombre);
        
        else{
            while(aux.siguiente != null){
                aux= aux.siguiente;
            }
            aux.siguiente=nuevo;
            nuevo.anterior=aux;
        }
    }
     
      public int size(){
        int contador =0;
        Nododoble aux = cabecera;
        if(! esVacia()){
             
        while( aux != null){
            aux = aux.siguiente ;
            contador ++;
        }
        }
        return contador;
    }
      
      public void print(){
        
       
       Nododoble aux = cabecera;
        if(! esVacia()){
            while (aux != null){
                System.out.println("["+aux.img+"]"+ "/["+aux.nombre+"]"+"-->" );
                aux=aux.siguiente;
            }
        
        }else{
            System.out.println("La lista esta vacia");
        }
        
        
    }
    
    
}

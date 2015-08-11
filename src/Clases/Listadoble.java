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
    
    public Nododoble cabecera;
    public Nododoble aux;
    
    public Listadoble()
    {
        this.cabecera = null;
    }
    
    public boolean esVacia()
    {
        return (cabecera == null);
    }
    
    ////////EN USOOOOO ////////////////
    public void insertarCabecera(String img, String nombre,String tipo){
       Nododoble nuevo=new Nododoble(img,nombre, tipo);
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
     
     ////////EN USOOOOO ////////////////
     public void insertarFinal(String img, String nombre,String tipo){
        Nododoble nuevo = new Nododoble(img, nombre,tipo);
        Nododoble aux = cabecera;
        if(esVacia())
            insertarCabecera(img,nombre,tipo);
        
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
                System.out.print("["+aux.img+"_"+aux.nombre+"_"+aux.getTipo()+"]"+"-->" );
                aux=aux.siguiente;
                
        
              
                
            }
        
        }else{
            System.out.println("La lista esta vacia");
        }
        
        
    }
    
    
}

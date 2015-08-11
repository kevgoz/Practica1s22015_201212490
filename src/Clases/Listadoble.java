/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileWriter;

/**
 *
 * @author Gamusa
 */
public class Listadoble {
    
    public Nododoble cabecera;
    public Nododoble aux;
    public String stringnodos;
    
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
      
       public void generararchivo1(){
    
     FileWriter fichero = null;
    stringnodos="";
  
        try
        {
           String f = "C:\\Users\\Gamusa\\Desktop\\archivo.txt";
           stringnodos = stringnodos + "digraph  G { rankdir=LR node [shape=box, color=blue] \n";
            
            /////////////////
            Nododoble aux=cabecera;
            while(aux!=null){
            
                if(aux.siguiente== null){
                stringnodos = stringnodos + aux.getNombre()+"_" +aux.getTipo() +";" + "\n" ;
                    System.out.println("aux es nulo");
                }
                else{
                
                stringnodos = stringnodos + aux.getNombre()+"_"+aux.getTipo()+ "->" + "\n" ;
                    System.out.println("aux no es nullo");
                }
                
                aux=aux.siguiente;
            }//////////////////
           
            stringnodos = stringnodos + " \n }"; 
            
            fichero = new FileWriter(f);
            fichero.write(stringnodos);
            fichero.close();
            
            //metodos
            System.out.println("entro al metodo generargrafica");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        
    
    
    }
    
   public void generarimagen1(){
   
   
   try {

       
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String fileInputPath = "C:\\Users\\Gamusa\\Desktop\\archivo.txt";
        String fileOutputPath = "C:\\Users\\Gamusa\\Desktop\\imagenprueba1.jpg";
        String tParam = "-Tjpg";
        String tOParam = "-o";
        
        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = fileInputPath;
        cmd[3] = tOParam;
        cmd[4] = fileOutputPath;
        
        Runtime rt = Runtime.getRuntime();
        
        rt.exec( cmd );
            System.out.println("genero la imagen correctamente");
        } catch (Exception ex) {
        ex.printStackTrace();
        }  finally {
        }
   
   
   }
    
    
}

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
public class Nododoble {
    
    Nododoble siguiente;
    Nododoble anterior;
    
    String img;
    String nombre;
    int cantidad;
    public Nododoble(String imagen, String nombre)
    {
    
        this.siguiente = null;
        this.anterior = null;
        this.img = imagen;
        this.nombre = nombre;
        
    }
    
 /*
    public Nododoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nododoble siguiente) {
        this.siguiente = siguiente;
    }

    public Nododoble getAnterior() {
        return anterior;
    }

    public void setAnterior(Nododoble anterior) {
        this.anterior = anterior;
    }
    */

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
        
    
}

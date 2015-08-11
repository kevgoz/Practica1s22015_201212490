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
public class Objetos {
    
    String img;
    String nombre;
    String tipo;
    
     public Objetos(String imagen, String nom,String tipo) {
        this.img = imagen;
         this.nombre = nom;
        this.tipo = tipo;
          
    }
     
     public Objetos ()
     {
     
     
     }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

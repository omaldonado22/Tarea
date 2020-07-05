/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p2.objeto;

/**
 *
 * @author DELL
 */
public abstract class ISV implements IISV {
        protected int id;
    protected String Nombre;

    public ISV() {
    }

    public ISV(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }
    
    
//    IMPLEMENTS para extender una interfaz

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}

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
public class ISV15 extends ISV {

    public ISV15(int id,String Nombre) {
        super(id, Nombre);
    }
       static final double valor = 0.15;
    @Override
    public double Calcular(double monto) {
          return monto = valor;
    }

    
}

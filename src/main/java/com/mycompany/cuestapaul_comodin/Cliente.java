/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestapaul_comodin;

/**
 *
 * @author paulc
 */
public class Cliente extends Persona {
    
    public Cliente(String nombre) {
        super(nombre);
    }
    
     @Override
    public String toString() {
        return "Cliente=" + super.toString();
    }
 
}

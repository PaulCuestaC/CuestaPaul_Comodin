/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuestapaul_comodin;

/**
 *
 * @author paulc
 */
public class CuestaPaul_Comodin {

    public static void main(String[] args) {
        ListaGenerica<Number> listaNum = new ListaGenerica<>(); //Prueba 1
        ListaGenerica<Persona> listaPer = new ListaGenerica<>(); //Prueba 2
        
        //Prueba 1
        listaNum.add(13);
        listaNum.add(13.36);
        
        System.out.println("Prueba 1");
        System.out.println("Dato en 0: " + listaNum.get(0));
        System.out.println("Dato en 1: " + listaNum.get(1));
        System.out.println("Se encuentra el 13? " + listaNum.contains(13));
        System.out.println("La lista esta vacia? " + listaNum.isEmpty());
        //Eliminar un dato
        listaNum.remove(13);
        //Comprobacion
        System.out.println("Existe el 13 ? " + listaNum.contains(13));
        System.out.println("La lista esta vacia ? " + listaNum.isEmpty());
        
        //Prueba 2
        Cliente cliente = new Cliente("Cliente Promedio");
        Trabajador trabajador = new Trabajador("Trabajador Promedio");
        listaPer.add(cliente);
        listaPer.add(trabajador);
        System.out.println("Prueba 2");
        System.out.println("Dato en 0: " + listaPer.get(0));
        System.out.println("Dato en 1: " + listaPer.get(1));
        System.out.println("Se encuentra el Cliente? " + listaPer.contains(cliente));
        System.out.println("La lista esta vacia? " + listaPer.isEmpty());
        //Eliminar un dato
        listaPer.remove(trabajador);
        //Comprobacion
        System.out.println("Existe el trabajador? " + listaPer.contains(trabajador));
        System.out.println("La lista esta vacia?" + listaPer.isEmpty());
        
        
    }
}

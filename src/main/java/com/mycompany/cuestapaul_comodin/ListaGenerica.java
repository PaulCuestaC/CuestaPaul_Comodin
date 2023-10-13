/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestapaul_comodin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulc
 */
public class ListaGenerica<T> {

    private List<? super T> lista;

    public ListaGenerica() {
        lista = new ArrayList<>();
    }

    public void add(T dato){
        lista.add(dato);
    }
    
    public T get(int posicion){
        return (T) lista.get(posicion);
    }
    public boolean contains(Object dato){
        return lista.contains(dato);
    }
    public boolean isEmpty(){
        return lista.isEmpty();
    }
    public void remove(T dato){
        lista.remove(dato);
        
    }
    public int size(){
        return lista.size();
    }
     @Override
    public String toString() {
        return lista.toString();
    }
}

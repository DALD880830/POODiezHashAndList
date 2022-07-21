package com.alopez.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {

    public static void main(String[] args) {

        String [] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atún", "Corvina","Lenguado"}; //Arreglo de String, utilizando llaves

        Set<String> unicos = new HashSet<>(); //Creamos un HashSet
        for (String pez: peces){ //Usamos un for para agregar elementos, arreglo de tipo String del arreglo peces
            if (!unicos.add(pez)){ //el metodo add retorna un boolean, si no se registra el pez que adherimos
                System.out.println("Elemento duplicado: " + pez); //Imprimimos el nombre del pez duplicado
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos); //Imprimimos la lista de peces
    }

}
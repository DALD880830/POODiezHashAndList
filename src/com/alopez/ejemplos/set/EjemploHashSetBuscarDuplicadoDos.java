package com.alopez.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicadoDos {

    public static void main(String[] args) {

        String [] peces = {"Corvina","Lenguado","Pejerrey","Robalo","Atún", "Corvina","Lenguado"}; //Arreglo de String, utilizando llaves

        Set<String> unicos = new HashSet<>(); //Creamos un HashSet
        Set<String> duplicados = new HashSet<>();
        for (String pez: peces){ //Usamos un for para agregar elementos, arreglo de tipo String del arreglo peces
            if (!unicos.add(pez)){ //el metodo add retorna un boolean, si no se registra el pez que adherimos
                duplicados.add(pez); //El elemento duplicado lo pasamos a Set duplicados
            }
        }
        unicos.removeAll(duplicados); //Borramos los elementos que estan duplicados
        System.out.println(unicos.size() + " elementos no duplicados: " + unicos); //Imprimimos la lista de peces
        System.out.println();
        System.out.println(duplicados.size() + " elementos duplicados: " + duplicados);
    }

}
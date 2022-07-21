package com.alopez.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>(); //Para crear la instancia utilizamos la interfaz, el tipo <String> , variable hs
        hs.add("uno"); //Agregamos elementos, el padre en comun es Collection, entonces cuenta con metodos similares
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs); //Imprimimos el hashset, al imprimir no cuenta con un ordenamiento

        boolean b = hs.add("tres"); //Adherimos un nuevo elemento, el cual es repetido, y lo pasamos a b para determinar si es false o true
        System.out.println("No permite elementos duplicados" + b); //Imprimimos b, que retorna false, ya que HashSet no permite elementos repetidos
        System.out.println(hs);

    }

}
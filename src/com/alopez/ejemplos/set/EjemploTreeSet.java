package com.alopez.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        Set<String> ascendente = new TreeSet<>(); //Creamos un TreeSet
        ascendente.add("uno"); //Adherimos elementos al TreeSet
        ascendente.add("dos");
        ascendente.add("tres");
        ascendente.add("tres");
        ascendente.add("cuatro");
        ascendente.add("cinco");

        System.out.println("ascendente = " + ascendente); //No acepta elementos duplicados y los ordena alfabeticamente a -> z
        System.out.println();

//        Set<String> descendente = new TreeSet<>((a, b) -> { //Creamos un TreeSet, esta es una forma
//            return b.compareTo(a); });

        Set<String> descendente = new TreeSet<>(Comparator.reverseOrder());//Creamos un TreeSet, esta es otra forma, pero es lo mismo que la anterior

        descendente.add("uno"); //Adherimos elementos al TreeSet
        descendente.add("dos");
        descendente.add("tres");
        descendente.add("tres");
        descendente.add("cuatro");
        descendente.add("cinco");

        System.out.println("descendente = " + descendente); //No admite repetidos y ordena de la z -> a con el reverseOrder
        System.out.println();

        Set<Integer> numeros = new TreeSet<>(); //Ordena los elementos
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println("numeros = " + numeros);

    }

}

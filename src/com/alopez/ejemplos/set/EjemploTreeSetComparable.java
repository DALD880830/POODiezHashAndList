package com.alopez.ejemplos.set;

import com.alopez.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {

//        Set<Alumno> sa = new TreeSet<>(); //Creamos un TreeSet
//        Set<Alumno> sa = new TreeSet<>((a, b)-> b.getNombre().compareTo(a.getNombre())); //Esto sobreescribe al metodo
        // y obliga a comparar por nombre y ordenar por nombre de manera descendente
        //Usando Java 8
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre).reversed());
        sa.add(new Alumno("Alex", 10)); //Añanimos elementos al TreeSet
        sa.add(new Alumno("Daniel", 8));
        sa.add(new Alumno("Lopez", 9));
        sa.add(new Alumno("Delgado", 7));
        sa.add(new Alumno("Hades", 5));
        sa.add(new Alumno("Zeus", 6));
        sa.add(new Alumno("Poseidon", 6)); //A pesar de que la nota se repite, el compareTo  o Comparator
        // esta enfocado en el nombr,e Entonces cuando se repite el nombre es cuando lo toma como duplicado, si el
        // compareTo estuviera enfocado en la nota, entonces no importaría que el nombre estuviera repetido


        System.out.println(sa); //Imprimimos el TreeSet

    }

}
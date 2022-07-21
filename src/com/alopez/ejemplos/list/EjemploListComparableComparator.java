package com.alopez.ejemplos.list;

import com.alopez.ejemplos.modelo.Alumno;

import java.util.*;


public class EjemploListComparableComparator {

    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>(); //Creamos un List
        sa.add(new Alumno("Alex", 10)); //Añanimos elementos al HashSet
        sa.add(new Alumno("Daniel", 8));
        sa.add(new Alumno("Lopez", 9));
        sa.add(new Alumno("Delgado", 7));
        sa.add(new Alumno("Hades", 5));
        sa.add(new Alumno("Zeus", 6));
        sa.add(new Alumno("Zeus", 6));
        sa.add(new Alumno("Zeus", 1));

//        Collections.sort(sa); //Usamos Collections que es una clase y usamos el metodo sort
        //Esto ordenará utilizando el compareTo que tenemos en la clase Alumno, el cual ordena por nota

//        Collections.sort(sa, (a, b) -> a.getNombre().compareTo(b.getNombre())); //Para sobreescribir el compareTo, usamos
        //el Comparator, en TreeSet es en el constructor en ArrayList es el metodo sort

//        sa.sort((a, b) -> a.getNombre().compareTo(b.getNombre())); //Metodo sort de la lista, es igual que el de arriba

        //Utilizando Java8
//        sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
//Lista punto sort (Comparator punto comparing((expresion lambda, primero el tipo de dato y variable)argumento variable punto como queremos ordenar())punto ordenar descendente)

        sa.sort(Comparator.comparing(Alumno::getNombre).reversed()); //Reemplazamos lambda por el metodo de referencia

        System.out.println(sa); //Imprimimos el ArrayList
        System.out.println();

        System.out.println("Iterando usando Stream, el metodo forEach"); //Funciona para los Set, en los List tambien funciona pero
        // los ordena como se fueron añadiendo
//        sa.forEach(a -> System.out.println(a)); //Este es lo mismo que el de abajo
        sa.forEach(System.out::println);

    }

}
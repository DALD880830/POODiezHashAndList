package com.alopez.ejemplos.list;

import com.alopez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class EjemploArrayList {

    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>(); //Creamos un List
        System.out.println(al + ", size = " + al.size()); //Tamaño de la lista antes de agregar elementos
        System.out.println("Lista vacia = " + al.isEmpty()); //Verifica si la lista está vacia
        al.add(new Alumno("Alex", 10)); //Añanimos elementos al HashSet
        al.add(new Alumno("Daniel", 8));
        al.add(new Alumno("Lopez", 9));
        al.add(new Alumno("Delgado", 7));
        al.add(2, new Alumno("Hades", 5)); //El 2 señala el indice en donde se va a introducir, esto hará que los otros objetos se desplacen
        al.set(3, new Alumno("Zeus", 6)); //Set no agraga, sino modifica, entonces borrará al que estaba en el indice 3 y colocara a este objeto en ese indice

        System.out.println(al + ", size = " + al.size()); //Tamaño de la lista despues de agregar elementos

        al.remove(new Alumno("Delgado", 7)); //Esto imprime por instancia, pero los valores deben ser identicos a los que estan en la lista
        //Utiliza el equals de la clase Alumno para buscar el objeto y eliminarlo
        al.remove(2); //Este borra el objeto de la lista a traves del indice
        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Daniel", 8)); //Contains retorna un true o false, de igual manera, busca
        //con el equals que está en Alumno, el cual verifica Nombre y Nota, entonces para usar el contains, los dos elementos deben ser
        //identicos a los contenidos en la lista
        System.out.println("Daniel está en la lista??? " + b);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }

    }
}
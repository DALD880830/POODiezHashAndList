package com.alopez.ejemplos.list;

import com.alopez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>(); //Creamos un LinkedList
        System.out.println(enlazada + ", size = " + enlazada.size()); //Tamaño de la lista antes de agregar elementos
        System.out.println("Lista vacia = " + enlazada.isEmpty()); //Verifica si la lista está vacia
        enlazada.add(new Alumno("Alex", 10)); //Añanimos elementos a la LinkedList
        enlazada.add(new Alumno("Daniel", 8));
        enlazada.add(new Alumno("Lopez", 9));
        enlazada.add(new Alumno("Delgado", 7));
        enlazada.add(new Alumno("Hades", 5));
        enlazada.add(new Alumno("Zeus", 6));

        System.out.println(enlazada + ", size = " + enlazada.size()); //Tamaño de la lista despues de agregar elementos

        enlazada.addFirst(new Alumno("Poseidon", 0)); //addFirst agrega el elemento al principio de la lista
        enlazada.addLast(new Alumno("Atena", 4)); //addLast  agrega el elemento al final de la lista

        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primer elemento: " + enlazada.getFirst() + //getFirst() Obtiene el primer elemento
                "\nUltimo elemento: " + enlazada.getLast()); //getLast() Obtiene el ultimo elemento
        System.out.println("Elemento en la posicion 3: "+ enlazada.get(3)); //Obtenemos el elemento que está en el indice 3
        //get Lanza una excepcion si no encuentra el elemento, peek no lanza la excepcion, este muesta null porque no hay elemento
        System.out.println("Usando peek: " + enlazada.peekLast());

        Alumno poseidon = enlazada.removeFirst(); //removeFirst() remueve el elemento y lo guarda, si no encuentra el elemento
        // lanza una excepcion, pero se puede usar pollFirst, este retorna null si la lista esta vacia
        enlazada.removeLast(); //ademas de remove, tambien se puede usar pop, ya que los metodos son equivalentes

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.remove(5); //Si no se le pone indice, borra el primero, con el indice borra el elemento en esa posicion
        enlazada.remove(new Alumno("Hades", 5)); //De esta forma borramos el elementop, pero debe coincidir porque usa el equals
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Odin", 2); //Creamos un nuevo elemento
        enlazada.addLast(a); //Agregamos a odin en el ultimo elemento
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Odin: " + enlazada.indexOf(a)); //con indexOf obtenemos el numero de indice en el que esta el elemento

        enlazada.set(2, new Alumno("Chino", 20)); //Con set reemplazamos ub elemento, colocando el indice y cual sera el nuevo elemento
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println();
        ListIterator<Alumno> listIterator = enlazada.listIterator(); //En vez de utilizar iterator usamos ListIterator
        while (listIterator.hasNext()){ //Existe hasNext() y hasPrevious(), para usar este segundo se debe avanzar una posicion
            Alumno alumno = listIterator.next(); //Se mueve el cursor y se obtiene el elemento
            System.out.println(alumno); //Imprimimos el elemento
        }

        System.out.println();

        while (listIterator.hasPrevious()) { //Este es el contrario al anterior, solo que ya podemos usar previous porque
            Alumno alumno = listIterator.previous(); //con el while anterior ya nos encontramos al final de la lista
            System.out.println(alumno);
        }
    }
}

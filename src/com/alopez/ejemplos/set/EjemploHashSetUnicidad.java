package com.alopez.ejemplos.set;

import com.alopez.ejemplos.modelo.Alumno;

import java.util.*;


public class EjemploHashSetUnicidad {

    public static void main(String[] args) {

//        Set<Alumno> sa = new HashSet<>(); //Creamos un HashSet
        List<Alumno> sa = new ArrayList<>(); //Cambiamos el Set por un List
        sa.add(new Alumno("Alex", 10)); //Añanimos elementos al HashSet
        sa.add(new Alumno("Daniel", 8));
        sa.add(new Alumno("Lopez", 9));
        sa.add(new Alumno("Delgado", 7));
        sa.add(new Alumno("Hades", 5));
        sa.add(new Alumno("Zeus", 6)); //El hashset permite que esten repetidos y los coloca en la lista, pero
        //esto es debido a que no son la misma instancia(no son el mismo objeto)
        sa.add(new Alumno("Zeus", 6)); //Al utilizar el metodo equals() and hashCodes() ya no permite que
        //este se repita, por la situación de que ya compara los atributos y ambos son llave, el nombre junto con la nota
        sa.add(new Alumno("Zeus", 1)); //Sin embargo, como los dos deben ser llaves y solo uno es el que se repite,
        //entonces los objetos ya no son iguales, esto es debido a como este implementado el hashCode() y en el equals()

        System.out.println(sa); //Imprimimos el HashSet
        System.out.println();

        //LinkedList tambien puede ser iterado por estos loops
        System.out.println("Utilizando un For"); //Este solo sirve en el List y no en el Set, porque los Set no tienen get
        for (int i = 0; i<sa.size(); i++){ //i empieza en cer; hasta el tamaño de la lista; i incrementa en 1
            Alumno a = sa.get(i); //Con el get pasamos el i, el cual se guarda en el Alumno a
            System.out.println(a); //Imprimimos a
        }

        System.out.println("Iterando usando un ForEach"); //Funciona para los Set, en los List tambien funciona pero
        // los ordena como se fueron añadiendo
        for (Alumno a : sa){
            System.out.println(a);
        }

        System.out.println("Iterando con iterator y while"); //Funciona para los Set, en los List tambien funciona pero
        // los ordena como se fueron añadiendo
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){ //Mientas it tenga un siguiente elemento
            Alumno a= it.next(); //obtenemos el elemento
            System.out.println(a);
        }

        System.out.println("Iterando usando Stream, el metodo forEach"); //Funciona para los Set, en los List tambien funciona pero
        // los ordena como se fueron añadiendo
//        sa.forEach(a -> System.out.println(a)); //Este es lo mismo que el de abajo
        sa.forEach(System.out::println);

    }

}
package com.alopez.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {

    public static void main(String[] args) {

//        Map<String, Object> persona = new TreeMap<>((a, b)-> b.compareTo(a)); //Creamos un TreeMap, el cual contiene una llave y un valor, el valor es del tipo Object
//        persona.put(null, "1234"); //La llave no puede estar en null, ya que el TreeMap ordena los elementos, no puede haber null
        //Ordenamos de manera descendente con (a, b)-> b.compareTo(a)
//        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder()); //Con Java8 usamos Comparator.reverseOrder para ordenar de manera descendente
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length)); //Comparamos por largo con Comparator.comparing(String::length)
        persona.put("nombre", "Alex"); //Para agregar elementos al Map usamos put
        persona.put("apellido", "Lopez");
        persona.put("email", "alex@alex.com");
        persona.put("edad", "33");

        Map<String, String> direccion = new TreeMap<>(); //Creamos un nuevo Map el cual se va a anidar con el otro
        direccion.put("pais", "USA"); //Agregamos elementos al segundo Map
        direccion.put("estado", "Caliornia");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion); //Asignamos direccion al primer MAP, con la llave "direccion" y el objeto map "direccion"

        System.out.println("persona = " + persona);

    }

}

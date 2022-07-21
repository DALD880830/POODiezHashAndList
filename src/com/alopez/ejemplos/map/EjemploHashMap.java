package com.alopez.ejemplos.map;

import java.util.*;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>(); //Creamos un Map, el cual contiene una llave y un valor,
        // los cuales pueden ser de cualquier tipo
        persona.put(null, "1234"); //La llave es única, no se puede repetir, si agregamos dos llaves iguales, toma el valor
        persona.put(null, "12345"); //"mas nuevo", pero si la lalve no se repite, el valor si se puede repetir
        persona.put("nombre", "Alex"); //Para agfregar elementos al Map usamos put
        persona.put("apellido", "Lopez");
        persona.put("email", "alex@alex.com");
        persona.put("edad", "33");

        System.out.println("persona = " + persona);

        String nombre = persona.get("nombre"); //Los valores se obtienen por la llave
        String apellido = persona.get("apellido");
        System.out.println(nombre + " " + apellido);

        String valorApellido = persona.remove("apellido"); //Cuando se elimina un argumento es a traves de la llave y lo retorna en un valor
        System.out.println("valor eliminado: " + valorApellido);
        System.out.println("persona = " + persona);

        boolean b = persona.containsKey("apellido"); //containsKey busca en el Map la llave para determinar si el valor existe o no
        System.out.println(b);

        boolean c = persona.containsValue("Alex"); //containsValue busca en el Map el valor para determinar si el valor existe o no
        System.out.println(c);

        Collection<String> valores = persona.values(); //Values retorna una coleccion del tipo String | No mantene el orden, no es ordenado
        for (String v: valores){ //Recorremos con un for
            System.out.println("v = " + v); //Imprimimos los valores
        }

        Set<String> llaves = persona.keySet(); //keySet obtenemos un set con los valores de las llaves | No es ordenado
        for (String llave: llaves){ //recorremos el set
            System.out.println("llave = " + llave); //imprimimos las llaves del set
        }

        for (Map.Entry<String, String> par : persona.entrySet()){ //Map.Entry Es una clase Inner que esta dentro de MAP <tipo de la llave, tipo del valor>
            //entrySet retorna un conjunto que contiene elementos del tipo Entry
            System.out.println("llave: " + par.getKey() + ", Valor: " + par.getValue());
        }

        for (String ll: persona.keySet()){ //keySet obtenemos un set con los valores de las llaves | No es ordenado
            String valor = persona.get(ll); //Con get obtenemos el valor a traves de la llave
            System.out.println("ll: " + ll + " valor: " + valor);
        }

        persona.forEach((llave, valor) -> { //For Each utilizando Java 8, con una expresion lambda
            System.out.println(llave + " y " + valor);
        });

        System.out.println(persona.size()); //Tamaño del Map
        System.out.println(persona.isEmpty()); //Verifica si el Map tiene elementos | Si esta vacio retorna true

        persona.replace("nombre", "Alejandro"); //Reemplaza un valor, pide la llave y damos el nuevo valor
        persona.replace("edad", "33", "34"); //Reemplaza un valor, de esta forma pide la llave,
        // damos el valor anterior, y otorgamos el valor nuevo  | Retorna un boolean
        System.out.println("persona = " + persona);

    }

}
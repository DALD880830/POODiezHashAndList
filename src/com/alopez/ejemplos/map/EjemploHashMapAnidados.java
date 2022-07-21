package com.alopez.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMapAnidados {

    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>(); //Creamos un Map, el cual contiene una llave y un valor, el valor es del tipo Object
        persona.put(null, "1234"); //La llave es única, no se puede repetir, si agregamos dos llaves iguales, toma el valor
        persona.put(null, "12345"); //"mas nuevo", pero si la lalve no se repite, el valor si se puede repetir
        persona.put("nombre", "Alex"); //Para agregar elementos al Map usamos put
        persona.put("apellido", "Lopez");
        persona.put("email", "alex@alex.com");
        persona.put("edad", "33");

        Map<String, String> direccion = new HashMap<>(); //Creamos un nuevo Map el cual se va a anidar con el otro
        direccion.put("pais", "USA"); //Agregamos elementos al segundo Map
        direccion.put("estado", "Caliornia");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion); //Asignamos direccion al primer MAP, con la llave "direccion" y el objeto map "direccion"


        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre"); //Los valores se obtienen por la llave | Hacemos el cast del tipo Object a persona
        String apellido = (String) persona.get("apellido"); //Hacemos el cast del tipo Object a persona
        System.out.println(nombre + " " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion"); //Para obtener los datos del segundo Map
        //Realizamos un map nuevo, en el cual le vamos a a pasar el get, que obtiene los datos de direccion, sin embargo, para
        //pasar los datos del otro map debemos hacer el cast (Map<String, String>)
        String pais = direccionPersona.get("pais"); //Con el nuevo Map, obtenemos el valor de la llave "pais" y la llave "ciudad"
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "la playa"); //getOrDefault, obtiene el valor de la llave
        //si no encuentra la llave, retorna valor que le demos
        System.out.println(pais + " " + ciudad); //Imprimimos pais, ciudad y barrio


        String valorApellido = (String) persona.remove("apellido"); //Cuando se elimina un argumento es a traves de la llave y lo retorna en un valor
        //Hacemos el cast del tipo Object a persona
        System.out.println("valor eliminado: " + valorApellido);
        System.out.println("persona = " + persona);

        boolean b = persona.containsKey("apellido"); //containsKey busca en el Map la llave para determinar si el valor existe o no
        System.out.println(b);

        boolean c = persona.containsValue("Alex"); //containsValue busca en el Map el valor para determinar si el valor existe o no
        System.out.println(c);

        Collection<Object> valores = persona.values(); //Values retorna una coleccion del tipo String | No mantene el orden, no es ordenado
        for (Object v: valores){ //Recorremos con un for
            System.out.println("v = " + v); //Imprimimos los valores
        }

        Set<String> llaves = persona.keySet(); //keySet obtenemos un set con los valores de las llaves | No es ordenado
        for (String llave: llaves){ //recorremos el set
            System.out.println("llave = " + llave); //imprimimos las llaves del set
        }

        for (Map.Entry<String, Object> par : persona.entrySet()){ //Map.Entry Es una clase Inner que esta dentro de MAP <tipo de la llave, tipo del valor>
            //entrySet retorna un conjunto que contiene elementos del tipo Entry
            Object valor = par.getValue();
            if (valor instanceof Map){ //Si valor es instancia de MAP del generico
                Map<String, String> direccionMap = (Map<String, String>) valor; //Creamos un nuevo map con un nombre distinto
                // Convertimos valor a tipo MAP con el cast (Map<String, String>)
                for (Map.Entry<String, String> parDir: direccionMap.entrySet()){ //entrySet retorna un conjunto que contiene elementos del tipo Entry
                    System.out.println(parDir.getKey() + " y " + parDir.getValue()); //getKey() obtiene la llave, getValue() Obtiene el valor
                }

                /*                System.out.println("El pais de la persona es: " + direccionMap.get("pais")); //Con get Obtenemos el valor de la llave que pasamos
                System.out.println("La ciudad de la persona es: " + direccionMap.get("ciudad"));
                System.out.println("El estado de la persona es: " + direccionMap.get("estado"));
*/            }else{
                System.out.println("llave: " + par.getKey() + ", Valor: " + valor);
            }
        }

        for (String ll: persona.keySet()){ //keySet obtenemos un set con los valores de las llaves | No es ordenado
            Object valor = persona.get(ll); //Con get obtenemos el valor a traves de la llave //Hacemos el cast del tipo Object a persona
            if (valor instanceof Map){ //Si valor es instancia de MAP del generico
                Map<String, String> direccionMap = (Map<String, String>) valor; //Creamos un nuevo map con un nombre distinto
                // Convertimos valor a tipo MAP con el cast (Map<String, String>)
                System.out.println("El pais de la persona es: " + direccionMap.get("pais")); //Con get Obtenemos el valor de la llave que pasamos
                System.out.println("La ciudad de la persona es: " + direccionMap.get("ciudad"));
                System.out.println("El estado de la persona es: " + direccionMap.get("estado"));
            }else {
                System.out.println("ll: " + ll + " valor: " + valor);
            }

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
package com.alopez.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private int nota;

    public Alumno() { //Constructor vacio
    }

    public Alumno(String nombre, int nota) { //Constructor con nombre y nota
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getter and Setter de nombre y nota
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() { //toString para imprimir el objeto
        return nombre + ": nota= " + nota;
    }

    @Override
    public int compareTo(Alumno a) { //Metodo de la Interfaz Comparable
        //Compara por nombre
    /*    if (this.nombre == null){ //Si el nombre es null se retorna 0
            return 0;
        }
        return this.nombre.compareTo(a.nombre); //Comparamos por nombre
    */
        //Compara por primitivo
        if (this.nota == a.nota){ //Si this nota es igual a la nota que se pasa por argumento, se retorna 0
            return 0;
        }
        if (this.nota > a.nota){ //Si this nota es mayor a la nota que se pasa por argumento, se retorna 1
            return 1;
        }
        return -1; //si this nota es menor a la nota que se pasa por argumento retorna -1

    }

    @Override //Clic derecho, Generate, equals() and hasCodes()
    public boolean equals(Object o) { //Comparacion con equals
        if (this == o) return true; //Primero compara si son la misma instancia
        if (o == null || getClass() != o.getClass()) return false; //Si son distintas instancias primero valida si es nulo
        Alumno alumno = (Alumno) o;
        return nota == alumno.nota && Objects.equals(nombre, alumno.nombre); //Compara por atributos
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota); //Usa tanto nombre como nota para usarlos como llave
    }
}
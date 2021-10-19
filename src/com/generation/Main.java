package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.ejercicio.Ejercicio;

public class Main {

    public static void main(String[] args) {

        Ejercicio person= new Ejercicio();
        person.setName("Santiago");
        person.setAge(33);
        person.setId("102045455");

        System.out.println( "Name: " + person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());

        /*
        CuentaBancaria cuenta =new CuentaBancaria();
        cuenta.setNombre("Victor Manuel");
        cuenta.setClave("ABC-1234");
        cuenta.setSaldo(1000000000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();
         */


        /*
        Persona persona = new Persona();
        persona.nombre = "Victor";
        persona.edad = 25;
        */

        //modificador Default no accede desde otros paquetes
        //Animal animal = new Animal();
        //animal.nombre
    }
}

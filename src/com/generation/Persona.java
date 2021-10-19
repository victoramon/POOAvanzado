package com.generation;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Persona {

    //Modificador de acceso privado nos permite acceder solo dentro de la misma clase
    private String nombre;

    private int edad;

    void saludar() {
        System.out.println("Hola");
    }
}

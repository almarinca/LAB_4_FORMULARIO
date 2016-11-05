/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Materia {
    String nombre;
    Profesor profesor;
    public static ArrayList<Materia> materias = new ArrayList<>();

    public Materia(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }
    
    
    
}

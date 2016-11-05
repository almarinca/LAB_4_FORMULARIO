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
public class Profesor {
    
    private String nombre;
    private String Apellido;
    
    public static ArrayList<Profesor> profesores; 

    public Profesor(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        
    }

    
    public String nombreCompleto() {
        return  nombre + " " + Apellido;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
    
}

package laboratorio4;

import java.util.ArrayList;

public class Estudiante {

    String nombre;
    String Apellido;
    ArrayList<String> Materia;
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Estudiante(String nombre, String Apellido, ArrayList<String> Materia) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Materia = Materia;
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + " " + Apellido + "\n"
                + "Materias: " + Materia + "\n";
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

    public ArrayList<String> getMateria() {
        return Materia;
    }

    public void setMateria(ArrayList<String> Materia) {
        this.Materia = Materia;
    }

}

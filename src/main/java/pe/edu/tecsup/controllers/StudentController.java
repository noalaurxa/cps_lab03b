package pe.edu.tecsup.controllers;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private List<String> estudiantes = new ArrayList<>();

    public StudentController() {
        // Datos iniciales de prueba
        estudiantes.add("Juan Pérez");
        estudiantes.add("María López");
    }

    public List<String> listarEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public void imprimirEstudiantes() {
        System.out.println("Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
}

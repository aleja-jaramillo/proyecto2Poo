package Registro;
import java.*;
import java.util.Scanner;

import sun.plugin2.liveconnect.JSExceptions;

public class Materia extends Registroest{

    private float nota;
    private Estudiante estudiante;

    public Materia(String nombre, Integer id, float nota, Estudiante estudiante) {
        super(nombre, id);
        this.nota = nota;
        this.estudiante = estudiante;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public void pedir() throws Excepcionstud {

        if (nota < 5.00f){
            System.out.println("Materia: " + nombre + ", id: " + id);
            System.out.println("Nota: " + nota);
            System.out.println("Estudiante: " + estudiante.getNombre() + ", identificación: " + estudiante.getId());

        }else {
            throw new Excepcionstud("La nota que ingreso no es valida");
            }
        }
    }

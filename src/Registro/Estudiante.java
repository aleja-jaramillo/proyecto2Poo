package Registro;

public class Estudiante extends Registroest{

    private Materia materia;

    public Estudiante(String nombre, Integer id, Materia materia) {
        super(nombre, id);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public void pedir() throws Excepcionstud{

        if (materia.getNota() < 5.00f){
            System.out.println("Estudiante: "+ nombre + ", Identificación: " + id);
            System.out.println("Materia: " + materia.getNombre() + ", Identificación " + materia.getId());
            System.out.println("Nota: " + materia.getNota());

        }else {
            throw new Excepcionstud("La nota que ingreso no es valida");
        }
    }
}

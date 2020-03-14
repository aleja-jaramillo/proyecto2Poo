package Registro;
import java.awt.datatransfer.SystemFlavorMap;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        Estudiante estudiante = null;
        Materia materia = null;

        Materia m1 = new Materia("Ingles", 1, 4.0f, estudiante);
        Materia m2 = new Materia("Calculo", 2, 3.8f , estudiante);

        Estudiante est1 = new Estudiante("Alejandra jaramillo", 1078639023, m1);
        Estudiante est2 = new Estudiante("Jhon Camargo", 1078639024, m2);

        System.out.println("Por favor elija una opción para averiguar");
        System.out.println("1. Estudiante");
        System.out.println("2. Materia");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("¿Que estudiante desea averiguar?");
                System.out.println("1. Alejandra Jaramillo");
                System.out.println("2. Jhon Camargo");
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("¿Que materia desea averiguar?");
                        System.out.println("1. Matematicas");
                        System.out.println("2. Sociales");

                        opc = sc.nextInt();

                        switch (opc) {

                            case 1:

                                est1.setMateria(m1);

                                break;
                            case 2:

                                est1.setMateria(m2);
                                break;

                            default:
                                System.out.println("No existe esa opcion");
                                break;

                        }

                        try {
                            est1.pedir();
                        } catch (Excepcionstud ex) {

                            System.out.println("Operacion invalida");
                            System.out.println(ex.getMessage());

                        } catch (NullPointerException ex) {
                            System.out.println("Excepcion por un valor nulo");
                        } finally {
                            System.out.println("Fin de la operacion");

                        }
                        break;

                    case 2:

                        System.out.println("¿Que materia desea averiguar?");
                        System.out.println("1. Matematicas");
                        System.out.println("2. Sociales");

                        opc = sc.nextInt();

                        switch (opc) {

                            case 1:
                                est2.setMateria(m1);

                                break;
                            case 2:

                                est2.setMateria(m2);
                                break;

                            default:
                                System.out.println("No existe esa opcion");
                                break;

                        }

                        try {
                            est2.pedir();
                        } catch (Excepcionstud ex) {

                            System.out.println("Operacion invalida");
                            System.out.println(ex.getMessage());

                        } catch (NullPointerException ex) {
                            System.out.println("Excepcion por un valor nulo");
                        } finally {
                            System.out.println("Fin de la operacion");

                        }
                        break;

                    default:
                        System.out.println("");
                }
                break;
            case 2:
                System.out.println("¿Que materia desea averiguar?");
                System.out.println("1. Matematicas");
                System.out.println("2. Sociales");

                opc = sc.nextInt();

                switch (opc) {

                    case 1:

                        System.out.println("¿Que estudiante desea averiguar?");
                        System.out.println("1. Andres Quintero");
                        System.out.println("2. Juana Padilla");

                        opc = sc.nextInt();

                        switch (opc) {

                            case 1:

                                m1.setEstudiante(est1);

                                break;
                            case 2:

                                m1.setEstudiante(est2);
                                break;

                            default:
                                System.out.println("No existe esa opcion");
                                break;

                        }

                        try {
                            m1.pedir();
                        } catch (Excepcionstud ex) {

                            System.out.println("Operacion invalida");
                            System.out.println(ex.getMessage());

                        } catch (NullPointerException ex) {
                            System.out.println("Excepcion por un valor nulo");
                        } finally {
                            System.out.println("Fin de la operacion");

                        }
                        break;

                    case 2:

                        System.out.println("¿Que estudiante desea averiguar?");
                        System.out.println("1. Andres Quintero");
                        System.out.println("2. Juana Padilla");

                        opc = sc.nextInt();

                        switch (opc) {

                            case 1:
                                m2.setEstudiante(est1);

                                break;
                            case 2:

                                m2.setEstudiante(est2);
                                break;

                            default:
                                System.out.println("No existe esa opcion");
                                break;

                        }

                        try {
                            m2.pedir();
                        } catch (Excepcionstud ex) {

                            System.out.println("Operacion invalida");
                            System.out.println(ex.getMessage());

                        } catch (NullPointerException ex) {
                            System.out.println("Excepcion por un valor nulo");
                        } finally {
                            System.out.println("Fin de la operacion");

                        }
                        break;

                    default:
                        System.out.println("");

                }
                break;
            default:
                System.out.println("Opcion incorrecta");


                }
                }

    }

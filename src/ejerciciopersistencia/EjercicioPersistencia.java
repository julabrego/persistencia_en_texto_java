package ejerciciopersistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioPersistencia {

    public static void main(String[] args) throws IOException {
        ArrayList<String> listaDeAlumnos = new ArrayList<String>();
        int opcion;
        String alumno;
        String alumnoABuscar;
        int alumnoABorrar;
        Scanner input = new Scanner(System.in);
        boolean ejecutando = true;

        File archivoNombre = new File("nombres.txt");
        archivoNombre.createNewFile();
        Scanner lectorArchivo = new Scanner(archivoNombre);

        while (lectorArchivo.hasNext()) {
            listaDeAlumnos.add(lectorArchivo.nextLine());
        }
        System.out.println(listaDeAlumnos);

        FileWriter miWriter;

        //listaDeAlumnos.add("Juan");
        //listaDeAlumnos.add("María");
        //listaDeAlumnos.add("Pepe");
        //listaDeAlumnos.add("Ana");
        
        while (ejecutando) {
            System.out.println("Elija la opción:");
            System.out.println("1) Agregar alumno");
            System.out.println("2) Borrar alumno");
            System.out.println("3) Vaciar lista");
            System.out.println("4) Verificar si un alumno está en la lista");
            System.out.println("5) Ver lista");
            System.out.println("6) Ordenar alfabéticamente el listado");
            System.out.println("7) Salir");

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del alumno que desea agregar");
                    alumno = input.nextLine();
                    listaDeAlumnos.add(alumno);
                    break;
                case 2:
                    System.out.println("Ingrese el índice que desea borrar");
                    alumnoABorrar = input.nextInt();
                    input.nextLine();

                    if (listaDeAlumnos.size() > alumnoABorrar && alumnoABorrar >= 0) {
                        System.out.println("Alumno borrado: " + listaDeAlumnos.get(alumnoABorrar));
                        listaDeAlumnos.remove(alumnoABorrar);
                    }
                    break;
                case 3:
                    listaDeAlumnos.clear();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del alumno que desea buscar");
                    alumnoABuscar = input.nextLine();
                    System.out.println(listaDeAlumnos.contains(alumnoABuscar));
                    break;
                case 5:
                    System.out.println(listaDeAlumnos);
                    break;
                case 6:
                    Collections.sort(listaDeAlumnos);
                    break;
                case 7:
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }

            String listaDeNombresString = "";
            for (String unAlumno : listaDeAlumnos) {
                listaDeNombresString += unAlumno + "\n";
            }

//            System.out.println(listaDeNombresString);
            miWriter = new FileWriter(archivoNombre);
            miWriter.write(listaDeNombresString);
            miWriter.close();

        }
    }
}

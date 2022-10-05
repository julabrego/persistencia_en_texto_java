package repository;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    private String nombreArchivo;

    public WriteToFile(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void execute(String mensaje) {
        try {
            FileWriter miWriter = new FileWriter(this.nombreArchivo);
            miWriter.write(mensaje);
            miWriter.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }
    }
}

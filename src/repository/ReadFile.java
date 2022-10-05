package repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
private String nombreArchivo;    

    public ReadFile(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public void execute(){
        try {
            File archivo = new File(nombreArchivo);
            Scanner myReader = new Scanner(archivo);
            
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }
    }
}

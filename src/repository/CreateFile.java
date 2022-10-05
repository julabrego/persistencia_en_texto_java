
package repository;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    private String nombreArchivo;
    
    CreateFile(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public void execute(){
        try{
            File archivo = new File(nombreArchivo);
            // File myObj = new File("C:\\Users\\MyName\\filename.txt");
            if(archivo.createNewFile()){
                System.out.println("Archivo creado correctamente");
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Ocurrió un error");
            e.printStackTrace();
        }
    }
}

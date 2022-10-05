package repository;

import java.io.File;

public class DeleteFile {

    String nombreArchivo;

    public DeleteFile(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public void execute(){
        File archivo = new File(nombreArchivo);
        
        if(archivo.delete()){
            System.out.println("Archivo \"" + archivo.getName() + "\" borrado correctamente");
        }else{
            System.out.println("No se pudo borrar el archivo");
        }
    }

}


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class administarGuerreros {
    private ArrayList<Guerrero> listaGuerreros = new ArrayList();
    private File archivo = null;

    public administarGuerreros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guerrero> getListaGuerreros() {
        return listaGuerreros;
    }

    public void setListaGuerreros(ArrayList<Guerrero> listaGuerreros) {
        this.listaGuerreros = listaGuerreros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setGuerrero(Guerrero guerrero){
        listaGuerreros.add(guerrero);
    }
    @Override
    public String toString() {
        return archivo + "";
    }
    public void cargarArchivo() throws FileNotFoundException, IOException, ClassNotFoundException{
        listaGuerreros = new ArrayList();
        Guerrero temp;
        if(archivo.exists()){
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try{
                
                while((temp=(Guerrero)objeto.readObject())!=null){
                    listaGuerreros.add(temp);
                    
                }
            }catch(EOFException e){
                //encontro el final del archivo
            }
            objeto.close();
            entrada.close();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Guerrero t : listaGuerreros) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
            
        }finally{
            try{
                bw.close();
                fw.close();
            }catch(Exception ex){
                
            }
    
}
    }
}


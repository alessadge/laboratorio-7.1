
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class administrarBatalla  {
    
    private ArrayList<Batallas> listaBatallas = new ArrayList();
    private File archivo=null; 

    public administrarBatalla(String path) {
        archivo= new File (path);
    }

    public ArrayList<Batallas> getListaBatallas() {
        return listaBatallas;
    }

    public void setListaBatallas(ArrayList<Batallas> listaBatallas) {
        this.listaBatallas = listaBatallas;
    }

    public void setBatalla(Batallas batallas){
        listaBatallas.add(batallas);
    }
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + archivo + '}';
        
    }    
    public void cargarArchivo() throws FileNotFoundException, IOException, ClassNotFoundException{

    
        listaBatallas = new ArrayList();
        Batallas temp;
        if(archivo.exists()){
            FileInputStream entrada = new FileInputStream(archivo);
            ObjectInputStream objeto = new ObjectInputStream(entrada);
            try{
                
                while((temp=(Batallas)objeto.readObject())!=null){
                    listaBatallas.add(temp);
                    
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
            for (Batallas t : listaBatallas) {
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

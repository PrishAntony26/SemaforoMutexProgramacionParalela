/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoftp;

import GUI.Vista;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author DOMINGUEZ
 */
public class DescargarArchivos {
    private static final int BUFFER_SIZE = 4096;
	
    private String host;
    private int port;
    private String username;
    private String password;
    private String saveDir;
    private long fileSize;
    
    private String nombreArchivo;
    static boolean accederBarra[] = {true, true, true}; 
    private String filesNames[];
    
    private Vista view;
    
    private FTPUtility util;
    

    public DescargarArchivos(String host, int port, String username, String password, String saveDir, Vista view) {
        this.util = new FTPUtility(host, port, username, password);
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.saveDir = saveDir;
        
        this.view = view;
    }
    
    //Obtenemos los nombres de cada archivo en el directorio remoto
    public String[] nombreArchivos(){
        try {
            util.connect();
            try {
                filesNames = util.getNombresArchivos();
                util.disconnect();
                return filesNames;
            } catch (IOException ex) {
                Logger.getLogger(DescargarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        } catch (FTPException ex) {
            Logger.getLogger(DescargarArchivos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
    //Este metodo será el concurrente donde ira por parametro el nombre 
    //del archivo que será escrito en la ubicacion local de nuestro equipo
    
    public void Descargar(String nombreArchivo, int contador) throws Exception{
        
        fileSize = 0;
        
        synchronized(this){
	try {
            //Bloque de codigo que permite el acceso a una barra de progreso determinada
            for(int barra=0;barra<accederBarra.length;barra++){
                    if(accederBarra[barra]==true){
                        accederBarra[barra] = false;
                        contador = barra;
                        break;
                    } 
                }
            //Conectamos con el servidor 
            util.connect();
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            long totalBytesRead = 0;
            int percentCompleted = 0;
            File downloadFile = new File(saveDir + File.separator + nombreArchivo);
            try{
                FileOutputStream outputStream = new FileOutputStream(downloadFile);        
                this.nombreArchivo = "/"+nombreArchivo;
                switch(contador) {
                            case 0:
                                view.jProgressBar1.setValue(0);
                                view.getjLabel12().setText(nombreArchivo);
                                break;
                            case 1:
                                view.jProgressBar2.setValue(0);
                                view.getjLabel13().setText(nombreArchivo);
                                break;
                            case 2:
                                view.jProgressBar3.setValue(0);
                                view.getjLabel14().setText(nombreArchivo);
                                break;
                            default:
                                break;
                        }
               
                fileSize = util.getFileSize(this.nombreArchivo);
                //Descargamos el archivo del directorio 
                util.downloadFile(this.nombreArchivo);
                InputStream inputStream = util.getInputStream();   
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                    totalBytesRead += bytesRead;
                    //Barra de progreso
                    percentCompleted = (int) (totalBytesRead * 100 / fileSize);
                    if(percentCompleted % 10 == 0.0){
                        switch (contador) {
                            case 0:
                                view.jProgressBar1.setValue(percentCompleted);
                                break;
                            case 1:
                                view.jProgressBar2.setValue(percentCompleted);
                                break;
                            case 2:
                                view.jProgressBar3.setValue(percentCompleted);
                                break;
                            default:
                                break;
                        }
                    }
                    
                }
              
                outputStream.close();
                util.finish();
                accederBarra[contador] = true; //Liberamos la barra para que otro lo ocupe
                view.descargaExitosa++;
                //Como llego hasta el final entonces, se infiere que se el archivo se ha descargado sin errores
                
                }catch(FileNotFoundException ex){
                    //En caso exista error 
                    accederBarra[contador] = true;//Liberamos la barra 
                        //Thread.sleep(500);
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error al descargar el archivo 1 \n"+ ex.getMessage(),"Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
            } catch (FTPException ex) {
                
                accederBarra[contador] = true;//Liberamos la barra 
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al descargar el archivo 2  \n"+ ex.getMessage(),"Error",
                                JOptionPane.ERROR_MESSAGE);
                switch (contador) {
                    case 0:
                        view.jProgressBar1.setValue(0);
                        break;
                    case 1:
                        view.jProgressBar2.setValue(0);
                        break;
                    case 2:
                        view.jProgressBar3.setValue(0);
                        break;
                default:
                    break;      
                }
                //Thread.sleep(500);
            } finally {
			util.disconnect();
	      }
            
            }
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoftp;

import GUI.Vista;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author DOMINGUEZ
 */
public class FTPcontrolador implements Runnable{
    
    public Vista view;
    public String[] nombres;
    public DescargarArchivos download;
    static Semaphore semaforo = new Semaphore(3,true);
    private String nombreH;
    
    public FTPcontrolador(Vista view, String nombreH) {
        this.nombreH = nombreH;
        this.view = view;
    }
    
    public void obtenerNombres(String server, String port, String user, String pass, String saveDir){
        download = new DescargarArchivos(server,Integer.valueOf(port), user, pass, saveDir, view);
        nombres = download.nombreArchivos();
        //Codigo para poner en la tabla todos los nombres de los archivos que se descargaran
    }
    
    public void run(){
        
            try {   
                
                    semaforo.acquire();
                    view.contador++;
                    view.contSemaforo++;
                    //Realizamos la descarga de los archivos 
                    download.Descargar(nombres[view.contador], view.contSemaforo);

                    semaforo.release();
                    view.contSemaforo--;
                    
                   
            } catch (Exception ex) {
                Logger.getLogger(FTPcontrolador.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(FTPcontrolador.class.getName()).log(Level.SEVERE, null, ex);
            }
   
        
    }

    public String[] getNombres() {
        return nombres;
    }
    
}

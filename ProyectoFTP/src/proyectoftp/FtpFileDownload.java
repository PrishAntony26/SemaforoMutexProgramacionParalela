/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoftp;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;


/**
 *
 * @author DOMINGUEZ
 */
public class FtpFileDownload {
    public static void main( String[] args) {
        String serverAddress = "www.peru-software.com"; // ftp server address
        int port = 21; // ftp uses default port Number 21
        String username = "pp20172@peru-software.com"; // username of ftp server
        String password = "fisi20172"; // password of ftp serve
        FTPClient ftpClient = new FTPClient();
        
        try {
        // realizar el login
            ftpClient.connect(serverAddress, port);
            boolean resp = ftpClient.login(username,password);
            if(resp){
                System.out.println("Credenciales correctas");
            }else
                System.out.println("Credenciales incorrectas");
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            String[] files = ftpClient.listNames();
            if (files != null && files.length > 0) {
            for (String aFile: files) {
                System.out.println("Archivo:" + aFile);
                }
            }
            
            String remoteFilePath = "/"+files[3];
            File localfile = new File("C:/Users/DOMINGUEZ/Desktop/UNMSM/Ciclo7_Verano/ProgramacionParalela/Semana11/Archivos"+File.separator+files[3]);
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(localfile));
            
            // Descomentar la linea de cpdigo de abajo para la otra opcion
           // boolean success = ftpClient.retrieveFile(remoteFilePath, outputStream); outputStream.close();
            
            InputStream inputStream = ftpClient.retrieveFileStream(remoteFilePath);
            int contador=0;
            int total = 0;
            byte[] bytesArray = new byte[5760];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(bytesArray)) != -1) {
                outputStream.write(bytesArray, 0, bytesRead);
                //System.out.println("b "+bytesArray.toString());
            }
            boolean success = ftpClient.completePendingCommand();
            
            outputStream.close();
            inputStream.close();
            
            if(success){
                System.out.println("Archivo descargado.");
            } else {
                System.out.println("Archivo no se pudo descargar");
            }
        } catch (IOException ex) {
            System.out.println("Ocurrio un error en la descarga : " +
            ex.getMessage());
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
  }
}


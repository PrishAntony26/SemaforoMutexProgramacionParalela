/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoftp;

import GUI.Vista;

/**
 *
 * @author DOMINGUEZ
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Si funciona probar con esto pipipi
        Vista view = new Vista();
        DescargarArchivos download = new DescargarArchivos("www.peru-software.com",
        21,"pp20172@peru-software.com","fisi20172",
       "C:/Users/DOMINGUEZ/Desktop/UNMSM/Ciclo7_Verano/ProgramacionParalela/Semana11/Archivos",view);
        String[] nombres = download.nombreArchivos();
        for(int i=0;i<nombres.length;i++){
            download.Descargar(nombres[i],1);
        }
        System.out.println(" Archivos descargados buenos: "+ view.descargaExitosa);
    }
    
}

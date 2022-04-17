/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoftp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DOMINGUEZ
 */
public class FTPException extends Exception {
	public FTPException(String message) {
		super(message);
                
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(FTPException.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JTextField;
import proyectoftp.FTPcontrolador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
/**
 *
 * @author DOMINGUEZ
 */
public class Vista extends javax.swing.JFrame {

    public int contador = -1;
    public int contSemaforo = -1;
    public int descargaExitosa = 0; 
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextServer = new javax.swing.JTextField();
        jTextPort = new javax.swing.JTextField();
        jTextUser = new javax.swing.JTextField();
        jTextPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextSave = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgressBar1.setStringPainted(true);
        jProgressBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jProgressBar1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgressBar2.setStringPainted(true);

        jProgressBar3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgressBar3.setStringPainted(true);

        jLabel1.setText("Server");

        jLabel2.setText("Port");

        jLabel3.setText("User");

        jLabel4.setText("Password");

        jTextServer.setText("www.peru-software.com");

        jTextPort.setText("21");

        jTextUser.setText("pp20172@peru-software.com");

        jTextPassword.setText("fisi20172");

        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Save file to: ");

        jTextSave.setText("C:/Users/DOMINGUEZ/Desktop/UNMSM/Ciclo7_Verano/ProgramacionParalela/Semana11/Archivos");

        jLabel6.setText("Subproceso 1");

        jLabel7.setText("Subproceso 2");

        jLabel8.setText("Subproceso 3");

        jLabel9.setText("Archivo:");

        jLabel10.setText("Archivo:");

        jLabel11.setText("Archivo:");

        jLabel12.setText("-");

        jLabel13.setText("-");

        jLabel14.setText("-");

        jLabel15.setText("Bienvenido ");

        jLabel16.setText("Total archivos descargados correctamente: ");

        jLabel17.setText("Total archivos que no fue posible descargar:  ");

        jLabel18.setText("-");

        jLabel19.setText("-");

        jButton3.setText("Resultado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextPort, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(jTextServer)))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                                        .addComponent(jTextPassword, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextSave, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton1))
                                .addGap(88, 88, 88))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel18)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProgressBar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jProgressBar1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jProgressBar1AncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        FTPcontrolador ftp1 = new FTPcontrolador(this,"hilo1"){};
        FTPcontrolador ftp2 = new FTPcontrolador(this,"hilo2"){};
        FTPcontrolador ftp3 = new FTPcontrolador(this,"hilo3"){};
        FTPcontrolador ftp4 = new FTPcontrolador(this,"hilo4"){};
        FTPcontrolador ftp5 = new FTPcontrolador(this,"hilo5"){};
        FTPcontrolador ftp6 = new FTPcontrolador(this,"hilo6"){};
        FTPcontrolador ftp7 = new FTPcontrolador(this,"hilo7"){};
        FTPcontrolador ftp8 = new FTPcontrolador(this,"hilo8"){};
        FTPcontrolador ftp9 = new FTPcontrolador(this,"hilo9"){};
        FTPcontrolador ftp10 = new FTPcontrolador(this,"hilo10"){};
        FTPcontrolador ftp11 = new FTPcontrolador(this,"hilo11"){};
        FTPcontrolador ftp12 = new FTPcontrolador(this,"hilo12"){};
        FTPcontrolador ftp13 = new FTPcontrolador(this,"hilo13"){};
        FTPcontrolador ftp14 = new FTPcontrolador(this,"hilo14"){};
        jLabel15.setText("Comenzando descarga de archivos.....");
        String server = jTextServer.getText();
        String port = jTextPort.getText();
        String user = jTextUser.getText();
        String password = jTextPassword.getText();
        String save = jTextSave.getText();
        ftp1.obtenerNombres(server, port, user, password, save);
        ftp2.obtenerNombres(server, port, user, password, save);
        ftp3.obtenerNombres(server, port, user, password, save);
        ftp4.obtenerNombres(server, port, user, password, save);
        ftp5.obtenerNombres(server, port, user, password, save);
        ftp6.obtenerNombres(server, port, user, password, save);
        ftp7.obtenerNombres(server, port, user, password, save);
        ftp8.obtenerNombres(server, port, user, password, save);
        ftp9.obtenerNombres(server, port, user, password, save);
        ftp10.obtenerNombres(server, port, user, password, save);
        ftp11.obtenerNombres(server, port, user, password, save);
        ftp12.obtenerNombres(server, port, user, password, save);
        ftp13.obtenerNombres(server, port, user, password, save);
        ftp14.obtenerNombres(server, port, user, password, save);
        Thread t1 = new Thread(ftp1);
        Thread t2 = new Thread(ftp2);
        Thread t3 = new Thread(ftp3);
        Thread t4 = new Thread(ftp4);
        Thread t5 = new Thread(ftp5);
        Thread t6 = new Thread(ftp6);
        Thread t7 = new Thread(ftp7);
        Thread t8 = new Thread(ftp8);
        Thread t9 = new Thread(ftp9);
        Thread t10 = new Thread(ftp10);
        Thread t11 = new Thread(ftp11);
        Thread t12 = new Thread(ftp12);
        Thread t13 = new Thread(ftp13);
        Thread t14 = new Thread(ftp14);
                t1.start();              
                t2.start();
                t3.start();
                t4.start();
                t5.start();
                t6.start();
                t7.start();
                t8.start();
                t9.start();
                t10.start();  
                t11.start();
                t12.start();               
                t13.start();                   
                t14.start();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                int descargaSExito = 14 - descargaExitosa;
                this.jLabel18.setText(String.valueOf(descargaExitosa));
                this.jLabel19.setText(String.valueOf(descargaSExito));
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    public JTextField getjTextServer() {
        return jTextServer;
    }

    public JTextField getjTextPassword() {
        return jTextPassword;
    }

    public JTextField getjTextPort() {
        return jTextPort;
    }

    public JTextField getjTextSave() {
        return jTextSave;
    }

    public JTextField getjTextUser() {
        return jTextUser;
    }

    public void hablar(){
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }
    
    
    /* Proyecto. 
        Se conecte al servidor ftp del ejemplo
        Recupere la lista de todos los archivos que contiene el directorio remoto.
        Lance un hilo por cada archivo de la lista, este hilo debe descargar el archivo en un
        directorio local.
        Mientras se realiza la descarga se debe ir pintando el porcentaje de descarga en
        incrementos de 10% aproximadamente.
        Se debe limitar la cantidad de conexiones simultáneas a 3 descargas. Se debe usar un
        semáforo contador para limitar las conexiones.
        En caso de error de alguna descarga se debe informar.
        Al finalizar todas las descargas se debe imprimir la cantidad de archivos descargados con
        éxito y la cantidad de archivos que no se pudieron descargar. Utilice un semáforo mutex
        cuando actualice estos contadores.
    
        Lo que hacemos es crear 3 clases aparte de la GUI 
        FTPUtility. Se encarga de realizar las funciones principales para trabajar con el servidor FTP:
        conectar, descargar, desconectar, etc.
        
        DescargarArchivos. Ejecuta la descarga del archivo en un subproceso en segundo plano 
        para que la GUI no deje de reponder o se congele.
    
        FTPControlador. Donde se implmenta los semaforos ademas se encarga de llamar a la funcion principal 
        donde se descargara los archivos. 
    
        La variable de tipo semaforo es de tipo estatico ya que al nosotros implementarlo asi estamos haciendolo
        independiente de las instancias que vallamos a crear por lo que nos ayudara a trabajar con todas las instancias 
        de FTPcontrolador ya que si se modifica el estado del semaforo se modificara para todas las instancias 
        
        Lo mismo ocurre con la variable accederBarra[] = {true, true, true}; de la clase DescargarArchivos.
        
        En la clase DescargarArchivos se realiza syncronized ya que existe seccion critica de codigo por lo que recordemos 
        que esta instruccion indica que la parte seleccionada por syncornized estara bloqueada para que un solo hilo pueda 
        acceder a esa porcion de codigo 
        He implmentado en toda esa parte de codigo ya que comparte en comun fileSize, accederBarra, nombreArchivo ya que si todos 
        los hilos van a la misma vez en esta parte de codigo no funcionaria 
        
    */
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JProgressBar jProgressBar1;
    public javax.swing.JProgressBar jProgressBar2;
    public javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JTextField jTextPassword;
    private javax.swing.JTextField jTextPort;
    private javax.swing.JTextField jTextSave;
    private javax.swing.JTextField jTextServer;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables
}
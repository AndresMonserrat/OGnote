package og;

import java.io.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
//import objetos.de.datos.Persona;
//import objetos.de.datos.Persona;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.util.Scanner;
//import objetos.de.datos.Nota;



public class Vista_nota extends javax.swing.JFrame {
    JFileChooser fChooser = new JFileChooser();
    
    private File ArchivoActual;
    public Vista_nota() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TxtA_Contenido = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        LblTituloNota = new javax.swing.JLabel();
        TxtTituloNota = new javax.swing.JTextField();
        TxtCategoria = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArchivo = new javax.swing.JMenu();
        MenuNuevo = new javax.swing.JMenuItem();
        MenuAbrirAnterior = new javax.swing.JMenuItem();
        MenuGuardar = new javax.swing.JMenuItem();
        MenuGuardarComo = new javax.swing.JMenuItem();
        MenuInfoPrograma = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtA_Contenido.setColumns(20);
        TxtA_Contenido.setRows(5);
        jScrollPane1.setViewportView(TxtA_Contenido);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 684, 348));

        jLabel1.setText("Categoria: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 37, -1, -1));

        LblTituloNota.setText("Titulo nota:");
        getContentPane().add(LblTituloNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, -1, -1));

        TxtTituloNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTituloNotaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtTituloNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 6, 224, -1));
        getContentPane().add(TxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 34, 224, -1));

        MenuArchivo.setText("Archivo");

        MenuNuevo.setText("Nuevo");
        MenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevoActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuNuevo);

        MenuAbrirAnterior.setText("Abrir");
        MenuAbrirAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAbrirAnteriorActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuAbrirAnterior);

        MenuGuardar.setText("Guardar");
        MenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGuardarActionPerformed(evt);
            }
        });
        MenuArchivo.add(MenuGuardar);

        MenuGuardarComo.setText("Guardar como...");
        MenuArchivo.add(MenuGuardarComo);

        jMenuBar1.add(MenuArchivo);

        MenuInfoPrograma.setText("OGNote");
        jMenuBar1.add(MenuInfoPrograma);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAbrirAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAbrirAnteriorActionPerformed
       
        JFileChooser ArchivoActual1 = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto (.txt)", "txt");
        ArchivoActual1.setFileFilter(filtro);
        
        int seleccion = ArchivoActual1.showOpenDialog(this.getContentPane());
        if (seleccion == JFileChooser.FILES_ONLY){
            this.ArchivoActual = ArchivoActual1.getSelectedFile();
            
            try {
                String ruta = this.ArchivoActual.getCanonicalPath();
                
                //obtener la url del documento:(carpeta del usuario predeterminada por el programa para el usuario.
                /*if(ArchivoActual1.getCurrentDirectory().equals("C:\\Users\\sebas\\OneDrive\\Documentos\\NetBeansProjects\\Objetos de datos\\src\\Usuarios\\")){
                
                }*/
            } catch (IOException ex) {
                Logger.getLogger(Vista_nota.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        int returnVal = fChooser.showOpenDialog(Vista_nota.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ArchivoActual = fChooser.getSelectedFile();
            //This is where a real application would open the file.

            try {
//                    File myObj = new File(filePath);
                Scanner myReader = new Scanner(fChooser.getSelectedFile());
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if ("".equals(TxtA_Contenido.getText())) {
                        TxtA_Contenido.setText(data);
                    } else {
                        TxtA_Contenido.setText(TxtA_Contenido.getText() + "\n" + data);
                    }
                    TxtTituloNota.setText(fChooser.getSelectedFile().getName());
                    System.out.println(data);
                }
                myReader.close();
                String filePath = fChooser.getSelectedFile().getAbsolutePath();
                Path path = Paths.get(filePath);
                Files.setAttribute(path, "dos:hidden", false, LinkOption.NOFOLLOW_LINKS);
                ArchivoActual.setWritable(true);
            } catch (IOException err) {

            }
            if (ArchivoActual.isHidden()) {
                System.out.println("File is hidden");
            } else {
                System.out.println("File is visible");
            }
        }
        
    }//GEN-LAST:event_MenuAbrirAnteriorActionPerformed

    private void MenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevoActionPerformed
        TxtA_Contenido.setText(" ");
        this.ArchivoActual = null;
    }//GEN-LAST:event_MenuNuevoActionPerformed

    private void MenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGuardarActionPerformed
       FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto (.txt)", "txt");
        int returnVal = fChooser.showSaveDialog(Vista_nota.this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String filePath = fChooser.getSelectedFile().getAbsolutePath();
            try {

                ArchivoActual = new File(filePath);
                FileWriter tempFile = new FileWriter(filePath);
                if (ArchivoActual.exists()) {
                    System.out.println("Archivo creado: " + ArchivoActual.getName());
                    tempFile.write(TxtA_Contenido.getText());
                    tempFile.close();
                } else {
                    System.out.println("Archivo ya existente.");
                }

            } catch (IOException err) {
                System.out.println("An error occurred.");
                err.printStackTrace();
            }
        } else {
            System.out.println("Error");
        }
    }//GEN-LAST:event_MenuGuardarActionPerformed

    private void TxtTituloNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTituloNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTituloNotaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTituloNota;
    private javax.swing.JMenuItem MenuAbrirAnterior;
    private javax.swing.JMenu MenuArchivo;
    private javax.swing.JMenuItem MenuGuardar;
    private javax.swing.JMenuItem MenuGuardarComo;
    private javax.swing.JMenu MenuInfoPrograma;
    private javax.swing.JMenuItem MenuNuevo;
    private javax.swing.JTextArea TxtA_Contenido;
    private javax.swing.JTextField TxtCategoria;
    private javax.swing.JTextField TxtTituloNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

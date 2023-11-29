/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package og;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OG {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Crear un objeto de la clase SplashScreen
                SplashScreen splash = new SplashScreen();

                // Mostrar la pantalla de carga
                splash.setVisible(true);

                // Configurar un temporizador para cerrar la pantalla de carga después de 7 segundos
                Timer timer = new Timer(7000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Cerrar la pantalla de carga
                        splash.setVisible(false);

                        // Iniciar la aplicación principal
                        new GUI_START().setVisible(true);
                    }
                });
                timer.setRepeats(false); // Para asegurarse de que el temporizador se ejecute solo una vez
                timer.start();
            }
        });
    }

    // Clase para la pantalla de carga (SplashScreen)
    static class SplashScreen extends JWindow {
        public SplashScreen() {
            // Configurar la apariencia de la pantalla de carga según tus necesidades
            JLabel label = new JLabel(new ImageIcon("src/video/OG PROJECT.gif"));
            getContentPane().add(label, BorderLayout.CENTER);
            pack();
            setLocationRelativeTo(null);
        }
    }
}


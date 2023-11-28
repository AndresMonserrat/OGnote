/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package og;

import java.awt.Color;
import javax.swing.ImageIcon;
import BasesDatos.SQLConectar;

/**
 *
 * @author camil
 */
public class GUI_START extends javax.swing.JFrame {

    public GUI_START() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/iconos/ogchikito.png")).getImage());
        deco.setVisible(true);
        iniciar.setVisible(true);
        menu.setVisible(false);
        panel_notas.setVisible(false);
        panel_user.setVisible(false);
        panel_cal.setVisible(false);
        panel_opciones.setVisible(false);
        panel_final.setVisible(false);
        SQLConectar.SQL_Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        up_panel = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        opcion_final = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        showuser = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        opcion_notas = new javax.swing.JButton();
        opcion_user = new javax.swing.JButton();
        opcion_cal = new javax.swing.JButton();
        opcion_settings = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        iniciar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        entrar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        empecemos = new javax.swing.JLabel();
        salirpanel = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        advertenciaLabel = new javax.swing.JLabel();
        deco = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panel_notas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        panel_user = new javax.swing.JPanel();
        panel_cal = new javax.swing.JPanel();
        panel_opciones = new javax.swing.JPanel();
        panel_final = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OGNOTE");
        setBounds(new java.awt.Rectangle(20, 20, 20, 20));
        setPreferredSize(new java.awt.Dimension(910, 530));

        up_panel.setBackground(new java.awt.Color(0, 153, 153));
        up_panel.setPreferredSize(new java.awt.Dimension(910, 540));
        up_panel.setLayout(null);

        menu.setBackground(new java.awt.Color(166, 195, 192));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcion_final.setBackground(new java.awt.Color(166, 195, 192));
        opcion_final.setForeground(new java.awt.Color(8, 59, 8));
        opcion_final.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Speech Bubble_1.png"))); // NOI18N
        opcion_final.setText("Acerca de...");
        opcion_final.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        opcion_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_finalActionPerformed(evt);
            }
        });
        menu.add(opcion_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 40));

        Exit.setBackground(new java.awt.Color(204, 255, 255));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Exit.setText("SALIR");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        menu.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 40));

        showuser.setBackground(new java.awt.Color(204, 204, 204));
        showuser.setToolTipText("");
        showuser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showuser.setName(""); // NOI18N
        showuser.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/foto2.png"))); // NOI18N
        showuser.add(jLabel8);
        jLabel8.setBounds(0, 10, 100, 80);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario:");
        showuser.add(jLabel10);
        jLabel10.setBounds(100, 20, 60, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Admin");
        showuser.add(jLabel11);
        jLabel11.setBounds(110, 50, 43, 16);

        menu.add(showuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 190, 100));

        opcion_notas.setBackground(new java.awt.Color(166, 195, 192));
        opcion_notas.setForeground(new java.awt.Color(8, 59, 8));
        opcion_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Sticky Notes_1.png"))); // NOI18N
        opcion_notas.setText("Notas");
        opcion_notas.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        opcion_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_notasActionPerformed(evt);
            }
        });
        menu.add(opcion_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 40));

        opcion_user.setBackground(new java.awt.Color(166, 195, 192));
        opcion_user.setForeground(new java.awt.Color(8, 59, 8));
        opcion_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/User Male.png"))); // NOI18N
        opcion_user.setText("Usuario");
        opcion_user.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        opcion_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_userActionPerformed(evt);
            }
        });
        menu.add(opcion_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 40));

        opcion_cal.setBackground(new java.awt.Color(166, 195, 192));
        opcion_cal.setForeground(new java.awt.Color(8, 59, 8));
        opcion_cal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Google Calendar.png"))); // NOI18N
        opcion_cal.setText("Calendario");
        opcion_cal.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        opcion_cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_calActionPerformed(evt);
            }
        });
        menu.add(opcion_cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 40));

        opcion_settings.setBackground(new java.awt.Color(166, 195, 192));
        opcion_settings.setForeground(new java.awt.Color(8, 59, 8));
        opcion_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Settings_1.png"))); // NOI18N
        opcion_settings.setText("Opciones");
        opcion_settings.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        opcion_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_settingsActionPerformed(evt);
            }
        });
        menu.add(opcion_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ogicon.png"))); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 210, 120));

        up_panel.add(menu);
        menu.setBounds(0, 0, 210, 510);

        iniciar.setPreferredSize(new java.awt.Dimension(400, 0));
        iniciar.setLayout(null);

        jPanel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Google_2.png"))); // NOI18N
        jButton1.setText(" Iniciar sesión con Google");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setPreferredSize(new java.awt.Dimension(250, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);

        iniciar.add(jPanel4);
        jPanel4.setBounds(0, 112, 400, 50);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("BIENVENIDOG");
        jLabel1.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iniciar.add(jPanel3);
        jPanel3.setBounds(0, 50, 400, 50);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 150));

        jPanel7.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 4));

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel7.add(emailField, java.awt.BorderLayout.CENTER);

        jLabel3.setText("Correo");
        jPanel7.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 50));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 4));

        jLabel2.setText("Contraseña");
        jPanel6.add(jLabel2, java.awt.BorderLayout.PAGE_START);
        jPanel6.add(passwordField, java.awt.BorderLayout.CENTER);

        jPanel8.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Recordarme");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(jCheckBox1, java.awt.BorderLayout.WEST);

        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Olvidaste tu contraseña?");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.add(jLabel4, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iniciar.add(jPanel5);
        jPanel5.setBounds(0, 168, 399, 150);

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 50));

        entrar.setText("ENTRAR");
        entrar.setPreferredSize(new java.awt.Dimension(250, 30));
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iniciar.add(jPanel9);
        jPanel9.setBounds(0, 336, 400, 50);

        jPanel10.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel5.setText("No tienes una cuenta aún?");

        empecemos.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        empecemos.setText("Empecemos!");
        empecemos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empecemos(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empecemosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empecemosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(empecemos))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(empecemos)))
        );

        iniciar.add(jPanel10);
        jPanel10.setBounds(0, 392, 400, 50);

        salirpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirpanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirpanelMouseEntered(evt);
            }
        });

        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Close.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirpanelLayout = new javax.swing.GroupLayout(salirpanel);
        salirpanel.setLayout(salirpanelLayout);
        salirpanelLayout.setHorizontalGroup(
            salirpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        salirpanelLayout.setVerticalGroup(
            salirpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirpanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iniciar.add(salirpanel);
        salirpanel.setBounds(0, 0, 40, 40);

        advertenciaLabel.setForeground(new java.awt.Color(255, 102, 102));
        iniciar.add(advertenciaLabel);
        advertenciaLabel.setBounds(80, 320, 240, 16);

        up_panel.add(iniciar);
        iniciar.setBounds(0, 0, 408, 510);

        deco.setBackground(new java.awt.Color(166, 195, 192));
        deco.setPreferredSize(new java.awt.Dimension(400, 430));
        deco.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/otro.png"))); // NOI18N
        deco.add(jLabel6);
        jLabel6.setBounds(110, 150, 300, 179);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ogicon.png"))); // NOI18N
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deco.add(jLabel12);
        jLabel12.setBounds(-100, -70, 280, 230);

        up_panel.add(deco);
        deco.setBounds(400, 0, 530, 510);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new java.awt.CardLayout());

        panel_notas.setBackground(new java.awt.Color(0, 153, 153));

        jTextPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout panel_notasLayout = new javax.swing.GroupLayout(panel_notas);
        panel_notas.setLayout(panel_notasLayout);
        panel_notasLayout.setHorizontalGroup(
            panel_notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_notasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_notasLayout.setVerticalGroup(
            panel_notasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_notasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panel_notas, "card4");

        panel_user.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout panel_userLayout = new javax.swing.GroupLayout(panel_user);
        panel_user.setLayout(panel_userLayout);
        panel_userLayout.setHorizontalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panel_userLayout.setVerticalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(panel_user, "card5");

        panel_cal.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout panel_calLayout = new javax.swing.GroupLayout(panel_cal);
        panel_cal.setLayout(panel_calLayout);
        panel_calLayout.setHorizontalGroup(
            panel_calLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panel_calLayout.setVerticalGroup(
            panel_calLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(panel_cal, "card7");

        panel_opciones.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(panel_opciones, "card3");

        panel_final.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout panel_finalLayout = new javax.swing.GroupLayout(panel_final);
        panel_final.setLayout(panel_finalLayout);
        panel_finalLayout.setHorizontalGroup(
            panel_finalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        panel_finalLayout.setVerticalGroup(
            panel_finalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(panel_final, "card6");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(up_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(up_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirpanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirpanelMouseEntered

    }//GEN-LAST:event_salirpanelMouseEntered

    private void salirpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirpanelMouseClicked

    }//GEN-LAST:event_salirpanelMouseClicked

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salirpanel.setBackground(new java.awt.Color(238, 238, 238));
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        salirpanel.setBackground(Color.red);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void empecemosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empecemosMouseExited
        empecemos.setForeground(Color.black);
    }//GEN-LAST:event_empecemosMouseExited

    private void empecemosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empecemosMouseEntered
        empecemos.setForeground(new java.awt.Color(0, 102, 54));
    }//GEN-LAST:event_empecemosMouseEntered

    private void empecemos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empecemos
        this.setVisible(false);
        registro fl = new registro();
        fl.setVisible(true);
    }//GEN-LAST:event_empecemos

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        if (!email.isBlank() && !password.isBlank()) {
            if (SQLConectar.verificar(email, password)) {
                deco.setVisible(false);
                iniciar.setVisible(false);
                menu.setVisible(true);
            } else {
                advertenciaLabel.setText("Correo o contraseña incorrectos");
            }
        }else{
            advertenciaLabel.setText("Hay campos vacios");
        }

    }//GEN-LAST:event_entrarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void opcion_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_notasActionPerformed
        panel_notas.setVisible(true);
        panel_user.setVisible(false);
        panel_cal.setVisible(false);
        panel_opciones.setVisible(false);
        panel_final.setVisible(false);
    }//GEN-LAST:event_opcion_notasActionPerformed

    private void opcion_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_userActionPerformed
        panel_notas.setVisible(false);
        panel_user.setVisible(true);
        panel_cal.setVisible(false);
        panel_opciones.setVisible(false);
        panel_final.setVisible(false);
    }//GEN-LAST:event_opcion_userActionPerformed

    private void opcion_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_finalActionPerformed
        panel_notas.setVisible(false);
        panel_user.setVisible(false);
        panel_cal.setVisible(false);
        panel_opciones.setVisible(false);
        panel_final.setVisible(true);
    }//GEN-LAST:event_opcion_finalActionPerformed

    private void opcion_calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_calActionPerformed
        panel_notas.setVisible(false);
        panel_user.setVisible(false);
        panel_cal.setVisible(true);
        panel_opciones.setVisible(false);
        panel_final.setVisible(false);
    }//GEN-LAST:event_opcion_calActionPerformed

    private void opcion_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_settingsActionPerformed
        panel_notas.setVisible(false);
        panel_user.setVisible(false);
        panel_cal.setVisible(false);
        panel_opciones.setVisible(true);
        panel_final.setVisible(false);
    }//GEN-LAST:event_opcion_settingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JLabel advertenciaLabel;
    private javax.swing.JPanel deco;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel empecemos;
    private javax.swing.JButton entrar;
    private javax.swing.JPanel iniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton opcion_cal;
    private javax.swing.JButton opcion_final;
    private javax.swing.JButton opcion_notas;
    private javax.swing.JButton opcion_settings;
    private javax.swing.JButton opcion_user;
    private javax.swing.JPanel panel_cal;
    private javax.swing.JPanel panel_final;
    private javax.swing.JPanel panel_notas;
    private javax.swing.JPanel panel_opciones;
    private javax.swing.JPanel panel_user;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel salir;
    private javax.swing.JPanel salirpanel;
    private javax.swing.JPanel showuser;
    private javax.swing.JPanel up_panel;
    // End of variables declaration//GEN-END:variables
}
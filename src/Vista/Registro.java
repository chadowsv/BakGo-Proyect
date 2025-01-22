package Vista;
import Modelo.RegistrarUsuario;
import Modelo.RegistroUsuarioDAO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.time.LocalDateTime;
public class Registro extends JFrame {
    int xMouse, yMouse;
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelSalida = new javax.swing.JPanel();
        Salida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RegistrarButton = new javax.swing.JPanel();
        RegistrarText = new javax.swing.JLabel();
        FechaNacimiento = new javax.swing.JTextField();
        ConfContra = new javax.swing.JPasswordField();
        Contra = new javax.swing.JPasswordField();
        Telefono = new javax.swing.JTextField();
        CorreoElectro = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        ApellidoMaterno = new javax.swing.JTextField();
        ApellidoPaterno = new javax.swing.JTextField();
        PrimerNombre = new javax.swing.JTextField();
        SegundoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelSalida.setBackground(new java.awt.Color(255, 255, 255));
        PanelSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSalidaMouseExited(evt);
            }
        });

        Salida.setBackground(new java.awt.Color(255, 255, 255));
        Salida.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salida.setText("X");
        Salida.setToolTipText("");
        Salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelSalidaLayout = new javax.swing.GroupLayout(PanelSalida);
        PanelSalida.setLayout(PanelSalidaLayout);
        PanelSalidaLayout.setHorizontalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalidaLayout.createSequentialGroup()
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelSalidaLayout.setVerticalGroup(
            PanelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalidaLayout.createSequentialGroup()
                .addComponent(Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(PanelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 70));

        RegistrarButton.setBackground(new java.awt.Color(22, 82, 52));
        RegistrarButton.setForeground(new java.awt.Color(22, 82, 52));
        RegistrarButton.setToolTipText("");
        RegistrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegistrarButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        RegistrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarButtonMouseExited(evt);
            }
        });

        RegistrarText.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        RegistrarText.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarText.setText("Registrar");
        RegistrarText.setToolTipText("");
        RegistrarText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegistrarButtonLayout = new javax.swing.GroupLayout(RegistrarButton);
        RegistrarButton.setLayout(RegistrarButtonLayout);
        RegistrarButtonLayout.setHorizontalGroup(
            RegistrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarButtonLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(RegistrarText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistrarButtonLayout.setVerticalGroup(
            RegistrarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarButtonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(RegistrarText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(RegistrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, 170, 60));

        FechaNacimiento.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        FechaNacimiento.setForeground(new java.awt.Color(153, 153, 153));
        FechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FechaNacimiento.setText("AAAA-MM-DD");
        FechaNacimiento.setBorder(null);
        FechaNacimiento.setDragEnabled(true);
        FechaNacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FechaNacimientoFocusLost(evt);
            }
        });
        FechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FechaNacimientoMousePressed(evt);
            }
        });
        FechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaNacimientoKeyTyped(evt);
            }
        });
        jPanel1.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 483, 270, -1));

        ConfContra.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        ConfContra.setForeground(new java.awt.Color(153, 153, 153));
        ConfContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ConfContra.setText("123456789123456789");
        ConfContra.setBorder(null);
        ConfContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConfContraMousePressed(evt);
            }
        });
        ConfContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConfContraKeyTyped(evt);
            }
        });
        jPanel1.add(ConfContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 598, 320, -1));

        Contra.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Contra.setForeground(new java.awt.Color(153, 153, 153));
        Contra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contra.setText("123456789123456789");
        Contra.setBorder(null);
        Contra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraMousePressed(evt);
            }
        });
        Contra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraKeyTyped(evt);
            }
        });
        jPanel1.add(Contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 483, 320, -1));

        Telefono.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Telefono.setForeground(new java.awt.Color(153, 153, 153));
        Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Telefono.setText("Ingresar Teléfono");
        Telefono.setToolTipText("");
        Telefono.setBorder(null);
        Telefono.setDragEnabled(true);
        Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefonoFocusLost(evt);
            }
        });
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoMousePressed(evt);
            }
        });
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 598, 380, -1));

        CorreoElectro.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        CorreoElectro.setForeground(new java.awt.Color(153, 153, 153));
        CorreoElectro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CorreoElectro.setText("Ingresar Correo Electrónico");
        CorreoElectro.setBorder(null);
        CorreoElectro.setDragEnabled(true);
        CorreoElectro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CorreoElectroFocusLost(evt);
            }
        });
        CorreoElectro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CorreoElectroMousePressed(evt);
            }
        });
        CorreoElectro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoElectroKeyTyped(evt);
            }
        });
        jPanel1.add(CorreoElectro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 483, 380, -1));

        Cedula.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Cedula.setForeground(new java.awt.Color(153, 153, 153));
        Cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cedula.setText("Ingresar Cédula");
        Cedula.setBorder(null);
        Cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CedulaFocusLost(evt);
            }
        });
        Cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CedulaMousePressed(evt);
            }
        });
        Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CedulaKeyTyped(evt);
            }
        });
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 368, 210, -1));

        ApellidoMaterno.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        ApellidoMaterno.setForeground(new java.awt.Color(153, 153, 153));
        ApellidoMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ApellidoMaterno.setText("Ingresar Apellido Materno");
        ApellidoMaterno.setBorder(null);
        ApellidoMaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ApellidoMaternoFocusLost(evt);
            }
        });
        ApellidoMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApellidoMaternoMousePressed(evt);
            }
        });
        ApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoMaternoKeyTyped(evt);
            }
        });
        jPanel1.add(ApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 367, 210, -1));

        ApellidoPaterno.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        ApellidoPaterno.setForeground(new java.awt.Color(153, 153, 153));
        ApellidoPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ApellidoPaterno.setText("Ingresar Apellido Paterno");
        ApellidoPaterno.setBorder(null);
        ApellidoPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ApellidoPaternoFocusLost(evt);
            }
        });
        ApellidoPaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApellidoPaternoMousePressed(evt);
            }
        });
        ApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoPaternoKeyTyped(evt);
            }
        });
        jPanel1.add(ApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 365, 190, -1));

        PrimerNombre.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        PrimerNombre.setForeground(new java.awt.Color(153, 153, 153));
        PrimerNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PrimerNombre.setText("Ingresar Primer Nombre");
        PrimerNombre.setBorder(null);
        PrimerNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PrimerNombreFocusLost(evt);
            }
        });
        PrimerNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrimerNombreMousePressed(evt);
            }
        });
        PrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrimerNombreKeyTyped(evt);
            }
        });
        jPanel1.add(PrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 200, -1));

        SegundoNombre.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        SegundoNombre.setForeground(new java.awt.Color(153, 153, 153));
        SegundoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SegundoNombre.setText("Ingresar Segundo Nombre");
        SegundoNombre.setBorder(null);
        SegundoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SegundoNombreFocusLost(evt);
            }
        });
        SegundoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SegundoNombreMousePressed(evt);
            }
        });
        SegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SegundoNombreKeyTyped(evt);
            }
        });
        jPanel1.add(SegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 210, -1));

        jLabel1.setBackground(new java.awt.Color(22, 82, 52));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Automático BakGo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1267, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void SalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalidaMouseClicked

    private void SalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidaMouseEntered
        Salida.setForeground(Color.white);
        PanelSalida.setBackground(Color.red);
    }//GEN-LAST:event_SalidaMouseEntered

    private void SalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalidaMouseExited
        Salida.setForeground(Color.black);
        PanelSalida.setBackground(Color.white);
    }//GEN-LAST:event_SalidaMouseExited

    private void RegistrarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarButtonMouseEntered
        RegistrarButton.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_RegistrarButtonMouseEntered

    private void RegistrarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarButtonMouseExited
        RegistrarButton.setBackground(new Color(22, 82, 52)); // Vuelve al color inicial
    }//GEN-LAST:event_RegistrarButtonMouseExited

    private void PrimerNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrimerNombreMousePressed
        if (PrimerNombre.getText().equals("Ingresar Primer Nombre")){
            PrimerNombre.setText("");
            PrimerNombre.setForeground(Color.black);
    }//GEN-LAST:event_PrimerNombreMousePressed
    }
    private void ApellidoPaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoPaternoMousePressed
        if (ApellidoPaterno.getText().equals("Ingresar Apellido Paterno")){
            ApellidoPaterno.setText("");
            ApellidoPaterno.setForeground(Color.black);
    }//GEN-LAST:event_ApellidoPaternoMousePressed
    }
    private void ApellidoMaternoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoMaternoMousePressed
        if (ApellidoMaterno.getText().equals("Ingresar Apellido Materno")){
            ApellidoMaterno.setText("");
            ApellidoMaterno.setForeground(Color.black);
    }//GEN-LAST:event_ApellidoMaternoMousePressed
    }
    private void CedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CedulaMousePressed
        if (Cedula.getText().equals("Ingresar Cédula")){
            Cedula.setText("");
            Cedula.setForeground(Color.black);
    }//GEN-LAST:event_CedulaMousePressed
}
    private void CorreoElectroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoElectroMousePressed
        if (CorreoElectro.getText().equals("Ingresar Correo Electrónico")){
            CorreoElectro.setText("");
            CorreoElectro.setForeground(Color.black);
    }//GEN-LAST:event_CorreoElectroMousePressed
}
    private void TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMousePressed
        if (Telefono.getText().equals("Ingresar Teléfono")){
            Telefono.setText("");
            Telefono.setForeground(Color.black);
        }
    }//GEN-LAST:event_TelefonoMousePressed

    private void ContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraMousePressed
        if(String.valueOf(Contra.getPassword()).equals("123456789123456789")){
            Contra.setText("");
            Contra.setForeground(Color.black);
        }
    }//GEN-LAST:event_ContraMousePressed

    private void ConfContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfContraMousePressed
        if(String.valueOf(ConfContra.getPassword()).equals("123456789123456789")){
            ConfContra.setText("");
            ConfContra.setForeground(Color.black);
        }
    }//GEN-LAST:event_ConfContraMousePressed

    private void PrimerNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrimerNombreFocusLost
        if (PrimerNombre.getText().equals("")) {
            PrimerNombre.setText("Ingresar Primer Nombre");
            PrimerNombre.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_PrimerNombreFocusLost

    private void ApellidoPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoPaternoFocusLost
    if (ApellidoPaterno.getText().equals("")) {
        ApellidoPaterno.setText("Ingresar Apellido Paterno");
        ApellidoPaterno.setForeground(Color.GRAY);
    }
    }//GEN-LAST:event_ApellidoPaternoFocusLost

    private void ApellidoMaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ApellidoMaternoFocusLost
    if (ApellidoMaterno.getText().equals("")) {
        ApellidoMaterno.setText("Ingresar Apellido Materno");
        ApellidoMaterno.setForeground(Color.GRAY);
    }//GEN-LAST:event_ApellidoMaternoFocusLost
    }
    private void CedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CedulaFocusLost
    if (Cedula.getText().equals("")) {
        Cedula.setText("Ingresar Cédula");
        Cedula.setForeground(Color.GRAY);
    }//GEN-LAST:event_CedulaFocusLost
    }
    private void CorreoElectroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoElectroFocusLost
    if (CorreoElectro.getText().equals("")) {
        CorreoElectro.setText("Ingresar Correo Electrónico");
        CorreoElectro.setForeground(Color.GRAY);
    }//GEN-LAST:event_CorreoElectroFocusLost
    }
    private void TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusLost
        if (Telefono.getText().equals("")) {
            Telefono.setText("Ingresar Teléfono");
            Telefono.setForeground(Color.GRAY);
    }//GEN-LAST:event_TelefonoFocusLost
}
    private void RegistrarTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarTextMouseEntered
        RegistrarButton.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_RegistrarTextMouseEntered

    private void RegistrarTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarTextMouseExited
        RegistrarButton.setBackground(new Color(22, 82, 52));
    }//GEN-LAST:event_RegistrarTextMouseExited

    private void RegistrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarButtonMouseClicked
    ValidacionDatos();
    }//GEN-LAST:event_RegistrarButtonMouseClicked

    private void SegundoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SegundoNombreMousePressed
        if (SegundoNombre.getText().equals("Ingresar Segundo Nombre")){
            SegundoNombre.setText("");
            SegundoNombre.setForeground(Color.black);
    }//GEN-LAST:event_SegundoNombreMousePressed
}
    private void SegundoNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SegundoNombreFocusLost
        if (SegundoNombre.getText().equals("")) {
            SegundoNombre.setText("");
            SegundoNombre.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_SegundoNombreFocusLost

    private void FechaNacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FechaNacimientoFocusLost
        if (FechaNacimiento.getText().equals("")) {
            FechaNacimiento.setText("AAAA-MM-DD");
            FechaNacimiento.setForeground(Color.GRAY);
    }//GEN-LAST:event_FechaNacimientoFocusLost
    }
    private void FechaNacimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaNacimientoMousePressed
        if(FechaNacimiento.getText().equals("AAAA-MM-DD")){
            FechaNacimiento.setText("");
            FechaNacimiento.setForeground(Color.black);
        }
    }//GEN-LAST:event_FechaNacimientoMousePressed

    private void PrimerNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrimerNombreKeyTyped
        if(PrimerNombre.getText().length() >=20){
            evt.consume(); //Evita el ingreso de mas caracteres despues de los 20
        }
    }//GEN-LAST:event_PrimerNombreKeyTyped

    private void SegundoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SegundoNombreKeyTyped
        if(SegundoNombre.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_SegundoNombreKeyTyped

    private void ApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoPaternoKeyTyped
        if(ApellidoPaterno.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_ApellidoPaternoKeyTyped

    private void ApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoMaternoKeyTyped
        if(ApellidoMaterno.getText().length()>=20){
            evt.consume();
        }
    }//GEN-LAST:event_ApellidoMaternoKeyTyped

    private void CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyTyped
            char c = evt.getKeyChar(); //Obtiene el carácter que el usuario intenta ingresar al campo de texto
            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) { //Verifica que el caracter no sea numerico
                evt.consume(); //cancela la acción de la tecla para que el caracter no sea ingresado en el campo de texto
                JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de Valores Numéricos");
            }
            if(Cedula.getText().length()>=10){ //Verifica la longitud del valor siendo ingresado en el campo
                evt.consume();
            }
    }//GEN-LAST:event_CedulaKeyTyped

    private void CorreoElectroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoElectroKeyTyped
        if(CorreoElectro.getText().length()>=35){
            evt.consume();
        }
    }//GEN-LAST:event_CorreoElectroKeyTyped

    private void FechaNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaNacimientoKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == '-' || c == KeyEvent.VK_BACK_SPACE)) {
        evt.consume(); // Descartar el evento si no es número ni guion
        JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de valores numéricos y guiones.");
}
        if(FechaNacimiento.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_FechaNacimientoKeyTyped

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de Valores Numéricos");
            }
        if(Telefono.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    private void ContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraKeyTyped
        if(String.valueOf(Contra.getPassword()).length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_ContraKeyTyped

    private void ConfContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfContraKeyTyped
        if(String.valueOf(ConfContra.getPassword()).length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_ConfContraKeyTyped

    private void RegistrarTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarTextMouseClicked
        ValidacionDatos();
    }//GEN-LAST:event_RegistrarTextMouseClicked

    private void PanelSalidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSalidaMouseEntered
        PanelSalida.setBackground(Color.red);
    }//GEN-LAST:event_PanelSalidaMouseEntered

    private void PanelSalidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSalidaMouseExited
        PanelSalida.setBackground(Color.white);
    }//GEN-LAST:event_PanelSalidaMouseExited

private void ValidacionDatos(){
    //Captura de Datos desde la GUi
    String PrimerNombretxt = PrimerNombre.getText();
    String SegundoNombretxt = SegundoNombre.getText();
    String ApellidoPaternotxt = ApellidoPaterno.getText();
    String ApellidoMaternotxt = ApellidoMaterno.getText();
    String Cedulatxt = Cedula.getText();
    String CorreoElectrotxt = CorreoElectro.getText();
    String FechaNacimientotxt = FechaNacimiento.getText();
    String Telefonotxt = Telefono.getText();
    String Contratxt = String.valueOf(Contra.getPassword());
    String ConfContratxt = String.valueOf(ConfContra.getPassword());
    LocalDateTime fechaReg = LocalDateTime.now(); //Obtención de la fecha y hora actual en la que se establece el registro
    //Condicional para establecer el Segundo Nombre de campo vacío como un campo vacío
    if (SegundoNombretxt.equals("") || SegundoNombretxt.equals("Ingresar Segundo Nombre")){
        SegundoNombretxt = "";
    }
    //Condificonal para validar que todos los datos hayan sido ingresados
    if (PrimerNombretxt.equals("Ingresar Primer Nombre") || 
    ApellidoPaternotxt.equals("Ingresar Apellido Paterno") || 
    ApellidoMaternotxt.equals("Ingresar Apellido Materno") || 
    Cedulatxt.equals("Ingresar Cédula") ||
    FechaNacimientotxt.equals("AAAA-MM-DD") ||
    Telefonotxt.equals("Ingresar Teléfono") ||
    CorreoElectrotxt.equals("Ingresar Correo Electrónico") || 
    Contratxt.isEmpty() || ConfContratxt.isEmpty() || Contratxt.equals("123456789123456789") || ConfContratxt.equals("123456789123456789")) {
        JOptionPane.showMessageDialog(this,
            "Los campos deben ser llenados",
            "Ingrese correctamente",
            JOptionPane.ERROR_MESSAGE);
        return; //Si se cumple el condicional se detiene el registro con este return
    }
    // Validar que las contraseñas coincidan
    if (!Contratxt.equals(ConfContratxt)) {
        JOptionPane.showMessageDialog(this,
            "Las contraseñas no coinciden",
            "Intente de nuevo",
        JOptionPane.ERROR_MESSAGE);
        return;
    }
    //Verificar que tenga un @ y .
    if (!CorreoElectrotxt.contains("@") || !CorreoElectrotxt.contains(".")) {
        JOptionPane.showMessageDialog(this,
            "El correo debe contener '@' y un punto '.'.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return; 
    }
    //Verificar que tenga el formato adecuado
        if (!FechaNacimientotxt.matches("\\d{4}-\\d{2}-\\d{2}")) {
            // \\ significa digitos del 0 al 9, la d{4} establece la cantidad de digitos
        JOptionPane.showMessageDialog(this,
            "La fecha de nacimiento debe tener el formato 'AAAA-MM-DD'.",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        return; // Detener el registro
    }
    RegistroUsuarioDAO registroDAO = new RegistroUsuarioDAO(); //Instancia del objeto
    //Revisar la validación de telefono, cedula y correo
    if (registroDAO.verificacionDuplicadoced(Cedulatxt)){
    JOptionPane.showMessageDialog(this,
            "La cédula ya está registrados en la base de datos. Verificar",
            "Error de registro",
            JOptionPane.ERROR_MESSAGE);
            return;
    }
    if (registroDAO.verificacionDuplicadotele(Telefonotxt)){
    JOptionPane.showMessageDialog(this,
            "El teléfono ya está registrados en la base de datos. Verificar",
            "Error de registro",
            JOptionPane.ERROR_MESSAGE);
            return;
    }
    if (registroDAO.verificacionDuplicadocorre(CorreoElectrotxt)){
    JOptionPane.showMessageDialog(this,
            "El correo ya está registrados en la base de datos. Verificar",
            "Error de registro",
            JOptionPane.ERROR_MESSAGE);
            return;
    }
    //Creación del objeto con la información de la GUI
    RegistrarUsuario usuario = new RegistrarUsuario(PrimerNombretxt, SegundoNombretxt, ApellidoPaternotxt, ApellidoMaternotxt, 
        Cedulatxt, CorreoElectrotxt, FechaNacimientotxt, Telefonotxt, 
        Contratxt, ConfContratxt, fechaReg.toLocalDate());
    //Registro de usuario con el método reg
        RegistrarUsuario registrado = registroDAO.reg(usuario.getPrimerNombretxt(), usuario.getSegundoNombretxt(), 
        usuario.getApellidoPaternotxt(), usuario.getApellidoMaternotxt(), usuario.getCedulatxt(), 
        usuario.getFechaNacimientotxt(), usuario.getTelefonotxt(), usuario.getFechaReg(), 
        usuario.getContratxt(), usuario.getCorreoElectrotxt());

    // Validar que el usuario fue registrado correctamente
    if (registrado != null) {
        JOptionPane.showMessageDialog(this, "Usuario registrado correctamente.");
        InicioSesion Inicio= new InicioSesion();
        Inicio.setVisible(true);
        this.setVisible(false);
        // Proceder con lo siguiente (cerrar ventana, redirigir, etc.)
    } else {
        JOptionPane.showMessageDialog(this, "Fallo en el registro", "Intenta de nuevo", JOptionPane.ERROR_MESSAGE);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoMaterno;
    private javax.swing.JTextField ApellidoPaterno;
    private javax.swing.JTextField Cedula;
    private javax.swing.JPasswordField ConfContra;
    private javax.swing.JPasswordField Contra;
    private javax.swing.JTextField CorreoElectro;
    private javax.swing.JTextField FechaNacimiento;
    private javax.swing.JPanel PanelSalida;
    private javax.swing.JTextField PrimerNombre;
    private javax.swing.JPanel RegistrarButton;
    private javax.swing.JLabel RegistrarText;
    private javax.swing.JLabel Salida;
    private javax.swing.JTextField SegundoNombre;
    private javax.swing.JTextField Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    
}

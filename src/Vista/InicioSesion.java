package Vista;

import Modelo.LoginDAO;
import Modelo.LoginDataUser;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {
    int mouseX, mouseY;

    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cedula = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        Registrate = new javax.swing.JLabel();
        bt_x = new javax.swing.JPanel();
        lb_x = new javax.swing.JLabel();
        bt_iniciar = new javax.swing.JPanel();
        lb_iniciar = new javax.swing.JLabel();
        Barra_superior = new javax.swing.JPanel();
        img_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cedula.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Cedula.setForeground(new java.awt.Color(153, 153, 153));
        Cedula.setText("Ingresa tu numero de Cédula");
        Cedula.setBorder(null);
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
        jPanel1.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Contraseña.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(153, 153, 153));
        Contraseña.setText("************");
        Contraseña.setBorder(null);
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraseñaMousePressed(evt);
            }
        });
        Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 436, 250, -1));

        Registrate.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        Registrate.setForeground(new java.awt.Color(0, 204, 51));
        Registrate.setText(".Registrate");
        Registrate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrateMouseExited(evt);
            }
        });
        jPanel1.add(Registrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, 30));

        bt_x.setBackground(new java.awt.Color(255, 255, 255));

        lb_x.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lb_x.setText("  X");
        lb_x.setToolTipText("");
        lb_x.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_xMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bt_xLayout = new javax.swing.GroupLayout(bt_x);
        bt_x.setLayout(bt_xLayout);
        bt_xLayout.setHorizontalGroup(
            bt_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bt_xLayout.setVerticalGroup(
            bt_xLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_x, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(bt_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        bt_iniciar.setBackground(new java.awt.Color(0, 102, 51));
        bt_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        bt_iniciar.setToolTipText("");

        lb_iniciar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lb_iniciar.setForeground(new java.awt.Color(255, 255, 255));
        lb_iniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iniciar.setText("Iniciar Sesión");
        lb_iniciar.setToolTipText("");
        lb_iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_iniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_iniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_iniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bt_iniciarLayout = new javax.swing.GroupLayout(bt_iniciar);
        bt_iniciar.setLayout(bt_iniciarLayout);
        bt_iniciarLayout.setHorizontalGroup(
            bt_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        bt_iniciarLayout.setVerticalGroup(
            bt_iniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(bt_iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 140, 40));

        Barra_superior.setBackground(new java.awt.Color(255, 255, 255));
        Barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_superiorMouseDragged(evt);
            }
        });
        Barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_superiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Barra_superiorLayout = new javax.swing.GroupLayout(Barra_superior);
        Barra_superior.setLayout(Barra_superiorLayout);
        Barra_superiorLayout.setHorizontalGroup(
            Barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        Barra_superiorLayout.setVerticalGroup(
            Barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        img_fondo.setBackground(new java.awt.Color(255, 255, 255));
        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio de sesion.png"))); // NOI18N
        jPanel1.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_superiorMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_Barra_superiorMousePressed

    private void Barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_Barra_superiorMouseDragged

    private void lb_xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_xMouseClicked

    private void lb_xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_xMouseEntered
        bt_x.setBackground(Color.red);
        lb_x.setForeground(Color.white);
    }//GEN-LAST:event_lb_xMouseEntered

    private void lb_xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_xMouseExited
        bt_x.setBackground(Color.white);
        lb_x.setForeground(Color.black);
    }//GEN-LAST:event_lb_xMouseExited

    private void RegistrateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrateMouseEntered
        Registrate.setForeground(Color.green);
    }//GEN-LAST:event_RegistrateMouseEntered

    private void RegistrateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrateMouseExited
        Registrate.setForeground(new Color(51,204,0));
    }//GEN-LAST:event_RegistrateMouseExited

    private void CedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CedulaMousePressed
        if (Cedula.getText().equals("Ingresa tu numero de Cédula")) {
            Cedula.setText("");
            Cedula.setForeground(Color.black);
        }
        if (String.valueOf(Contraseña.getPassword()).isEmpty()) {
        Contraseña.setText("************");
        Contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CedulaMousePressed

    private void ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMousePressed
        if (String.valueOf(Contraseña.getPassword()).equals("************")) {
        Contraseña.setText("");
        Contraseña.setForeground(Color.black);
        }
        if (Cedula.getText().isEmpty()) {
        Cedula.setText("Ingresa tu numero de Cédula");
        Cedula.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContraseñaMousePressed

    private void lb_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_iniciarMouseClicked
        validar();
    }//GEN-LAST:event_lb_iniciarMouseClicked

    private void lb_iniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_iniciarMouseEntered
        bt_iniciar.setBackground(Color.green);
    }//GEN-LAST:event_lb_iniciarMouseEntered

    private void lb_iniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_iniciarMouseExited
        bt_iniciar.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_lb_iniciarMouseExited

    private void RegistrateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrateMouseClicked
        Registro reg = new Registro();
                reg.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_RegistrateMouseClicked

    private void CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CedulaKeyTyped
        if(Cedula.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_CedulaKeyTyped

    private void ContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContraseñaKeyTyped
        if(String.valueOf(Contraseña.getPassword()).length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_ContraseñaKeyTyped

    
private LoginDataUser userData = null;
//userData es el nombre del atributo, LoginDataUser es el tipo de dato
private boolean loggedIn = false;

public boolean isLoggedIn() {
    return loggedIn; // permite conocer si esta logueado o no
}

public LoginDataUser getUserData() {
    return userData; // Retorna los datos del usuario después del inicio de sesión
}

    public void validar() {
        String cedula = Cedula.getText();
        String contraseña = new String(Contraseña.getPassword());
        if (!cedula.isEmpty() && !contraseña.isEmpty()) {
            LoginDAO dao = new LoginDAO(); //Instancia del objeto
            LoginDataUser userData = dao.log(cedula,contraseña);  //Se establece que el objeto de tipo LoginDataUser va a tener con los campos ingresados de cedula y contraseña, el objeto es llenado con la info
            if (userData.getCedula() != null && userData.getContraseña() != null) { 
                loggedIn = true;//Se realiza el log
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                // Pasar datos a la nueva ventana
                InicioCuentas cuentas = new InicioCuentas(userData);
                cuentas.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor llena todos los campos");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_superior;
    private javax.swing.JTextField Cedula;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Registrate;
    private javax.swing.JPanel bt_iniciar;
    private javax.swing.JPanel bt_x;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_iniciar;
    private javax.swing.JLabel lb_x;
    // End of variables declaration//GEN-END:variables
}

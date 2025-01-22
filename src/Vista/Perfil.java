
package Vista;

import Modelo.LoginDataUser;
import java.awt.Color;
import Modelo.PerfilDAO;
import Modelo.RegistrarUsuario;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Perfil extends javax.swing.JFrame {
    int mouseX, mouseY;
    private LoginDataUser userData;

    public Perfil(LoginDataUser userData) {
        this.userData = userData;
        initComponents();
        perfilfuncion();
        
        this.setLocationRelativeTo(this);
        setmenuimage(bt_menu, "src/Imagenes/Menu.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pcedula = new javax.swing.JLabel();
        pnumbre1 = new javax.swing.JLabel();
        pnombre2 = new javax.swing.JLabel();
        papellido1 = new javax.swing.JLabel();
        papellido2 = new javax.swing.JLabel();
        pcorreo = new javax.swing.JLabel();
        ptelefono = new javax.swing.JLabel();
        pcontraseña = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_menu = new javax.swing.JLabel();
        bt_cerrar = new javax.swing.JPanel();
        lb_cerrar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pcedula.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        pcedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pcedula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 190, 30));

        pnumbre1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        pnumbre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pnumbre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 170, 30));

        pnombre2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        pnombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pnombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 200, 30));

        papellido1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        papellido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(papellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 180, 30));

        papellido2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        papellido2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(papellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 200, 30));

        pcorreo.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        pcorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 280, 30));

        ptelefono.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        ptelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ptelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 290, 30));

        pcontraseña.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        pcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(pcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 570, 280, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
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

        bt_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        bt_cerrar.setBackground(new java.awt.Color(0, 102, 51));
        bt_cerrar.setForeground(new java.awt.Color(0, 102, 51));
        bt_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lb_cerrar.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lb_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        lb_cerrar.setText("     Cerrar Sesión");
        lb_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bt_cerrarLayout = new javax.swing.GroupLayout(bt_cerrar);
        bt_cerrar.setLayout(bt_cerrarLayout);
        bt_cerrarLayout.setHorizontalGroup(
            bt_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        bt_cerrarLayout.setVerticalGroup(
            bt_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(bt_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 640, 190, 50));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Perfil.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setmenuimage(JLabel menu, String rootmenu) {
    ImageIcon image = new ImageIcon(rootmenu);
    Image scaledImage = image.getImage().getScaledInstance(menu.getWidth(), menu.getHeight(), Image.SCALE_DEFAULT);
    Icon icon = new ImageIcon(scaledImage);
    menu.setIcon(icon);
    this.repaint();
    }
    
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getX();
        int y = evt.getY();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void lb_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_cerrarMouseClicked

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        bt_cerrar.setBackground(new Color(51,204,0));
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void lb_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseExited
        bt_cerrar.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_lb_cerrarMouseExited

    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Menu menu = new Menu(userData);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_menuMouseClicked

    private void perfilfuncion() {
    
    PerfilDAO perDAO = new PerfilDAO();
    RegistrarUsuario perfil = perDAO.infoperfil(userData);

    pnumbre1.setText(perfil.getPrimerNombretxt());
    pnombre2.setText(perfil.getSegundoNombretxt());
    papellido1.setText(perfil.getApellidoMaternotxt());
    papellido2.setText(perfil.getApellidoPaternotxt());
    pcedula.setText(perfil.getCedulatxt());
    pcorreo.setText(perfil.getCorreoElectrotxt());
    ptelefono.setText(perfil.getTelefonotxt());
    pcontraseña.setText(perfil.getContratxt());
}

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bt_cerrar;
    private javax.swing.JLabel bt_menu;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel papellido1;
    private javax.swing.JLabel papellido2;
    private javax.swing.JLabel pcedula;
    private javax.swing.JLabel pcontraseña;
    private javax.swing.JLabel pcorreo;
    private javax.swing.JLabel pnombre2;
    private javax.swing.JLabel pnumbre1;
    private javax.swing.JLabel ptelefono;
    // End of variables declaration//GEN-END:variables
}

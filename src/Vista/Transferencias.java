
package Vista;

import Modelo.LoginDataUser;
import Modelo.TransferenciasDAO;
import Modelo.TransferenciasDataUser;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Transferencias extends javax.swing.JFrame {
    int mouseX, mouseY;
    private LoginDataUser userData;

    public Transferencias(LoginDataUser userData) {
        this.userData = userData;
        initComponents();
        this.setLocationRelativeTo(this);
        setmenuimage(bt_menu, "src/Imagenes/Menu.png");
        setmenuimage(bt_perfil, "src/Imagenes/perfil.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        PanelBase_Transferencias = new javax.swing.JPanel();
        Titulo_InfoCuenta = new javax.swing.JLabel();
        Titulo_NumCuenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        C_tran = new javax.swing.JTextField();
        bt_valc = new javax.swing.JPanel();
        lb_valc = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        DueñoCuenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        monto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Descrip = new javax.swing.JTextField();
        bt_conf = new javax.swing.JPanel();
        lb_conf = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DatoMonto = new javax.swing.JLabel();
        DatoCuentaT = new javax.swing.JLabel();
        DatoCuentaR = new javax.swing.JLabel();
        DatoBen = new javax.swing.JLabel();
        DatoDestino = new javax.swing.JLabel();
        bt_tran = new javax.swing.JPanel();
        lb_tran = new javax.swing.JLabel();
        Barra_Superior = new javax.swing.JPanel();
        bt_perfil = new javax.swing.JLabel();
        bt_menu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Desde = new javax.swing.JTextField();
        Prueba = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelBase_Transferencias.setBackground(new java.awt.Color(255, 255, 255));
        PanelBase_Transferencias.setMinimumSize(new java.awt.Dimension(1920, 1080));
        PanelBase_Transferencias.setPreferredSize(new java.awt.Dimension(1920, 1080));
        PanelBase_Transferencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo_InfoCuenta.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        Titulo_InfoCuenta.setText("Información de la cuenta");
        PanelBase_Transferencias.add(Titulo_InfoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        Titulo_NumCuenta.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Titulo_NumCuenta.setText("Nro. de cuenta:");
        PanelBase_Transferencias.add(Titulo_NumCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PanelBase_Transferencias.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 250, 10));

        C_tran.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        C_tran.setForeground(new java.awt.Color(153, 153, 153));
        C_tran.setText("Nº de cuenta a transferir");
        C_tran.setBorder(null);
        C_tran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                C_tranMousePressed(evt);
            }
        });
        PanelBase_Transferencias.add(C_tran, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, 30));

        bt_valc.setBackground(new java.awt.Color(0, 102, 51));

        lb_valc.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lb_valc.setForeground(new java.awt.Color(255, 255, 255));
        lb_valc.setText("  Validar Cuenta");
        lb_valc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_valc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_valc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_valcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_valcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_valcMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bt_valcLayout = new javax.swing.GroupLayout(bt_valc);
        bt_valc.setLayout(bt_valcLayout);
        bt_valcLayout.setHorizontalGroup(
            bt_valcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_valc, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        bt_valcLayout.setVerticalGroup(
            bt_valcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_valc, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelBase_Transferencias.add(bt_valc, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 170, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Esta cuenta pertenece a:");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        DueñoCuenta.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(DueñoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DueñoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        PanelBase_Transferencias.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 120, 600, 120));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel3.setText("Ingresar Monto a Transferir:");
        PanelBase_Transferencias.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        PanelBase_Transferencias.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 380, 20));

        monto.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        monto.setForeground(new java.awt.Color(153, 153, 153));
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto.setText("Ingresar el monto que Transferir");
        monto.setBorder(null);
        monto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                montoMousePressed(evt);
            }
        });
        PanelBase_Transferencias.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 340, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel4.setText("Descripción");
        PanelBase_Transferencias.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        PanelBase_Transferencias.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 1310, 10));

        Descrip.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Descrip.setForeground(new java.awt.Color(153, 153, 153));
        Descrip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Descrip.setText("Ingrese la descripción de la transferencia");
        Descrip.setBorder(null);
        Descrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DescripMousePressed(evt);
            }
        });
        PanelBase_Transferencias.add(Descrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 450, 1150, 30));

        bt_conf.setBackground(new java.awt.Color(0, 102, 51));

        lb_conf.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lb_conf.setForeground(new java.awt.Color(255, 255, 255));
        lb_conf.setText("        Confirmar");
        lb_conf.setToolTipText("");
        lb_conf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_conf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_conf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_confMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_confMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_confMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bt_confLayout = new javax.swing.GroupLayout(bt_conf);
        bt_conf.setLayout(bt_confLayout);
        bt_confLayout.setHorizontalGroup(
            bt_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_conf, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        bt_confLayout.setVerticalGroup(
            bt_confLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_conf, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        PanelBase_Transferencias.add(bt_conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 190, 50));

        jLabel6.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel6.setText("Desde:");
        PanelBase_Transferencias.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, -1, 50));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        PanelBase_Transferencias.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 460, 10));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel7.setText("Confirmar los datos de la transferencia");
        PanelBase_Transferencias.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, -1, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel8.setText("Monto a Transferir:");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel9.setText("Nº de Cuenta que transfiere:");

        jLabel10.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel10.setText("Nº de Cuenta que recibe:");

        jLabel11.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel11.setText("Beneficiario:");

        jLabel12.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel12.setText("Banco Destino:");

        DatoMonto.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        DatoCuentaT.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        DatoCuentaR.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        DatoBen.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        DatoDestino.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DatoMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(DatoCuentaT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoCuentaR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoBen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoCuentaT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoCuentaR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DatoBen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(DatoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelBase_Transferencias.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 670, 830, 290));

        bt_tran.setBackground(new java.awt.Color(0, 102, 51));

        lb_tran.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        lb_tran.setForeground(new java.awt.Color(255, 255, 255));
        lb_tran.setText("  Transferir y Finalizar");
        lb_tran.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_tran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_tranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_tranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_tranMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bt_tranLayout = new javax.swing.GroupLayout(bt_tran);
        bt_tran.setLayout(bt_tranLayout);
        bt_tranLayout.setHorizontalGroup(
            bt_tranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_tran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bt_tranLayout.setVerticalGroup(
            bt_tranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_tran, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        PanelBase_Transferencias.add(bt_tran, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 750, 340, -1));

        Barra_Superior.setBackground(new java.awt.Color(0, 102, 51));
        Barra_Superior.setPreferredSize(new java.awt.Dimension(1920, 80));
        Barra_Superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_SuperiorMouseDragged(evt);
            }
        });
        Barra_Superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_SuperiorMousePressed(evt);
            }
        });

        bt_perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_perfilMouseClicked(evt);
            }
        });

        bt_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_menuMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Transferencias");

        javax.swing.GroupLayout Barra_SuperiorLayout = new javax.swing.GroupLayout(Barra_Superior);
        Barra_Superior.setLayout(Barra_SuperiorLayout);
        Barra_SuperiorLayout.setHorizontalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_SuperiorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1500, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bt_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        Barra_SuperiorLayout.setVerticalGroup(
            Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_SuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                        .addGroup(Barra_SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Barra_SuperiorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(bt_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Barra_SuperiorLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelBase_Transferencias.add(Barra_Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 80));

        Desde.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        Desde.setForeground(new java.awt.Color(153, 153, 153));
        Desde.setText("Ingresa tu número de cuenta");
        Desde.setBorder(null);
        Desde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DesdeMousePressed(evt);
            }
        });
        PanelBase_Transferencias.add(Desde, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 430, 30));

        Prueba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PanelBase_Transferencias.add(Prueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase_Transferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBase_Transferencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void Barra_SuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_Barra_SuperiorMousePressed

    private void Barra_SuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_SuperiorMouseDragged
        int x = evt.getX();
        int y = evt.getY();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_Barra_SuperiorMouseDragged

    private void lb_valcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_valcMouseEntered
        bt_valc.setBackground(new Color(0,204,51));
        
    }//GEN-LAST:event_lb_valcMouseEntered

    private void lb_valcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_valcMouseExited
        bt_valc.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_lb_valcMouseExited

    private void lb_confMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_confMouseEntered
        bt_conf.setBackground(new Color(0,204,51));
    }//GEN-LAST:event_lb_confMouseEntered

    private void lb_confMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_confMouseExited
        bt_conf.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_lb_confMouseExited

    private void lb_tranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_tranMouseEntered
        bt_tran.setBackground(new Color(0,204,51));
    }//GEN-LAST:event_lb_tranMouseEntered

    private void lb_tranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_tranMouseExited
        bt_tran.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_lb_tranMouseExited

    private void C_tranMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_tranMousePressed
        //Restricciones
        C_tran.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                e.consume();
                JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de Valores Numéricos");
            }
            if (C_tran.getText().length() >= 10) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de caracteres permitidos.");
            }
        }
    });
        
        if (C_tran.getText().equals("Nº de cuenta a transferir")) {
            C_tran.setText("");
            C_tran.setForeground(Color.black);
        }
        if (monto.getText().isEmpty()) {
        monto.setText("Ingresar el monto que Transferir");
        monto.setForeground(Color.gray);
        }
        if (Descrip.getText().isEmpty()) {
        Descrip.setText("Ingrese la descripción de la transferencia");
        Descrip.setForeground(Color.gray);
        }
        if (Desde.getText().isEmpty()) {
        Desde.setText("Ingresa tu número de cuenta");
        Desde.setForeground(Color.gray);
        }
        
        // Condicion de extención
        if(C_tran.getText().length()>=11){
            evt.consume();
        }
    }//GEN-LAST:event_C_tranMousePressed

    private void montoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montoMousePressed
        //Restricciones
        monto.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();

            // Permitir solo números, punto (.) y tecla de retroceso
            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != '.') {
                e.consume();
                JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de Valores Numéricos y el punto (.)");
            }
        }
    });
        
        if (monto.getText().equals("Ingresar el monto que Transferir")) {
            monto.setText("");
            monto.setForeground(Color.black);
        }
        if (C_tran.getText().isEmpty()) {
        C_tran.setText("Nº de cuenta a transferir");
        C_tran.setForeground(Color.gray);
        }
        if (Descrip.getText().isEmpty()) {
        Descrip.setText("Ingrese la descripción de la transferencia");
        Descrip.setForeground(Color.gray);
        }
        if (Desde.getText().isEmpty()) {
        Desde.setText("Ingresa tu número de cuenta");
        Desde.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_montoMousePressed

    private void DescripMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescripMousePressed
        //Restricciones
        Descrip.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (Descrip.getText().length() >= 55) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de caracteres permitidos.");
            }
        }
    });
        
        if (Descrip.getText().equals("Ingrese la descripción de la transferencia")) {
            Descrip.setText("");
            Descrip.setForeground(Color.black);
        }
        if (C_tran.getText().isEmpty()) {
        C_tran.setText("Nº de cuenta a transferir");
        C_tran.setForeground(Color.gray);
        }
        if (monto.getText().isEmpty()) {
        monto.setText("Ingresar el monto que Transferir");
        monto.setForeground(Color.gray);
        }
        if (Desde.getText().isEmpty()) {
        Desde.setText("Ingresa tu número de cuenta");
        Desde.setForeground(Color.gray);
        }
    }//GEN-LAST:event_DescripMousePressed

    private void lb_valcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_valcMouseClicked
        String ncuenta = C_tran.getText();
        TransferenciasDAO nombredata = new TransferenciasDAO();
        TransferenciasDataUser nombreData = nombredata.mostrarNombre(ncuenta); 
        if (nombreData == null) {
            JOptionPane.showMessageDialog(null, "Número de cuenta no encontrado");
        } else {
            DueñoCuenta.setText(nombreData.getNcuenta());
        }
              
    }//GEN-LAST:event_lb_valcMouseClicked

    private void DesdeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesdeMousePressed
        Desde.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE) {
                e.consume();
                JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de Valores Numéricos");
            }
            if (Desde.getText().length() >= 10) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Se ha alcanzado el límite de caracteres permitidos.");
            }
        }
    });

        if (Desde.getText().equals("Ingresa tu número de cuenta")) {
            Desde.setText("");
            Desde.setForeground(Color.black);
        }
        if (C_tran.getText().isEmpty()) {
        C_tran.setText("Nº de cuenta a transferir");
        C_tran.setForeground(Color.gray);
        }
        if (monto.getText().isEmpty()) {
        monto.setText("Ingresar el monto que Transferir");
        monto.setForeground(Color.gray);
        }
        if (Descrip.getText().isEmpty()) {
        Descrip.setText("Ingrese la descripción de la transferencia");
        Descrip.setForeground(Color.gray);
        }
    }//GEN-LAST:event_DesdeMousePressed

    private void lb_confMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_confMouseClicked
        
        String ncuenta = Desde.getText();
        TransferenciasDAO nombreplata = new TransferenciasDAO();
        TransferenciasDataUser nombrePlata = nombreplata.mostrarDinero(ncuenta); 
           
        String ValorString = (nombrePlata.getSaldo());
        double saldo1 = Double.parseDouble(ValorString);
        
        String entrada = monto.getText();
        double Entradadinero = Double.parseDouble(entrada);
        
        if (Entradadinero > saldo1) {
            JOptionPane.showMessageDialog(null, "El monto ingresado supera tu saldo actual. Chambea que te falta plata");
        } else {
            String immonto = monto.getText();
            String inCuentaT = Desde.getText();
            String inCuentaR = C_tran.getText();
            String Beneficiario = DueñoCuenta.getText();

            DatoMonto.setText(immonto);
            DatoCuentaT.setText(inCuentaT);
            DatoCuentaR.setText(inCuentaR);
            DatoBen.setText(Beneficiario);
            DatoDestino.setText("BankGo");

        }
    }//GEN-LAST:event_lb_confMouseClicked

    private void lb_tranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_tranMouseClicked

        String numerocuenta1 = Desde.getText();  // Primer número de cuenta
        String numerocuenta2 = C_tran.getText();
        String e = monto.getText();
        double montotra = Double.parseDouble(e);
        LocalDateTime fechaReg = LocalDateTime.now();
        String Descripcion = Descrip.getText();
        TransferenciasDAO IncertFinal = new TransferenciasDAO();
        TransferenciasDataUser IDcuenta1 = IncertFinal.ID(numerocuenta1);
        TransferenciasDataUser IDcuenta2 = IncertFinal.ID(numerocuenta2);
        TransferenciasDataUser Incert = new TransferenciasDataUser(IDcuenta1, IDcuenta2, montotra, fechaReg.toLocalDate(), Descripcion);
        

        TransferenciasDataUser registro = IncertFinal.InsertTrans(Incert.getIDcuenta1(), Incert.getIDcuenta2(), Incert.getMontotra(), Incert.getFechaReg(), Incert.getDescripcion());
        if (registro != null) {
        JOptionPane.showMessageDialog(null, "La Transferencia fue realizada de manera exitosa");
        C_tran.setText("");
        DueñoCuenta.setText("");
        monto.setText("");
        Desde.setText("");
        Descrip.setText("");
        DatoMonto.setText("");
        DatoCuentaT.setText("");
        DatoCuentaR.setText("");
        DatoBen.setText("");
        DatoDestino.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Fallo en la Transferencia", "Intenta de nuevo", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_lb_tranMouseClicked

    private void bt_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_menuMouseClicked
        Menu menu = new Menu(userData);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_menuMouseClicked

    private void bt_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_perfilMouseClicked
        Perfil perfil = new Perfil(userData);
        perfil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_perfilMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Superior;
    private javax.swing.JTextField C_tran;
    private javax.swing.JLabel DatoBen;
    private javax.swing.JLabel DatoCuentaR;
    private javax.swing.JLabel DatoCuentaT;
    private javax.swing.JLabel DatoDestino;
    private javax.swing.JLabel DatoMonto;
    private javax.swing.JTextField Descrip;
    private javax.swing.JTextField Desde;
    private javax.swing.JLabel DueñoCuenta;
    private javax.swing.JPanel PanelBase_Transferencias;
    private javax.swing.JLabel Prueba;
    private javax.swing.JLabel Titulo_InfoCuenta;
    private javax.swing.JLabel Titulo_NumCuenta;
    private javax.swing.JPanel bt_conf;
    private javax.swing.JLabel bt_menu;
    private javax.swing.JLabel bt_perfil;
    private javax.swing.JPanel bt_tran;
    private javax.swing.JPanel bt_valc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lb_conf;
    private javax.swing.JLabel lb_tran;
    private javax.swing.JLabel lb_valc;
    private javax.swing.JTextField monto;
    // End of variables declaration//GEN-END:variables
}

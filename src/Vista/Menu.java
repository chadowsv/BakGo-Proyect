package Vista;

import Modelo.LoginDataUser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {
    private LoginDataUser userData;
    private JPanel Principal;
    public Menu(LoginDataUser userData){
        this.userData = userData;
        initComponents();
    }
    private void initComponents() {
        this.userData = userData;
        setUndecorated(true);
        Principal = new JPanel();
        Principal.setBounds(0,0,1920,1080);
        Principal.setLayout(null);
        // JLabel para el panel de la cuenta
        JLabel panelMenu = new JLabel();
        ImageIcon fondomenu = new ImageIcon(getClass().getResource("/Imagenes/basemenu.png"));
        Image fondoRedimensionado = fondomenu.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
        fondomenu = new ImageIcon(fondoRedimensionado);
        panelMenu.setIcon(fondomenu);
        panelMenu.setBounds(0,0,1920,1080); // Posición y tamaño del panel
        // Agregar el panel al JFrame
        
        //Label de Menú
        JLabel Menutxt = new JLabel();
        Menutxt.setText("MENÚ");
        Menutxt.setForeground(Color.WHITE);
        Menutxt.setFont(new Font("Serif", Font.BOLD, 100));
        Menutxt.setBounds(810,30,700,120);
        Principal.add(Menutxt);
        // Panel de las cuentas
        JPanel cuentas = new JPanel();
        cuentas.setLayout(null);
        cuentas.setBackground(new Color(0,102,51));
        cuentas.setBounds(583,188,750,126);
        cuentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //Label Casita
        JLabel Casita = new JLabel();
        //Dimensiones 300x325
        //linea blanca de separacion tiene 750
        ImageIcon casitaicono = new ImageIcon(getClass().getResource("/Imagenes/Casitaicon.png"));
        Image casitaredi = casitaicono.getImage().getScaledInstance(70,76, Image.SCALE_SMOOTH);
        casitaicono = new ImageIcon(casitaredi);
        Casita.setIcon(casitaicono);
        Casita.setBounds(340,25,70,76);
        Casita.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                InicioCuentas cuentas =  new InicioCuentas(userData);
                cuentas.setVisible(true);
                dispose();
            }
        });
        cuentas.add(Casita);
        Principal.add(cuentas);
        //Panel de Transferencias
        JPanel transferenpan = new JPanel();
        transferenpan.setLayout(null);
        transferenpan.setBackground(new Color(0,102,51));
        transferenpan.setBounds(583,319,750,124);
        transferenpan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //Texto transferencias
        JLabel transf = new JLabel();
        transf.setText("Transferencias");
        transf.setFont(new Font("Serif", Font.PLAIN, 70));
        transf.setForeground(Color.WHITE);
        transf.setBounds(180,15,900,124);
        transferenpan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        transferenpan.add(transf);
        transferenpan.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt){
            Transferencias transferencia = new Transferencias(userData);
            transferencia.setVisible(true);
            dispose();
        }
        });
        Principal.add(transferenpan);
        //Panel Préstamos
        JPanel presta = new JPanel();
        presta.setLayout(null);
        presta.setBackground(new Color(0,102,51));
        presta.setBounds(583,448,750,124);
        presta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //Texto Préstamo
        JLabel prest = new JLabel();
        prest.setText("Préstamos");
        prest.setFont(new Font("Serif", Font.PLAIN, 70));
        prest.setForeground(Color.WHITE);
        prest.setBounds(240,15,900,124);
        prest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        presta.add(prest);
        
        presta.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt){
            PrestamosGUI prestamo = new PrestamosGUI(userData);
            prestamo.setVisible(true);
            dispose();
        }
        });
        Principal.add(presta);
        //Panel Tarjetas
        JPanel tarpanel = new JPanel();
        tarpanel.setLayout(null);
        tarpanel.setBackground(new Color(0,102,51));
        tarpanel.setBounds(583,576,750,124);
        tarpanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        //Texto Préstamo
        JLabel tarjetxt = new JLabel();
        tarjetxt.setText("Tarjetas");
        tarjetxt.setFont(new Font("Serif", Font.PLAIN, 70));
        tarjetxt.setForeground(Color.WHITE);
        tarjetxt.setBounds(265,15,900,124);
        tarjetxt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tarpanel.add(tarjetxt);
        tarpanel.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent evt){
            TarjetasGUI tarjetas = new TarjetasGUI(userData);
            tarjetas.setVisible(true);
            dispose();
        }
        });
        Principal.add(tarpanel);
        //Añadir los paneles con imagen y principal
        Principal.add(panelMenu);
        add(Principal);
        // Hacer visible el JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080); // Dimensiones de la ventana
        setLayout(null); // Layout absoluto
        setLocationRelativeTo(null); // Centrar la ventana
        setResizable(false); // Desactivar redimensionamiento
        setVisible(true);
    }
}

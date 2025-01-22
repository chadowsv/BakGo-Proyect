package Vista;
import Modelo.Cuenta;
import Modelo.InicioCuentasDAO;
import Modelo.LoginDataUser;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.*;
public class InicioCuentas extends JFrame {
    private LoginDataUser userData;
    private JPanel JPanel, PanelMenu; //Panel principal
    
    public InicioCuentas(LoginDataUser userData) {
        this.userData = userData;
        initComponents();
        CuentasDinamicas();
    }

private void initComponents() {
    //Quitar la barra de titulo y bordes de la ventana
    setUndecorated(true);
    //Layout absoluto
    JPanel = new JPanel();
    JPanel.setLayout(null); //layout absoluto
    JPanel.setBackground(Color.white);
    JLabel Saludoconnombre = new JLabel();
    Saludoconnombre.setText("¡Hola, " + userData.getPrimerNombre() + "!");
    Saludoconnombre.setFont(new Font("Serif",Font.PLAIN, 30));
    Saludoconnombre.setForeground(Color.white);
    Saludoconnombre.setBounds(1580,15, 200,50);
    JPanel.add(Saludoconnombre);
        JPanel PanelMenu = new JPanel();
        PanelMenu.setLayout(null);
        PanelMenu.setBackground(new Color(0, 102, 51)); // Fondo verde
        PanelMenu.setBounds(0, 0, 1920, 80); // Dimensiones del panel
        // Ícono de menú
        JLabel iconoMenu = new JLabel();
        ImageIcon menu = new ImageIcon(getClass().getResource("/Imagenes/Menu.png"));
        Image menuRedimen = menu.getImage().getScaledInstance(70, 48, Image.SCALE_SMOOTH);
        menu = new ImageIcon(menuRedimen);
        iconoMenu.setIcon(menu);
        iconoMenu.setBounds(40, 15, 70, 48);
        iconoMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Menu menu =  new Menu(userData);
                menu.setVisible(true);
                dispose();
            }
        });
        PanelMenu.add(iconoMenu);
        // Ícono de perfil
        JLabel iconoPerfil = new JLabel();
        ImageIcon perfil = new ImageIcon(getClass().getResource("/Imagenes/perfil.png"));
        Image perfilRedimen = perfil.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        perfil = new ImageIcon(perfilRedimen);
        iconoPerfil.setIcon(perfil);
        iconoPerfil.setBounds(1800, 5, 70, 70);
        iconoPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                Perfil perfil = new Perfil(userData);
                perfil.setVisible(true);
                dispose();
            }
        });
        PanelMenu.add(iconoPerfil);
        JPanel.add(PanelMenu);
    //Instancia Método estático
    //Agregar el JPanel principal a la ventada JFrame
    add(JPanel);
    setSize(1920,1080); //Dimension de la ventana
    setLocationRelativeTo(null); //Centrar la ventana
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Definir que no se haga nada al intentar cerrar la ventana
    setVisible(true);
}

private void CuentasDinamicas() {
    // Crear objeto DAO para obtener las cuentas
    InicioCuentasDAO dao = new InicioCuentasDAO();
    ArrayList<Cuenta> cuentas = dao.obtenerCuentasPorUsuario(userData);
        int panelwidth = 1920;
        int panellength =1080;
    if (dao.numcuentas(userData)== 0){
        int labelwidth = 800;
        int labellength= 300;
        JLabel labelsincuentas = new JLabel();
        int xcentrado = (panelwidth-labelwidth)/2;
        int ycentrado = (panellength-labellength)/2;
        labelsincuentas.setText("Usuario sin cuentas");
        labelsincuentas.setBounds(xcentrado, ycentrado, 800, 300);
        labelsincuentas.setFont(new Font("Serif", Font.PLAIN, 80));
        labelsincuentas.setForeground(Color.GRAY);
        labelsincuentas.setHorizontalAlignment(SwingConstants.CENTER);
        labelsincuentas.setVerticalAlignment(SwingConstants.CENTER);
        JPanel.add(labelsincuentas);
    }
if (dao.numcuentas(userData) == 1) {
    JLabel panelcuenta = new JLabel();
    ImageIcon fondocuenta = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio = fondocuenta.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondocuenta = new ImageIcon(fondoredimensio);
    panelcuenta.setIcon(fondocuenta);
    panelcuenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    
    // Coordenadas del panel
    int panelcuentawidth = 700;
    int panelcuentalength = 455;
    int xcentradopanel = (panelwidth - panelcuentawidth) / 2;
    int ycentradopanel = (panellength - panelcuentalength - 200) / 2;
    panelcuenta.setBounds(xcentradopanel, ycentradopanel, panelcuentawidth, panelcuentalength);
    
    int xposition = 45;
    int yposition = 0;
    Cuenta cuenta = cuentas.get(0);
        // Crear un JLabel con la información de la cuenta
        JLabel labelIDCuenta = new JLabel(cuenta.getIdCuenta());
        labelIDCuenta.setBounds(xposition, yposition + 20, 250, 100);
        labelIDCuenta.setFont(new Font("Serif", Font.BOLD, 50));
        labelIDCuenta.setForeground(new Color(1, 98, 51));
        panelcuenta.add(labelIDCuenta);
        
        // Añadir el JLabel para el número de cuenta
        String numeroCuenta = cuenta.getNumeroCuenta();
        JLabel labelnumcuenta = new JLabel(String.valueOf(numeroCuenta));
        labelnumcuenta.setBounds(xposition + 10, yposition + 80, 200, 90);
        labelnumcuenta.setFont(new Font("Serif", Font.PLAIN, 35));
        panelcuenta.add(labelnumcuenta);

        // Añadir el JLabel para el tipo de cuenta
        JLabel labeltipcuenta = new JLabel();
        labeltipcuenta.setFont(new Font("Serif", Font.PLAIN, 25));
        if (cuenta.getTipoCuenta().equals("A")) {
            labeltipcuenta.setText("<html>Cuenta de<br>Ahorros</html>");
        }
        if (cuenta.getTipoCuenta().equals("C")) {
            labeltipcuenta.setText("<html>Cuenta<br>Corriente</html>");
        }
        labeltipcuenta.setHorizontalAlignment(SwingConstants.CENTER);
        labeltipcuenta.setVerticalAlignment(SwingConstants.CENTER);
        labeltipcuenta.setForeground(Color.GRAY);
        labeltipcuenta.setBounds(xposition + 350, yposition + 50, 300, 70);
        panelcuenta.add(labeltipcuenta);
        
        // Añadir el JLabel de "Saldo Disponible"
        JLabel saldotxt = new JLabel("Saldo Disponible");
        saldotxt.setBounds(xposition + 10, yposition + 230, 450, 100);
        saldotxt.setFont(new Font("Serif", Font.BOLD, 50));
        panelcuenta.add(saldotxt);
        
        // Añadir el JLabel con el saldo en la cuenta
        JLabel saldodouble = new JLabel("$" + cuenta.getSaldo());
        saldodouble.setBounds(xposition + 10, yposition + 270, 350, 150);
        saldodouble.setForeground(new Color(1, 98, 51));
        saldodouble.setFont(new Font("Serif", Font.BOLD, 45));
        panelcuenta.add(saldodouble);
    

    // MouseListener
    panelcuenta.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            // Cuando se hace clic en el panel de la cuenta, abrir el historial
            HistorialCuentasGUI historial = new HistorialCuentasGUI(cuentas.get(0), userData);
            historial.setVisible(true);  // Mostrar la ventana del historial
            dispose();  // Cerrar la ventana actual (opcional)
        }
    });
    JPanel.add(panelcuenta);
}

if (dao.numcuentas(userData) == 2) {
    int panelcuentawidth = 700;
    int panelcuentalength = 455;
    int totalWidth = panelcuentawidth * 2 + 40;
    int xcentrado = (panelwidth - totalWidth) / 2; 
    int xprimerpanel = xcentrado;
    int xsegundopanel = xprimerpanel + panelcuentawidth + 40;
    int xposition = 45;  // Posición para la información dentro del primer panel
    int yposition = 0;
    int yprimerpanel = (panellength - panelcuentalength - 200) / 2;

    JLabel panelcuenta1 = new JLabel();
    ImageIcon fondocuenta1 = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio1 = fondocuenta1.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondocuenta1 = new ImageIcon(fondoredimensio1);
    panelcuenta1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    panelcuenta1.setIcon(fondocuenta1);
    panelcuenta1.setBounds(xprimerpanel, yprimerpanel, panelcuentawidth, panelcuentalength);
    
    panelcuenta1.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt){
            HistorialCuentasGUI historial = new HistorialCuentasGUI(cuentas.get(0), userData);
            historial.setVisible(true);
            dispose();
        }
    });

    // Crear y añadir la información de la cuenta 1 al panel
    Cuenta cuenta1 = cuentas.get(0);

    JLabel labelIDCuenta1 = new JLabel(cuenta1.getIdCuenta());
    labelIDCuenta1.setBounds(xposition, yposition + 20, 250, 100);
    labelIDCuenta1.setFont(new Font("Serif", Font.BOLD, 50));
    labelIDCuenta1.setForeground(new Color(1, 98, 51));
    panelcuenta1.add(labelIDCuenta1);
    String numeroCuenta1 = cuenta1.getNumeroCuenta();
    JLabel labelnumcuenta1 = new JLabel(String.valueOf(numeroCuenta1));
    labelnumcuenta1.setBounds(xposition + 10, yposition + 80, 200, 90);
    labelnumcuenta1.setFont(new Font("Serif", Font.PLAIN, 35));
    panelcuenta1.add(labelnumcuenta1);

    JLabel labeltipcuenta1 = new JLabel();
    labeltipcuenta1.setFont(new Font("Serif", Font.PLAIN, 25));
    if (cuenta1.getTipoCuenta().equals("A")) {
        labeltipcuenta1.setText("<html>Cuenta de<br>Ahorros</html>");
    } else if (cuenta1.getTipoCuenta().equals("C")) {
        labeltipcuenta1.setText("<html>Cuenta<br>Corriente</html>");
    }
    labeltipcuenta1.setHorizontalAlignment(SwingConstants.CENTER);
    labeltipcuenta1.setVerticalAlignment(SwingConstants.CENTER);
    labeltipcuenta1.setForeground(Color.GRAY);
    labeltipcuenta1.setBounds(xposition + 350, yposition + 50, 300, 70);
    panelcuenta1.add(labeltipcuenta1);

    JLabel saldotxt1 = new JLabel("Saldo Disponible");
    saldotxt1.setBounds(xposition + 10, yposition + 230, 450, 100);
    saldotxt1.setFont(new Font("Serif", Font.BOLD, 50));
    panelcuenta1.add(saldotxt1);

    JLabel saldodouble1 = new JLabel("$" + cuenta1.getSaldo());
    saldodouble1.setBounds(xposition + 10, yposition + 270, 350, 150);
    saldodouble1.setForeground(new Color(1, 98, 51));
    saldodouble1.setFont(new Font("Serif", Font.BOLD, 45));
    panelcuenta1.add(saldodouble1);

    // Segundo panel (Cuenta 2)
    JLabel panelcuenta2 = new JLabel();
    ImageIcon fondocuenta2 = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio2 = fondocuenta2.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondocuenta2 = new ImageIcon(fondoredimensio2);
    panelcuenta2.setIcon(fondocuenta2);
    panelcuenta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    panelcuenta2.setBounds(xsegundopanel, yprimerpanel, panelcuentawidth, panelcuentalength);

    panelcuenta2.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt){
            HistorialCuentasGUI historial = new HistorialCuentasGUI(cuentas.get(1), userData);
            historial.setVisible(true);
            dispose();
        }
    });

    // Crear y añadir la información de la cuenta 2 al panel
    Cuenta cuenta2 = cuentas.get(1);

    JLabel labelIDCuenta2 = new JLabel(cuenta2.getIdCuenta());
    labelIDCuenta2.setBounds(xposition, yposition + 20, 250, 100);
    labelIDCuenta2.setFont(new Font("Serif", Font.BOLD, 50));
    labelIDCuenta2.setForeground(new Color(1, 98, 51));
    panelcuenta2.add(labelIDCuenta2);
    String numeroCuenta2 = cuenta2.getNumeroCuenta();
    JLabel labelnumcuenta2 = new JLabel(String.valueOf(numeroCuenta2));
    labelnumcuenta2.setBounds(xposition + 10, yposition + 80, 200, 90);
    labelnumcuenta2.setFont(new Font("Serif", Font.PLAIN, 35));
    panelcuenta2.add(labelnumcuenta2);

    JLabel labeltipcuenta2 = new JLabel();
    labeltipcuenta2.setFont(new Font("Serif", Font.PLAIN, 25));
    if (cuenta2.getTipoCuenta().equals("A")) {
        labeltipcuenta2.setText("<html>Cuenta de<br>Ahorros</html>");
    } else if (cuenta2.getTipoCuenta().equals("C")) {
        labeltipcuenta2.setText("<html>Cuenta<br>Corriente</html>");
    }
    labeltipcuenta2.setHorizontalAlignment(SwingConstants.CENTER);
    labeltipcuenta2.setVerticalAlignment(SwingConstants.CENTER);
    labeltipcuenta2.setForeground(Color.GRAY);
    labeltipcuenta2.setBounds(xposition + 350, yposition + 50, 300, 70);
    panelcuenta2.add(labeltipcuenta2);

    JLabel saldotxt2 = new JLabel("Saldo Disponible");
    saldotxt2.setBounds(xposition + 10, yposition + 230, 450, 100);
    saldotxt2.setFont(new Font("Serif", Font.BOLD, 50));
    panelcuenta2.add(saldotxt2);

    JLabel saldodouble2 = new JLabel("$" + cuenta2.getSaldo());
    saldodouble2.setBounds(xposition + 10, yposition + 270, 350, 150);
    saldodouble2.setForeground(new Color(1, 98, 51));
    saldodouble2.setFont(new Font("Serif", Font.BOLD, 45));
    panelcuenta2.add(saldodouble2);

    // Añadir los paneles al JPanel principal
    JPanel.add(panelcuenta1);
    JPanel.add(panelcuenta2);
}
    // Actualizar el JPanel
    JPanel.revalidate();
    JPanel.repaint();
}
}


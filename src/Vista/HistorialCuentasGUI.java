package Vista;

import Modelo.Cuenta;
import Modelo.HistorialCuenta;
import Modelo.HistorialCuentasDAO;
import Modelo.LoginDataUser;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class HistorialCuentasGUI extends JFrame {
    private Cuenta cuenta; //cuenta de tipo Cuenta
    private LoginDataUser userData; //informacion del usuario
    private JPanel JPanel, PanelMenu; // Panel principal
    private JScrollPane scrollPane; // Scroll para los historiales
    private JPanel panelHistorialContainer; // Contenedor de los paneles de historial
    private int inicioY = 10; // Posición inicial vertical para los paneles

    public HistorialCuentasGUI(Cuenta cuenta, LoginDataUser userData) {
        this.cuenta = cuenta;
        this.userData = userData;
        initComponents();
        cuentaredimensio(cuenta);
        cargarHistorialCuentas();
    }

    private void initComponents() {
        // Quitar la barra de título y bordes de la ventana
        setUndecorated(true);
        // Panel principal
        JPanel = new JPanel();
        JPanel.setLayout(null); // Layout absoluto
        JPanel.setBackground(Color.white);
        JLabel Saludoconnombre = new JLabel("Mi cuenta");
        Saludoconnombre.setFont(new Font("Serif", Font.PLAIN, 30));
        Saludoconnombre.setForeground(Color.white);
        Saludoconnombre.setBounds(1610, 15, 200, 50);
        JPanel.add(Saludoconnombre);
        //Panel del Menu
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
        // Panel contenedor de historiales con layout absoluto
        panelHistorialContainer = new JPanel();
        panelHistorialContainer.setLayout(null);
        panelHistorialContainer.setBackground(Color.white);

        // JScrollPane para envolver el contenedor de historiales
        scrollPane = new JScrollPane(panelHistorialContainer);
        scrollPane.setBounds(200, 500, 1520, 400); // Ajustar posición y tamaño, de largo tendra 1520
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // Agregar el scrollPane al JPanel principal
        JPanel.add(scrollPane);
        
        // Configuración de la ventana principal
        add(JPanel);
        setSize(1920, 1080); // Dimensiones de la ventana
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void cargarHistorialCuentas() {
        HistorialCuentasDAO historialDAO = new HistorialCuentasDAO();
        ArrayList<HistorialCuenta> histo = historialDAO.obtenerHistorialCuentas(cuenta);

        if (histo.isEmpty()) {
            System.out.println("No se encontraron historiales.");
            return;
        }

        int inicioX = 10; // Posición inicial horizontal
        int panelHistorialHeight = 100; // Altura de cada panel

        for (HistorialCuenta historial : histo) {
            // Crear un panel para el historial
            JPanel panelHistorial = new JPanel();
            panelHistorial.setLayout(null);
            panelHistorial.setBackground(Color.white);
            panelHistorial.setBounds(inicioX, inicioY, 1450, panelHistorialHeight);

            // Borde del panel
            Border borde = BorderFactory.createLineBorder(Color.GRAY, 2);
            panelHistorial.setBorder(borde);

            // Texto de transferencia
            JLabel transferenciatxt = new JLabel();
            int idUsuarioActual = userData.getIDusuario();
            if (historial.getIdUsuarioEnvio() == idUsuarioActual) {
                transferenciatxt.setText("Transferencia realizada a " + historial.getNombre_Usuario_Recibe());
            } else if (historial.getIdUsuarioRecibe() == idUsuarioActual) {
                transferenciatxt.setText("Transferencia recibida de " + historial.getNombre_Usuario_Envio());
            }
            transferenciatxt.setBounds(10, 10, 1000, 45);
            transferenciatxt.setFont(new Font("Serif", Font.PLAIN, 35));
            panelHistorial.add(transferenciatxt);

            // Texto de fecha
            JLabel fechaTxt = new JLabel("Fecha: " + historial.getFechaTransaccion());
            fechaTxt.setBounds(13, 60, 300, 35);
            fechaTxt.setForeground(Color.GRAY);
            fechaTxt.setFont(new Font("Serif", Font.PLAIN, 25));
            panelHistorial.add(fechaTxt);

            // Texto de saldo posterior
            JLabel saldoTxt = new JLabel("$ " + historial.getSaldoPosterior());
            saldoTxt.setBounds(1225, 10 , 400, 45);
            saldoTxt.setForeground(new Color(0,102,51));
            saldoTxt.setFont(new Font("Serif", Font.BOLD, 40));
            panelHistorial.add(saldoTxt);
            JLabel saldoantTxt = new JLabel("$ " + historial.getSaldoAnterior());
            saldoantTxt.setBounds(1278, 50 , 400, 45);
            saldoantTxt.setForeground(Color.GRAY);
            saldoantTxt.setFont(new Font("Serif", Font.BOLD, 25));
            panelHistorial.add(saldoantTxt);
            // Agregar el panel al contenedor
            panelHistorialContainer.add(panelHistorial);

            // Actualizar posición vertical
            inicioY += panelHistorialHeight + 10;
        }

        // Ajustar el tamaño del contenedor dinámicamente
        panelHistorialContainer.setPreferredSize(new Dimension(1500, inicioY + 10)); //ajusta el tamaño del contenedor en funcion de los paneles que se han agregado, esmejor usar setPreferred size para que se ajuste perfectamente el contenido y la barra de desplazamiento
        panelHistorialContainer.revalidate(); //Recalcular el diseño del contenedos y componentes hijos
        panelHistorialContainer.repaint(); //Cambio en la apariencia gráfica de un componente, pero no es su estructura o tamaño
    }
//Corregir esto no sale en la pantalla
private void cuentaredimensio(Cuenta cuenta) {
    int xposition = 45;  
    int yposition = 0;
    int yprimerpanel = 100;

    // Redimensionar la imagen del JLabel
    JLabel panelcuenta = new JLabel();
    ImageIcon fondocuenta = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio = fondocuenta.getImage().getScaledInstance(500, 325, Image.SCALE_SMOOTH);
    fondocuenta = new ImageIcon(fondoredimensio);
    panelcuenta.setIcon(fondocuenta);
    panelcuenta.setBounds(710 , yprimerpanel, 500,325);

    // Crear el JLabel para el ID de la cuenta
    JLabel labelIDCuenta = new JLabel(cuenta.getIdCuenta());
    labelIDCuenta.setBounds(xposition, yposition + 30, 300, 30);
    labelIDCuenta.setFont(new Font("Serif", Font.BOLD, 40));
    labelIDCuenta.setForeground(new Color(1, 98, 51));
    panelcuenta.add(labelIDCuenta);

    // Crear el JLabel para el número de cuenta
    String numeroCuenta = cuenta.getNumeroCuenta();
    JLabel labelnumcuenta = new JLabel(String.valueOf(numeroCuenta));
    labelnumcuenta.setBounds(xposition + 5, yposition + 60, 200, 90);
    labelnumcuenta.setFont(new Font("Serif", Font.PLAIN, 30));
    panelcuenta.add(labelnumcuenta);

    // Crear el JLabel para el tipo de cuenta
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
    labeltipcuenta.setBounds(xposition + 200, yposition + 50, 300, 70);
    panelcuenta.add(labeltipcuenta);

    // Crear el JLabel de "Saldo Disponible"
    JLabel saldotxt = new JLabel("Saldo Disponible");
    saldotxt.setBounds(xposition + 5, yposition + 180, 450, 100);
    saldotxt.setFont(new Font("Serif", Font.BOLD, 30));
    panelcuenta.add(saldotxt);

    // Crear el JLabel para el saldo en la cuenta
    JLabel saldodouble = new JLabel("$" + cuenta.getSaldo());
    saldodouble.setBounds(xposition + 5, yposition + 200, 350, 150);
    saldodouble.setForeground(new Color(1, 98, 51));
    saldodouble.setFont(new Font("Serif", Font.BOLD, 25));
    panelcuenta.add(saldodouble);
    JPanel.add(panelcuenta);
    JPanel.revalidate();
    JPanel.repaint();
}

}

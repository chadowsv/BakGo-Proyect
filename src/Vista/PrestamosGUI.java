
package Vista;

import Modelo.LoginDataUser;
import Modelo.Prestamo;
import Modelo.PrestamosDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PrestamosGUI extends JFrame {
    private LoginDataUser userData;
    private JPanel JPanel, PanelMenu; //Panel principal
    
    public PrestamosGUI(LoginDataUser userData) {
        this.userData = userData;
        initComponents();
        PrestamosDinamicos();
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

private void PrestamosDinamicos() {
    // Crear objeto DAO para obtener las cuentas
    PrestamosDAO dao = new PrestamosDAO();
    ArrayList<Prestamo> prestamos = dao.obtenerPrestamosPorUsuario(userData);
        int panelwidth = 1920;
        int panellength =1080;
    if (dao.numprestamos(userData)== 0){
        int labelwidth = 800;
        int labellength= 300;
        JLabel labelsinprestamos = new JLabel();
        int xcentrado = (panelwidth-labelwidth)/2;
        int ycentrado = (panellength-labellength)/2;
        labelsinprestamos.setText("Usuario sin prestamos");
        labelsinprestamos.setBounds(xcentrado, ycentrado, 800, 300);
        labelsinprestamos.setFont(new Font("Serif", Font.PLAIN, 80));
        labelsinprestamos.setForeground(Color.GRAY);
        labelsinprestamos.setHorizontalAlignment(SwingConstants.CENTER);
        labelsinprestamos.setVerticalAlignment(SwingConstants.CENTER);
        JPanel.add(labelsinprestamos);
    }
if (dao.numprestamos(userData) == 1) {
    JLabel panelprestamo = new JLabel();
    ImageIcon fondoprestamo = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio = fondoprestamo.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondoprestamo = new ImageIcon(fondoredimensio);
    panelprestamo.setIcon(fondoprestamo);
    
    // Coordenadas del panel
    int panelprestamowidth = 700;
    int panelprestamolength = 455;
    int xcentradopanel = (panelwidth - panelprestamowidth) / 2;
    int ycentradopanel = (panellength - panelprestamolength - 200) / 2;
    panelprestamo.setBounds(xcentradopanel, ycentradopanel, panelprestamowidth, panelprestamolength);
    
    int xposition = 45;
    int yposition = 0;
    
    for (Prestamo pre : prestamos) {
        // Crear un JLabel con la información del prestamo
        JLabel labelIDCuenta = new JLabel(pre.getIDPrestamo());
        labelIDCuenta.setBounds(xposition, yposition + 20, 250, 100);
        labelIDCuenta.setFont(new Font("Serif", Font.BOLD, 50));
        labelIDCuenta.setForeground(new Color(1, 98, 51));
        panelprestamo.add(labelIDCuenta);
        
        // Añadir el JLabel para la fecha de Inicio del prestamo
        String Fechainicio = pre.getFechaInicio();
        JLabel labelnumprestamo = new JLabel(String.valueOf(Fechainicio));
        labelnumprestamo.setBounds(xposition + 10, yposition + 80, 200, 90);
        labelnumprestamo.setFont(new Font("Serif", Font.PLAIN, 35));
        panelprestamo.add(labelnumprestamo);

        // Añadir el JLabel para la fecha de expiracion del prestamo
        JLabel labelfechaexpiracion = new JLabel();
        labelfechaexpiracion.setFont(new Font("Serif", Font.PLAIN, 25));
        String Fechaexpirado = pre.getFechaVencimiento();
        labelfechaexpiracion.setText(Fechaexpirado);
        labelfechaexpiracion.setHorizontalAlignment(SwingConstants.CENTER);
        labelfechaexpiracion.setVerticalAlignment(SwingConstants.CENTER);
        labelfechaexpiracion.setForeground(Color.GRAY);
        labelfechaexpiracion.setBounds(xposition + 350, yposition + 50, 300, 70);
        panelprestamo.add(labelfechaexpiracion);
        
        // Añadir el JLabel de "Monto del prestamo"
        JLabel montotxt = new JLabel("Monto a pagar: ");
        montotxt.setBounds(xposition + 10, yposition + 230, 450, 100);
        montotxt.setFont(new Font("Serif", Font.BOLD, 50));
        panelprestamo.add(montotxt);
        
        // Añadir el JLabel con la informacion del monto del prestamo
        JLabel montodouble = new JLabel("$" + pre.getMontoPrestamo());
        montodouble.setBounds(xposition + 10, yposition + 270, 350, 150);
        montodouble.setForeground(new Color(1, 98, 51));
        montodouble.setFont(new Font("Serif", Font.BOLD, 45));
        panelprestamo.add(montodouble);    
    }
    JPanel.add(panelprestamo);
}
    

if (dao.numprestamos(userData) == 2) {
    int panelprewidth = 700;
    int panelprelength = 455;
    int totalWidth = panelprewidth * 2 + 40;
    int xcentrado = (panelwidth - totalWidth) / 2; 
    int xprimerpanel = xcentrado;
    int xsegundopanel = xprimerpanel + panelprewidth + 40;
    int xposition = 45;  // Posición para la información dentro del primer panel
    int yposition = 0;
    int yprimerpanel = (panellength - panelprelength - 200) / 2;

    JLabel panelprestamo1 = new JLabel();
    ImageIcon fondoprestamo1 = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio1 = fondoprestamo1.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondoprestamo1 = new ImageIcon(fondoredimensio1);
    panelprestamo1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    panelprestamo1.setIcon(fondoprestamo1);
    panelprestamo1.setBounds(xprimerpanel, yprimerpanel, panelprewidth, panelprelength);

    // Crear y añadir la información de la cuenta 1 al panel
    Prestamo pre1 = prestamos.get(0);

    JLabel labelIDPrestamo1 = new JLabel(pre1.getIDPrestamo());
    labelIDPrestamo1.setBounds(xposition, yposition + 20, 250, 100);
    labelIDPrestamo1.setFont(new Font("Serif", Font.BOLD, 50));
    labelIDPrestamo1.setForeground(new Color(1, 98, 51));
    panelprestamo1.add(labelIDPrestamo1);
    
    
    // Añadir el JLabel para la fecha de Inicio del prestamo
    String Fechainicio = pre1.getFechaInicio();
    JLabel labelnumprestamo1 = new JLabel(String.valueOf(Fechainicio));
    labelnumprestamo1.setBounds(xposition + 10, yposition + 80, 200, 90);
    labelnumprestamo1.setFont(new Font("Serif", Font.PLAIN, 35));
    panelprestamo1.add(labelnumprestamo1);

    // Añadir el JLabel para la fecha de expiracion del prestamo
    JLabel labelfechaexpiracion = new JLabel();
    labelfechaexpiracion.setFont(new Font("Serif", Font.PLAIN, 25));
    String Fechaexpirado = pre1.getFechaVencimiento();
    labelfechaexpiracion.setText(Fechaexpirado);
    labelfechaexpiracion.setHorizontalAlignment(SwingConstants.CENTER);
    labelfechaexpiracion.setVerticalAlignment(SwingConstants.CENTER);
    labelfechaexpiracion.setForeground(Color.GRAY);
    labelfechaexpiracion.setBounds(xposition + 350, yposition + 50, 300, 70);
    panelprestamo1.add(labelfechaexpiracion);

    // Añadir el JLabel de "Monto del prestamo"
    JLabel montotxt = new JLabel("Monto a pagar: ");
    montotxt.setBounds(xposition + 10, yposition + 230, 450, 100);
    montotxt.setFont(new Font("Serif", Font.BOLD, 50));
    panelprestamo1.add(montotxt);

    // Añadir el JLabel con la informacion del monto del prestamo
    JLabel montodouble = new JLabel("$" + pre1.getMontoPrestamo());
    montodouble.setBounds(xposition + 10, yposition + 270, 350, 150);
    montodouble.setForeground(new Color(1, 98, 51));
    montodouble.setFont(new Font("Serif", Font.BOLD, 45));
    panelprestamo1.add(montodouble); 

    // Segundo panel (Prestamo 2)
    JLabel panelprestamo2 = new JLabel();
    ImageIcon fondoprestamo2 = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio2 = fondoprestamo2.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondoprestamo2 = new ImageIcon(fondoredimensio2);
    panelprestamo2.setIcon(fondoprestamo2);
    panelprestamo2.setBounds(xsegundopanel, yprimerpanel, panelprewidth, panelprelength);

    // Crear y añadir la información de la cuenta 2 al panel
    Prestamo pre2 = prestamos.get(1);

    JLabel labelIDPrestamo2 = new JLabel(pre2.getIDPrestamo());
    labelIDPrestamo2.setBounds(xposition, yposition + 20, 250, 100);
    labelIDPrestamo2.setFont(new Font("Serif", Font.BOLD, 50));
    labelIDPrestamo2.setForeground(new Color(1, 98, 51));
    
    panelprestamo2.add(labelIDPrestamo2);
    String Fechainicio2 = pre2.getFechaInicio();
    JLabel labelnumprestamo2 = new JLabel(String.valueOf(Fechainicio2));
    labelnumprestamo2.setBounds(xposition + 10, yposition + 80, 200, 90);
    labelnumprestamo2.setFont(new Font("Serif", Font.PLAIN, 35));
    panelprestamo2.add(labelnumprestamo2);

    JLabel labelfechaexpiracion2 = new JLabel();
    labelfechaexpiracion2.setFont(new Font("Serif", Font.PLAIN, 25));
    String Fechaexpirado2 = pre1.getFechaVencimiento();
    labelfechaexpiracion.setText(Fechaexpirado2);
    labelfechaexpiracion2.setHorizontalAlignment(SwingConstants.CENTER);
    labelfechaexpiracion2.setVerticalAlignment(SwingConstants.CENTER);
    labelfechaexpiracion2.setForeground(Color.GRAY);
    labelfechaexpiracion2.setBounds(xposition + 350, yposition + 50, 300, 70);
    panelprestamo2.add(labelfechaexpiracion2);

    JLabel montotxt2 = new JLabel("Monto a pagar: ");
    montotxt2.setBounds(xposition + 10, yposition + 230, 450, 100);
    montotxt2.setFont(new Font("Serif", Font.BOLD, 50));
    panelprestamo2.add(montotxt2);

    JLabel montodouble2 = new JLabel("$" + pre2.getMontoPrestamo());
    montodouble2.setBounds(xposition + 10, yposition + 270, 350, 150);
    montodouble2.setForeground(new Color(1, 98, 51));
    montodouble2.setFont(new Font("Serif", Font.BOLD, 45));
    panelprestamo2.add(montodouble2);

    // Añadir los paneles al JPanel principal
    JPanel.add(panelprestamo1);
    JPanel.add(panelprestamo2);
}
    // Actualizar el JPanel
    JPanel.revalidate();
    JPanel.repaint();
}
}
package Vista;
import Modelo.LoginDataUser;
import Modelo.Tarjeta;
import Modelo.TarjetasDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TarjetasGUI extends JFrame{
    private LoginDataUser userData;
    private JPanel JPanel, PanelMenu; //Panel principal
    
    public TarjetasGUI(LoginDataUser userData) {
        this.userData = userData;
        initComponents();
        TarjetasDinamicas();
    }

private void initComponents() {
    //Quitar la barra de titulo y bordes de la ventana
    setUndecorated(true);
    //Layout absoluto
    JPanel = new JPanel();
    JPanel.setLayout(null); //layout absoluto
    JPanel.setBackground(Color.white);
    JLabel Saludoconnombre = new JLabel();
    Saludoconnombre.setText("Mis tarjetas");
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

private void TarjetasDinamicas() {
    // Crear objeto DAO para obtener las cuentas
    TarjetasDAO dao = new TarjetasDAO();
    Tarjeta tarjetacre = dao.obtenerTarjetasC(userData);
    Tarjeta tarjetadeb = dao.obtenerTarjetasD(userData);
        int panelwidth = 1920;
        int panellength =1080;
    if (dao.numTarjetasC(userData)==0 && dao.numTarjetasD(userData)==0){
        int labelwidth = 800;
        int labellength= 300;
        JLabel labelsincuentas = new JLabel();
        int xcentrado = (panelwidth-labelwidth)/2;
        int ycentrado = (panellength-labellength)/2;
        labelsincuentas.setText("Usuario sin tarjetas");
        labelsincuentas.setBounds(xcentrado, ycentrado, 800, 300);
        labelsincuentas.setFont(new Font("Serif", Font.PLAIN, 80));
        labelsincuentas.setForeground(Color.GRAY);
        labelsincuentas.setHorizontalAlignment(SwingConstants.CENTER);
        labelsincuentas.setVerticalAlignment(SwingConstants.CENTER);
        JPanel.add(labelsincuentas);
    }
if (dao.numTarjetasC(userData) == 1 && dao.numTarjetasD(userData)==0) {
    int panelcuentawidth = 700;
    int panelcuentalength = 455;
    int xpos = (panelwidth - panelcuentawidth) / 2;
    int ypos = (panellength - panelcuentalength - 200) / 2;
    String tipoTarjeta = "Tarjeta Crédito";
    int numeroTarjeta = tarjetacre.getNumero_tarjeta();
    String monto = "Monto a Pagar";
    double saldo = tarjetacre.getMonto();
    LocalDate fechaExpiracion = tarjetacre.getFecha_expiracion();
    String CVV = tarjetacre.getCVV();
    crearPanelTarjeta(JPanel, tipoTarjeta, numeroTarjeta, monto, saldo, fechaExpiracion,CVV,xpos,ypos);
    }
if (dao.numTarjetasC(userData) == 0 && dao.numTarjetasD(userData)==1) {
    int panelcuentawidth = 700;
    int panelcuentalength = 455;
    int xpos = (panelwidth - panelcuentawidth) / 2;
    int ypos = (panellength - panelcuentalength - 200) / 2;
    String tipoTarjeta = "Tarjeta Débito";
    int numeroTarjeta = tarjetadeb.getNumero_tarjeta();
    double saldo = tarjetadeb.getMonto();
    String monto = "Saldo Disponible";
    LocalDate fechaExpiracion = tarjetadeb.getFecha_expiracion();
    String CVV= tarjetadeb.getCVV();  
    crearPanelTarjeta(JPanel, tipoTarjeta, numeroTarjeta, monto, saldo, fechaExpiracion, CVV, xpos, ypos);
}

if (dao.numTarjetasC(userData) == 1 && dao.numTarjetasD(userData) == 1) {
    int panelcuentawidth = 700; 
    int panelcuentalength = 455; 
    int totalWidth = panelcuentawidth * 2 + 40; 
    int xpos = (panelwidth - totalWidth) / 2; 
    int ypos = (panellength - panelcuentalength - 200) / 2;
    String tipoTarjeta = "Tarjeta Crédito";
    int numeroTarjeta = tarjetacre.getNumero_tarjeta();
    String monto = "Monto a Pagar";
    double saldo = tarjetacre.getMonto();
    LocalDate fechaExpiracion = tarjetacre.getFecha_expiracion();
    String CVV = tarjetacre.getCVV();
    crearPanelTarjeta(JPanel, tipoTarjeta, numeroTarjeta, monto, saldo, fechaExpiracion, CVV, xpos, ypos);
    //Tarjeta Débito
    String tipoTarjeta1 = "Tarjeta Débito";
    int numeroTarjeta1 = tarjetadeb.getNumero_tarjeta();
    double saldo1 = tarjetadeb.getMonto();
    String monto1 = "Saldo Disponible";
    LocalDate fechaExpiracion1 = tarjetadeb.getFecha_expiracion();
    int xpos1 = xpos + panelcuentawidth + 40;
    String CVV1= tarjetadeb.getCVV();  
    crearPanelTarjeta(JPanel, tipoTarjeta1, numeroTarjeta1, monto1, saldo1, fechaExpiracion1, CVV1, xpos1, ypos);
}
    // Actualizar el JPanel
    JPanel.revalidate();
    JPanel.repaint();
}
private void crearPanelTarjeta(JPanel panel, String tipoTarjeta, int numeroTarjeta,String monto, double saldo, LocalDate fechaExpiracion, String CVV, int xpos, int ypos ){
    JLabel paneltarjeta = new JLabel();
    ImageIcon fondocuenta = new ImageIcon(getClass().getResource("/Imagenes/fondocuenta.png"));
    Image fondoredimensio = fondocuenta.getImage().getScaledInstance(700, 455, Image.SCALE_SMOOTH);
    fondocuenta = new ImageIcon(fondoredimensio);
    paneltarjeta.setIcon(fondocuenta);
    // Coordenadas del panel
    int panelcuentawidth = 700;
    int panelcuentalength = 455;
    paneltarjeta.setBounds(xpos, ypos, panelcuentawidth, panelcuentalength);
    int xposition = 45;
    int yposition = 0;

    JLabel labelTipoTarje = new JLabel(tipoTarjeta);
    labelTipoTarje.setBounds(xposition, yposition + 20, 450, 100);
    labelTipoTarje.setFont(new Font("Serif", Font.BOLD, 50));
    labelTipoTarje.setForeground(new Color(1, 98, 51));
    paneltarjeta.add(labelTipoTarje);

    // Añadir el JLabel para el número de tarjeta
    JLabel labelnumTar = new JLabel(String.valueOf(numeroTarjeta));
    labelnumTar.setBounds(xposition + 10, yposition + 80, 200, 90);
    labelnumTar.setFont(new Font("Serif", Font.PLAIN, 35));
    paneltarjeta.add(labelnumTar);

    // Añadir el JLabel de "Saldo Disponible"
    JLabel labelSaldo = new JLabel(monto);
    labelSaldo.setBounds(xposition + 10, yposition +150,300,100);
    labelSaldo.setFont(new Font("Serif", Font.BOLD, 35));
    paneltarjeta.add(labelSaldo);
    //Añadir el monto a pagar
    JLabel saldotxt = new JLabel("$ " + saldo);
    saldotxt.setBounds(xposition + 10, yposition + 200, 450, 100);
    saldotxt.setForeground(Color.GRAY);
    saldotxt.setFont(new Font("Serif", Font.BOLD, 35));
    paneltarjeta.add(saldotxt);

    // Añadir el JLabel con "Fecha de expiración"
    JLabel fechatxt = new JLabel("Fecha de expiración:");
    fechatxt.setBounds(xposition + 10, yposition + 300, 500, 50);
    fechatxt.setForeground(new Color(1, 98, 51));
    fechatxt.setFont(new Font("Serif", Font.BOLD, 30));
    paneltarjeta.add(fechatxt);

    // Añadir el JLabel "Monto a pagar"
    LocalDate fechaExpir = fechaExpiracion;
    JLabel fecha = new JLabel(String.valueOf(fechaExpir));
    fecha.setFont(new Font("Serif", Font.PLAIN, 35));
    fecha.setHorizontalAlignment(SwingConstants.CENTER);
    fecha.setVerticalAlignment(SwingConstants.CENTER);
    fecha.setBounds(xposition, yposition + 340, 200, 40);
    paneltarjeta.add(fecha);

    //Añadir el JLable "CVV"
    JLabel cvvtxt = new JLabel("CVV");
    cvvtxt.setBounds(xposition+500,yposition+45,100,40);
    cvvtxt.setFont(new Font("Serif", Font.BOLD, 35));
    paneltarjeta.add(cvvtxt);

    //Añadir el JLabel con el texto de CVV
    JLabel cvv = new JLabel();
    cvv.setText(CVV);
    cvv.setBounds(xposition+500, yposition+ 90,100,60);
    cvv.setFont(new Font("Serif", Font.BOLD,40));
    cvv.setForeground(new Color(1, 98, 51));
    paneltarjeta.add(cvv);
    panel.add(paneltarjeta);
}
}

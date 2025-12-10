package Modelo;
import java.sql.Connection; //Conexión activa con las base de datos
import java.sql.DriverManager; //Manejo de conexiones con diferentes bases de datos mediante controladores
import java.sql.SQLException; //Manejo de excepciones relacionadas a SQL
    //icono menu 350x240
    //icono perfil 322x322
    //PanelMenu.setBackground(new Color(0,102,51));
    //PanelMenu.setBounds(0,0,1920,80);
public class Constantes {
    // Parámetros de conexión
    static final String user = "sa"; //Autenticacion en la base de datos
    static final String contrase = "C"; 
    static final String connectionUrl = "jdbc:sqlserver://LAPTOP-G33I1NPP:1433;databaseName=BANCAMOVIL;encrypt=true;trustServerCertificate=true";
    //jdbc:sqlserver:// protocolo de conexión al servidor
    //LAPTOP-G32:1433: es el nombre del servidor y el puerto
    //databse: especifica el nombre de la base de datos
    //encrypt true: conexion encriptada
    //trustServer permite confiar en el certificado del servidor sin necesidad de validación adicional
// Método para obtener la conexión 
    public static Connection getConexion() {
        Connection conectar = null;
        try {
            conectar = DriverManager.getConnection(connectionUrl, user, contrase);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos." + e.getErrorCode());
        }
        return conectar; //Se devuelve el objeto Connection conectar
    }
}

package Modelo;

import static Modelo.Constantes.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.ResultSet;
public class RegistroUsuarioDAO {
    Connection conn; //Declaración de variable conn de tipo Connection
    PreparedStatement ps; // usa la conexión de BDD para preparar y ejecutar comandos SQL
    //Creación de método que permite el registro del usuario a la BDD
    public RegistrarUsuario reg(String PrimerNombretxt, String SegundoNombretxt, String ApellidoPaternotxt, String ApellidoMaternotxt, String Cedulatxt,String FechaNacimientotxt, String Telefonotxt, LocalDate fechaReg, String Contratxt, String CorreoElectrotxt){
        RegistrarUsuario regist = new RegistrarUsuario(); //Instancia del objeto que mantiene los datos del registro
        String sql = "INSERT INTO Usuarios (Primer_Nombre, Segundo_Nombre, Apellido_Paterno, Apellido_Materno, Cedula, Fecha_Nacimiento, Telefono, Fecha_Registro, Password, email)" + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try{
            conn = getConexion(); //se establece la conexión con JDBC del método estático
            ps = conn.prepareStatement(sql); //Por medio de la conexión se usa el objeto PreparedStatement para ejecutal la conulta con parámetros dinámicos
            ps.setString(1, PrimerNombretxt);
            ps.setString(2, SegundoNombretxt);
            ps.setString(3, ApellidoPaternotxt);
            ps.setString(4,ApellidoMaternotxt);
            ps.setString(5, Cedulatxt);
            ps.setString(6, FechaNacimientotxt);
            ps.setString(7, Telefonotxt);
            java.sql.Date fechaRegistro = java.sql.Date.valueOf(fechaReg); //Convertsion del valor de reg a tipo date de sql
            ps.setDate(8, fechaRegistro);
            ps.setString(9,Contratxt);
            ps.setString(10, CorreoElectrotxt);
        int addedRows = ps.executeUpdate(); //Ejecución de las consultas como INSERT, devolviendo el numero de filas afectadas
        if (addedRows > 0){ //Si la inserción fue exitosa, se crea el objeto con los datos asignados
            regist.setPrimerNombretxt(PrimerNombretxt);
            regist.setSegundoNombretxt(SegundoNombretxt);
            regist.setApellidoPaternotxt(ApellidoPaternotxt);
            regist.setApellidoMaternotxt(ApellidoMaternotxt);
            regist.setCedulatxt(Cedulatxt);
            regist.setFechaNacimientotxt(FechaNacimientotxt);
            regist.setTelefonotxt(Telefonotxt);
            regist.setFechaReg(fechaReg);
            regist.setContratxt(Contratxt);
            regist.setCorreoElectrotxt(CorreoElectrotxt);
        }
        conn.close(); //Cierre de conexión para liberación de recursos y fugas de memoria
    }catch (SQLException e) {
            System.out.println(e.toString()); //Si ocurre algún error, el mismo se imprimira en la consola para la depuración
}
        return regist; //Devuelve el objeto regist con los datos introducidos
}
    public boolean verificacionDuplicadoced(String cedula){
        String consultadup = "SELECT COUNT(*) FROM Usuarios WHERE Cedula = ?";
        try {
        conn = getConexion();
        ps= conn.prepareStatement(consultadup);//Se realiza la conexión para realizar la consulta
        ps.setString(1,cedula);
        ResultSet rs = ps.executeQuery(); //Manejar los resultados al ejecutar la Query obteniendo el ResultSet
        if (rs.next()){ //Mover el cursor al primer registro del resultado
            return rs.getInt(1) > 0;//Si el conteo es mayor a cero se devuelve true
        }
        } catch (SQLException e){
        e.printStackTrace();
        } return false;
    }
    public boolean verificacionDuplicadotele(String telefono){
        String consultatelefono = "SELECT COUNT(*) FROM Usuarios WHERE Telefono = ?";
        try {
            conn = getConexion();
            ps= conn.prepareStatement(consultatelefono);
            ps.setString(1, telefono);
            ResultSet rs = ps.executeQuery();
        if (rs.next()){
            return rs.getInt(1) > 0; //Si el conteo es mayor a cero se devuelve true
        }
        } catch (SQLException e){
        e.printStackTrace();
        } return false;
    }
    public boolean verificacionDuplicadocorre(String correo) {
        String consultacorre = "SELECT COUNT(*) FROM Usuarios WHERE email = ?";
        try {
            conn = getConexion(); //la variable es establecida con el método estático getConexion
            ps= conn.prepareStatement(consultacorre); //se realiza la consulta 
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery(); //se establece el resultado de la consulta como rs
        if (rs.next()){ //cursor en el primer resultado del resultado
            return rs.getInt(1) > 0; //si el conteo es mayor a 0 se convierte en falso
        }
        } catch (SQLException e){
        e.printStackTrace();
        } return false;
    }
    }

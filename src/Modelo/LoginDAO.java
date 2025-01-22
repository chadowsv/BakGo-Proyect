package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    private LoginDataUser userData;
    Connection conectar;
    PreparedStatement ps;
    ResultSet rs;

    public LoginDataUser log(String Cedula, String Contraseña) {
        LoginDataUser l = new LoginDataUser();
        String sql = "SELECT * FROM Usuarios WHERE Cedula = ? AND Password = ?";
        try {
            conectar = Constantes.getConexion();
            ps = conectar.prepareStatement(sql);
            ps.setString(1, Cedula);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            if (rs.next()) {
                l.setIDusuario(rs.getInt("ID_usuario"));
                l.setPrimerNombre(rs.getString("Primer_Nombre"));
                l.setSegundoNombre(rs.getString("Segundo_Nombre"));
                l.setApellidoPaterno(rs.getString("Apellido_Paterno"));
                l.setApellidoMaterno(rs.getString("Apellido_Materno"));
                l.setCedula(rs.getString("Cedula"));
                l.setTelefonoMovil(rs.getString("Telefono"));
                l.setCorreoElectro(rs.getString("email"));
                l.setContraseña(rs.getString("Password"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return l;
    }
    
}

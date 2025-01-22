package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PerfilDAO {
    Connection conn= Constantes.getConexion();
    PreparedStatement ps;
    public RegistrarUsuario infoperfil(LoginDataUser userData) {
        RegistrarUsuario datos = new RegistrarUsuario();
        String sql = "SELECT Primer_Nombre, Segundo_Nombre, Apellido_Paterno, Apellido_Materno, Cedula, email, Telefono, Password FROM Usuarios WHERE Cedula = ?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, userData.getCedula());
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                datos.setPrimerNombretxt(rs.getString("Primer_Nombre"));
                datos.setSegundoNombretxt(rs.getString("Segundo_Nombre"));
                datos.setApellidoPaternotxt(rs.getString("Apellido_Paterno"));
                datos.setApellidoMaternotxt(rs.getString("Apellido_Materno"));
                datos.setCedulatxt(rs.getString("Cedula"));
                datos.setCorreoElectrotxt(rs.getString("email"));
                datos.setTelefonotxt(rs.getString("Telefono"));
                datos.setContratxt(rs.getString("Password"));
                
            } else {
                return null;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar el perfil, regrese mas tarde");
        }
        return datos;
    }
    
}

package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrestamosDAO {
    private Connection conectar;
    private PreparedStatement ps;
    private ResultSet rs;

    public int numprestamos(LoginDataUser userData){ //Revisar para hacer el tema de contar los prestamos y realiza el bucle para 0, 1 o 2 prestamos
        String obtenernum = "SELECT COUNT(ID_prestamo) as Numero_prestamo FROM Prestamos WHERE ID_usuario = ?";
        int numprestamostotal = 0;
        try{
            ps = conectar.prepareStatement(obtenernum);
            ps.setInt(1,userData.getIDusuario());
            rs= ps.executeQuery();
            
            if (rs.next()) { //Si la consulta devuelve un resultado, se obtiene un número de prestamos
                numprestamostotal = rs.getInt("Numero_prestamo");
            }
        }catch (SQLException e){
        }return numprestamostotal; //Retorna el número total de prestamos del usuario
    }
    public ArrayList<Prestamo> obtenerPrestamosPorUsuario(LoginDataUser userData) {
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT * FROM Prestamos WHERE ID_Usuario = ?";
        try {
            conectar = Constantes.getConexion();
            ps = conectar.prepareStatement(sql);
            ps.setInt(1, userData.getIDusuario());
            rs = ps.executeQuery();

            while (rs.next()) {
                Prestamo pres = new Prestamo();
                pres.setIDPrestamo(rs.getString("ID_prestamo"));
                pres.setFechaVencimiento(rs.getString("Fecha_vencimiento"));
                pres.setFechaInicio(rs.getString("Fecha_inicio"));
                pres.setMontoPrestamo(rs.getDouble("Monto_prestamo"));
                prestamos.add(pres);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return prestamos;
    }
}

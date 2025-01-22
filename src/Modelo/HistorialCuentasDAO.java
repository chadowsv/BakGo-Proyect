package Modelo;
import static Modelo.Constantes.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
public class HistorialCuentasDAO {
    private Connection conectar;
    private PreparedStatement ps;
    private ResultSet rs;

    public ArrayList<HistorialCuenta> obtenerHistorialCuentas(Cuenta cuenta){
    ArrayList<HistorialCuenta> historial = new ArrayList<>();
    String historialque = "SELECT t.ID_transferencia, h.Saldo_anterior, h.Saldo_posterior, t.Fecha_transferencia, t.Descripcion_transferencia, " + 
            "u1.ID_usuario AS ID_Usuario_Envio,"+ 
            "u2.ID_usuario AS ID_Usuario_Recibe," +  
            "u1.Primer_Nombre + ' ' + u1.Apellido_Paterno AS Nombre_Usuario_Envio, " + 
             "u2.Primer_Nombre + ' ' + u2.Apellido_Paterno AS Nombre_Usuario_Recibe " +
             "FROM HistorialCuentas h " +
             "JOIN Transferencias t ON h.ID_transferencia = t.ID_transferencia " +
             "JOIN Cuentas c1 ON t.ID_cuenta_A = c1.ID_cuenta " +
             "JOIN Usuarios u1 ON c1.ID_usuario = u1.ID_usuario " +
             "JOIN Cuentas c2 ON t.ID_cuenta_B = c2.ID_cuenta " +
             "JOIN Usuarios u2 ON c2.ID_usuario = u2.ID_usuario " +
             "WHERE h.ID_cuenta_A = ?";
    try {
            conectar = getConexion();
            ps = conectar.prepareStatement(historialque); //por la conexion realizo la consulta
            ps.setString(1,cuenta.getIdCuenta()); 
            rs= ps.executeQuery(); //se guarda el resultado de la query
            while (rs.next()){//va pasando por cada fila
                HistorialCuenta historialCuenta = new HistorialCuenta(); //instancia del objeto
                historialCuenta.setSaldoAnterior(rs.getDouble("Saldo_anterior"));
                historialCuenta.setSaldoPosterior(rs.getDouble("Saldo_posterior"));
                java.sql.Date fechatransferenciaSQL = rs.getDate("Fecha_transferencia"); //Obtengo la fecha en modo de java sql date
                if(fechatransferenciaSQL != null){ //
                LocalDate localDate = fechatransferenciaSQL.toLocalDate(); //conversion de sql date a java localdate
                historialCuenta.setFechaTransaccion(localDate);
                }
                historialCuenta.setDescripcionTransaccion(rs.getString("Descripcion_transferencia"));
                historialCuenta.setIdUsuarioEnvio(rs.getInt("ID_Usuario_Envio"));
                historialCuenta.setIdUsuarioRecibe(rs.getInt("ID_Usuario_Recibe"));
                historialCuenta.setNombre_Usuario_Envio(rs.getString("Nombre_Usuario_Envio"));
                historialCuenta.setNombre_Usuario_Recibe(rs.getString("Nombre_Usuario_Recibe"));
                historial.add(historialCuenta);
            }
    }catch (SQLException e){
    }
    return historial;
    }
    
}

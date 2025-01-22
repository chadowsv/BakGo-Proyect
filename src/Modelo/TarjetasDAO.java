package Modelo;
import static Modelo.Constantes.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
public class TarjetasDAO {
    private Connection conectar;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public int numTarjetasC(LoginDataUser userData){
    String cuentasc = "SELECT COUNT(ID_tarjeta) AS  Numero_TarjetasCredito FROM TarjetasCredito t JOIN Cuentas c ON t.ID_cuenta = c.ID_cuenta WHERE ID_usuario = ?";
    int cuentasctot = 0;
    try{
        conectar = getConexion();
        ps= conectar.prepareStatement(cuentasc);
        ps.setInt(1,userData.getIDusuario());
        rs = ps.executeQuery();
        if(rs.next()){
        cuentasctot = rs.getInt("Numero_TarjetasCredito");
        }
    }catch (SQLException e){
    }return cuentasctot;
    }
    public int numTarjetasD(LoginDataUser userData){
    String cuentasd = "SELECT COUNT(ID_tarjeta) AS  Numero_TarjetasDebito FROM TarjetasDebito t JOIN Cuentas c ON t.ID_cuenta = c.ID_cuenta WHERE ID_usuario = ?";
    int cuentasdtot = 0;
    try{
        conectar = getConexion();
        ps= conectar.prepareStatement(cuentasd);
        ps.setInt(1,userData.getIDusuario());
        rs = ps.executeQuery();
        if(rs.next()){
        cuentasdtot = rs.getInt("Numero_TarjetasDebito");
        }
    }catch (SQLException e){
    }return cuentasdtot;
}
    public Tarjeta obtenerTarjetasC(LoginDataUser userData){
    String sql = "SELECT t.ID_cuenta, t.Numero_tarjeta, t.Fecha_expiracion, t.Monto_pagar, t.CVV, c.ID_usuario FROM TarjetasCredito t JOIN Cuentas c ON t.ID_cuenta = c.ID_Cuenta WHERE ID_usuario = ?";
    Tarjeta tarjetaCredito = null;
    try{
        conectar = getConexion();
        ps = conectar.prepareStatement(sql);
        ps.setInt(1, userData.getIDusuario());
        rs = ps.executeQuery();
        if(rs.next()){
        tarjetaCredito = new Tarjeta();
        tarjetaCredito.setNumero_tarjeta(rs.getInt("Numero_tarjeta"));
        tarjetaCredito.setMonto(rs.getDouble("Monto_pagar"));
        tarjetaCredito.setCVV(rs.getString("CVV"));
        java.sql.Date fechaexpiracion = rs.getDate("Fecha_expiracion");
        if(fechaexpiracion != null){
        LocalDate fechaex = fechaexpiracion.toLocalDate();
        tarjetaCredito.setFecha_expiracion(fechaex);
        }
        }
    }catch(SQLException e){
    } return tarjetaCredito;
    }
    public Tarjeta obtenerTarjetasD(LoginDataUser userData){
    String sqltar = "SELECT c.ID_usuario, t.ID_cuenta, t.Numero_tarjeta,t.Fecha_expiracion, t.CVV, c.Saldo FROM TarjetasDebito t JOIN Cuentas c ON t.ID_cuenta = c.ID_cuenta WHERE ID_usuario = ?";
    Tarjeta tarjetaDebito = null;
    try{
        conectar = getConexion();
        ps = conectar.prepareStatement(sqltar);
        ps.setInt(1, userData.getIDusuario());
        rs = ps.executeQuery();
        if(rs.next()){
        tarjetaDebito = new Tarjeta();
        tarjetaDebito.setNumero_tarjeta(rs.getInt("Numero_tarjeta"));
        tarjetaDebito.setMonto(rs.getDouble("Saldo"));
        tarjetaDebito.setCVV(rs.getString("CVV"));
        java.sql.Date fechaexpi = rs.getDate("Fecha_expiracion");
        if(fechaexpi != null){
        LocalDate fechaex = fechaexpi.toLocalDate();
        tarjetaDebito.setFecha_expiracion(fechaex);
        }
        }
    }catch(SQLException e){}
    return tarjetaDebito;
    }
}

package Modelo;
import static Modelo.Constantes.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InicioCuentasDAO {
    private Connection conectar;
    private PreparedStatement ps;
    private ResultSet rs;

    public int numcuentas(LoginDataUser userData){ 
        String obtenernum = "SELECT COUNT(ID_cuenta) as Numero_cuentas FROM Cuentas WHERE ID_usuario = ?";
        int numcuentastotal = 0; //Para iniciar se deja el numero de cuentas en 0
        try{
            ps = conectar.prepareStatement(obtenernum); //por medio de la conexion se realiza la consulta en el SQL
            ps.setInt(1,userData.getIDusuario());
            rs= ps.executeQuery(); //resultado de la query
            
            if (rs.next()) { //Si la consulta devuelve un resultado, se obtiene el número de cuenta
                numcuentastotal = rs.getInt("Numero_cuentas");
            }
        }catch (SQLException e){
        }return numcuentastotal; //Retorna el número total de cuentas del usuario
    }
    public ArrayList<Cuenta> obtenerCuentasPorUsuario(LoginDataUser userData) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        String sql = "SELECT * FROM Cuentas WHERE ID_Usuario = ?";
        try {
            conectar = getConexion(); //metodo de conexion
            ps = conectar.prepareStatement(sql); //consulta de la sentencia
            ps.setInt(1, userData.getIDusuario());
            rs = ps.executeQuery(); //de la consulta tomo el resultado

            while (rs.next()) { //se recorre cada fila del resultado
                Cuenta cuenta = new Cuenta();
                //para cada fila se crea un objeto Cuenta con cada propiedad
                cuenta.setIdCuenta(rs.getString("ID_Cuenta"));
                cuenta.setTipoCuenta(rs.getString("ID_tipocuenta"));
                cuenta.setNumeroCuenta(rs.getString("Numero_Cuenta"));
                cuenta.setSaldo(rs.getDouble("Saldo"));
                cuentas.add(cuenta); //el objeto de resultado se agrega a la lista de cuentas
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return cuentas; //Devolución de la lista completa con los objetos Cuenta
    }
    
}

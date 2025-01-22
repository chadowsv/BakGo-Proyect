
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TransferenciasDAO {
        Connection conn= Constantes.getConexion();
        PreparedStatement ps;
        public TransferenciasDataUser mostrarNombre(String ncuenta){
        TransferenciasDataUser nombre= new TransferenciasDataUser();
        String usuarioInicio = "SELECT u.Primer_Nombre, u.Segundo_Nombre, u.Apellido_Paterno, u.Apellido_Materno FROM Usuarios u JOIN Cuentas c ON u.ID_usuario = c.ID_usuario WHERE Numero_cuenta = ?";
        String nombrecuenta1= null;
        try{
            ps = conn.prepareStatement(usuarioInicio);
            ps.setString(1,ncuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                nombre.setNcuenta((rs.getString("Primer_Nombre") + " " + rs.getString("Segundo_Nombre") + " " + rs.getString("Apellido_Paterno") + " " + rs.getString("Apellido_Materno")));
            } else {
                return null;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Los Datos Ingresados no son Validos");
        }
        return nombre;
        }
        
        public TransferenciasDataUser mostrarDinero(String ncuenta){
        TransferenciasDataUser dinero = new TransferenciasDataUser();
        String usuariodinero = "SELECT Saldo FROM Cuentas WHERE Numero_cuenta = ?";
        try{
            ps = conn.prepareStatement(usuariodinero);
            ps.setString(1,ncuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                dinero.setSaldo(rs.getString("Saldo"));
            } else {
                return null;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se obtiene una entrada de dinero valida");
        }
        return dinero;
    }
        
        public TransferenciasDataUser ID(String numerocuenta){
        TransferenciasDataUser IDcuentas = new TransferenciasDataUser();
        String IDSQL = "SELECT ID_cuenta FROM Cuentas WHERE Numero_cuenta = ?";
        try{
            ps = conn.prepareStatement(IDSQL);
            ps.setString(1, numerocuenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                IDcuentas.setIDcuenta(rs.getString("ID_cuenta"));
            } else {
                return null;
            }
        }catch(SQLException e){
        }
        return IDcuentas;
    }
        
        public TransferenciasDataUser InsertTrans(TransferenciasDataUser IDcuenta1, TransferenciasDataUser IDcuenta2, double montotra, LocalDate fechaReg, String Descripcion){
        TransferenciasDataUser InTransferencia = new TransferenciasDataUser();
        String Incert = "INSERT INTO Transferencias (ID_cuenta_A, ID_cuenta_B, Monto_transferencia, Fecha_transferencia, Descripcion_transferencia)" + "VALUES (?,?,?,?,?)";
        try{
            String idCuenta1 = IDcuenta1.getIDcuenta();
            String idCuenta2 = IDcuenta2.getIDcuenta();
            
            ps = conn.prepareStatement(Incert);
            ps.setString(1, idCuenta1);
            ps.setString(2, idCuenta2);
            ps.setDouble(3, montotra);
            java.sql.Date fechaRegistro = java.sql.Date.valueOf(fechaReg);
            ps.setDate(4, fechaRegistro);
            ps.setString(5, Descripcion);
            int addedRows = ps.executeUpdate();
        if (addedRows > 0){
            InTransferencia.setIDcuenta1(IDcuenta1);
            InTransferencia.setIDcuenta2(IDcuenta2);
            InTransferencia.setMonto(montotra);
            InTransferencia.setFechaReg(fechaReg);
            InTransferencia.setDescripcion(Descripcion);            
        }
        conn.close();
    }catch (SQLException e) {
            System.out.println(e.toString());
}
        return InTransferencia;
    }
        
}
          

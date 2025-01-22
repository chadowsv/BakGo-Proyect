package Modelo;

public class Cuenta {
    private String IDCuenta;
    private String ID_tipoCuenta;
    private String numeroCuenta;
    private double saldo;
//Si no se establece ningpun constructor, por defecto se crea    
    public String getIdCuenta() {
        return IDCuenta;
    } 

    public void setIdCuenta(String IDCuenta) {
       this.IDCuenta = IDCuenta;
    }

    public String getTipoCuenta() {
        return ID_tipoCuenta;
    }

    public void setTipoCuenta(String ID_tipoCuenta) {
        this.ID_tipoCuenta = ID_tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

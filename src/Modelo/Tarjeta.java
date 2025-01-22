package Modelo;

import java.time.LocalDate;

public class Tarjeta {
    private String Nombretarjeta, CVV, tipo;
    private int Numero_tarjeta;
    private double Monto, saldoDisponible;
    private LocalDate Fecha_expiracion;
   
    
    public String getNombretarjeta() {
        return Nombretarjeta;
    }

    public void setNombretarjeta(String Nombretarjeta) {
        this.Nombretarjeta = Nombretarjeta;
    }

    public int getNumero_tarjeta() {
        return Numero_tarjeta;
    }

    public void setNumero_tarjeta(int Numero_tarjeta) {
        this.Numero_tarjeta = Numero_tarjeta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public LocalDate getFecha_expiracion() {
        return Fecha_expiracion;
    }

    public void setFecha_expiracion(LocalDate Fecha_expiracion) {
        this.Fecha_expiracion = Fecha_expiracion;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
    
}

package Modelo;

import java.time.LocalDate;

public class HistorialCuenta {
    
    // Atributos
    private double saldoAnterior;
    private double saldoPosterior; 
    private LocalDate fechaTransaccion;
    private String descripcionTransaccion;
    private String Nombre_Usuario_Envio;
    private String Nombre_Usuario_Recibe;
    private int idUsuarioEnvio;
    private int idUsuarioRecibe;    
    public HistorialCuenta() {
    
    }
    // Métodos getter y setter

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getSaldoPosterior() {
        return saldoPosterior;
    }

    public void setSaldoPosterior(double saldoPosterior) {
        this.saldoPosterior = saldoPosterior;
    }

    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getDescripcionTransaccion() {
        return descripcionTransaccion;
    }

    public void setDescripcionTransaccion(String descripcionTransaccion) {
        this.descripcionTransaccion = descripcionTransaccion;
    }

    public String getNombre_Usuario_Envio() {
        return Nombre_Usuario_Envio;
    }

    public void setNombre_Usuario_Envio(String Nombre_Usuario_Envio) {
        this.Nombre_Usuario_Envio = Nombre_Usuario_Envio;
    }

    public String getNombre_Usuario_Recibe() {
        return Nombre_Usuario_Recibe;
    }

    public void setNombre_Usuario_Recibe(String Nombre_Usuario_Recibe) {
        this.Nombre_Usuario_Recibe = Nombre_Usuario_Recibe;
    }
    public int getIdUsuarioEnvio() {
        return idUsuarioEnvio;
    }
    public void setIdUsuarioEnvio(int idUsuarioEnvio) {
        this.idUsuarioEnvio = idUsuarioEnvio;
    }
    public int getIdUsuarioRecibe() {
        return idUsuarioRecibe;
    }
    public void setIdUsuarioRecibe(int idUsuarioRecibe) {
        this.idUsuarioRecibe = idUsuarioRecibe;
    }
}


package Modelo;

import java.time.LocalDate;

public class TransferenciasDataUser {
    private String ncuenta;
    private String ncuenta2;
    private TransferenciasDataUser IDcuenta1;
    private TransferenciasDataUser IDcuenta2;
    private double monto;
    private LocalDate fechaReg;
    private String Descripcion;
    private String saldo;
    private String saldo1;
    private double montotra;
    private String IDcuenta;

    public TransferenciasDataUser(TransferenciasDataUser IDcuenta1, TransferenciasDataUser IDcuenta2, double montotra, LocalDate fechaReg, String Descripcion) {
        this.IDcuenta1 = IDcuenta1;
        this.IDcuenta2 = IDcuenta2;
        this.montotra = montotra;
        this.fechaReg = fechaReg;
        this.Descripcion = Descripcion;
    }
    

    TransferenciasDataUser() {
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public String getNcuenta2() {
        return ncuenta2;
    }

    public String getSaldo1() {
        return saldo1;
    }

    public String getSaldo() {
        return saldo;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getMontotra() {
        return montotra;
    }

    public String getIDcuenta() {
        return IDcuenta;
    }

    public TransferenciasDataUser getIDcuenta1() {
        return IDcuenta1;
    }

    public TransferenciasDataUser getIDcuenta2() {
        return IDcuenta2;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setNcuenta2(String ncuenta2) {
        this.ncuenta2 = ncuenta2;
    }

    public void setSaldo1(String saldo1) {
        this.saldo1 = saldo1;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFechaReg(LocalDate fechaReg) {
        this.fechaReg = fechaReg;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setMontotra(double montotra) {
        this.montotra = montotra;
    }

    public void setIDcuenta(String IDcuenta) {
        this.IDcuenta = IDcuenta;
    }

    public void setIDcuenta1(TransferenciasDataUser IDcuenta1) {
        this.IDcuenta1 = IDcuenta1;
    }

    public void setIDcuenta2(TransferenciasDataUser IDcuenta2) {
        this.IDcuenta2 = IDcuenta2;
    }
    

}


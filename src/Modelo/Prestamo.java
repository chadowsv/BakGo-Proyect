
package Modelo;

public class Prestamo {
    private String IDPrestamo;
    private String FechaVencimiento;
    private String FechaInicio;
    private double MontoPrestamo;

    public String getIDPrestamo() {
        return IDPrestamo;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public double getMontoPrestamo() {
        return MontoPrestamo;
    }

    public void setIDPrestamo(String IDPrestamo) {
        this.IDPrestamo = IDPrestamo;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setMontoPrestamo(double MontoPrestamo) {
        this.MontoPrestamo = MontoPrestamo;
    }
    
}

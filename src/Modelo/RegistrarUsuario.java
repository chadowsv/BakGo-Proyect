package Modelo;

import java.time.LocalDate;

public class RegistrarUsuario {
    private String PrimerNombretxt;
    private String SegundoNombretxt;
    private String ApellidoPaternotxt;
    private String ApellidoMaternotxt;
    private String Cedulatxt;
    private String CorreoElectrotxt;
    private String FechaNacimientotxt;
    private String Telefonotxt;
    private String Contratxt;
    private String ConfContratxt;
    private LocalDate fechaReg; //Representación de fechas sin información de la hora
    
    public RegistrarUsuario(){}; //Validación de registro de usuario

    public RegistrarUsuario(String PrimerNombretxt, String SegundoNombretxt, String ApellidoPaternotxt, String ApellidoMaternotxt, String Cedulatxt, String CorreoElectrotxt, String FechaNacimientotxt, String Telefonotxt, String Contratxt, String ConfContratxt, LocalDate fechaReg) {
        this.PrimerNombretxt = PrimerNombretxt;
        this.SegundoNombretxt = SegundoNombretxt;
        this.ApellidoPaternotxt = ApellidoPaternotxt;
        this.ApellidoMaternotxt = ApellidoMaternotxt;
        this.Cedulatxt = Cedulatxt;
        this.CorreoElectrotxt = CorreoElectrotxt;
        this.FechaNacimientotxt = FechaNacimientotxt;
        this.Telefonotxt = Telefonotxt;
        this.Contratxt = Contratxt;
        this.ConfContratxt = ConfContratxt;
        this.fechaReg = fechaReg;
    }  

    public String getPrimerNombretxt() {
        return PrimerNombretxt;
    }

    public void setPrimerNombretxt(String PrimerNombretxt) {
        this.PrimerNombretxt = PrimerNombretxt;
    }

    public String getSegundoNombretxt() {
        return SegundoNombretxt;
    }

    public void setSegundoNombretxt(String SegundoNombretxt) {
        this.SegundoNombretxt = SegundoNombretxt;
    }

    public String getApellidoPaternotxt() {
        return ApellidoPaternotxt;
    }

    public void setApellidoPaternotxt(String ApellidoPaternotxt) {
        this.ApellidoPaternotxt = ApellidoPaternotxt;
    }

    public String getApellidoMaternotxt() {
        return ApellidoMaternotxt;
    }

    public void setApellidoMaternotxt(String ApellidoMaternotxt) {
        this.ApellidoMaternotxt = ApellidoMaternotxt;
    }

    public String getCedulatxt() {
        return Cedulatxt;
    }

    public void setCedulatxt(String Cedulatxt) {
        this.Cedulatxt = Cedulatxt;
    }

    public String getCorreoElectrotxt() {
        return CorreoElectrotxt;
    }

    public void setCorreoElectrotxt(String CorreoElectrotxt) {
        this.CorreoElectrotxt = CorreoElectrotxt;
    }

    public String getFechaNacimientotxt() {
        return FechaNacimientotxt;
    }

    public void setFechaNacimientotxt(String FechaNacimientotxt) {
        this.FechaNacimientotxt = FechaNacimientotxt;
    }

    public String getTelefonotxt() {
        return Telefonotxt;
    }

    public void setTelefonotxt(String Telefonotxt) {
        this.Telefonotxt = Telefonotxt;
    }

    public String getContratxt() {
        return Contratxt;
    }

    public void setContratxt(String Contratxt) {
        this.Contratxt = Contratxt;
    }

    public String getConfContratxt() {
        return ConfContratxt;
    }

    public void setConfContratxt(String ConfContratxt) {
        this.ConfContratxt = ConfContratxt;
    }

    public LocalDate getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDate fechaReg) {
        this.fechaReg = fechaReg;
    }
    
}

package Modelo;
public class LoginDataUser {
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoMaterno;
    private String ApellidoPaterno;
    private String CorreoElectro;
    private String TelefonoMovil;
    private String Cedula;
    private String Contraseña;
    private int IDusuario;
    private int numcuentas;
    public LoginDataUser() {
    }
    public LoginDataUser(int IDusuario, String Cedula, String PrimerNombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, String CorreloElectro, String TelefonoMovil, int numcuentas) {
        this.IDusuario = IDusuario;
        this.Cedula = Cedula;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.CorreoElectro = CorreloElectro;
        this.TelefonoMovil = TelefonoMovil;
        this.numcuentas = numcuentas;
    }
    public LoginDataUser(String Cedula, String Contraseña) {
        this.Cedula = Cedula;
        this.Contraseña = Contraseña;
    }
    public int getIDusuario() {
        return IDusuario;
    }
    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }
    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    public String getPrimerNombre() {
        return PrimerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        SegundoNombre = segundoNombre;
    }
    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        ApellidoMaterno = apellidoMaterno;
    }
    public String getCorreoElectro() {
        return CorreoElectro;
    }
    public void setCorreoElectro(String correoElectro) {
        CorreoElectro = correoElectro;
    }
    public String getTelefonoMovil() {
        return TelefonoMovil;
    }
    public void setTelefonoMovil(String telefonoMovil) {
        TelefonoMovil = telefonoMovil;
    }
    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    public int getNumcuentas() {
        return numcuentas;
    }
    public void setNumcuentas(int numcuentas) {
        this.numcuentas = numcuentas;
    }
}

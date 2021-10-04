
package taller6;
public class paciente  extends persona{
    public String dondefueatendido;
    public String motivodeconsulta;
    public String medicoatendido;
    public String fecha;

    public paciente(String dondefueatendido, String motivodeconsulta, String medicoatendido, String fecha, String cedula, String nombre, String apellido, String Sexo, String direccion) {
        super(cedula, nombre, apellido, Sexo, direccion);
        this.dondefueatendido = dondefueatendido;
        this.motivodeconsulta = motivodeconsulta;
        this.medicoatendido = medicoatendido;
        this.fecha = fecha;
    }

    public String getDondefueatendido() {
        return dondefueatendido;
    }

    public void setDondefueatendido(String dondefueatendido) {
        this.dondefueatendido = dondefueatendido;
    }

    public String getMotivodeconsulta() {
        return motivodeconsulta;
    }

    public void setMotivodeconsulta(String motivodeconsulta) {
        this.motivodeconsulta = motivodeconsulta;
    }

    public String getMedicoatendido() {
        return medicoatendido;
    }

    public void setMedicoatendido(String medicoatendido) {
        this.medicoatendido = medicoatendido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}
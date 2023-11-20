package proyecto;

import javax.swing.JOptionPane;

public class Encargados {
    private String nombreEncargado,Apellidos;
    private String ninoCargo;
    private String Ciudad, direccion;
    private int telefono;
    private String correoElectronico;
    private boolean estado = true;

    public Encargados() {
        this.nombreEncargado = "";
        this.Apellidos = "";
        this.ninoCargo = "";
        this.Ciudad = "";
        this.direccion = "";
        this.telefono = 0;
        this.correoElectronico = "";
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNinoCargo() {
        return ninoCargo;
    }

    public void setNinoCargo(String ninoCargo) {
        this.ninoCargo = ninoCargo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}

package proyecto;

import javax.swing.JOptionPane;

public class Facturas {

    private String nombrec;
    private String fechaf;
    private String numeroc;
    private String direccion;
    private String identificacion;
    private boolean Estado;
    private double pagar;

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getFechaf() {
        return fechaf;
    }

    public void setFechaf(String fechaf) {
        this.fechaf = fechaf;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(String numeroc) {
        this.numeroc = numeroc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getPagar() {
        return pagar;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    
}

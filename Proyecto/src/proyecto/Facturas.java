package proyecto;

public class Facturas {

    private String Hora;
    private String Fecha;
    private String Numero_Factura;
    private double Pago_Mensual;
    private String Rutina;
    private String Cliente;
    private Boolean Estado;

    public Facturas() {
        this.Hora = " ";
        this.Fecha = " ";
        this.Numero_Factura = " ";
        this.Pago_Mensual = 0;
        this.Rutina = "";
        this.Cliente = "";
        this.Estado = true;

    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNumero_Factura() {
        return Numero_Factura;
    }

    public void setNumero_Factura(String Numero_Factura) {
        this.Numero_Factura = Numero_Factura;
    }

    public double getPago_Mensual() {
        return Pago_Mensual;
    }

    public void setPago_Mensual(double Pago_Mensual) {
        this.Pago_Mensual = Pago_Mensual;
    }

    public String getRutina() {
        return Rutina;
    }

    public void setRutina(String Rutina) {
        this.Rutina = Rutina;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }

}

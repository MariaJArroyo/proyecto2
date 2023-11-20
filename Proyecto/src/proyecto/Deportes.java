package proyecto;



public class Deportes {
    private String nombreDeporte;
    private String caracteristicas;
    private boolean estado = true;

    public Deportes() {
        this.nombreDeporte = "";
        this.caracteristicas = "";
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
   
    
}

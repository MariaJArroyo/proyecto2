package proyecto;



public class Rutinas {
    private Deportes deporteEscoger;
    private float tiempo;
    private boolean estado=false;

    public Rutinas(){
        this.tiempo = 0.00f;
    }

    public Deportes getDeporteEscoger() {
        return deporteEscoger;
    }

    public void setDeporteEscoger(Deportes deporteEscoger) {
        this.deporteEscoger = deporteEscoger;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}

    

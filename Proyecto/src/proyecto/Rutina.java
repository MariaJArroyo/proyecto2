package proyecto;

import javax.swing.JOptionPane;

public class Rutina {
    private Deportes deporteEscoger;
    private float tiempo;
    private boolean estado=true;

    public Rutina(){
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

    

package proyecto;

import javax.swing.JOptionPane;

public class Deportes {
    public String nombreDeporte;
    private String caracteristicas;
    private boolean estado = true;

    public Deportes() {
        this.nombreDeporte = "";
        this.caracteristicas = "";
    }
    public void leerDatos(){
        nombreDeporte=JOptionPane.showInputDialog(null, "Digite el nombre del deporte: ");
        caracteristicas=JOptionPane.showInputDialog(null, "Digite las caracteristicas del deporte: ");
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"El nombre del deporte es "+nombreDeporte+" y sus caracteristicas son "+caracteristicas+".");
    }
   
    
}

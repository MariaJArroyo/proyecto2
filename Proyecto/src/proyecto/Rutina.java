package proyecto;

import javax.swing.JOptionPane;

public class Rutina {
    private Deportes deporteEscoger;
    private float tiempo;
    private boolean estado=true;

    public Rutina(){
        this.tiempo = 0.00f;
    }
    public void leerDatos(){
        Deportes de =  new Deportes();
        de.nombreDeporte=JOptionPane.showInputDialog(null, "Digite el nombre del deporte que va a escoger: ");
        tiempo=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el tiempo de duracion: "));
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"El deporte a escojer es  "+deporteEscoger.nombreDeporte+
                " y su tiempo es de "+tiempo+".");
    }
    
}

    

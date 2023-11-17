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
    public void leerDatos(){
        
        nombreEncargado=JOptionPane.showInputDialog(null, "Digite el nombre del encargado: ");
        Apellidos=JOptionPane.showInputDialog(null, "Digite sus apellidos: ");
        ninoCargo=JOptionPane.showInputDialog(null, "Digite el nombre del nino a cargo: ");
        Ciudad=JOptionPane.showInputDialog(null, "Digite la ciudad donde vive: ");
        direccion=JOptionPane.showInputDialog(null, "Digite su direccion: ");
        telefono=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su telefono: "));
        correoElectronico=JOptionPane.showInputDialog(null, "Digite su correo electronico: ");
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"El encargado legal es "+nombreEncargado+Apellidos+" esta a cargo del nino "+ninoCargo+
                "vive en la ciudad de "+Ciudad+" su direccion es "+direccion+" su numero de telefono es "+telefono+
                " y su correo electronico es"+correoElectronico+".");
    }
    
    
}

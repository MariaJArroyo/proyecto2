package proyecto;
import javax.swing.JOptionPane;

public class Deportista {
    private int id;
    private String nombreNino,Apellidos;
    private String ciudad,direccion;
    private int telefono;
    private String correoElectronico;
    private boolean estado=true;

    public Deportista() {
        this.id =0;
        this.nombreNino ="";
        this.Apellidos = "";
        this.ciudad ="";
        this.direccion = "";
        this.telefono = 0;
        this.correoElectronico = "";
    }
    
    public void leerDatos(){
        nombreNino=JOptionPane.showInputDialog(null, "Digite su nombre: ");
        Apellidos=JOptionPane.showInputDialog(null, "Digite sus apellidos: ");
        id=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su id: "));
        ciudad=JOptionPane.showInputDialog(null, "Digite la ciudad donde vive: ");
        direccion=JOptionPane.showInputDialog(null, "Digite su direccion: ");
        telefono=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su telefono: "));
        correoElectronico=JOptionPane.showInputDialog(null, "Digite su correo electronico: ");
    }
    
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"El nombre del deportista es "+nombreNino+Apellidos+"Su id es "+id+
                " Vive en la Ciudad de "+ciudad+" su direccion es "+direccion+" su numero de telefono es "+telefono+
                " y su correo electronico es "+correoElectronico+".");
    }
    
            
}

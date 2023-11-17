package proyecto;
import javax.swing.JOptionPane;

public class Usuarios {
    private String nombre,apellidos,usuario,contrasena;
    boolean estado= true;
    
    public Usuarios (){
        this.nombre="";
        this.usuario="";
        this.apellidos="";
        this.contrasena="";
        this.estado=true;
    }
    public void leerDatos(){
        nombre=JOptionPane.showInputDialog(null, "Digite su nombre: ");
        apellidos=JOptionPane.showInputDialog(null, "Digite sus apellidos: ");
        usuario=JOptionPane.showInputDialog(null, "Digite un usuario: ");
        contrasena=JOptionPane.showInputDialog(null, "Digite una contraseña: ");
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre "+nombre+" y sus apellidos "+apellidos+" ,su usuario es "+usuario+
                " y su contraseña es "+contrasena+".");
       
    }

}

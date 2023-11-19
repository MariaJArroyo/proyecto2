
package proyecto;
import javax.swing.JOptionPane;

public class Rutina {
    
// Arreglos de objetos de Usuarios
 private Usuarios infoUsuarios[] = new Usuarios[1];
     
     public void informaciónUsuarios(){
     for(int x=0; x<infoUsuarios.length; x++){
          Usuarios e = new Usuarios();
JOptionPane.showMessageDialog(null, "Se solicitarán los datos de usuario "+x);
 e.setNombre(JOptionPane.showInputDialog(null, " Escriba el nombre "));
 e.setApellidos(JOptionPane.showInputDialog(null, " Escriba el nombre "));
 e.setUsuario(JOptionPane.showInputDialog(null, " Escriba el nombre "));
 e.setContrasena(JOptionPane.showInputDialog(null, " Escriba el nombre "));
 infoUsuarios[x] = e;
}
     }
            public void consultarUsuarios() {
        String usuario = JOptionPane.showInputDialog(null, "Digite el usuario: ");
        for (int x = 0; x < infoUsuarios.length; x++) {
            if (infoUsuarios[x].getNombre().equals(infoUsuarios)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + infoUsuarios[x].getNombre() + "\nApellidos: " + infoUsuarios[x].getApellidos()+
                        "\nUsurio: " +  infoUsuarios[x].getUsuario()+  "\nContraseña: " +  infoUsuarios[x].getContrasena());
                break;
            }
        }
    }






// Arreglos de objetos de Deportistas






// Arreglos de objetos de Encargados






// Arreglos de objetos de deportes


    
    
  




// Arreglos de objetos de Rutinas
  
    

}
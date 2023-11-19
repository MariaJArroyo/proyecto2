package proyecto;

import javax.swing.JOptionPane;

public class Rutina {

// Arreglos de objetos de Usuarios
    private Usuarios infoUsuarios[] = new Usuarios[3];
    private Deportistas deportistas[] = new Deportistas[3];

    public void informaciónUsuarios() {
        for (int x = 0; x < infoUsuarios.length; x++) {
            Usuarios e = new Usuarios();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de usuario " + x);
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
                JOptionPane.showMessageDialog(null, "Nombre: " + infoUsuarios[x].getNombre() + "\nApellidos: " + infoUsuarios[x].getApellidos()
                        + "\nUsurio: " + infoUsuarios[x].getUsuario() + "\nContraseña: " + infoUsuarios[x].getContrasena());
                break;
            }
        }
    }

// Arreglos de objetos de Deportistas
    public void agregarDeportistas() {
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas d = new Deportistas();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del deportista");
            d.setNombreNino(JOptionPane.showInputDialog(null, " Escriba el nombre:  "));
            d.setApellidos(JOptionPane.showInputDialog(null, " Escriba los Apellidos: "));
            d.setCiudad(JOptionPane.showInputDialog(null, " Escriba la ciudad de residencia "));
            d.setDireccion(JOptionPane.showInputDialog(null, " Escriba la direccion "));
            d.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite su numero telefonico: ")));
            d.setCorreoElectronico(JOptionPane.showInputDialog(null, " Digite su correo Electronico: "));
            deportistas[i] = d;
        }
    }

    public void consultarDeportista() {
        String Deportista = JOptionPane.showInputDialog(null, "Digite el usuario: ");
        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getNombreNino().equals(deportistas)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + deportistas[i].getNombreNino() + " " + deportistas[i].getApellidos()
                        + "\nCiudad" + deportistas[i].getCiudad() + "\nDireccion" + deportistas[i].getDireccion()
                        + "Correo Electronico:" + deportistas[i].getCorreoElectronico() + "Numero de telefono " + deportistas[i].getTelefono());
            }

// Arreglos de objetos de Encargados



// Arreglos de objetos de deportes




// Arreglos de objetos de Rutinas




        }
    }
}

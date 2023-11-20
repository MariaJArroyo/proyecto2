package proyecto;

import javax.swing.JOptionPane;

public class Rutina {

// Arreglos de objetos de Usuarios
    private Usuarios infoUsuarios[] = new Usuarios[3];
    private Deportistas deportistas[] = new Deportistas[3];
    private Encargados Encargados[] = new Encargados[3];
    private Deportes Deportes[] = new Deportes[3];
    private Rutinas Rutinas[] = new Rutinas[3];

    public void informaciónUsuarios() {
        for (int x = 0; x < infoUsuarios.length; x++) {
            Usuarios u = new Usuarios();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de usuario " + x);
            u.setNombre(JOptionPane.showInputDialog(null, " Escriba el nombre "));
            u.setApellidos(JOptionPane.showInputDialog(null, " Escriba el nombre "));
            u.setUsuario(JOptionPane.showInputDialog(null, " Escriba el nombre "));
            u.setContrasena(JOptionPane.showInputDialog(null, " Escriba el nombre "));
            infoUsuarios[x] = u;
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
        }
    }
    

    public void editarDeportista() {
        String deportistaEditar = JOptionPane.showInputDialog(null, "Digite el deportista que desea cambiar de la informacion: ");
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas dep = new Deportistas();
            if (deportistas[i].getNombreNino().equals(deportistaEditar)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea hacer algun cambio?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));

                /*
                JOptionPane.showMessageDialog(null, "Digite lo que desea cambiar");
                dep.setNombreNino(JOptionPane.showInputDialog(null, " Escriba el nuevo nombre:  "));
                dep.setApellidos(JOptionPane.showInputDialog(null, " Escriba los nuevos Apellidos:  "));
                dep.setId(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite su nuevo id: ")));
                dep.setCiudad(JOptionPane.showInputDialog(null, "Digite la nueva Ciudad donde reside:  "));
                dep.setDireccion(JOptionPane.showInputDialog(null, " Digite su nueva direccion donde vive:  "));
                dep.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite su nuevo numero telefonico:  ")));
                dep.setCorreoElectronico(JOptionPane.showInputDialog(null, " Digite su nuevo correo electronico:  "));
                deportistas[i]=dep
                 */
                break;
            }
        }
    }

// Arreglos de objetos de Encargados
    public void agregarEncargados() {
        for (int i = 0; i < Encargados.length; i++) {
            Encargados e = new Encargados();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del Encargado");
            e.setNombreEncargado(JOptionPane.showInputDialog(null, " Escriba el nombre del encargado:  "));
            e.setApellidos(JOptionPane.showInputDialog(null, " Escriba los Apellidos ddel encargado: "));
            e.setNinoCargo(JOptionPane.showInputDialog(null, " Escriba... : "));
            e.setCiudad(JOptionPane.showInputDialog(null, " Escriba la ciudad de residencia del encargado: "));
            e.setDireccion(JOptionPane.showInputDialog(null, " Escriba la direccion del encargado: "));
            e.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite numero telefonico del encargado: ")));
            e.setCorreoElectronico(JOptionPane.showInputDialog(null, " Digite el correo Electronico del encargado: "));
            Encargados[i] = e;
        }
    }

// Arreglos de objetos de deportes
    public void agregarDeportes() {
        for (int i = 0; i < Deportes.length; i++) {
            Deportes D = new Deportes();
            D.setNombreDeporte(JOptionPane.showInputDialog(null, "Digite el nombre del deporte"));
            D.setCaracteristicas(JOptionPane.showInputDialog(null, "Escriba las caracteristicas del deporte"));
            Deportes[i] = D;
        }
    }

    public void consultarDeportes() {
        String nombreDeporte = JOptionPane.showInputDialog(null, "Digite el deporte");
        for (int i = 0; i < Deportes.length; i++) {
            if (Deportes[i].getNombreDeporte().equals(Deportes)) {
                JOptionPane.showMessageDialog(null, "El" + " " + Deportes[i].getNombreDeporte() + " " + "Tiene como caracteristicas:/n/n" + Deportes[i].getCaracteristicas());
            }
        }
    }
        // Arreglos de objetos de Rutinas

    public void Rutinas(){
        for (int i = 0; i < deportistas.length; i++) {
            Rutinas r = new Rutinas();
            r.setDeportes(JOptionPane.showInputDialog(null, "Escriba el deporte que desea escoger: "));
            r.setTiempo(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el tiempo: ")));
            r.setEstado(true);

        }
    }
}

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
        String Deportista = JOptionPane.showInputDialog(null, "Digite el deportista: ");
        boolean encontro = false;
        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getNombreNino().equals(deportistas)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + deportistas[i].getNombreNino() + " " + deportistas[i].getApellidos()
                        + "\nCiudad" + deportistas[i].getCiudad() + "\nDireccion" + deportistas[i].getDireccion()
                        + "Correo Electronico:" + deportistas[i].getCorreoElectronico() + "Numero de telefono " + deportistas[i].getTelefono());
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + Deportista);
        }
    }

    public void editarDeportista() {
        String deportistaEditar = JOptionPane.showInputDialog(null, "Digite el deportista que desea cambiar de la informacion: ");
        boolean encontro = false;
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas dep = new Deportistas();
            if (deportistas[i].getNombreNino().equals(deportistaEditar)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar el nombre?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    dep.setNombreNino(JOptionPane.showInputDialog(null, " Escriba el nuevo nombre:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar los Apellidos?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    dep.setApellidos(JOptionPane.showInputDialog(null, " Escriba los nuevos Apellidos:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia la ciudad en la que reside?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    dep.setCiudad(JOptionPane.showInputDialog(null, "Digite la nueva Ciudad donde reside:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia la direccion en la que reside?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    dep.setDireccion(JOptionPane.showInputDialog(null, "Digite la nueva direccion donde reside:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia el numero de telefono?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    dep.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo numero de telefono:  ")));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia el correo electronico\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    dep.setCorreoElectronico(JOptionPane.showInputDialog(null, "Digite el nuevo correo electronico:  "));
                }
                deportistas[i] = dep;
                encontro = true;
                break;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + deportistaEditar);
        }
    }

    public void inactivarDeportistas() {
        String deportista = JOptionPane.showInputDialog(null, "Digite el deportista que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas dep = new Deportistas();
            if (deportistas[i].getNombreNino().equals(deportista)) {
                dep.setEstado(false);
                deportistas[i] = dep;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + deportista);
        }
    }

// Arreglos de objetos de Encargados
    public void agregarEncargados() {
        for (int i = 0; i < Encargados.length; i++) {
            Encargados e = new Encargados();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del Encargado");
            e.setNombreEncargado(JOptionPane.showInputDialog(null, " Escriba el nombre del encargado:  "));
            e.setApellidos(JOptionPane.showInputDialog(null, " Escriba los Apellidos del encargado: "));
            e.setNinoCargo(JOptionPane.showInputDialog(null, " Escriba... : "));
            e.setCiudad(JOptionPane.showInputDialog(null, " Escriba la ciudad de residencia del encargado: "));
            e.setDireccion(JOptionPane.showInputDialog(null, " Escriba la direccion del encargado: "));
            e.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite numero telefonico del encargado: ")));
            e.setCorreoElectronico(JOptionPane.showInputDialog(null, " Digite el correo Electronico del encargado: "));
            Encargados[i] = e;
        }
    }

    public void consultarEncargados() {
        String Encargado = JOptionPane.showInputDialog(null, "Digite el nombre del encargado: ");
        boolean encontro = false;
        for (int i = 0; i < Encargados.length; i++) {
            if (Encargados[i].getNombreEncargado().equals(Encargado)) {
                JOptionPane.showMessageDialog(null, " Nombre: " + Encargados[i].getNombreEncargado() + " " + Encargados[i].getApellidos()
                        + "\nEl nombre del nino encargado" + Encargados[i].getNinoCargo() + " \nLa ciudad que reside: " + Encargados[i].getCiudad()
                        + "\nLa direccion en la que reside: " + Encargados[i].getDireccion() + "\nSu numero de telefono es: " + Encargados[i].getTelefono()
                        + " \nSu correo electronico es:" + Encargados[i].getCorreoElectronico());
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + Encargado);
        }
    }

    public void editarEncargados() {
        String encargadoEditar = JOptionPane.showInputDialog(null, "Digite el Encagrado que desea cambiar de la informacion: ");
        boolean encontro = false;
        for (int i = 0; i < Encargados.length; i++) {
            Encargados encargado = new Encargados();
            if (deportistas[i].getNombreNino().equals(encargadoEditar)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar el nombre?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    encargado.setNombreEncargado(JOptionPane.showInputDialog(null, " Escriba el nuevo nombre del encargado:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar los Apellidos?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    encargado.setApellidos(JOptionPane.showInputDialog(null, " Escriba los nuevos Apellidos:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia la ciudad en la que reside?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    encargado.setCiudad(JOptionPane.showInputDialog(null, "Digite la nueva Ciudad donde reside:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia la direccion en la que reside?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    encargado.setDireccion(JOptionPane.showInputDialog(null, "Digite la nueva direccion donde reside:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia el numero de telefono?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    encargado.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo numero de telefono:  ")));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia el correo electronico\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    encargado.setCorreoElectronico(JOptionPane.showInputDialog(null, "Digite el nuevo correo electronico:  "));
                }
                Encargados[i] = encargado;
                encontro = true;
                break;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + encargadoEditar);
        }
    }

    public void inactivarEncargado() {
        String Encargado = JOptionPane.showInputDialog(null, "Digite el encargado que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < Encargados.length; i++) {
            Encargados encargado = new Encargados();
            if (Encargados[i].getNombreEncargado().equals(Encargado)) {
                encargado.setEstado(false);
                Encargados[i] = encargado;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + Encargado);
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

    public void editarDeporte() {
        String deporteEditar = JOptionPane.showInputDialog(null, "Digite el deporte que desea editar: ");
        boolean encontro = false;
        for (int i = 0; i < Deportes.length; i++) {
            Deportes deporte = new Deportes();
            if (Deportes[i].getNombreDeporte().equals(deporteEditar)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar el nombre del deporte?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deporte.setNombreDeporte(JOptionPane.showInputDialog(null, " Escriba el nuevo nombre del encargado:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar las caracteristicas del deporte?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deporte.setCaracteristicas(JOptionPane.showInputDialog(null, " Escriba los nuevos Apellidos:  "));
                }
                Deportes[i] = deporte;
                encontro = true;
                break;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + deporteEditar);
        }
    }

    public void InactivarDeporte() {
        String Deporte = JOptionPane.showInputDialog(null, "Digite el deporte que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < Deportes.length; i++) {
            Deportes deporte = new Deportes();
            if (Deportes[i].getNombreDeporte().equals(Deporte)) {
                deporte.setEstado(encontro);
                Deportes[i] = deporte;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + Deporte);
        }
    }

// Arreglos de objetos de Rutinas
    public void agregarRutinas() {
        for (int i = 0; i < deportistas.length; i++) {
            Rutinas r = new Rutinas();
            boolean existe = false;
            do {
                String deporte = JOptionPane.showInputDialog(null, "Escriba el deporte que desea escoger: ");
                for (int j = 0; j < Deportes.length; j++) {
                    if (deporte.equals(Deportes[j].getNombreDeporte())) {
                        existe = true;
                        break;
                    }
                }
                if (existe == false) {
                    JOptionPane.showMessageDialog(null, "El deporte seleccionado no existe, porfavor vuelva a intentarlo ");
                } else {
                    r.setDeporte(deporte);
                }
            } while (existe = false);
            r.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripcion de la rutina: "));
            r.setTiempo(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el tiempo: ")));
            r.setEstado(true);

        }
    }

public void consultarRutinas(){
 String NombreRutina = JOptionPane.showInputDialog(null, "Digite la rutina a consultar");
   for (int i = 0; i < Rutinas.length; i++) {
            if (Rutinas[i].getDescripcion().equals(NombreRutina)) {
                JOptionPane.showMessageDialog(null, "La" + " " + Deportes[i].getNombreDeporte() + " " + "Tiene como caracteristicas:/n/n" + Deportes[i].getCaracteristicas());
}
}

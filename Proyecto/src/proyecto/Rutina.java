// Prueba
package proyecto;

import javax.swing.JOptionPane;

public class Rutina {

// Arreglos de objetos de Usuarios
    private Usuarios infoUsuarios[] = new Usuarios[2];
    private Deportistas deportistas[] = new Deportistas[2];
    private Encargados Encargados[] = new Encargados[2];
    private Deportes Deportes[] = new Deportes[2];
    private Rutinas Rutinas[] = new Rutinas[2];

    public void agregarUsuarios() {
        for (int i = 0; i < infoUsuarios.length; i++) {
            Usuarios usuario = new Usuarios();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos de usuario " + i);
            usuario.setNombre(JOptionPane.showInputDialog(null, "Escriba el nombre: "));
            usuario.setApellidos(JOptionPane.showInputDialog(null, "Escriba los Apellidos: "));
            usuario.setUsuario(JOptionPane.showInputDialog(null, "Escriba el Usuario: "));
            usuario.setContrasena(JOptionPane.showInputDialog(null, " Escriba su Contrasena: "));
            infoUsuarios[i] = usuario;
        }
    }

    public void consultarUsuarios() {
        String usuarioConsultar = JOptionPane.showInputDialog(null, "Digite el usuario: ");
        boolean encontro = false;
        for (int i = 0; i < infoUsuarios.length; i++) {
            if (infoUsuarios[i].getNombre().equals(usuarioConsultar)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + infoUsuarios[i].getNombre() + "\nApellidos: " + infoUsuarios[i].getApellidos()
                        + "\nUsurio: " + infoUsuarios[i].getUsuario() + "\nContraseña: " + infoUsuarios[i].getContrasena());
                encontro = true;

            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun ususario con el nombre: " + usuarioConsultar);
        }
    }

    public void inactivarUsuario() {
        String usuarioInactivar = JOptionPane.showInputDialog(null, "Digite el usuario que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < infoUsuarios.length; i++) {
            Usuarios usuario = new Usuarios();
            if (infoUsuarios[i].getNombre().equals(usuarioInactivar)) {
                usuario.setEstado(false);
                infoUsuarios[i] = usuario;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ninguna usuario  con el nombre: " + usuarioInactivar);
        }
    }

// Arreglos de objetos de Deportistas
    public void agregarDeportistas() {
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas deportista = new Deportistas();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del deportista");
            deportista.setNombreNino(JOptionPane.showInputDialog(null, " Escriba el nombre del deportista:  "));
            deportista.setApellidos(JOptionPane.showInputDialog(null, " Escriba los Apellidos del deportista: "));
            deportista.setCiudad(JOptionPane.showInputDialog(null, " Escriba la ciudad de residencia: "));
            deportista.setDireccion(JOptionPane.showInputDialog(null, " Escriba la direccion de residencia:  "));
            deportista.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero telefonico: ")));
            deportista.setCorreoElectronico(JOptionPane.showInputDialog(null, " Digite su correo Electronico: "));
            deportistas[i] = deportista;
        }
    }

    public void consultarDeportista() {
        String DeportistaConsultar = JOptionPane.showInputDialog(null, "Digite el deportista: ");
        boolean encontro = false;
        for (int i = 0; i < deportistas.length; i++) {
            if (deportistas[i].getNombreNino().equals(DeportistaConsultar)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + deportistas[i].getNombreNino() + " " + deportistas[i].getApellidos()
                        + "\nCiudad: " + deportistas[i].getCiudad() + "\nDireccion: " + deportistas[i].getDireccion()
                        + "\nCorreo Electronico:" + deportistas[i].getCorreoElectronico() + "\nNumero de telefono: " + deportistas[i].getTelefono());
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun deportista con el nombre: " + DeportistaConsultar);
        }
    }

    public void editarDeportista() {
        String deportistaEditar = JOptionPane.showInputDialog(null, "Digite el deportista que desea cambiar de la informacion: ");
        boolean encontro = false;
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas deportista = new Deportistas();
            if (deportistas[i].getNombreNino().equals(deportistaEditar)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar el nombre?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deportista.setNombreNino(JOptionPane.showInputDialog(null, " Escriba el nuevo nombre del deportista:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar los Apellidos?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deportista.setApellidos(JOptionPane.showInputDialog(null, " Escriba los nuevos Apellidos deportista:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia la ciudad en la que reside?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deportista.setCiudad(JOptionPane.showInputDialog(null, "Digite la nueva Ciudad donde reside:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia la direccion en la que reside?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deportista.setDireccion(JOptionPane.showInputDialog(null, "Digite la nueva direccion donde reside:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia el numero de telefono?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deportista.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el nuevo numero de telefono:  ")));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambia el correo electronico\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deportista.setCorreoElectronico(JOptionPane.showInputDialog(null, "Digite el nuevo correo electronico:  "));
                }
                deportistas[i] = deportista;
                encontro = true;
                break;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun deportista con el nombre: " + deportistaEditar);
        }
    }

    public void inactivarDeportistas() {
        String deportistaInactivar = JOptionPane.showInputDialog(null, "Digite el deportista que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < deportistas.length; i++) {
            Deportistas deportista = new Deportistas();
            if (deportistas[i].getNombreNino().equals(deportistaInactivar)) {
                deportista.setEstado(false);
                deportistas[i] = deportista;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun deportista con el nombre: " + deportistaInactivar);
        }
    }

// Arreglos de objetos de Encargados
    public void agregarEncargados() {
        for (int i = 0; i < Encargados.length; i++) {
            Encargados encargado = new Encargados();
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del Encargado");
            encargado.setNombreEncargado(JOptionPane.showInputDialog(null, " Escriba el nombre del encargado:  "));
            encargado.setApellidos(JOptionPane.showInputDialog(null, " Escriba los Apellidos del encargado: "));
            encargado.setNinoCargo(JOptionPane.showInputDialog(null, " Escriba el nombre del nino del que esta acargo : "));
            encargado.setCiudad(JOptionPane.showInputDialog(null, " Escriba la ciudad de residencia del encargado: "));
            encargado.setDireccion(JOptionPane.showInputDialog(null, " Escriba la direccion del encargado: "));
            encargado.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, " Digite numero telefonico del encargado: ")));
            encargado.setCorreoElectronico(JOptionPane.showInputDialog(null, " Digite el correo Electronico del encargado: "));
            Encargados[i] = encargado;
        }
    }

    public void consultarEncargados() {
        String EncargadoConsultar = JOptionPane.showInputDialog(null, "Digite el nombre del encargado: ");
        boolean encontro = false;
        for (int i = 0; i < Encargados.length; i++) {
            if (Encargados[i].getNombreEncargado().equals(EncargadoConsultar)) {
                JOptionPane.showMessageDialog(null, " Nombre: " + Encargados[i].getNombreEncargado() + " " + Encargados[i].getApellidos()
                        + "\nEl nombre del nino que esta acargo" + Encargados[i].getNinoCargo() + " \nLa ciudad que reside: " + Encargados[i].getCiudad()
                        + "\nLa direccion en la que reside: " + Encargados[i].getDireccion() + "\nSu numero de telefono es: " + Encargados[i].getTelefono()
                        + " \nSu correo electronico es:" + Encargados[i].getCorreoElectronico());
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun encargado  con el nombre: " + EncargadoConsultar);
        }
    }

    public void editarEncargados() {
        String encargadoEditar = JOptionPane.showInputDialog(null, "Digite el Encargado que desea cambiar de la informacion: ");
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
                    encargado.setApellidos(JOptionPane.showInputDialog(null, " Escriba los nuevos Apellidos del Encargado:  "));
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
            JOptionPane.showMessageDialog(null, "No hay ningun encargado con el nombre: " + encargadoEditar);
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
            JOptionPane.showMessageDialog(null, "No hay ningun encargado con el nombre: " + Encargado);
        }
    }

// Arreglos de objetos de deportes
    public void agregarDeportes() {
        for (int i = 0; i < Deportes.length; i++) {
            Deportes deporte = new Deportes();
            deporte.setNombreDeporte(JOptionPane.showInputDialog(null, "Digite el nombre del deporte: "));
            deporte.setCaracteristicas(JOptionPane.showInputDialog(null, "Escriba las caracteristicas del deporte: "));
            Deportes[i] = deporte;
        }
    }

    public void consultarDeportes() {
        String nombreDeporte = JOptionPane.showInputDialog(null, "Digite el deporte: ");
        boolean encontro = false;
        for (int i = 0; i < Deportes.length; i++) {
            if (Deportes[i].getNombreDeporte().equals(nombreDeporte)) {
                JOptionPane.showMessageDialog(null, "El" + " " + Deportes[i].getNombreDeporte() + " " + "Tiene como caracteristicas:" + Deportes[i].getCaracteristicas());
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun deporte con el nombre: " + nombreDeporte);
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
                    deporte.setNombreDeporte(JOptionPane.showInputDialog(null, "Escriba el nuevo nombre del deporte:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar las caracteristicas del deporte?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    deporte.setCaracteristicas(JOptionPane.showInputDialog(null, "Escriba las nuevas caracteristicas del deporte:  "));
                }
                Deportes[i] = deporte;
                encontro = true;
                break;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun deporte con el nombre: " + deporteEditar);
        }
    }

    public void InactivarDeporte() {
        String deporteInactivar = JOptionPane.showInputDialog(null, "Digite el deporte que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < Deportes.length; i++) {
            Deportes deporte = new Deportes();
            if (Deportes[i].getNombreDeporte().equals(deporteInactivar)) {
                deporte.setEstado(encontro);
                Deportes[i] = deporte;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + deporteInactivar);
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
            r.setNombreRutina(JOptionPane.showInputDialog(null, "Digite el nombre de la rutina: "));
            r.setDescripcion(JOptionPane.showInputDialog(null, "Digite la descripcion de la rutina: "));
            r.setTiempo(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el tiempo: ")));

        }
    }

    public void consultarRutinas() {
        String nombreRutina = JOptionPane.showInputDialog(null, "Digite la rutina a consultar");
        boolean encontro = false;
        for (int i = 0; i < Rutinas.length; i++) {
            if (Rutinas[i].getNombreRutina().equals(nombreRutina)) {
                JOptionPane.showMessageDialog(null, "El nombre de la rutina es: " + Rutinas[i].getNombreRutina() + "\nSu descripcion es: " + Rutinas[i].getDescripcion()
                        + "\nY su tiempo de duracion es de: " + Rutinas[i].getTiempo());
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ningun  con el nombre: " + nombreRutina);
        }
    }

    public void editarRutina() {
        String rutinaEditar = JOptionPane.showInputDialog(null, "Digite la rutina a editar");
        boolean encontro = false;
        for (int i = 0; i < Rutinas.length; i++) {
            Rutinas rutina = new Rutinas();
            if (Rutinas[i].getNombreRutina().equals(rutinaEditar)) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar el nombre de la Rutina?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    rutina.setNombreRutina(JOptionPane.showInputDialog(null, "Escriba el nuevo nombre de la rutina:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar la descripcion de las rutina?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    rutina.setDescripcion(JOptionPane.showInputDialog(null, "Escriba la nueva descripcion de la rutina:  "));
                }
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea cambiar el tiempo de la rutina?\n 1-Si\n 2-No\n\n Ingrese una Opcion"));
                if (opcion == 1) {
                    rutina.setTiempo(Float.parseFloat(JOptionPane.showInputDialog(null, " Escriba el nuevo tiempo de la rutina:  ")));
                }
                Rutinas[i] = rutina;
                encontro = true;
                break;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ninguna rutina  con el nombre: " + rutinaEditar);
        }
    }

    public void inactivarRutina() {
        String rutinaInactivar = JOptionPane.showInputDialog(null, "Digite la rutina que desea inactivar: ");
        boolean encontro = false;
        for (int i = 0; i < Rutinas.length; i++) {
            Rutinas rutina = new Rutinas();
            if (Rutinas[i].getNombreRutina().equals(rutinaInactivar)) {
                rutina.setEstado(encontro);
                Rutinas[i] = rutina;
                encontro = true;
            }
        }
        if (encontro == false) {
            JOptionPane.showMessageDialog(null, "No hay ninguna rutina  con el nombre: " + rutinaInactivar);
        }
    }
}

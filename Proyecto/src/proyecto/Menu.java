package proyecto;

import javax.swing.JOptionPane;

public class Menu {

    Rutina r = new Rutina();

    public void MostrarMenu() {

        int opcion = 0;
        while (opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "---Menu--- \n"
                    + "1- Usuarios\n"
                    + "2- Deportista\n"
                    + "3- Encargado\n"
                    + "4- Deporte\n"
                    + "5- Rutina\n"
                    + "6- Factura\n"
                    + "7- Salir\n"));
            switch (opcion) {
                case 1:
                    menuUsuarios();
                    break;
                case 2:
                    menuDeportista();
                    break;
                case 3:
                    menuEncargado();
                    break;
                case 4:
                    menuDeporte();
                    break;
                case 5:
                    menuRutinas();
                    break;
                case 6:
                    menuFacturacion();
                    break;
                case 7:
                    System.exit(0);
                    JOptionPane.showMessageDialog(null, "Ha salido del sistema :) ");
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :(");
                }
            }
        }
    }

    public void menuUsuarios() {

        int opcion = 0;
        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***Menu Usuarios***\n"
                    + "1-Agregar Usuario\n "
                    + "2-Consultar Usuario\n"
                    + "3- Inactivar Usuario\n"
                    + "4- Salir\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.agregarUsuarios();
                    break;
                case 2:
                    r.consultarUsuarios();
                    break;
                case 3:
                    r.inactivarUsuario();
                    break;
                case 4:
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :(");
                }
            }
        }
    }

    public void menuDeportista() {

        int opcion = 0;
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "---Menu Deportistas---\n"
                    + "1-Agregar Deportista\n"
                    + "2-Consultar Deportista\n"
                    + "3-Editar Deportista\n"
                    + "4-Inactivar Deportista\n"
                    + "5-Salir\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.agregarDeportistas();
                    break;
                case 2:
                    r.consultarDeportista();
                    break;
                case 3:
                    r.editarDeportista();
                    break;
                case 4:
                    r.inactivarDeportistas();
                    break;
                case 5:
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :( ");
                }
            }
        }
    }

    public void menuEncargado() {

        int opcion = 0;
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***Menu Encargado***\n"
                    + "1-Agregar Encargado\n"
                    + "2-Consultar Encargado\n"
                    + "3-Editar Encargado\n"
                    + "4-Inactivar Encargado\n"
                    + "5- Salir\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.agregarUsuarios();
                    break;
                case 2:
                    r.consultarEncargados();
                    break;
                case 3:
                    r.editarEncargados();
                    break;
                case 4:
                    r.inactivarEncargado();
                    break;
                case 5:
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :( ");
                }
            }
        }
    }

    public void menuDeporte() {

        int opcion = 0;
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "---Menu Deporte---\n"
                    + "1-Agregar Deporte\n "
                    + "2-Consultar Deporte\n"
                    + "3-Editar Deporte\n"
                    + "4-Inactivar Deporte\n"
                    + "5- Salir\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.agregarDeportes();
                    break;
                case 2:
                    r.consultarDeportes();
                    break;
                case 3:
                    r.editarDeporte();
                    break;
                case 4:
                    r.InactivarDeporte();
                    break;
                case 5:
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :( ");
                }
            }
        }
    }

    public void menuRutinas() {

        int opcion = 0;
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "***Menu Rutinas***\n"
                    + "1- Agregar Rutina\n"
                    + "2- Consultar Rutina\n"
                    + "3- Editar Rutina\n"
                    + "4- Inactivar Rutina\n"
                    + "5- Salir\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.agregarRutinas();
                    break;
                case 2:
                    r.consultarRutinas();
                    break;
                case 3:
                    r.editarRutina();
                    break;
                case 4:
                    r.inactivarRutina();
                    break;
                case 5:
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :( ");
                }
            }
        }
    }

    public void menuFacturacion() {

        int opcion = 0;
        while (opcion != 4) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "---Menu Facturación---\n"
                    + "1-Agregar Factura\n"
                    + "2-Mostar facturar\n"
                    + "3- Anular factura\n"
                    + "4- Salir\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.facturacion();
                    break;
                case 2:
                    r.mostrarfactura();
                    break;
                case 3:
                    r.anularfactura();
                    break;
                case 4:
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida. :( ");
                }
            }
        }
    }
}

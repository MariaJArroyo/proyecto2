package proyecto;

import javax.swing.JOptionPane;

public class Menu {

    public void MostrarMenu() {

        Rutina r = new Rutina();
        r.agregarUsuarios();
        r.agregarDeportistas();
        r.agregarEncargados();
        r.agregarDeportes();
        r.agregarRutinas();

        int opcion = 0;
        while (opcion != 14) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Menu \n\n"
                    + "1-Consultar Usuario\n"
                    + "2-Inactivar Usuario\n"
                    + "3-Consultar Deportista\n"
                    + "4-Editar Deportista\n"
                    + "5-Inactivar Deportista\n"
                    + "6-Consultar Encargado\n"
                    + "7-Editar Encargado\n"
                    + "8-Inactivar Encargado\n"
                    + "9-Consultar Deporte\n"
                    + "10-Editar Deporte\n"
                    + "11-Inactivar Deporte\n"
                    + "12-Consultar Rutina\n"
                    + "13-Editar Rutina\n"
                    + "14-Inactivar Rutina\n\n"
                    + "Elija una opcion :)"));

            switch (opcion) {
                case 1:
                    r.consultarUsuarios();
                    break;
                case 2:
                    r.inactivarUsuario();
                    break;
                case 3:
                    r.consultarDeportista();
                    break;
                case 4:
                    r.editarDeportista();
                    break;
                case 5:
                    r.inactivarDeportistas();
                    break;
                case 6:
                    r.consultarEncargados();
                    break;
                case 7:
                    r.editarEncargados();
                    break;
                case 8:
                    r.inactivarEncargado();
                    break;
                case 9:
                    r.consultarDeportes();
                    break;
                case 10:
                    r.editarDeporte();
                    break;
                case 11:
                    r.InactivarDeporte();
                    break;
                case 12:
                    r.consultarRutinas();
                    break;
                case 13:
                    r.editarRutina();
                    break;
                case 14:
                    r.inactivarRutina();
                    break;
                case 15:
                    System.exit(0);
                    JOptionPane.showMessageDialog(null, "Ha salido del sistema");
                    break;
                default: {
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
                }
            }
        }
    }
}

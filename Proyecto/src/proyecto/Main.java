package proyecto;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Usuarios u = new Usuarios();
        Deportista d = new Deportista();
        Encargados e = new Encargados();
        Deportes dp = new Deportes();
        Rutina r = new Rutina();
        
        boolean ejecutar = true;
        int opcion = 0;

        while (ejecutar == true) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu principal \n1.Registrar Usuario \n2.Consultar Usuarios "
                    + "\n3.Ver deportistas \n4.Ver encargados \n5.Mostrar deportes \n6.Mostrar Rutinas \n7.Salir del Sistema \nDigite un numero:  "));

            switch (opcion) {
                case 1:
                    u.leerDatos();
                    break;
                case 2:
                    u.mostrarDatos();
                    break;
                case 3:
                    d.leerDatos();
                    d.mostrarDatos();
                    break;
                case 4:
                    e.leerDatos();
                    e.mostrarDatos();
                    break;
                case 5:
                    dp.leerDatos();
                    dp.mostrarDatos();
                    break;
                case 6:
                    r.leerDatos();
                    r.mostrarDatos();
                    break;
                case 7:
                    ejecutar=false;
                    JOptionPane.showMessageDialog(null,"Usted ha salido del sistema");
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida.");
            }

        }
    }

}

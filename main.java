import java.util.ArrayList;
import javax.swing.JOptionPane;
import Mascotas.Mascota;
public class main {

    public static void main(String[] args) {

        int opcion;
        Mascota mascota = new Mascota();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú principal\n\n" +
                    "1. Insertar Datos\n" +
                    "2. Modificar Datos\n" +
                    "3. Imprime datos\n"+
                    "4. Salir"));

            switch (opcion) {
                case 1:
                mascota.insertarDatos();
                    break;
                case 2:
                mascota.modificarDatos();
                    break;
                case 3:
                mascota.imprimirDatos();
                    break;
                case 4:
                JOptionPane.showMessageDialog(null, "SALIENDO...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 4);
    }
}
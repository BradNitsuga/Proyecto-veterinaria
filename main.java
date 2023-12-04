
import javax.swing.JOptionPane;

import Empleado.Empleado;
import Mascotas.Mascota;
import Sucursal.Sucursal;
import Servicio.Servicio;

public class Main {

public static void main(String[] args) {
int opcion;
Sucursal.Sucursal.imprimeSucursal();
Cliente cliente = new Cliente();
cliente.insertar_datos();
cliente.imprimir_datos();

do { opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú principal\n\n" +
                    "1. EMPLEADOS\n" +
                    "2. MASCOTAS\n" +
                    "3. PRODUCTOS\n"+
                    "4. SERVICIO\n"+
                    "5. Salir"));

            switch (opcion) {
                case 1: Empleado.menu();
                    break;
                case 2:Mascota.menu();
                    break;
                case 3: Producto.menu();
                    break;
                case 4:Servicio.menu();
                    break;
                case 5: 
                JOptionPane.showMessageDialog(null, "SALIENDO...");
                    break;
                default: System.out.println("Opción no válida.");
                    break; } } while (opcion != 5);
    }
}
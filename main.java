import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Empleado.Empleado;
import Mascotas.Mascota;
public class main {

    public static void main(String[] args) {


int opcion;
do { opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú principal\n\n" +
                    "1. EMPLEADOS\n" +
                    "2. MASCOTAS\n" +
                    "3. PRODUCTOS\n"+
                    "4. Salir"));
            switch (opcion) {
                case 1: Empleado.menu();
                    break;
                case 2:Mascota.menu();
                    break;
                case 3: 
                
                    break;
                case 4: 
                JOptionPane.showMessageDialog(null, "SALIENDO...");
                    break;
                default: System.out.println("Opción no válida.");
                    break; } } while (opcion != 4);
    }
}
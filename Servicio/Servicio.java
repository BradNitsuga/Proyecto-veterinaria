package Servicio;
import javax.swing.JOptionPane;



public class Servicio {
    private String nombre_mascota, dia_cita, hora;

    public void insertarDatos() {
        nombre_mascota = JOptionPane.showInputDialog("Nombre de la mascota:");
        dia_cita = JOptionPane.showInputDialog("Dia que desea agendar:");
        hora = JOptionPane.showInputDialog("HORA que desea agendar:");
     }

    public void imprimeDatos(){
        String mensaje = "BIENVENIDO: " + "\nIngresa el nombre de la mascota: " + nombre_mascota + "\nIngresa el dia que desea agendar: " + 
        dia_cita + "\nIngresa la HORA que desea agendar: " + hora;
        JOptionPane.showMessageDialog(null, mensaje, "Detalles del Hospedaje", JOptionPane.INFORMATION_MESSAGE);
    }
          public static void menu(){
        int opcion;

        do { 
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Que Tipo de Servicio Desea? \n\n" +
                    "1. Estetico\n" +
                    "2. Guarderia \n" +
                    "3. Hospedaje \n" +
                    "4. Regresar al menu principal"));

            switch (opcion) {
                case 1:MainEstetico.menu();
                    break;
                case 2: MainGuarderia.menu();
                    break;
                case 3:
                //E_Hospedaje.menu();
                    break;
                case 4:JOptionPane.showMessageDialog(null, "Regresando a MENU PRINCIPAL..");
                break;
                default: JOptionPane.showMessageDialog(null,"Opción no válida.");
                    break; 
            } 
        } while (opcion != 4);
    }
    }
    


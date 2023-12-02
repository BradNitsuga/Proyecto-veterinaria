package Servicio;
import javax.swing.JOptionPane;
public class Servicio {
    private String nombre_mascota, dia_cita, hora;

    public void insertarDatos() {
        nombre_mascota = JOptionPane.showInputDialog("Ingresa el nombre de la mascota:");
        dia_cita = JOptionPane.showInputDialog("Ingresa el dia que desea agendar:");
        hora = JOptionPane.showInputDialog("Ingresa la HORA que desea agendar:");
     }

    public void imprimeDatos(){
        String mensaje = "BIENVENIDO: " + "\nIngresa el nombre de la mascota: " + nombre_mascota + "\nIngresa el dia que desea agendar: " + 
        dia_cita + "\nIngresa la HORA que desea agendar: " + hora;
        JOptionPane.showMessageDialog(null, mensaje, "Detalles del Hospedaje", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void menu(){
        S_E_Baño baño= new S_E_Baño ();
        S_E_Corte corte = new S_E_Corte();
        int opc;
        String op = JOptionPane.showInputDialog(" 1 : BAÑO" + "\n" + " 2 : CORTE");
        opc = Integer.parseInt(op);

        switch(opc){
        case 1:
            baño.insertarDatos();
            baño.imprimirServicio();
        break;
        case 2: 
            corte.insertarDatos();
            corte.imprimirServicio();
        break;
        default:
                JOptionPane.showMessageDialog(null,  "Opcion Incorrecta");
         }
    }
          
    }
    


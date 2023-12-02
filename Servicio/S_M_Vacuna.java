package Servicio;
import javax.swing.JOptionPane;

public class S_M_Vacuna extends S_Medico{
    public String nombre_mascota, dia_cita, hora;

    public void insertarDatos(){
        nombre_mascota = JOptionPane.showInputDialog("Ingresa el nombre de la mascota:");
        dia_cita = JOptionPane.showInputDialog("Ingresa el dia que desea agendar:");
        hora = JOptionPane.showInputDialog("Ingresa la HORA que desea agendar:");

    int op;

        op =Integer.parseInt(JOptionPane.showInputDialog("selecciona el tipo de mascota" + "\n"+ "1 :Canino" + "\n" + " 2 :Felino"   + "\n" + "3:Salir"));
        switch(op){
            case 1:
                int canino= Integer.parseInt(JOptionPane.showInputDialog("VACUNAS DISPONIBLES PARA PERROS:" + "\n"+ "Selecciona la vacuna que deseas aplicar a tu mascota."+ "\n" + "1 :Puppy DP" + "\n" + " 2 :Sextuple" + "\n" +
                        "3 :KC " + "\n" + "4 :Antirrabica" ));
                switch(canino){
                    case 1:
                        JOptionPane.showMessageDialog(null,  "Vacuna: Puppy DP" + ", Precio: 300");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,  "Vacuna: Sextuple" + ", Precio: 350");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,  "Vacuna: KC" + ", Precio: 275");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,  "Vacuna: Antirrabica " + ", Precio: 305");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,  "Opcion fuera del rango");
                }
                break;
            case 2:

                int felino= Integer.parseInt(JOptionPane.showInputDialog("VACUNAS DISPONIBLES PARA GATOS:" + "\n"+ "Selecciona la vacuna que deseas aplicar a tu mascota."+"\n" + "1 :Triple felina" + "\n" + " 2 :Leucemia felina" + "\n" +
                        "3 :Antirrabica " ));
                switch (felino){
                    case 1:
                        JOptionPane.showMessageDialog(null,  "Vacuna: Triple felina" + ", Precio: 300");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,  "Vacuna: Leucemia Fleina" + ", Precio: 350");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Vacuna: Antirrabica" + ", Precio: 275 ");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,  "Opcion fuera del rango");

                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saliste del menu");
                break;
            default:
                JOptionPane.showMessageDialog(null,  "Opcion fuera del rango");
        }
    }

    public void imprimirServicio() {
       // insertarDatos();
        //imprimirServicio();
        JOptionPane.showMessageDialog(null, "Nombre de la mascota: " + nombre_mascota +
                        "\nDía de cita: " + dia_cita + "\nHora: " + hora,
                "Detalles del Servicio - Vacuna", JOptionPane.INFORMATION_MESSAGE);
    }

}
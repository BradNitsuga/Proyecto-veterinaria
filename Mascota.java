package Macotass;
import javax.swing.JOptionPane;

public class Mascota {
    private String id_mascota,nombre, tipo, alergias, raza;
    private int edad;
    private float peso;
   
public void insertarDatos() {
        id_mascota = JOptionPane.showInputDialog("Ingrese el ID de la mascota:");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
        tipo = JOptionPane.showInputDialog("tu mascota es un perro o gato ");
        alergias = JOptionPane.showInputDialog("Ingrese las alergias de la mascota:");
        raza = JOptionPane.showInputDialog("Ingrese la raza de la mascta:");
        peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la mascota:"));
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota:")); 
        	
        System.out.println("DATOS MASCOTA");
        System.out.println("id de la mascota: " + id_mascota);
        System.out.println("Nombre (mascota): " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Alergias: " + alergias);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Raza: " + raza);  
    }
    

    public void modificarDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" M E N U "+ "\n" +"1: Modificar nombre" + "\n" + 
        "\n 2: Modificar alergias "+"\n"
         +"\t 3: Cambiar peso" + "\n" +"\n 4: Modificar edad " + "\n" +"\n 5: Modificar raza " ));
switch(opcion) {
            case 1:
                nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la mascota:");
                break;
            case 2:
                alergias = JOptionPane.showInputDialog("Ingrese las nuevas alergias de la mascota:");
                break;
            case 3:
                float nuevoPeso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo peso de la mascota:"));
                break;
            case 4:
                int nuevaEdad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad de la mascota:"));
                break;
            case 5:
                raza = JOptionPane.showInputDialog("Ingrese la nueva raza de la mascota:");
                break;
            default:
                // Cancelar la modificacion
                JOptionPane.showMessageDialog(null, "Modificacion cancelada");
        }
    }
}



package Servicio;
import javax.swing.JOptionPane;
public class S_Estetico extends Servicio{

    private String tamaño, raza;
    private float peso; 

    public void insertarDatos() {
      super.insertarDatos();
      String[] opcionesTipoAnimal = {"Gato", "Perro"};
      String[] opcionesTamaño = {"Pequeño", "Mediano", "Grande"};
    
      int tipoIndex = JOptionPane.showOptionDialog(null, "Seleccione el tipo de animal", "Tipo Animal",
      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesTipoAnimal, opcionesTipoAnimal[0]); 
      String tipoAnimal = opcionesTipoAnimal[tipoIndex];

      int tamañoIndex = JOptionPane.showOptionDialog(null, "Seleccione el tamaño", "Tamaño",
      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesTamaño, opcionesTamaño[0]);
      tamaño = opcionesTamaño[tamañoIndex];

      peso= Integer.parseInt(JOptionPane.showInputDialog("Inserta el peso: "));

      raza= JOptionPane.showInputDialog("Inserta la raza de tu mascota: "); 
      }

      public void imprimirServicio() {
      super.imprimeDatos();
            String mensaje =  "\nTamaño: " + tamaño + "\nPeso: " + peso + "\nRaza:" + raza ;
            JOptionPane.showMessageDialog(null, mensaje, "Datos del animal", JOptionPane.INFORMATION_MESSAGE);
      }



}






    


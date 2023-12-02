package Servicio;

import javax.swing.JOptionPane;

public class S_Medico extends Servicio {
    private String tipo_mascota;
    private String genero;
    private int edad;
    private float peso; 
    

    public void insertarDatos() {
    super.insertarDatos();
    String[] opcionesTipoAnimal = {"Gato", "Perro"};
    String[] opcionesSexo = {"Hembra", "Macho"};
    
      int tipoIndex = JOptionPane.showOptionDialog(null, "Seleccione el tipo de animal", "Tipo Animal",
      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesTipoAnimal, opcionesTipoAnimal[0]);
        tipo_mascota = opcionesTipoAnimal[tipoIndex];
    
        int sexoIndex = JOptionPane.showOptionDialog(null, "Seleccione el sexo", "Sexo",
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesSexo, opcionesSexo[0]);
        genero = opcionesSexo[sexoIndex];

      edad= Integer.parseInt(JOptionPane.showInputDialog("Inserta la edad de la mascota: "));

      peso= Float.parseFloat(JOptionPane.showInputDialog("Inserta el peso de tu mascota: ")); 
   }

   public void imprimirServicio() {
    super.imprimeDatos();
    String mensaje = "Tipo de animal: " + tipo_mascota  + "\nSexo: " + genero + "\nEdad: " + edad + "\nPeso: " + peso;
    JOptionPane.showMessageDialog(null, mensaje, "Datos Servicio Medico", JOptionPane.INFORMATION_MESSAGE);

}

}

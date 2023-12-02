package Servicio;
import javax.swing.JOptionPane;
public class S_Guarderia extends Servicio{
    private String tipoAnimal;
    private String tamaño;
    private String sexo;


    public void insertarDatos() {
        super.insertarDatos();
        String[] opcionesTipoAnimal = {"Gato", "Perro"};
        String[] opcionesTamaño = {"Pequeño", "Mediano", "Grande"};
        String[] opcionesSexo = {"Hembra", "Macho"};


        int tipoIndex = JOptionPane.showOptionDialog(null, "Seleccione el tipo de animal", "Tipo Animal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesTipoAnimal, opcionesTipoAnimal[0]);
        tipoAnimal = opcionesTipoAnimal[tipoIndex];


        int tamañoIndex = JOptionPane.showOptionDialog(null, "Seleccione el tamaño", "Tamaño",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesTamaño, opcionesTamaño[0]);
        tamaño = opcionesTamaño[tamañoIndex];


        int sexoIndex = JOptionPane.showOptionDialog(null, "Seleccione el sexo", "Sexo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesSexo, opcionesSexo[0]);
        sexo = opcionesSexo[sexoIndex];
    }

    public void imprimirServicio() {
        super.imprimeDatos();
        String mensaje = "Tipo de animal: " + tipoAnimal + "\nTamaño: " + tamaño + "\nSexo: " + sexo;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del animal", JOptionPane.INFORMATION_MESSAGE);

    }

}

package Macotass;
import javax.swing.JOptionPane;
public class M_Canino extends Mascota {
    private String descripcion_can; 

    @Override
    public void insertarDatos(){
    	super.insertarDatos();
        descripcion_can= JOptionPane.showInputDialog("Introduce una breve descripcion de tu mascota: "); 
        System.out.println("Descripcion del Canino: " + descripcion_can);  
    }
}

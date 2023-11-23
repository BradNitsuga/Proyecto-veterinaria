package Macotass;
import javax.swing.JOptionPane;
public class M_Felino extends Mascota {
    private String descripcion; 
    	
    @Override
    public void insertarDatos(){
    	super.insertarDatos();
        descripcion= JOptionPane.showInputDialog("Introduce una breve descripcion de tu mascota: "); 
        System.out.println("Descripcion del felino: " + descripcion);  
    }
}
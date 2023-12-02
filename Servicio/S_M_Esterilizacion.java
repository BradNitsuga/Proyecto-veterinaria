package Servicio;
import javax.swing.JOptionPane;
public class S_M_Esterilizacion extends S_Medico{
    private int opcioneste;
    private final float costo= 250;

    public void insertarDatos(){
        super.insertarDatos();
        opcioneste= JOptionPane.showConfirmDialog(null,"¿Deseas esterilizar a tu mascota?","Servicio Medico",JOptionPane.YES_NO_OPTION);		
    if(opcioneste==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Esterilizacion: " + "1" +"\n"+ "Costo: " + costo, "Datos servicio Medico", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Cancelacion de Esterilizacion " + "0", "Datos servicio Medico", JOptionPane.INFORMATION_MESSAGE);

    }
}

   
    public void imprimirServicio() {
        super.imprimirServicio();
       
       
    }
    
    }

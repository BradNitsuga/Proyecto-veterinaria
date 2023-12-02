package Servicio;
import javax.swing.JOptionPane;
public class S_M_Consulta extends S_Medico {
    private String malestar;
    private final float precio= 150;

    
    public void insertarDatos(){
        super.insertarDatos();
        malestar= JOptionPane.showInputDialog("Ingresa brevemente los sintomas de la mascota: "); 
   
    }

    public void imprimirServicio() {
        super.imprimirServicio();
       // insertarDatos();
        String mensaje = "Malestares de la mascota: " + malestar +"\n"+ "Costo de consulta a pagar: " + precio;
        JOptionPane.showMessageDialog(null, mensaje, "Datos Servicio Medico", JOptionPane.INFORMATION_MESSAGE);
    }
}

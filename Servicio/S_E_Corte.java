package Servicio;
import javax.swing.JOptionPane;

public class S_E_Corte extends S_Estetico{
    private String corte;
    private final int costo= 100; 

    public void insertarDatos(){
        super.insertarDatos();
        corte = JOptionPane.showInputDialog("Especificaciones de corte: "); 
    }

    public void imprimirServicio() {
        super.imprimirServicio();

        String mensaje =   "\nCorte:" + corte + "\nPrecio:" + costo ;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Corte", JOptionPane.INFORMATION_MESSAGE);
  
    }




}

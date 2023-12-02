package Servicio;
import javax.swing.JOptionPane;
public class S_G_Hospedaje extends S_Guarderia {
    private String fecha;
    private String ubicacion;
    private int numeroMascota;
    private double costo;
    private int numeroDias;

    @Override
    public void insertarDatos() {
       super.insertarDatos();

        fecha = JOptionPane.showInputDialog("Ingrese la fecha de hospedaje:");

        ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación de hospedaje:");

        String mascotas = JOptionPane.showInputDialog("Ingrese el número de mascotas:");
        numeroMascota = Integer.parseInt(mascotas);

        String dias = JOptionPane.showInputDialog("Ingrese el número de días:");
        numeroDias = Integer.parseInt(dias);
    }

    public int getNumeroDias() {
        return numeroDias;
    }


    public void calcularCosto() {
        costo = getNumeroDias() * 160;
        JOptionPane.showMessageDialog(null, "El costo del hospedaje es: $" + costo, "Costo de Hospedaje", JOptionPane.INFORMATION_MESSAGE);
    }

    public void imprimeDatos() {
        insertarDatos();
        super.imprimirServicio();
        calcularCosto();

        String mensaje = "Fecha de Hospedaje: " + fecha + "\nUbicación: " + ubicacion
                + "\nNúmero de Mascotas: " + numeroMascota + "\nCosto: $" + costo;
        JOptionPane.showMessageDialog(null, mensaje, "Detalles del Hospedaje", JOptionPane.INFORMATION_MESSAGE);
    }
}

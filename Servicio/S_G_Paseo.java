package Servicio;
import javax.swing.JOptionPane;
public class S_G_Paseo extends S_Guarderia {
    private String[] diasPaseo;
    private String lugar;
    private double costo;


    public S_G_Paseo() {
        diasPaseo = new String[7];
    }

    @Override
    public void insertarDatos() {
        super.insertarDatos();

        lugar = JOptionPane.showInputDialog("Ingrese el lugar del paseo:");

        int index = 0;
        do {
            String[] opcionesDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
            int diaIndex = JOptionPane.showOptionDialog(null, "Seleccione un día de la semana", "Día de Paseo",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcionesDias, opcionesDias[0]);

            diasPaseo[index] = opcionesDias[diaIndex];
            index++;

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea añadir otro día?", "Añadir Día",
                    JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION || index >= diasPaseo.length) {
                break;
            }
        } while (true);
    }

    public void calcularPrecio() {
        int count = 0;
        for (String dia : diasPaseo) {
            if (dia == null) {
                count++;
            }
        }
        costo = count * 120;
    }

    public void imprimeCita() {
        super.imprimirServicio();

        StringBuilder dias = new StringBuilder();
        for (String dia : diasPaseo) {
            if (dia != null) {
            dias.append(dia).append("/ ");
            }
        }

        String mensaje = "Días de paseo: " + dias + "\nLugar: " + lugar + "\nCosto: $" + costo;
        JOptionPane.showMessageDialog(null, mensaje, "Detalles de la Cita", JOptionPane.INFORMATION_MESSAGE);
    }
}

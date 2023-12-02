package Servicio;
import javax.swing.JOptionPane;


public class S_E_Baño extends S_Estetico {
    private String masaje, limpiezadeoido, cortedeuñas;
    private String continuar;

 public static void mostrarMenu() {
        int total = 0;
        do {
            String[] opciones = {"Masaje","Limpieza de oído", "Corte de uñas"};
            int result = JOptionPane.showOptionDialog(null,"Seleccione un servicio:", "Menú de Servicios", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, null);
            if (result == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Operación cancelada por el usuario.", "Cancelar",
                JOptionPane.INFORMATION_MESSAGE);
            return;
            }

            switch (opciones[result]) {
        case "Masaje": 
        JOptionPane.showMessageDialog(null, "Masaje - Precio: $100");
            total += 100;
            break;
        case "Limpieza de oído":
        JOptionPane.showMessageDialog(null,"Limpieza de oído - Precio: $150");
            total += 150;
            break;
        case "Corte de uñas":
        JOptionPane.showMessageDialog(null, "Corte de uñas - Precio: $200");
            total += 200;
            break;
            }
            int respuesta =JOptionPane.showConfirmDialog(null, "¿Desea añadir otro servicio?", "Añadir Servicio", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) { mostrarMenu();
            }
            break;
            } while (true);
            JOptionPane.showMessageDialog(null, "Total: $" + total, "Total de Costos",JOptionPane.INFORMATION_MESSAGE);
            }

            public void insertarDatos(){
                super.insertarDatos();
                mostrarMenu();
            }

            public void imprimirServicio(){
                super.imprimirServicio();
            }
        

}


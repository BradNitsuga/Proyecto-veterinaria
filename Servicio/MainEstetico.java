package Servicio;
import javax.swing.JOptionPane;

public class MainEstetico {
    
    public static void menu(){
        S_E_Baño baño= new S_E_Baño ();
        S_E_Corte corte = new S_E_Corte();
        int opc;
        String op = JOptionPane.showInputDialog(" 1 : BAÑO" + "\n" + " 2 : CORTE");
        opc = Integer.parseInt(op);

        switch(opc){
        case 1:
            baño.insertarDatos();
            baño.imprimirServicio();
        break;
        case 2: 
            corte.insertarDatos();
            corte.imprimirServicio();
        break;
        default:
                JOptionPane.showMessageDialog(null,  "Opcion Incorrecta");
         }
    }
}

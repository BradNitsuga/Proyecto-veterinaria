package Servicio;

import javax.swing.JOptionPane;

public class MainGuarderia {

    public static void menu(){
        S_G_Paseo paseo = new S_G_Paseo();
        S_G_Hospedaje hospedaje = new S_G_Hospedaje();

        int opc;
        
        String op = JOptionPane.showInputDialog(" 1 : Hospedaje" + "\n" + " 2 : Paseo");
        opc = Integer.parseInt(op);
        switch(opc){
            case 1:
                hospedaje.imprimeDatos();
            break;
            case 2: 
                paseo.insertarDatos();
                paseo.calcularPrecio();
                paseo.imprimeCita();
            break;
                default:
                JOptionPane.showMessageDialog(null,  "Opcion Incorrecta");
            break;
            }
    }
}

    
    
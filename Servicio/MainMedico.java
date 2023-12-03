package Servicio;

import javax.swing.JOptionPane;

public class MainMedico {
    public static void menu() {
        
        S_M_Esterilizacion esterilizacion = new S_M_Esterilizacion();
        S_M_Consulta consulta = new S_M_Consulta();
        S_M_Vacuna vacuna = new S_M_Vacuna();
        
         int opc;
    
          String op = JOptionPane.showInputDialog(" 1 : Esterilizacion" + "\n" + " 2 : Consulta" + "\n" + " 3: Vacuna");
          opc = Integer.parseInt(op);
          switch(opc){
		   	case 1:
            esterilizacion.insertarDatos();
            esterilizacion.imprimirServicio();
            break;

            case 2: 
            consulta.insertarDatos();
            consulta.imprimirServicio();
            break;

            case 3:
            vacuna.insertarDatos();
            vacuna.imprimirServicio();
            break;
		   	    default:
		   	     JOptionPane.showMessageDialog(null,  "Opcion Incorrecta");
		   }
        



    }   
}

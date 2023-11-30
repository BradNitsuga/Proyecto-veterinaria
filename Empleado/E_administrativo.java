package Empleado;

import javax.swing.JOptionPane;

public class E_administrativo extends Empleado {

    public String nombre; public String curp; public String genero; public String NSS;
    public String edad; public String telefono; public String correo;
    int opc,i,num=0,continuar;
    public static E_administrativo trabajadorAdministrativos[];

    public E_administrativo(){
        this.nombre = "";
        this.curp = "";
        this.genero = "";
        this.NSS = "";
        this.edad = "";
        this.telefono = "";
        this.correo="";
    }

    public E_administrativo(String nombre, String curp, String genero, String NSS,
    String edad, String telefono, String correo) {
        super(nombre, curp, genero, NSS, edad, telefono);
        this.correo = correo;
    }

    public void insertarDatos() {

        E_administrativo trabajador[] = new E_administrativo[8];
        int i,num=0;
        int continuar;
       do{
        trabajador [num]= new E_administrativo(
        (JOptionPane.showInputDialog("Ingrese el nombre: ")),(JOptionPane.showInputDialog("Ingrese el Curp: ")),
        (JOptionPane.showInputDialog("Ingrese su Genero: ")),(JOptionPane.showInputDialog("Ingrese su NSS: ")),
        (JOptionPane.showInputDialog("Ingrese su edad: ")),(JOptionPane.showInputDialog("Ingrese numero de telefono: ")),
        (JOptionPane.showInputDialog("Ingrese su Correo: ")));
        num=num+1;
        continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Trabajador?","Recabando información",JOptionPane.YES_NO_OPTION);
        }
        while(continuar==JOptionPane.YES_OPTION);
        for (i=0;i<num;i++)
            {
            //Escribir Trabajadores
            JOptionPane.showMessageDialog(null, "Empleado " + (i + 1) + ":\n" + trabajador[i]);
            JOptionPane.showMessageDialog(null, "Pago total por Quincena : \n " + " $1000 x 1 \n "+ trabajador[i].calcularPago());    
    }
}

public static void menu(){
    int opcion;
   E_administrativo trabajador = new E_administrativo();
    do { 
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Empleado\n\n" +
                "1. Insertar Datos\n" +
                "2. Modificar Datos\n" +
                "3. Imprime datos\n"+
                "4. Regresar al menu principal"));

        switch (opcion) {
            case 1: trabajador.insertarDatos();
                break;
            case 2:trabajador.modificarDatos();
                break;
            case 3:trabajador.toString();
                break;
            case 4: JOptionPane.showMessageDialog(null, "Regresando a MENU EMPLEADO..");
                break;
            default: JOptionPane.showMessageDialog(null,"Opción no válida.");
                break; 
        } 
    } while (opcion != 4);
}

public int calcularPago (){
    int pre= 1000*1;
    return pre;
}

public void modificarDatos() {
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(
        " M E N U " + 
        "\n 1: Modificar Curp " +
        "\n 2: Modificar Nombre" + 
        "\n 3: Modificar NSS " +
        "\n 4: Cambiar Telefono" + 
        "\n 5: Cambiar Edad" + 
        "\n 6: Cambiar Correo"  )
    );

    switch (opcion) {
        case 1:
            curp = JOptionPane.showInputDialog("Ingrese la nueva Curp");
            break;
        case 2:
            nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
            break;
        case 3:
            NSS = JOptionPane.showInputDialog("Ingrese las nueva NSS");
            break;
        case 4:
             telefono = JOptionPane.showInputDialog("Ingrese el nuevo Telefono");
            break;
        case 5:
            edad = JOptionPane.showInputDialog("Ingrese la nueva edad");
            break;
        case 6:
            correo = JOptionPane.showInputDialog("Ingrese el nuevo correo");
            break;
        default:
            // Cancel the modification
            JOptionPane.showMessageDialog(null, "Modificacion cancelada");
    }
}

}
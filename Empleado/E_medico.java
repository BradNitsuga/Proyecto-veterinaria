package Empleado;

import javax.swing.JOptionPane;

public class E_medico extends Empleado {
    public String nombre; public String curp; public String genero; public String NSS;
    public String edad; public String telefono; public String especialidad;
    int opc,i,num=0,continuar;
    public static E_medico trabajadorMedicos[];

    public E_medico(){
        this.nombre = "";
        this.curp = "";
        this.genero = "";
        this.NSS = "";
        this.edad = "";
        this.telefono = "";
        this.especialidad="";
    }

    public E_medico(String nombre, String curp, String genero, String NSS, String edad, String telefono, String especialidad) {
        super(nombre, curp, genero, NSS, edad,telefono);
        this.nombre = nombre;
        this.curp = curp;
        this.genero = genero;
        this.NSS = NSS;
        this.edad = edad;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public void insertarDatos() {

        E_medico trabajador[] = new E_medico[8];
        int i,num=0;
        int continuar;
       do{
        trabajador [num]= new E_medico(
        (JOptionPane.showInputDialog("Ingrese el nombre: ")),(JOptionPane.showInputDialog("Ingrese el Curp: ")),
        (JOptionPane.showInputDialog("Ingrese su Genero: ")),(JOptionPane.showInputDialog("Ingrese su NSS: ")),
        (JOptionPane.showInputDialog("Ingrese su edad: ")),(JOptionPane.showInputDialog("Ingrese numero de telefono: ")),
        (JOptionPane.showInputDialog("Ingrese su Especialidad: ")));
        num=num+1;
        continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Trabajador?","Recabando información",JOptionPane.YES_NO_OPTION);
        }
        while(continuar==JOptionPane.YES_OPTION);
        for (i=0;i<num;i++)
            {
            //Escribir Trabajadores
            JOptionPane.showMessageDialog(null, "Empleado " + (i + 1) + ":\n" + trabajador[i]);
            JOptionPane.showMessageDialog(null, "Pago total por Quincena : \n " + " $1000 x 3 \n \n "+ trabajador[i].calcularPago());    
    }
}


public static void menu(){
    E_medico trabajador = new E_medico();
    trabajador.insertarDatos();
}

public int calcularPago (){
    int pre= 1000*3;
    return pre;
}

public String toString (){
    return "Curp: " + this.curp + "\n" +
        "Nombre: " + this.nombre + "\n" +
        "Tipo: " + this.genero + "\n" +
        "NSS: " + this.NSS + "\n" +
        "Telefono: " + this.telefono + "\n" +
        "Edad: " + this.edad + "\n" +
        "Especialidad: " + this.especialidad + "";
}

public void modificarDatos() {
    int opcion = Integer.parseInt(JOptionPane.showInputDialog(
        " M E N U " + 
        "\n 1: Modificar Curp " +
        "\n 2: Modificar Nombre" + 
        "\n 3: Modificar NSS " +
        "\n 4: Cambiar Telefono" + 
        "\n 5: Cambiar Edad" + 
        "\n 6: Cambiar Especialidad"  )
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
            especialidad = JOptionPane.showInputDialog("Ingrese la nueva Especialidad");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Modificacion cancelada");
        }
    }
}

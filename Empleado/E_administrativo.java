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
        this.nombre = nombre;
        this.curp = curp;
        this.genero = genero;
        this.NSS = NSS;
        this.edad = edad;
        this.telefono = telefono;
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
            E_administrativo trabajador = new E_administrativo();
            trabajador.insertarDatos();
        }

    public int calcularPago (){
            int pre= 1000*1;
            return pre;
        }

}
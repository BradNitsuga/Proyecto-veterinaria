
package Empleado;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Empleado {
    
    public String nombre; public String curp; public String genero; public String NSS;
    public String edad; public String telefono; public String sueldo;
    int opc,i;
    int num=0;
    int continuar;
    public static Empleado trabajador[];

    // Default constructor
    public Empleado() {
        this.nombre = "";
        this.curp = "";
        this.genero = "";
        this.NSS = "";
        this.edad = "";
        this.telefono = "";
        this.sueldo = "";
    }

    // Parameterized constructor
    public Empleado(String n, String c, String g, String N, String e, String t, String s) {
        this.nombre = n;
        this.curp = c;
        this.genero = g;
        this.NSS = N;
        this.edad = e;
        this.telefono = t;
        this.sueldo = s;
    }

    // Method to insert data
    public void insertarDatos() {

        Empleado trabajador[] = new Empleado[7];
        int opc,i,num=0;
        int continuar;
    
       do{
        trabajador [num]= new Empleado(
        (JOptionPane.showInputDialog("Ingrese el nombre:")),
        (JOptionPane.showInputDialog("Ingrese el Curp:")),
        (JOptionPane.showInputDialog("Ingrese su Genero: ")),
        (JOptionPane.showInputDialog("Ingrese su NSS")),
        (JOptionPane.showInputDialog("Ingrese su edad:")),
        (JOptionPane.showInputDialog("Ingrese numero de telefono:")),
        (JOptionPane.showInputDialog("Sueldo")));
        num=num+1;
        continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Trabajador?","Recabando información",JOptionPane.YES_NO_OPTION);
        }while(continuar==JOptionPane.YES_OPTION);

        for (i=0;i<num;i++)
            {
            //Escribir Trabajadores
            JOptionPane.showMessageDialog(null, "Empleado " + (i + 1) + ":" + trabajador[i]);
            JOptionPane.showMessageDialog(null, "Pago total: \n "+ trabajador[i].calcularPago());

        
    }
}

    public void imprimirDatos(){
        int opc,i,num=0;
        int continuar;

        for (i=0;i<num;i++)
            {
            //Escribir Trabajadores
            JOptionPane.showMessageDialog(null, trabajador[i]);
            }
/*
        JOptionPane.showMessageDialog(null, "Datos ingresados: \n" +
            "CURP: " + this.curp + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Tipo: " + this.genero + "\n" +
            "NSS: " + this.NSS + "\n" +
            "Telefono: " + this.telefono + "\n" +
            "Edad: " + this.edad + "\n" +
            "Tipo de empleado: " +   "\n");
            */
        
    }

    // Method to modify data
    public void modificarDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
            " M E N U " + "\n" + 
            "1: Modificar nombre" + 
            "\n 2: Modificar NSS " +
            "\n 3: Cambiar Telefono" + 
            "\n 4: Modificar edad " + 
            "\n 5: Modificar Curp ")
        );

        switch (opcion) {
            case 1:
                nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la mascota:");
                break;
            case 2:
                NSS = JOptionPane.showInputDialog("Ingrese las nuevas NSS de la mascota:");
                break;
            case 3:
                 telefono = JOptionPane.showInputDialog("Ingrese el nuevo Telefono de la mascota:");
                break;
            case 4:
                edad = JOptionPane.showInputDialog("Ingrese la nueva edad de la mascota:");
                break;
            case 5:
                curp = JOptionPane.showInputDialog("Ingrese la nueva Curp de la mascota:");
                break;
            default:
                // Cancel the modification
                JOptionPane.showMessageDialog(null, "Modificacion cancelada");
        }
    }

    // Getter methods
    public String getNombre(){
        return nombre;
    }
    public String getCurp(){
        return curp;
    }
    public String getGenero(){
        return genero;
    }
    public String getNSS() { 
        return NSS; 
    }
    public String getEdad(){
        return edad;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getSueldo(){
        return sueldo;
    }

    // Calculate the payment
    public double calcularPago (){
        return 0.0 ;
    }

    // Convert the object to a string
    public String toString (){
        return "CURP: " + this.curp + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Tipo: " + this.genero + "\n" +
            "NSS: " + this.NSS + "\n" +
            "Telefono: " + this.telefono + "\n" +
            "Edad: " + this.edad + "\n" +
            "Tipo de empleado: " +  "\n";
    }

    // Main menu
    public static void menu(){
        int opcion;
        Empleado trabajador = new Empleado();
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
                case 3: 
                    int num=0;
                    for (int i=0;i< num;i++)
                    {
                    //Escribir Trabajadores
                    JOptionPane.showMessageDialog(null, Empleado.trabajador[i]);
                }
                    break;
                case 4: JOptionPane.showMessageDialog(null, "SALIENDO...");
                    break;
                default: System.out.println("Opción no válida.");
                    break; 
            } 
        } while (opcion != 4);
    }
}
    
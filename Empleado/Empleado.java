package Empleado;
import javax.swing.JOptionPane;

public class Empleado {
    public String nombre; public String curp; public String genero; public String NSS;
    public String edad; public String telefono;
    int opc,i,num=0,continuar;
    public static Empleado trabajador[];

    // Default constructor
    public Empleado() {
        this.nombre = "";
        this.curp = "";
        this.genero = "";
        this.NSS = "";
        this.edad = "";
        this.telefono = "";
    }

    // Parameterized constructor
    public Empleado(String n, String c, String g, String N, String e, String t) {
        this.nombre = n;
        this.curp = c;
        this.genero = g;
        this.NSS = N;
        this.edad = e;
        this.telefono = t;
    }

    // Method to insert data
    public void insertarDatos() {

        Empleado trabajador[] = new Empleado[7];
        int i,num=0;
        int continuar;
       do{
        trabajador [num]= new Empleado(
        (JOptionPane.showInputDialog("Ingrese el nombre: ")),(JOptionPane.showInputDialog("Ingrese el Curp: ")),
        (JOptionPane.showInputDialog("Ingrese su Genero: ")),(JOptionPane.showInputDialog("Ingrese su NSS: ")),
        (JOptionPane.showInputDialog("Ingrese su edad: ")),(JOptionPane.showInputDialog("Ingrese numero de telefono: ")));
        num=num+1;
        continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Trabajador?","Recabando información",JOptionPane.YES_NO_OPTION);
        }
        while(continuar==JOptionPane.YES_OPTION);
        for (i=0;i<num;i++)
            {
            //Escribir Trabajadores
            JOptionPane.showMessageDialog(null, "Empleado " + (i + 1) + ":\n" + trabajador[i]);
            JOptionPane.showMessageDialog(null, "Pago total: \n "+ trabajador[i].calcularPago());    
    }
}

    public void imprimirDatos(){
        int i,num=0;

        for (i=0;i<num;i++)
            {
            //Escribir Trabajadores
            JOptionPane.showMessageDialog(null, trabajador.toString());
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

    // Calculate the payment
    public int calcularPago (){
        int pre= 1000*3;
        return pre;
    }

    // Convert the object to a string
    public String toString (){
        return "Curp: " + this.curp + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Tipo: " + this.genero + "\n" +
            "NSS: " + this.NSS + "\n" +
            "Telefono: " + this.telefono + "\n" +
            "Edad: " + this.edad + "\n";
    }

    // Main menu
   
     public static void menu(){
        int opcion;

        do { 
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Que Tipo de Empleado Desea Registrar? \n\n" +
                    "1. Medico\n" +
                    "2. Administración \n" +
                    "3. Regresar al menu principal"));

            switch (opcion) {
                case 1: E_medico.menu();
                    break;
                case 2:E_administrativo.menu();
                    break;
                case 3:JOptionPane.showMessageDialog(null, "Regresando a MENU PRINCIPAL..");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción no válida.");
                    break; 
            } 
        } while (opcion != 3);
    }
}
    
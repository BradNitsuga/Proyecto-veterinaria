package Empleado;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre; private String curp; private String genero; private String NSS; 
    private int edad; private int telefono; private double sueldo;
        
        public Empleado() {
            this.nombre = "";
            this.curp = "";
            this.genero = "";
            this.NSS = "";
            this.edad = 0;
            this.telefono = 0;
            this.sueldo = 1200.00;
        }
        public Empleado(String n, String c, String g, int e, int t, double s) {
            this.nombre = nombre;
            this.curp = curp;
            this.genero = genero;
            this.NSS = NSS;
            this.edad = edad;
            this.telefono = telefono;
            this.sueldo = 1200.00;
        }

        public void insertarDatos() {
        this.curp = JOptionPane.showInputDialog("Ingrese el Curp:");
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        this.genero = JOptionPane.showInputDialog("Ingrese su Genero; ");
        this.NSS = JOptionPane.showInputDialog("Ingrese su NSS");
        this.telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de telefono:"));
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota:"));
    }

    public void imprimirDatos(){
        JOptionPane.showMessageDialog(null, "Datos ingresados: \n" +
            "CURP: " + this.curp + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Tipo: " + this.genero + "\n" +
            "NSS: " + this.NSS +
            "Telefono: " + this.telefono + "\n" +
            "Edad: " + this.edad + "\n");
    }

    public void modificarDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
            " M E N U " + "\n" + 
            "1: Modificar nombre" + 
            "\n 2: Modificar NSS " +
            "\n 3: Cambiar Telefono" + 
            "\n 4: Modificar edad " + 
            "\n 5: Modificar Curp "));

        switch (opcion) {
            case 1:
                nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la mascota:");
                break;
            case 2:
                NSS = JOptionPane.showInputDialog("Ingrese las nuevas NSS de la mascota:");
                break;
            case 3:
                 telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo Telefono de la mascota:"));
                break;
            case 4:
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad de la mascota:"));
                break;
            case 5:
                curp = JOptionPane.showInputDialog("Ingrese la nueva Curp de la mascota:");
                break;
            default:
                // Cancelar la modificacion
                JOptionPane.showMessageDialog(null, "Modificacion cancelada");
        }
    }


        public String getNombre(){
            return nombre;
        }
        public String getCurp(){
            return curp;
        }
        public String getGenero(){
            return genero;
        }
        private String getNSS() { 
            return NSS; 
        }
        public int getEdad(){
            return edad;
        }
        public int getTelefono(){
            return telefono;
        }
        public double getSueldo(){
            return sueldo;
        }
        // calcular el pago
        public double calcularPago (){
            return 0.0;
        }
        public String toString (){
            return nombre + ", Número de seguro social: " + NSS;
            
        }

        public static void menu(){
    int opcion;
    Empleado empleado = new Empleado();
    do { opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "Menú principal\n\n" +
                "1. Insertar Datos\n" +
                "2. Modificar Datos\n" +
                "3. Imprime datos\n"+
                "4. Salir"));
        switch (opcion) {
            case 1: empleado.insertarDatos();
                break;
            case 2:empleado.modificarDatos();
                break;
            case 3: empleado.imprimirDatos();
                break;
            case 4: JOptionPane.showMessageDialog(null, "SALIENDO...");
                break;
            default: System.out.println("Opción no válida.");
                break; } } while (opcion != 4);
        }

}

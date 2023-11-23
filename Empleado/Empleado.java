package Empleado;

public class Empleado {
    private String nombre; private String curp; private String genero; private String NSS; private int edad; private int telefono; private double sueldo;

        public Empleado(String n, String c, String g, int e, int t, double s) {
            this.nombre = nombre;
            this.curp = curp;
            this.genero = genero;
            this.NSS = NSS;
            this.edad = edad;
            this.telefono = telefono;
            this.sueldo = 1200.00;
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
        private String getNSS() { return NSS; }
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

}

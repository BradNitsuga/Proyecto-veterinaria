package Mascotas;



import javax.swing.JOptionPane;

public class Mascota {
    private String id_mascota, nombre, tipo, alergias, raza;
    private int edad;
    private float peso;

    public Mascota() {
        this.id_mascota = "";
        this.nombre = "";
        this.tipo = "";
        this.alergias = "";
        this.raza = "";
        this.edad = 0;
        this.peso = 0;
    }

    public Mascota(String id_mascota, String nombre, String tipo, String alergias, String raza, int edad, float peso) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.tipo = tipo;
        this.alergias = alergias;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }
    
    // metodos
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nTipo:" + this.tipo + "\nAlergias: " + this.alergias + "\nRaza: " + this.raza + "\nEdad: " + this.edad + "\nPeso: " + this.peso;
        }


    public void insertarDatos() {
        id_mascota = JOptionPane.showInputDialog("Ingrese el ID de la mascota:");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
        tipo = JOptionPane.showInputDialog("tu mascota es un perro o gato ");
        alergias = JOptionPane.showInputDialog("Ingrese las alergias de la mascota:");
        raza = JOptionPane.showInputDialog("Ingrese la raza de la mascta:");
        peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso de la mascota:"));
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota:"));
    }

    public void imprimirDatos(){
        JOptionPane.showMessageDialog(null, "Datos ingresados: \n" +
            "Id de la Mascota: " + this.id_mascota + "\n" +
            "Nombre: " + this.nombre + "\n" +
            "Tipo: " + this.tipo + "\n" +
            "Alergias: " + this.alergias +
            "Peso: " + this.peso + "\n" +
            "Edad: " + this.edad + "\n" +            
            "Raza: " + this.raza + "\n");
    }

    public void modificarDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(" M E N U " + "\n" + "1: Modificar nombre" + "\n" +
                "\n 2: Modificar alergias " + "\n"
                + "\n 3: Cambiar peso" + "\n" + "\n 4: Modificar edad " + "\n" + "\n 5: Modificar raza "));
        switch (opcion) {
            case 1:
                nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la mascota:");
                break;
            case 2:
                alergias = JOptionPane.showInputDialog("Ingrese las nuevas alergias de la mascota:");
                break;
            case 3:
                float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo peso de la mascota:"));
                break;
            case 4:
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad de la mascota:"));
                break;
            case 5:
                raza = JOptionPane.showInputDialog("Ingrese la nueva raza de la mascota:");
                break;
            default:
                // Cancelar la modificacion
                JOptionPane.showMessageDialog(null, "Modificacion cancelada");
        }
    }

    // getters y setters de los atributos
    public String getId_mascota() {
        return this.id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlergias() {
        return this.alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
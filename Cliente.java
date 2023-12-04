import javax.swing.JOptionPane;

public class Cliente {
    private Integer num_cliente;
    private String nombre;
    private String direccion;
    private String clase_mascota;
    private Integer numero;

    public Cliente(Integer num_cliente, String nombre, String direccion, Integer numero, String clase_mascota) {
        this.num_cliente= num_cliente;
        this.nombre=nombre;
        this.direccion=direccion;
        this.numero = numero;
        this.clase_mascota = clase_mascota;
    }

    public void insertar_datos(){
        num_cliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cliente"));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        direccion = JOptionPane.showInputDialog("Ingrese su direccion");
        clase_mascota = JOptionPane.showInputDialog("Ingrese el tipo de mascota");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero telefonico"));
    }

    public void imprimir_datos(){
        System.out.println("--------Informacion del Cliente--------");
        System.out.println("Numero de cliente: "+ num_cliente);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Direccion: "+ direccion);
        System.out.println("Tipo de mascota"+ clase_mascota);
        System.out.println("Numero telefonico"+ numero);
    }
}


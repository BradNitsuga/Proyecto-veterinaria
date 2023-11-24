import javax.swing.JOptionPane;

public class Producto {
    private String nombre_producto;
    private Integer num_producto;
    private Double precio_producto;
    private Integer cantidad;

    public Producto (String nombre, Integer numero, Double precio) {
        nombre_producto = nombre;
        num_producto = numero;
        precio_producto = precio;
    }

    public void registrar_producto(int cantidad){
        nombre_producto= JOptionPane.showInputDialog("Ingrese el nombre del producto");
        num_producto= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos hay en existencia"));
        num_producto += cantidad;

    }

    public void calcular_precio(double costototal) {
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));  
        }

    public void imprime_producto(){
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Costo total: "+ cantidad*precio_producto);
        System.out.println("-----Resumen-----"+ "\nProducto: " + nombre_producto + "\nNumero de producto: " + num_producto + "\nPrecio unitario: $"+ precio_producto);
    }
}

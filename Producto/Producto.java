import javax.swing.JOptionPane;

public class Producto {
    private String nombre_producto;
    private Integer num_producto;
    private Double precio_producto;
    private Integer cantidad;

    public Producto () {
        this.nombre_producto= "";
        this.num_producto= 0;
        this.precio_producto= 0.0;
    }
    public Producto (String nombre, Integer numero, Double precio) {
        nombre_producto = nombre;
        num_producto = numero;
        precio_producto = precio;
    }

    public void registrar_producto(){
        nombre_producto= JOptionPane.showInputDialog("Ingrese el nombre del producto");
        num_producto= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos hay en existencia"));
        num_producto = cantidad;

    }

    public void calcular_precio() {
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto"));  
        }

    public void imprime_producto(){
        JOptionPane.showMessageDialog(null, "Cantidad: " + cantidad+ "Costo total: "+ cantidad*precio_producto +
        "-----Resumen-----" + "\nProducto: " + nombre_producto + "\nNumero de producto: " + num_producto + "\nPrecio unitario: $"+ precio_producto);
    }

    public String toString(){
        return "Cantidad: " + cantidad + "\n Costo total: "+ cantidad*precio_producto +
        "\n -----Resumen-----\n"+ "\nProducto: " + nombre_producto + "\nNumero de producto: " + num_producto + "\nPrecio unitario: $"+ precio_producto;
    
    }

    public static void menu(){
    int opcion;
    Producto p = new Producto();
    do { 
        opcion = Integer.parseInt(JOptionPane.showInputDialog(
            "MENU PRODUCTO\n\n" +
                "1. Insertar Datos\n" +
                "2. Modificar Datos\n" +
                "3. Imprime datos\n"+
                "4. Regresar al menu principal"));

        switch (opcion) {
            case 1: p.registrar_producto();
                break;
            case 2: p.calcular_precio();
                break;
            case 3:p.toString();p.imprime_producto();
                break;
            case 4: JOptionPane.showMessageDialog(null, "Regresando a MENU EMPLEADO..");
                break;
            default: JOptionPane.showMessageDialog(null,"Opción no válida.");
                break; 
        } 
    } while (opcion != 4);
}
}

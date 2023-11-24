public class P_Juguete extends Producto {
    private String marca_juguete;
    private String nombre_producto;
    private double precio;

    public P_Juguete (String nombre, Integer numero, Double precio, String marca, Double pre, String producto) {
        super(nombre,numero, precio);
            marca_juguete=marca;
            precio=pre;
            nombre_producto=producto;
    }

    public void imprime_producto(){
        System.out.println("--------Productos--------");
        System.out.println("Producto: " + nombre_producto);
        System.out.println("Marca: " + marca_juguete);
        System.out.println("Precio: " + precio);
    }
}

public class P_Alimento extends Producto {
    private String marca_comida;
    private Double precio;
    private String tipo_animal;

public P_Alimento (String nombre, Integer numero, Double precio, String marca, Double pre, String animal) {
    super(nombre,numero, precio);
        marca_comida=marca;
        precio=pre;
        tipo_animal=animal;
}

public void imprime_producto(){
    System.out.println("--------Alimento--------");
    System.out.println("Producto: " + marca_comida);
    System.out.println("Precio: " + precio);
    System.out.println("Tipo de animal: " + tipo_animal);
}
}

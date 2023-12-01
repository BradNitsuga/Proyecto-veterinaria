import javax.swing.JOptionPane;

public class P_Alimento extends Producto {
    private String nombre;
    private Integer numero;
    private Double precio;
    private String marca_comida;
    private String tipo_animal;

public P_Alimento () {
    this.nombre="";
    this.numero= 0;
    this.precio= 0.0;
    this.marca_comida="";
    this.tipo_animal="";
}
        
public P_Alimento (String nombre, Integer numero, Double precio, String marca, String animal) {
    super(nombre,numero, precio);
    this.nombre=nombre;
    this.numero= numero;
    this.precio= precio;
    this.marca_comida=marca;
    this.tipo_animal=animal;
}

public void imprime_producto(){
    System.out.println("--------Alimento--------");
    System.out.println("Producto: " + marca_comida);
    System.out.println("Precio: " + precio);
    System.out.println("Tipo de animal: " + tipo_animal);
}

public String toString(){
    return
    "\nNombre: " + nombre + 
    "\nNumero en inventario: " + numero + 
    "\nPrecio unitario: $"+ precio+ 
    "\nMarca del producto: " + marca_comida + 
    "\nAlimento para tipo"+ tipo_animal;
}

public void registrar_producto(){
        P_Alimento productos[]= new P_Alimento[6];
        int i,num=0;
        int continuar;
        do{
            productos [num]= new P_Alimento(
            (JOptionPane.showInputDialog("Ingrese el nombre del producto")),
            (Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos hay en existencia"))),
            (Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Precio: "))),
            (JOptionPane.showInputDialog("Ingrese el Marca del producto")),
            (JOptionPane.showInputDialog("Ingrese Para que tipo de animal es el producto")));
            num=num+1;
            continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Producto?","Recabando información",JOptionPane.YES_NO_OPTION);
            }
            while(continuar==JOptionPane.YES_OPTION);
            for (i=0;i<num;i++)
                {
                //Escribir Trabajadores
                JOptionPane.showMessageDialog(null, "ALIMENTO " + (i + 1) + ":\n" + productos[i]);
   
        }
    }
public static void menu(){
    P_Alimento producto = new P_Alimento();
    producto.registrar_producto();
}
}

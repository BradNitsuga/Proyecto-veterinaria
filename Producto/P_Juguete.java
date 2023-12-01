import javax.swing.JOptionPane;

public class P_Juguete extends Producto {
    private String nombre;
    private Integer numero;
    private Double precio;
    private String marca;
    
    public P_Juguete() {
        this.nombre="";
        this.numero= 0;
        this.precio= 0.0;
        this.marca="";
    }
    public P_Juguete (String nombre, Integer numero, Double precio, String marca) {
        super(nombre,numero, precio);
    this.nombre=nombre;
    this.numero= numero;
    this.precio= precio;
    this.marca=marca;
    }

    public void imprime_producto(){
        System.out.println("--------Productos--------");
        System.out.println("Producto: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
    }

    public String toString(){
        return
        "\nNombre: " + nombre + 
        "\nNumero en inventario: " + numero + 
        "\nPrecio unitario: $"+ precio+ 
        "\nMarca del producto: " + marca;
    }

    public void registrar_producto(){
        P_Juguete productos[]= new P_Juguete[6];
        int i,num=0;
        int continuar;
        do{
            productos [num]= new P_Juguete(
            (JOptionPane.showInputDialog("Ingrese el nombre del producto")),
            (Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos hay en existencia"))),
            (Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Precio: "))),
            (JOptionPane.showInputDialog("Ingrese el Marca del producto")));
            num=num+1;
            continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Producto?","Recabando información",JOptionPane.YES_NO_OPTION);
            }
            while(continuar==JOptionPane.YES_OPTION);
            for (i=0;i<num;i++)
                {
                //Escribir Trabajadores
                JOptionPane.showMessageDialog(null, "JUEGUETE " + (i + 1) + ":\n" + productos[i]);
   
        }
    }

    public static void menu(){
        P_Juguete p = new P_Juguete();
        p.registrar_producto();
    }
}

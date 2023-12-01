import javax.swing.JOptionPane;

public class Producto {
    private String nombre_producto;
    private Integer num_producto;
    private Double precio_producto;
    public static Producto productos[];


    public Producto () {
        this.nombre_producto= "";
        this.num_producto= 0;
        this.precio_producto= 0.0;
    }
    public Producto (String nombre, Integer numero, Double precio) {
        this.nombre_producto = nombre;
        this.num_producto = numero;
        this.precio_producto = precio;
    }

    public void registrar_producto(){
        Producto productos[]= new Producto[3];
        int i,num=0;
        int continuar;
        do{
            productos [num]= new Producto(
            (JOptionPane.showInputDialog("Ingrese el nombre del producto")),(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos productos hay en existencia"))),
            (Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Precio: "))));
            num=num+1;
            continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Producto?","Recabando información",JOptionPane.YES_NO_OPTION);
            }
            while(continuar==JOptionPane.YES_OPTION);
            for (i=0;i<num;i++)
                {
                //Escribir Trabajadores
                JOptionPane.showMessageDialog(null, "Producto " + (i + 1) + ":\n" + productos[i]);
   
        }
    }

    public String toString(){
        return
        "-----Resumen-----\n"+ "\nProducto: " + nombre_producto + "\nNumero de producto: " + num_producto + "\nPrecio unitario: $"+ precio_producto;
    }

     public static void menu(){
        int opcion;

        do { 
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Que Tipo de Producto Desea Registrar? \n\n" +
                    "1. Alimento\n" +
                    "2. Juguete \n" +
                    "3. Regresar al menu principal"));

            switch (opcion) {
                case 1: P_Alimento.menu();
                    break;
                case 2:P_Juguete.menu();
                    break;
                case 3:JOptionPane.showMessageDialog(null, "Regresando a MENU PRINCIPAL..");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción no válida.");
                    break; 
            } 
        } while (opcion != 3);
    }

    
}

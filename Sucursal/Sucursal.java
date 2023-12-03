package Sucursal;
public class Sucursal {

    private String id_sucursal;
    private String nombre;
    private String direccion;
    private long telefono;
    private String horario;


    public Sucursal (String id_sucursal, String nombre, String direccion, long telefono, String horario){    
        this.id_sucursal = "202324CCO3";
        this.nombre = "Veterinaria BUAPA";
        this.direccion = "Jardines de San Programado";
        this.horario = " 08:00 a 18:00 horas"; 
        this.telefono = "+52 202-8382-1532"; 
    }

    public void imprimeSucursal() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("BIENVENIDO A LA SUCURSAL: " + this.getNombre());
        System.out.println("El id de la sucursal es: " + this.getId_sucursal());
        System.out.println("La Direccion: " + this.getDireccion());
        System.out.println("El teléfono de la sucursal es: " + this.getTelefono());
        System.out.println("La sucursal atiende en un horario de:" + this.getHorario());
        System.out.println("---------------------------------------------------------------");
}
    public String getId_sucursal(){
        return id_sucursal;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public long getTelefono(){
        return telefono;
    }
    public String getHorario(){
        return horario;
    }

}
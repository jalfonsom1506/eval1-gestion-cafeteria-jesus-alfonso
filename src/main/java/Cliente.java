/**
 * Representa al cliente que realiza el pedido en la cafetería.
 * Almacena información básica de contacto como nombre y teléfono.
 * Se compone de los getter y setter correspondientes y el método
 * detalles que da formato a los datos necesarios para el ticket
 *
 * @author Jesús Alfonso Muñoz
 * @version 1.0
 */

public class Cliente {

    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre (){
        return this.nombre;
    }
    public String getTelefono (){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void detallesCliente (){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(this.nombre);

        System.out.println(sb.toString());
    }
}
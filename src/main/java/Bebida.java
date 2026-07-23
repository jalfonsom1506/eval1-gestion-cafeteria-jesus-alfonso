/**Clase hija que hereda de Producto para reflejar las consumiciones líquidas.
 * Añade la propiedad particular del tamaño del envase, taza o recipiente.
 *
 * También cuenta con su constructor, getter y setter correspondientes.
 *
 * @author Jesús Alfonso Muñoz
 * @version 1.0
 */

public class Bebida extends Producto {

    private String tamanio;

    public Bebida(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Tamaño: " + tamanio);
    }
}

/**Clase hija que hereda atributos de Producto para representar un artículo de comida.
 * Añade el atributo o propiedad que determina si se trata de un producto frío o caliente.
 *
 * Contiene el constructor, los getter y setter.
 *
 * @author Jesús Alfonso Muñoz
 * @version 1.0
 */

public class Comida extends Producto {

    private boolean esCaliente;

    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean getEsCaliente () {
        return this.esCaliente;
    }

    public void setEsCaliente (boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public void detalles() {
        super.detalles();
            if (esCaliente) {
                System.out.println("caliente");
            }
            else {
                System.out.println("frío");
            }
    }
}

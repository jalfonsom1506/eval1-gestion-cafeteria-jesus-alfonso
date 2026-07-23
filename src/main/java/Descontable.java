/**
 * Interfaz que define el contrato para cualquier elemento de la cafetería
 * que pueda recibir un descuento en su precio de venta.
 *
 * @author Jesús Alfonso Muñoz
 * @version 1.0
 */

public interface Descontable {

    /**
     * Aplica un descuento al precio del artículo.
     * @param porcentaje El porcentaje de descuento a aplicar al artículo.
     * @return El nuevo precio tras el descuento.
     */

    double aplicarDescuento (double porcentaje);

}

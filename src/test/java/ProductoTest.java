import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void aplicarDescuento() {
        Bebida agua = new Bebida ("Agua", 3.20, "Aguas", "Pequeño");

        double precioFinal = agua.aplicarDescuento(10.00);
        assertEquals(2.88, precioFinal, 0.01);
    }

    @Test
    void aplicarDescuentoInvalido() {
        Bebida agua = new Bebida ("Agua", 3.20, "Aguas", "Pequeño");

        double precioFinal = agua.aplicarDescuento(150.00);
        assertEquals(3.20, precioFinal, 0.01);
    }
}
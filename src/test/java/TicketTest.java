import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket pruebaTicket;
    private Comida ensaladilla;
    private Comida croquetas;
    private Bebida aguaGas;
    private Bebida cocaCola;

    @BeforeEach
            void setUp() {
        Cliente ana = new Cliente ("Ana López", "600123456");
        Camarero carlos = new Camarero ("Carlos", "010");

    pruebaTicket = new Ticket (ana, carlos);
    ensaladilla = new Comida ("Ensaladilla rusa", 12.20, "Comida", false);
    croquetas = new Comida ("Croquetas de jamón", 10.50, "Comida", true);
    aguaGas = new Bebida ("Agua con gas", 2.40, "Bebida", "Pequeño");
    cocaCola = new Bebida ("Coca Cola", 2.00, "Bebida", "Pequeño");
    }

    @Test
    void calcularTotalConProductos() {
        pruebaTicket.agregarProducto(ensaladilla);
        pruebaTicket.agregarProducto(cocaCola);

        assertEquals(14.20, pruebaTicket.calcularTotal(), 0.01);
    }

    @Test
    void calcularTotalConTicketVacio(){

        assertEquals(0.0, pruebaTicket.calcularTotal(), 0.01);
    }

    @Test
    void agregarProductoMasAllaDelLimite(){
        for (int i = 0; i < 11; i++) {
            pruebaTicket.agregarProducto(cocaCola);
        }
        assertEquals(20.00, pruebaTicket.calcularTotal(), 0.01);
    }

    @AfterEach
            void tearDown() {

        pruebaTicket = null;
        ensaladilla = null;
        croquetas = null;
        aguaGas = null;
        cocaCola = null;
    }
}
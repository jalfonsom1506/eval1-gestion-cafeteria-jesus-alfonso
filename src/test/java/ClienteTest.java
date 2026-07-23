import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testModificarDatosCliente() {
        Cliente cliente = new Cliente ("Ana López", "600123456");

        cliente.setNombre("María Rodríguez");
        cliente.setTelefono("699123999");

        assertEquals("María Rodríguez", cliente.getNombre());
        assertEquals("699123999", cliente.getTelefono());
    }
}
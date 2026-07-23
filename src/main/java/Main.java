public class Main {

    static void main(String[] args) {

        Cliente ana = new Cliente ("Ana López", "600123456");
        Camarero carlos = new Camarero("Carlos", "010");

        Comida ensaladilla = new Comida ("Ensaladilla rusa", 9.70, "Raciones", false);
        Comida polloAsado = new Comida ("Pollo asado", 12.80, "Platos Principales", true);
        Comida croquetasJamon = new Comida ("Croquetas de jamón", 10.80, "Raciones", true);
        Comida sandwichVegetal = new Comida ("Sandwich vegetal", 7.50, "Bocadillos", false);

        Bebida aguaGas = new Bebida ("Agua con gas", 3.20, "Aguas", "Mediano");
        Bebida zumoNaranja = new Bebida ("Zumo de naranja natural", 4.30, "Zumos", "Pequeño");
        Bebida cocaCola = new Bebida ("Coca Cola", 2.50, "Refrescos", "330cl");
        Bebida cafe = new Bebida ("Café con leche", 1.80, "Cafés", "Pequeño");

        Ticket ticket = new Ticket (ana, carlos);

        ticket.agregarProducto(aguaGas);
        ticket.agregarProducto(cocaCola);
        ticket.agregarProducto(sandwichVegetal);
        ticket.agregarProducto(ensaladilla);

        ticket.mostrarTicket();

        double porcentaje = 20.0;
        double promoAguaGas = aguaGas.aplicarDescuento(porcentaje);
        aguaGas.setPrecio(promoAguaGas);

        System.out.println("\n------- Promoción Aplicada -------");
        System.out.printf("%s: %.2f%%\n", aguaGas.getNombre(), porcentaje);
        System.out.printf("Precio final: %.2f€\n", promoAguaGas);
        System.out.printf("\nTOTAL CON DESCUENTO: %.2f€\n", ticket.calcularTotal());
        System.out.println("----------------------------------\n");

        System.out.println("\n***** Muchas gracias por su visita *****");


    }
}
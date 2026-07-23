public class Ticket {

    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[10];
        this.contadorProductos = 0;
    }

    public void agregarProducto(Producto nuevoProducto) {
        if (this.contadorProductos < this.productos.length) {
            this.productos[this.contadorProductos] = nuevoProducto;
            this.contadorProductos++;
        } else {
            System.out.println("No se pueden agregar más productos a este ticket");
        }
    }

    public double calcularTotal() {
        double total = 0.0;

        for (int i = 0; i < this.contadorProductos; i++) {
            total = total + this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarTicket() {
        System.out.println("\n==========================");
        System.out.println("=     CAFETERIA JAVA     =");
        System.out.println("==========================\n");

        this.cliente.detallesCliente();
        this.camarero.detallesCamarero();

        System.out.println("\n        PRODUCTOS");

        for(int i = 0; i < this.contadorProductos; i++){
            System.out.printf("%d. %s: %.2f€\n", (i + 1), this.productos[i].getNombre()
            ,this.productos[i].getPrecio());
        }

        System.out.printf("\nTOTAL: %.2f€\n", this.calcularTotal());
    }
}
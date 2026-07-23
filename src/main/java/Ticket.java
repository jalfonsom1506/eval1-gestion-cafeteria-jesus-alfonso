/**
 * Representa el ticket de compra o consumición de una venta en la cafetería.
 * Gestiona la composición entre un Cliente, un Camarero, y un conjunto limitado
 * de productos mediante un array de tamaño fijo.
 *
 * @author Jesús Alfonso Muñoz
 * @version 1.0
 */

public class Ticket {

    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[100];
        this.contadorProductos = 0;
    }

    /**
     * Agregar un nuevo producto al array y al ticket de forma secuencial
     * Valida mediante un condicional (if) que el array no supere el límite de capacidad
     *
      * @param nuevoProducto El objeto de la clase Producto (o sus hijas Comida/Bebida) que se añade.
     */
    public void agregarProducto(Producto nuevoProducto) {
        if (this.contadorProductos < this.productos.length) {
            this.productos[this.contadorProductos] = nuevoProducto;
            this.contadorProductos++;
        } else {
            System.out.println("No se pueden agregar más productos a este ticket");
        }
    }

    /**Recorre las casillas del array mediante un bucle for
     * y calcula la suma acumulada de los precios de los productos del array.
     *
     * @return El importe total acumulado en formato double
     */
    public double calcularTotal() {
        double total = 0.0;

        for (int i = 0; i < this.contadorProductos; i++) {
            total = total + this.productos[i].getPrecio();
        }
        return total;
    }

    /**
     * Imprime por consola el desglose completo de la factura con un diseño predefinido,
     * extrayendo los datos personales de los métodos de las clases Cliente y Camarero,
     * listando productos y precios mediante un bucle for del array, y mostrando el total
     * con formato de dos decimales mediante printf
     */
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
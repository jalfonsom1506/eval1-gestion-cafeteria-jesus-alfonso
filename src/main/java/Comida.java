public class Comida extends Producto {

    private boolean esCaliente;

    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean getComida () {
        return this.esCaliente;
    }

    public void setComida (boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public void detalles() {
        super.detalles();
            if (esCaliente) {
                System.out.println("Temperatura: Caliente");
            }
            else {
                System.out.println("Temperatura: Fría");
            }
    }
}

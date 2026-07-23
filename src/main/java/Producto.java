public class Producto implements Descontable {

    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }


    public void detalles () {
        StringBuilder sb = new StringBuilder();
        sb.append("------ PRODUCTO ------");
        sb.append("\nNombre: ").append(this.nombre);
        sb.append("\nPrecio: ").append(this.precio).append(" euros");
        sb.append("\nCategoria: ").append(this.categoria);

        System.out.println(sb.toString());

        //System.out.println("------ PRODUCTO -------");
        //System.out.println("Nombre: " + this.nombre);
        //System.out.println("Precio: " + this.precio);
        //System.out.println("Categoría: " + this.categoria);
    }
    @Override
    public double aplicarDescuento (double porcentaje) {

        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje invalido");
            return this.precio;
        }

        else {
            double descuento = this.precio * (porcentaje / 100);
            return this.precio - descuento;
        }
    }
}

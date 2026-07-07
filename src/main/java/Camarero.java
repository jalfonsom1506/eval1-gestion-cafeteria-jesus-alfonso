public class Camarero {

    String nombre;
    int codigoEmpleado;

    public Camarero(String nombre, int codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre (){
        return this.nombre;
    }
    public int getCodigoEmpleado (){
        return this.codigoEmpleado;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCodigoEmpleado(int codigoEmpleado){
        this.codigoEmpleado = codigoEmpleado;
    }

    public void detallesCamarero(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------- LE ATENDIÓ ----------");
        sb.append("\nNombre: ").append(this.nombre);
        sb.append("\nCódigo empleado: ").append(this.codigoEmpleado);
    }
}

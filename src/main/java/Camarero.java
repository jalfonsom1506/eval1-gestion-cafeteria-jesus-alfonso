public class Camarero {

    private String nombre;
    private String codigoEmpleado;

    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre (){
        return this.nombre;
    }
    public String getCodigoEmpleado (){
        return this.codigoEmpleado;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCodigoEmpleado(String codigoEmpleado){
        this.codigoEmpleado = codigoEmpleado;
    }

    public void detallesCamarero(){
        StringBuilder sb = new StringBuilder();
        sb.append("Camarero: ").append(this.nombre);
        sb.append(" - Código: ").append(this.codigoEmpleado);

        System.out.println(sb.toString());
    }
}

public class Cliente {

    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre (){
        return this.nombre;
    }
    public String getTelefono (){
        return this.telefono;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void detallesCliente (){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(this.nombre);

        System.out.println(sb.toString());
    }
}
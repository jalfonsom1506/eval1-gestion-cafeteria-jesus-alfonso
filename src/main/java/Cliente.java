public class Cliente {

    String nombre;
    String telefono;

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
        sb.append("--------------------------------");
        sb.append("Nombre: ").append(this.nombre);
        sb.append("\nTelefono: ").append(this.telefono);
    }
}
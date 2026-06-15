public class Personaje {
    private String nombre;
    private String apellido;
    private String estado;

    public  Personaje (String nombre, String apellido, String estado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Estado: " + estado;
    }
}

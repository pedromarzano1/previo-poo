package herencia;

public class persona {
    int id;
    String dni;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;

    public persona() {
    }

    public persona(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        this.id = id;
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.domicilio=domicilio;
        this.telefono=telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}

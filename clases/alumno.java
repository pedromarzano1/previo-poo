package clases;


public class alumno {
    int id ;
    String nombre;
    String apellido;

    public void mostrarNombre(){
        System.out.println("mo nombre es: "+ nombre);
    }

    public alumno() {
    }

    public alumno(String apellido, int id, String nombre) {
        this.apellido = apellido;
        this.nombre=nombre;
        this.id= id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

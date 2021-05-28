package lab5p2_cesarbrito;

public class Psicologo extends Persona {

    private int edad;
    private int id;
    private int informes;
    private int jugadoresAtendidos;
    private String titulo;
    private String especialidad;

    public Psicologo() {
        super();
    }

    public Psicologo(int edad, int id, int informes, int jugadoresAtendidos, String titulo, String especialidad, String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.edad = edad;
        this.id = id;
        this.informes = informes;
        this.jugadoresAtendidos = jugadoresAtendidos;
        this.titulo = titulo;
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInformes() {
        return informes;
    }

    public void setInformes(int informes) {
        this.informes = informes;
    }

    public int getJugadoresAtendidos() {
        return jugadoresAtendidos;
    }

    public void setJugadoresAtendidos(int jugadoresAtendidos) {
        this.jugadoresAtendidos = jugadoresAtendidos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

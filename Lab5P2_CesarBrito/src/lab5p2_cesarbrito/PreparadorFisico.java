package lab5p2_cesarbrito;

public class PreparadorFisico extends Persona {

    private int edad;
    private int id;
    private int contrato;
    private String especialidad;
    private String titulo;

    public PreparadorFisico() {
        super();
    }

    public PreparadorFisico(int edad, int id, int contrato, String especialidad, String titulo, String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.edad = edad;
        this.id = id;
        this.contrato = contrato;
        this.especialidad = especialidad;
        this.titulo = titulo;
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

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

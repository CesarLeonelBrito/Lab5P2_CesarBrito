package lab5p2_cesarbrito;

public class Entrenador extends Persona {

    private int edad;
    private int contrato;
    private int copas;

    public Entrenador() {
        super();
    }

    public Entrenador(int edad, int contrato, int copas, String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.edad = edad;
        this.contrato = contrato;
        this.copas = copas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getCopas() {
        return copas;
    }

    public void setCopas(int copas) {
        this.copas = copas;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

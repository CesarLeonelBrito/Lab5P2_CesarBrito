package lab5p2_cesarbrito;

public class Jugador extends Persona {

    private int edad;
    private int numero;
    private int partidosJugados;
    private int copasGanadas;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int contrato;

    public Jugador() {
        super();
    }

    public Jugador(int edad, int numero, int partidosJugados, int copasGanadas, int tarjetasAmarillas, int tarjetasRojas, int contrato, String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido, nacionalidad);
        this.edad = edad;
        this.numero = numero;
        this.partidosJugados = partidosJugados;
        this.copasGanadas = copasGanadas;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.contrato = contrato;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getCopasGanadas() {
        return copasGanadas;
    }

    public void setCopasGanadas(int copasGanadas) {
        this.copasGanadas = copasGanadas;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

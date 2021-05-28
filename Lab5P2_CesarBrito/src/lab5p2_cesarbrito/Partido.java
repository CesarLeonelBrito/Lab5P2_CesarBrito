package lab5p2_cesarbrito;

import java.util.ArrayList;

public class Partido {
    
    private String equipoRival;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Partido() {
    }

    public Partido(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public String getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return  "Equipo Rival : " + equipoRival + "\nJugadores : " + jugadores;
    }
    
    
    
}

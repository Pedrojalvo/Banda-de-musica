package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuar implements Serializable {
    private static final long serialVersionUID = 1L;
    private LocalDate fecha;
    private List<Participante> participantes;

    public Actuar(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void añadirParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Fecha de actuación: " + fecha + "\n");

        for (Participante participante : participantes) {
            sb.append(participante.toString()).append("\n");
        }

        return sb.toString();
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }
}
package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bandamusica implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private List<Actuar> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuar(Actuar actuacion) {
        this.actuaciones.add(actuar);
    }

    public List<Actuar> getActuaciones() {
        return actuaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean eliminarActuar(LocalDate fecha) {
        Iterator<Actuar> iterator = actuaciones.iterator();
        while (iterator.hasNext()) {
            Actuar actuacion = iterator.next();
            if (actuacion.getFecha().equals(fecha)) {
                iterator.remove();
                System.out.println("Actuación eliminada con éxito.");
                return true; 
            }
        }

        System.out.println("No se encontró una actuación con la fecha especificada.");
        return false; 
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("BANDA DE MÚSICA " + nombre + "\n\n");

        for (Actuar actuacion : actuaciones) {
            sb.append(actuacion.toString()).append("\n\n");
        }

        return sb.toString();
    }
}
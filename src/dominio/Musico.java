package dominio;


public class Musico extends Participante {
    private String instrumento;

    public Musico(String nombre, String instrumento) {
        super(nombre);
        this.instrumento = instrumento;
    }

    public String toString() {
        return super.toString() + ", " + instrumento;
    }
}
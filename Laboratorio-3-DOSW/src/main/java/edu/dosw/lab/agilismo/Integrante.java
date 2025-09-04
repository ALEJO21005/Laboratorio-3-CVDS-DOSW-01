import java.util.Scanner;

public class Integrante {
    private String nombre;
    private EstrategiaV estrategiaVotacion;

    public Integrante(String nombre, EstrategiaV estrategiaVotacion) {
        this.nombre = nombre;
        this.estrategiaVotacion = estrategiaVotacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int votar(Scanner scanner) {
        return estrategiaVotacion.votar(scanner);
    }
}
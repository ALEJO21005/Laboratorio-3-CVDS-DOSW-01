package edu.dosw.lab.agilismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Votacion {
    private ArrayList<Integrante> integrantes;
    private Tarea tarea;

    public Votacion(ArrayList<Integrante> integrantes, Tarea tarea) {
        this.integrantes = integrantes;
        this.tarea = tarea;
    }

    public int realizarVotacion(Scanner scanner) {
        ArrayList<Integer> votos = new ArrayList<>();
        boolean consenso = false;

        while (!consenso) {
            System.out.println("\nVotación para la tarea: " + tarea.getDescripcion());
            votos.clear();


            for (Integrante integrante : integrantes) {
                int voto = integrante.votar(scanner);
                votos.add(voto);
            }


            consenso = verificarConsenso(votos);
            if (!consenso) {
                System.out.println("Votos divergentes - Discutan y vuelvan a votar.");
            }
        }

        return votos.get(0);
    }

    private boolean verificarConsenso(ArrayList<Integer> votos) {
        int primerVoto = votos.get(0);
        for (int voto : votos) {
            if (voto != primerVoto) {
                return false;
            }
        }
        return true;
    }
}

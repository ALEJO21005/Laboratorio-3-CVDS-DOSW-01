package edu.dosw.lab.agilismo;

import java.util.ArrayList;
import java.util.Scanner;

public class PlanningPoker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EstrategiaV estrategia = new EstrategiaFibonacci();

        System.out.print("¿Cuántos integrantes son en el equipo? ");
        int numeroDeMiembros = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integrante> integrantes = new ArrayList<>();
        for (int i = 0; i < numeroDeMiembros; i++) {
            System.out.print("Ingresa el nombre del integrante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            integrantes.add(new Integrante(nombre, estrategia));
        }

        ArrayList<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Quiero solicitar  cuenta  una bancaria para administrar mis cuentas bancarias"));
        tareas.add(new Tarea("Quiero consultar el saldo de una cuenta para gestionar mi dinero."));
        tareas.add(new Tarea("Quiero realizar depósitos para estar al día con mis pagos."));

        for (Tarea tarea : tareas) {
            Votacion votacion = new Votacion(integrantes, tarea);
            int puntajeFinal = votacion.realizarVotacion(scanner);
            tarea.setPuntaje(puntajeFinal);
        }

        System.out.println("\nResumen de las votaciones:");
        for (Tarea tarea : tareas) {
            System.out.println(tarea.getDescripcion() + " - Puntaje Final: " + tarea.getPuntaje());
        }

        scanner.close();
    }
}
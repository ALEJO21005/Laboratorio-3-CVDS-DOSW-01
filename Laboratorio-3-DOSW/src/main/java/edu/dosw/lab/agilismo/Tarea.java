package edu.dosw.lab.agilismo;

public class Tarea {
    private String descripcion;
    private int puntaje;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.puntaje = 0;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
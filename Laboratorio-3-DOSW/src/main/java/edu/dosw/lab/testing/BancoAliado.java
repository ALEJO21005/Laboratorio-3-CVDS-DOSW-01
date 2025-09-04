package edu.dosw.lab.testing;

public enum BancoAliado {
    // Primero las constantes del enum
    BANCO1(1, "Banco Ejemplo 1"),
    BANCO2(2, "Banco Ejemplo 2");

    private int codigoBanco;
    private String nombreBanco;

    BancoAliado(int codigoBanco, String nombreBanco) {
        this.codigoBanco = codigoBanco;
        this.nombreBanco = nombreBanco;
    }

}
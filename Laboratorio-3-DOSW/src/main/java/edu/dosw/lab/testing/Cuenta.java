package edu.dosw.lab.testing;

public abstract class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private String banco;
    private boolean activa;

    public Cuenta(int numeroCuenta, String banco) {
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
        this.saldo = 0.0;
        this.activa = true;
    }

    public boolean validarCuenta() {
        return activa;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
}

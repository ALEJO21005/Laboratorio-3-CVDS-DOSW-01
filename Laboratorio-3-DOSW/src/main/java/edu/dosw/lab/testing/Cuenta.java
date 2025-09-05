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
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser positivo.");
            return;  
        }
        setSaldo(this.saldo + monto);  
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
            return;
        }
        if (this.saldo < monto) {
            System.out.println("Saldo insuficiente para realizar el retiro.");
            return;
        }
        setSaldo(this.saldo - monto);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    protected void setSaldo(double saldo) {this.saldo = saldo;}
}

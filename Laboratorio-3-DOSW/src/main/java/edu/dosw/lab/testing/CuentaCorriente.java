package edu.dosw.lab.testing;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int numeroCuenta, String banco) {
        super(numeroCuenta, banco);
    }

    public void permitirSobregiro(double monto) {
        double saldoActual = consultarSaldo();
        double nuevoSaldo = saldoActual - monto;
    }

    @Override
    public void depositar(double monto) {
        double nuevoSaldo = consultarSaldo() + monto;
        setSaldo(nuevoSaldo);
    }











}

package edu.dosw.lab.testing;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(int numeroCuenta, String banco) {
        super(numeroCuenta, banco);
    }

    public double calcularInteres(double tasaInteres) {
        double saldo = consultarSaldo();
        return saldo > 0 ? saldo * tasaInteres : 0.0;
    }


}

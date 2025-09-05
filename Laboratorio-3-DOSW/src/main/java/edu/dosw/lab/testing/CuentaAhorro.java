package edu.dosw.lab.testing;

public class CuentaAhorro extends Cuenta {

    public CuentaAhorro(int numeroCuenta, String banco) {
        super(numeroCuenta, banco);
    }

    @Override
    public void depositar(double monto) {
        double nuevoSaldo = consultarSaldo() + monto;
        setSaldo(nuevoSaldo);
    }

    public boolean validarCuenta() {
        return false;
    }

    public double calcularInteres(double tasaInteres) {
        double saldo = consultarSaldo();
        if (saldo > 0){
            return saldo * tasaInteres;
        }
        return 0.0;
    }


}

package edu.dosw.lab.testing;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int numeroCuenta, String banco) {
        super(numeroCuenta, banco);
    }

    public void permitirSobregiro(double monto) {
        if (monto > 1000) {
            System.out.println("El monto excede el límite de sobregiro permitido.");
            return;  
        }
        setSaldo(consultarSaldo() - monto);
    }












}

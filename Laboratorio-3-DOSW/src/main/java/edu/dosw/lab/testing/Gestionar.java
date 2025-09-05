package edu.dosw.lab.testing;

public class Gestionar {
    private int numeroCuenta;
    private int idCliente;
    private String nombreBanco;

    public void gestionarTransaccion(Cuenta cuenta, double monto) {
        if(cuenta == null) {
            throw new IllegalArgumentException("La cuenta no puede ser nula");
        }
        cuenta.depositar(monto);
    }

    public void gestionarDeposito(Cuenta cuenta, double monto) {
        if(cuenta!= null && monto > 0) {
            cuenta.depositar(monto);
        }
    }

    public void gestionarRetiro(Cuenta cuenta, double monto) {
        if (cuenta != null && monto > 0) {
            cuenta.retirar(monto);
        }
    }
}

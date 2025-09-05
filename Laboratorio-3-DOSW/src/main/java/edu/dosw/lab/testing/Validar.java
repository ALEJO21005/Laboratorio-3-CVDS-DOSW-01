package edu.dosw.lab.testing;

public class Validar {

    public boolean validarCuenta(Cuenta cuenta) {
        if(cuenta == null) {
            throw new IllegalArgumentException("Cuenta no puede ser nula");
        }
        return cuenta.validarCuenta();
    }

    public boolean validarCliente(Cliente cliente) {
        return false;
    }

    public boolean validarSaldo(double saldo) {
        return false;
    }

}

package edu.dosw.lab.testing;

public class Validar {

    public boolean validarCuenta(Cuenta cuenta) {
        if(cuenta == null) {
            throw new IllegalArgumentException("Cuenta no puede ser nula");
        }
        return cuenta.validarCuenta();
    }

    public boolean validarCliente(Cliente cliente) {
        if (cliente == null) {
            return false;
        }
        return cliente.getNombre() != null && 
               !cliente.getNombre().trim().isEmpty() && 
               cliente.getIdCliente() > 0;
    }

    public boolean validarSaldo(double saldo) {
        return saldo >= -1000000.0 && saldo <= 1000000.0;
    }

}

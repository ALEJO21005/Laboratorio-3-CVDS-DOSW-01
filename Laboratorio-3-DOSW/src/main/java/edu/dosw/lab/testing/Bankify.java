package edu.dosw.lab.testing;

import java.util.ArrayList;

public class Bankify {
    private ArrayList<Cliente> clientes;
    private ArrayList<BancoAliado> bancos;

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<BancoAliado> getBancos() {
        return bancos;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void crearCuenta(Cliente cliente, Cuenta cuenta) {
        cliente.agregarCuenta(cuenta);
    }

    public void realizarDeposito(int numeroCuenta, double monto) {

    }

    public double consultarSaldo(int numeroCuenta) {
        return 0;
    }
}

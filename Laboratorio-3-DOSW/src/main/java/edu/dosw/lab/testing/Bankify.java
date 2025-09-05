package edu.dosw.lab.testing;

import java.util.ArrayList;

public class Bankify {

    private ArrayList<Cliente> clientes;
    private ArrayList<BancoAliado> bancos;

    public Bankify() {
        clientes = new ArrayList<>();
        bancos = new ArrayList<>();
        bancos.add(BancoAliado.BANCO1);
        bancos.add(BancoAliado.BANCO2);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<BancoAliado> getBancos() {
        return bancos;
    }

    public void registrarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void crearCuenta(Cliente cliente, Cuenta cuenta) {
        cliente.agregarCuenta(cuenta);
    }

    public void realizarDeposito(int numeroCuenta, double monto) {
    clientes.stream()
        .flatMap(cliente -> cliente.getCuentas().stream())
        .filter(cuenta -> cuenta.getNumeroCuenta() == numeroCuenta)
        .findFirst()
        .ifPresent(cuenta -> cuenta.depositar(monto));
    }

    public double consultarSaldo(int numeroCuenta) {
    return clientes.stream()
        .flatMap(cliente -> cliente.getCuentas().stream())
        .filter(cuenta -> cuenta.getNumeroCuenta() == numeroCuenta)
        .findFirst()
        .map(Cuenta::consultarSaldo)
        .orElse(0.0);
    }
}

package edu.dosw.lab.testing;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Cuenta> cuentas;
    private int idCliente;

    public Cliente(String nombre, int idCliente) {
        this.nombre = nombre;
        this.idCliente = idCliente;
        this.cuentas = new ArrayList<>();
    }


    public void agregarCuenta(Cuenta cuenta) {
    }

    public double consultarSaldo(int numeroCuenta) {
        return 0;
    }

    public void depositar(int numeroCuenta, double monto) {
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
}

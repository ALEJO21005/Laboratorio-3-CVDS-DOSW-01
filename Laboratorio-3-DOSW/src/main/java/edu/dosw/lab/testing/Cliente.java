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
        if(!cuentas.contains(cuenta)) {
            cuentas.add(cuenta);
            }
        }

    public double consultarSaldo(int numeroCuenta) {

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta.consultarSaldo();
            }
        }
        return 0.0;
    }

    public void depositar(int numeroCuenta, double monto) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                cuenta.depositar(monto);
                return;
            }
        }
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }
}

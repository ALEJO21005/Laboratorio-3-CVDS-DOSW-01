package edu.dosw.lab.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestionarTest {

    private Gestionar gestionar;
    private CuentaAhorro cuenta;

    @BeforeEach
    public void setUp() {
        gestionar = new Gestionar();
        cuenta = new CuentaAhorro(123, "Banco Test");
        cuenta.depositar(500.0);
    }

    @Test
    public void testGestionarTransaccionDeposito() {
        gestionar.gestionarTransaccion(cuenta, 200.0);
        // Esperamos que la transacción actualice el saldo
        assertEquals(700.0, cuenta.consultarSaldo());
    }

    @Test
    public void testGestionarDepositoMontoPositivo() {
        gestionar.gestionarDeposito(cuenta, 300.0);
        assertEquals(800.0, cuenta.consultarSaldo());
    }

    @Test
    public void testGestionarRetiroConSaldoSuficiente() {
        gestionar.gestionarRetiro(cuenta, 200.0);
        assertEquals(300.0, cuenta.consultarSaldo());
    }

    @Test
    public void testGestionarRetiroSaldoInsuficiente() {
        gestionar.gestionarRetiro(cuenta, 600.0);
        // No debe permitir retiro mayor al saldo
        assertEquals(500.0, cuenta.consultarSaldo());
    }

    @Test
    public void testGestionarDepositoMontoNegativo() {
        gestionar.gestionarDeposito(cuenta, -50.0);
        // No debe permitir depósitos negativos
        assertEquals(500.0, cuenta.consultarSaldo());
    }

    @Test
    public void testGestionarTransaccionCuentaNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            gestionar.gestionarTransaccion(null, 100.0);
        });
    }
}

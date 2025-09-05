package edu.dosw.lab.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {


    @Test
    public void testConsultarSaldoInicial() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Banco Test");
        cuenta.depositar(1500.0);
        assertEquals(1500.0, cuenta.consultarSaldo());
    }

    @Test
    public void testDepositarMontoPositivo() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Banco Test");
        cuenta.depositar(100.0);
        cuenta.depositar(50.0);
        assertEquals(150.0, cuenta.consultarSaldo());
    }

    @Test
    public void testDepositarMontoNegativo() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Banco Test");
        cuenta.depositar(100.0);
        cuenta.depositar(-20.0);
        assertEquals(100.0, cuenta.consultarSaldo());
    }
}

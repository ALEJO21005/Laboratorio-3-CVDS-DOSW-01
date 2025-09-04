package edu.dosw.lab.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaAhorroTest {

    @Test
    public void testCalcularInteresSaldoPositivo() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Banco Test");
        cuenta.depositar(1000.0);
        double interes = cuenta.calcularInteres();
        // Esperamos 2% de interés anual: 1000 * 0.02 = 20
        assertEquals(20.0, interes, 0.01);
    }


    @Test
    public void testDepositarYCalcularInteres() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Banco Test");
        cuenta.depositar(500.0);
        cuenta.depositar(500.0);
        // Después del depósito: saldo = 1000, interés = 20
        assertEquals(1000.0, cuenta.consultarSaldo());
        assertEquals(20.0, cuenta.calcularInteres(), 0.01);
    }

    @Test
    public void testValidarCuentaAhorroActiva() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Banco Test");
        assertFalse(cuenta.validarCuenta());
    }
}

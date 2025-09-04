package edu.dosw.lab.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {

    @Test
    public void testPermitirSobregirosConSaldoInsuficiente() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        cuenta.depositar(100.0);
        cuenta.permitirSobregiro(150.0);
        // Esperamos que permita sobregiro hasta cierto límite
        assertEquals(-50.0, cuenta.consultarSaldo());
    }

    @Test
    public void testPermitirSobregiroLimiteMaximo() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        cuenta.depositar(0.0);
        cuenta.permitirSobregiro(500.0);
        // Límite de sobregiro de 1000
        assertEquals(-500.0, cuenta.consultarSaldo());
    }

    @Test
    public void testRechazarSobregiroExcesivo() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        cuenta.depositar(0.0);
        cuenta.permitirSobregiro(1500.0);
        // No debe permitir sobregiro mayor a 1000
        assertEquals(0.0, cuenta.consultarSaldo());
    }

    @Test
    public void testDepositarEnCuentaConSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(312345, "BancoTest");
        cuenta.depositar(-200.0);
        cuenta.depositar(300.0);
        assertEquals(100.0, cuenta.consultarSaldo());
    }



    @Test
    public void testHerenciaValidarCuenta() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        boolean valida = cuenta.validarCuenta();
        assertFalse(valida); // Hereda el comportamiento de la clase padre
    }
}

package edu.dosw.lab.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaCorrienteTest {

    @Test
    public void testPermitirSobregirosConSaldoInsuficiente() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        cuenta.depositar(100.0);
        cuenta.permitirSobregiro(150.0);
        assertEquals(-50.0, cuenta.consultarSaldo());
    }


    @Test
    public void testRechazarSobregiroExcesivo() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        cuenta.depositar(0.0);
        cuenta.permitirSobregiro(1500.0);
        assertEquals(0.0, cuenta.consultarSaldo());
    }

    @Test
    public void testDepositarEnCuentaConSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(312345, "BancoTest");
        cuenta.permitirSobregiro(200.0);
        cuenta.depositar(300.0);
        assertEquals(100.0, cuenta.consultarSaldo());
    }



    @Test
    public void testHerenciaValidarCuenta() {
        CuentaCorriente cuenta = new CuentaCorriente(12345, "BancoTest");
        boolean valida = cuenta.validarCuenta();
        assertTrue(valida);
    }
}

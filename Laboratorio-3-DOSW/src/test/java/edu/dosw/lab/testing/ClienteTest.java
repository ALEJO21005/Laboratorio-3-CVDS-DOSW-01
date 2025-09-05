package edu.dosw.lab.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente("Juan Pérez", 123);
    }

    @Test
    public void testAgregarCuenta() {
        CuentaAhorro cuenta = new CuentaAhorro(345, "Cuenta de Prueba");
        cliente.agregarCuenta(cuenta);
        assertEquals(1, cliente.getCuentas().size());
    }

    @Test
    public void testConsultarSaldoCuentaExistente() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Cuenta de Prueba");
        cuenta.depositar(500.0);
        cliente.agregarCuenta(cuenta);
        double saldo = cliente.consultarSaldo(cuenta.getNumeroCuenta());
        assertEquals(500.0, saldo);
    }

    @Test
    public void testDepositarEnCuentaExistente() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Cuenta de Prueba");
        cuenta.depositar(100.0);
        cliente.agregarCuenta(cuenta);
        cliente.depositar(cuenta.getNumeroCuenta(), 200.0);
        assertEquals(300.0, cliente.consultarSaldo(cuenta.getNumeroCuenta()));
    }

    @Test
    public void testConsultarSaldoCuentaInexistente() {
        double saldo = cliente.consultarSaldo(999);
        assertEquals(0.0, saldo); // Esperamos -1 para cuenta no encontrada
    }
}

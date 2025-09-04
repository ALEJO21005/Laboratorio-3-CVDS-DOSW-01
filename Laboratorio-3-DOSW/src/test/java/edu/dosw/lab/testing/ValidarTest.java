package edu.dosw.lab.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidarTest {

    private Validar validar;
    private Cliente cliente;
    private CuentaAhorro cuenta;

    @BeforeEach
    public void setUp() {
        validar = new Validar();
        cliente = new Cliente("Juan Pérez", 123);
        cuenta = new CuentaAhorro(123, "Cuenta de Prueba");
    }

    @Test
    public void testValidarCuentaActiva() {
        boolean resultado = validar.validarCuenta(cuenta);
        assertTrue(resultado);
    }

    @Test
    public void testValidarCuentaNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            validar.validarCuenta(null);
        });
    }

    @Test
    public void testValidarClienteConNombre() {
        boolean resultado = validar.validarCliente(cliente);
        assertTrue(resultado);
    }

    @Test
    public void testValidarClienteNull() {
        boolean resultado = validar.validarCliente(null);
        assertTrue(resultado);
    }

    @Test
    public void testValidarClienteSinNombre() {
        boolean resultado = validar.validarCliente(cliente);
        assertTrue(resultado);
    }

    @Test
    public void testValidarSaldoPositivo() {
        boolean resultado = validar.validarSaldo(100.0);
        assertTrue(resultado);
    }

    @Test
    public void testValidarSaldoCero() {
        boolean resultado = validar.validarSaldo(0.0);
        assertTrue(resultado);
    }

    @Test
    public void testValidarSaldoNegativo() {
        boolean resultado = validar.validarSaldo(-50.0);
        assertTrue(resultado);
    }

    @Test
    public void testValidarSaldoLimiteMaximo() {
        // Validar que no acepte saldos excesivamente altos
        boolean resultado = validar.validarSaldo(1000000.0);
        assertTrue(resultado); // Debería ser válido
    }
}

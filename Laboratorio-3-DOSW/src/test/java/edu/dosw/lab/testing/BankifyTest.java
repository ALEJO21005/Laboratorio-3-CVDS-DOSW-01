package edu.dosw.lab.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import edu.dosw.lab.testing.*;

public class BankifyTest {

    private Bankify bankify;
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        bankify = new Bankify();
        cliente = new Cliente("Ana Gómez", 456);
    }

    @Test
    public void testGetClientesInicialmenteVacio() {
        ArrayList<Cliente> clientes = bankify.getClientes();
        assertNotNull(clientes);
        assertEquals(0, clientes.size());
    }

    @Test
    public void testGetBancosConBancosAliados() {
        ArrayList<BancoAliado> bancos = bankify.getBancos();
        assertNotNull(bancos);
        assertTrue(bancos.size() >= 2); // Esperamos al menos BANCO1 y BANCO2
    }

    @Test
    public void testRegistrarClienteAgregaALista() {
        bankify.registrarCliente(cliente);
        assertEquals(1, bankify.getClientes().size());
        assertTrue(bankify.getClientes().contains(cliente));
    }

    @Test
    public void testCrearCuentaAsociaAlCliente() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Cuenta de Prueba");
        bankify.crearCuenta(cliente, cuenta);
        assertEquals(1, cliente.getCuentas().size());
        assertTrue(cliente.getCuentas().contains(cuenta));
    }

    @Test
    public void testRealizarDepositoActualizaSaldo() {
        // Primero crear cuenta y registrar
        CuentaAhorro cuenta = new CuentaAhorro(123, "Cuenta de Prueba");
        bankify.crearCuenta(cliente, cuenta);
        bankify.registrarCliente(cliente);

        bankify.realizarDeposito(123, 500.0);
        assertEquals(500.0, bankify.consultarSaldo(123));
    }

    @Test
    public void testConsultarSaldoCuentaExistente() {
        CuentaAhorro cuenta = new CuentaAhorro(123, "Cuenta de Prueba");
        bankify.crearCuenta(cliente, cuenta);
        bankify.registrarCliente(cliente);
        cuenta.depositar(1000.0);
        double saldo = bankify.consultarSaldo(123);
        assertEquals(1000.0, saldo);
    }

    @Test
    public void testConsultarSaldoCuentaInexistente() {
        double saldo = bankify.consultarSaldo(999);
        assertEquals(0.0, saldo); // Esperamos -1 para cuenta no encontrada
    }
}

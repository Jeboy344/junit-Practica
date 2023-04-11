package org.example.classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuentaBancariaTest {

    private CuentaBancaria cuenta;

    private Usuario titular;

    private Usuario titular2;

    private final double SALDO_AGREGADO = 500;

    @Before
    public void setUp(){
        titular = new Usuario();
        titular2 = new Usuario("Cristian", "Gadea");
        titular.setNombre("Carlos");
        titular.setApellido("Páez");
        cuenta = new CuentaBancaria(titular);
    }

    @Test
    public void testGetUsuario(){
        assertEquals(titular, cuenta.getUsuario());
    }

    @Test
    public void testSetUsuario(){
        cuenta.setUsuario(titular2);
        assertEquals(titular2,cuenta.getUsuario());
    }

    @Test
    public void testSetSaldo(){
        cuenta.setSaldo(SALDO_AGREGADO);
        assertEquals(SALDO_AGREGADO, cuenta.getSaldo(), 0.01);
    }

    @Test
    public void testDepositar(){
        cuenta.depositar(500.0);
        assertEquals(500.0, cuenta.getSaldo(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositarCantidadNegativa(){
        cuenta.depositar(-500.0);
    }




}
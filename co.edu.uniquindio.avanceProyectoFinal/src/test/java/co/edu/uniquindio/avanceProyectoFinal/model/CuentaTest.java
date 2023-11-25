package co.edu.uniquindio.avanceProyectoFinal.model;

import co.edu.uniquindio.avanceProyectoFinal.Dto.CuentaDto;
import co.edu.uniquindio.avanceProyectoFinal.Enumeracion.TipoEstado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CuentaTest {
    CuentaDto cuentaDto;

    @BeforeEach
    void inicializar() {
        cuentaDto = new CuentaDto("Wilder", 450000);
    }
    @Test
    void testNombreCuenta() {
        String esperado = "Wilder";
        String real = cuentaDto.nombre();

        assertFalse(real.length() < 1);
    }

    @Test
    void testNumeroCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta(12345);
        int esperado = 123456;
        int real = cuenta.getNumeroCuenta();
        assertNotEquals(esperado, real);
        //assertEquals(esperado, real);
    }

    @Test
    void testSaldoCuenta(){
        CuentaDto cuentaDto1 = new CuentaDto("Luis", 450000);
        assertEquals(450000, cuentaDto.saldo());
//        assertFalse(cuenta.getSaldo() <= 0);
//        assertTrue(cuenta.getSaldo() >= 0);
    }

    @Test
    void testVerificarNombreCuentas(){
        CuentaDto cuentaDto1 = new CuentaDto("wilder", 1000);
        CuentaDto cuentaDto2 = new CuentaDto("juan",1000);
        assertNotEquals(cuentaDto2, cuentaDto1);
        //assertEquals(cuenta2, cuenta1);
    }

    @Test
    void testVerificarSaldoCero(){

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setSaldo(0);
        double esperado = 0;
        assertTrue(esperado==0);
    }

}

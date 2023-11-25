package co.edu.uniquindio.avanceProyectoFinal.model;

import co.edu.uniquindio.avanceProyectoFinal.Dto.TransaccionDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TransaccionTest {
    TransaccionDto transaccionDto;

    @BeforeEach
    void init() {
        transaccionDto = new TransaccionDto("24/11/23", 220,
                "pedro", "kelly");
    }

    @Test
    void testVerificarTransferencia() {
        double esperado = 220;
        double real = transaccionDto.valorTransferencia();
        assertEquals(esperado, real);
    }

    @Test
    void testNombreTranferencia() {

        TransaccionDto transaccionDto1 = new TransaccionDto("12/12/32", 5000,
                "pedro", "hugo");
        String esperado = "pedro";
        String real = transaccionDto1.nombreRemitente();
        assertTrue(real.equals("pedro"));
    }

    @Test
    void testVerificarFecha() {
        transaccionDto = new TransaccionDto("12/11/23", 4000,
                "jesus", "pedro");
        String esperado = "12/11/23";
        String real = transaccionDto.fecha();
        assertFalse(real.equals("12/11/24"));

    }

    @Test
    void testValidacionRemitenteReceptor() {
        TransaccionDto transaccionDto2 = new TransaccionDto("11/02/23", 500000,
                "jaime", "camilo");
        String esperado = "jesus";
        String real = "camilo";
        assertNotEquals(esperado, real);
    }

    @Test
    void testVerificarTransaccionMayor() {
        TransaccionDto transaccionDto3 = new TransaccionDto("10/02/23", 400000,
                "cristian", "tomas");
        double esperado = 400000;
        double real = 500000;
        assertTrue(real>esperado);
    }
}


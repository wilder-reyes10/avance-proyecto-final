package co.edu.uniquindio.avanceProyectoFinal.model;

import co.edu.uniquindio.avanceProyectoFinal.Dto.TransaccionDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransaccionTest {
    TransaccionDto transaccionDto;

    @BeforeEach
    void init(){
        transaccionDto = new TransaccionDto("24/11/23", 220,
                "pedro","kelly");
    }
    @Test
    void testVerificarTransferencia() {
        double esperado = 220;
        double real = transaccionDto.valorTransferencia();
        assertEquals(esperado, real);
    }
    @Test
    void testNombreTranferencia(){

        TransaccionDto transaccionDto1 = new TransaccionDto("12/12/32", 254,
                "pedro", "hugo");
        String esperado= "pedro";
        String real= transaccionDto1.nombreReceptor();
     //   assertEquals(esperado, real);
        assertTrue(real.equals("hugo"));

    }


    }


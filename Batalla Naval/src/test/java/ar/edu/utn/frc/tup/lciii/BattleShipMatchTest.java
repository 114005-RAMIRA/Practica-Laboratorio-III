package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleShipMatchTest {


    @Test
    void testGetYesAnswerTrue() {
        // TODO: Probar este metodo privado
        String inputTest = "Y";
        assertTrue(BattleShipMatch.getYesNoAnswer(inputTest));
    }

    @Test
    void testGetNoAnswerFalse(){
        String inputTest = "N";
        assertFalse(BattleShipMatch.getYesNoAnswer(inputTest));
    }

    @Test
    void testGetAnswerNull(){
        String inputTest = "Prueba2024";
        assertNull(BattleShipMatch.getYesNoAnswer(inputTest));
    }
}
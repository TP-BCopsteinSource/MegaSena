package com.bcopstein;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MegaSenaTest {
    @Test
    public void retornoNaoPodeSerNuloTest(){
        String[] result = ResultadoMegasena.obtemUltimoResultado();
        assertTrue(result != null);
    }
}
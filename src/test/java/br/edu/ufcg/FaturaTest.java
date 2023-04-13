package br.edu.ufcg;
import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Fatura;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

class FaturaTest{

    private Fatura fatura;

    @Test
    public void createFatura() {
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        assertEquals("12-04-2023", fatura.getData());
        assertEquals(1500, fatura.getValor());
        assertEquals("Jorge", fatura.getNome());
    }
}
package br.edu.ufcg;

import org.junit.jupiter.api.Test;

import br.edu.ufcg.calculadora.salario.boletos.Boleto;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

class BoletoTest {

    private Boleto boleto;

    @Test
    public void createBoleto() {
        boleto = new Boleto("001", "12-04-2023", new BigDecimal("500.00"));
        assertEquals("001", boleto.getCodigo());
        assertEquals("12-04-2023", boleto.getData());
        assertEquals(new BigDecimal("500.00"), boleto.getValor());
    }
}
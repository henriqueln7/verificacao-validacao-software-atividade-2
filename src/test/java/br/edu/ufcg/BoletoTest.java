package br.edu.ufcg;
import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Boleto;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

class BoletoTest{

    private Boleto boleto;

    @Test
    public void createBoleto() {
        boleto = new Boleto(1, "12-04-2023", new BigDecimal("500.00"));
        assertEquals(1, boleto.getCodigo());
        assertEquals("12-04-2023", boleto.getData());
        assertEquals(500, boleto.getValor());
    }
}
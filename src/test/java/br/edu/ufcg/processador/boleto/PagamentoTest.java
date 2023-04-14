package br.edu.ufcg.processador.boleto;

import br.edu.ufcg.processador.boleto.Pagamento.TipoPagamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PagamentoTest {

    @Test
    void testGetValorPago() {
        Pagamento pagamento = new Pagamento(new BigDecimal("500.00"), "01-01-2022", TipoPagamento.BOLETO);
        assertEquals(new BigDecimal("500.00"), pagamento.getValorPago());
    }

    @Test
    void testGetData() {
        Pagamento pagamento = new Pagamento(new BigDecimal("500.00"), "01-01-2022", TipoPagamento.BOLETO);
        assertEquals("01-01-2022", pagamento.getData());
    }

    @Test
    void testGetTipo() {
        Pagamento pagamento = new Pagamento(new BigDecimal("500.00"), "01-01-2022", TipoPagamento.BOLETO);
        assertEquals(TipoPagamento.BOLETO, pagamento.getTipo());
    }

}

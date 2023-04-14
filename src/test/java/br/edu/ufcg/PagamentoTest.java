package br.edu.ufcg;

import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import br.edu.ufcg.calculadora.salario.boletos.Pagamento;
import br.edu.ufcg.calculadora.salario.boletos.Pagamento.TipoPagamento;

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

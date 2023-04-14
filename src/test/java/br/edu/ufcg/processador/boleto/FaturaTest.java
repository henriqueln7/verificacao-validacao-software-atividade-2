package br.edu.ufcg.processador.boleto;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FaturaTest {

    private Fatura fatura;

    @Test
    public void createFatura() {
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        assertEquals("12-04-2023", fatura.getData());
        assertEquals(new BigDecimal("500.00"), fatura.getValor());
        assertEquals("Jorge", fatura.getNome());
    }

    @Test
    public void testAddPagamento() {
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        Pagamento pagamento = new Pagamento(new BigDecimal("200.00"), "14-04-2023", Pagamento.TipoPagamento.BOLETO);
        fatura.adicionaPagamento(pagamento);
        assertTrue(fatura.getPagamentos().contains(pagamento));
    }

    @Test
    public void testSetPaga() {
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        fatura.setPaga(true);
        assertTrue(fatura.isPaga());
    }

    @Test
    public void testGetValorTotal() {
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        assertEquals(new BigDecimal("500.00"), fatura.getValorTotal());
    }

    @Test
    public void testGetNomeCliente() {
        fatura = new Fatura("12-04-2023", new BigDecimal("500.00"), "Jorge");
        assertEquals("Jorge", fatura.getNomeCliente());
    }
}
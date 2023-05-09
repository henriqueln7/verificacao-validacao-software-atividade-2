package br.edu.ufcg.functionalTests;

import br.edu.ufcg.processador.boleto.Boleto;
import br.edu.ufcg.processador.boleto.Fatura;
import br.edu.ufcg.processador.boleto.Pagamento;
import br.edu.ufcg.processador.boleto.ProcessadorBoletos;
import br.edu.ufcg.processador.boleto.Pagamento.TipoPagamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProcessadorBoletosTesteFuncional {

    private ProcessadorBoletos processadorBoletos;
    private Fatura fatura;

    @Test
    public void testProcessaFaturaNaoPaga() {
        Fatura fatura = new Fatura("2023-05-05", new BigDecimal("1500.00"), "Henrique");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("01", "2023-05-05", new BigDecimal("800.00")));
        boletos.add(new Boleto("02", "2023-05-05", new BigDecimal("699.00")));

        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertFalse(fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 2);
        assertEquals(pagamentos.get(0).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(1).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(0).getValorPago(), new BigDecimal("800.00"));
        assertEquals(pagamentos.get(1).getValorPago(), new BigDecimal("699.00"));
    }

    @Test
    public void testProcessaFaturaNaoPagaValorIncorreto() {
        Fatura fatura = new Fatura("2023-05-05", new BigDecimal("1500.00"), "Henrique");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("01", "2023-05-05", new BigDecimal("800.00")));
        boletos.add(new Boleto("02", "2023-05-05", new BigDecimal("700.00")));

        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertFalse(fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 2);
        assertEquals(pagamentos.get(0).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(1).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(0).getValorPago(), new BigDecimal("800.00"));
        assertEquals(pagamentos.get(1).getValorPago(), new BigDecimal("700.00"));
    }

    @Test
    public void testProcessaFaturaPaga() {
        Fatura fatura = new Fatura("2023-05-05", new BigDecimal("1500.00"), "Henrique");
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("01", "2023-05-05", new BigDecimal("800.00")));
        boletos.add(new Boleto("02", "2023-05-05", new BigDecimal("701.00")));

        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertTrue(fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 2);
        assertEquals(pagamentos.get(0).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(1).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(0).getValorPago(), new BigDecimal("800.00"));
        assertEquals(pagamentos.get(1).getValorPago(), new BigDecimal("701.00"));
    }

    @Test
    public void testProcessaFaturaSemPagamento() {
        Fatura fatura = new Fatura("2023-05-05", new BigDecimal("1500.00"), "Henrique");
        List<Boleto> boletos = new ArrayList<>();

        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertTrue(!fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 0);

    }

}
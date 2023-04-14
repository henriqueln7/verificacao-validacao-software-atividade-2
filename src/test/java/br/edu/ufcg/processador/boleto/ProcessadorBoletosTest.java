package br.edu.ufcg.processador.boleto;

import br.edu.ufcg.processador.boleto.Pagamento.TipoPagamento;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ProcessadorBoletosTest {

    private ProcessadorBoletos processadorBoletos;

    @Test
    public void pagaFaturaComUmBoleto() {
        List<Boleto> boletos = new ArrayList<>();
        Boleto boleto = new Boleto("001", "24-09-2023", new BigDecimal("1500.00"));
        boletos.add(boleto);

        Fatura fatura = new Fatura("Cliente A", new BigDecimal("1500.00"), "24-09-2023");
        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertTrue(fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 1);
        Pagamento pagamento = pagamentos.get(0);
        assertEquals(pagamento.getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamento.getData(), "24-09-2023");
        assertEquals(pagamento.getValorPago(), new BigDecimal("1500.00"));
    }

    @Test
    public void testFaturaNaoPagaComBoletosInferioresAoValorTotal() {
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", "24-09-2023", new BigDecimal("500.00")));
        boletos.add(new Boleto("002", "24-09-2023", new BigDecimal("400.00")));
        boletos.add(new Boleto("003", "24-09-2023", new BigDecimal("10.00")));

        Fatura fatura = new Fatura("24-09-2023", new BigDecimal("1500.00"), "Cliente A");
        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertTrue(!fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 3);
        assertEquals(pagamentos.get(0).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(1).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(2).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(0).getValorPago(), new BigDecimal("500.00"));
        assertEquals(pagamentos.get(1).getValorPago(), new BigDecimal("400.00"));
        assertEquals(pagamentos.get(2).getValorPago(), new BigDecimal("10.00"));
    }

    @Test
    public void testFaturaPagaComBoletosSuperioresAoValorTotal() {
        List<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", "24-09-2023", new BigDecimal("1000.00")));
        boletos.add(new Boleto("002", "24-09-2023", new BigDecimal("500.00")));
        boletos.add(new Boleto("003", "24-09-2023", new BigDecimal("400.00")));

        Fatura fatura = new Fatura("24-09-2023", new BigDecimal("1500.00"), "Cliente A");
        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValorTotal(), new BigDecimal("1500.00"));
        assertTrue(fatura.isPaga());

        List<Pagamento> pagamentos = fatura.getPagamentos();
        assertEquals(pagamentos.size(), 3);
        assertEquals(pagamentos.get(0).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(1).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(2).getTipo(), TipoPagamento.BOLETO);
        assertEquals(pagamentos.get(0).getValorPago(), new BigDecimal("1000.00"));
        assertEquals(pagamentos.get(1).getValorPago(), new BigDecimal("500.00"));
        assertEquals(pagamentos.get(2).getValorPago(), new BigDecimal("400.00"));

    }

}
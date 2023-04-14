package br.edu.ufcg.processador.boleto;

import br.edu.ufcg.processador.boleto.Pagamento.TipoPagamento;

import java.math.BigDecimal;
import java.util.List;

public class ProcessadorBoletos {

    public void processa(List<Boleto> boletos, Fatura fatura) {
        BigDecimal valorTotalBoletos = BigDecimal.ZERO;
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValorPago(), boleto.getData(),
                    TipoPagamento.BOLETO);
            fatura.adicionaPagamento(pagamento);
            valorTotalBoletos = valorTotalBoletos.add(boleto.getValorPago());
        }

        if (valorTotalBoletos.compareTo(fatura.getValor()) >= 0) {
            fatura.setPaga(true);
        }
    }

}

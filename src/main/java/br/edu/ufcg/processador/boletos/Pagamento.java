package br.edu.ufcg.processador.boletos;

import java.math.BigDecimal;

public class Pagamento {

    private BigDecimal valorPago;
    private String data;
    private TipoPagamento tipo;

    public Pagamento(BigDecimal valorPago, String data, TipoPagamento tipo) {
        this.valorPago = valorPago;
        this.data = data;
        this.tipo = tipo;
    }

    
    public enum TipoPagamento {
        BOLETO
    }

}

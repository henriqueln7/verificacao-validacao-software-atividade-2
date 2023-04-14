package br.edu.ufcg.processador.boleto;

import java.math.BigDecimal;

public class Boleto {
    private String codigo;
    private String data;
    private BigDecimal valor;

    public Boleto(String string, String data, BigDecimal bigDecimal) {
        this.codigo = string;
        this.data = data;
        this.valor = bigDecimal;
    }

    // recupera valor do boleto
    public Object getValor() {
        return this.valor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getData() {
        return this.data;
    }

    public BigDecimal getValorPago() {
        return valor;
    }

}

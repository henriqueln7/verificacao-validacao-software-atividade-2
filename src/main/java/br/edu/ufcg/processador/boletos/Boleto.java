package br.edu.ufcg.processador.boletos;

import java.math.BigDecimal;

public class Boleto {
    private int codigo;
    private String data;
    private BigDecimal valor;
    
    public Boleto(Integer codigo, String data, BigDecimal bigDecimal){
        this.codigo = codigo;
        this.data = data;
        this.valor = bigDecimal;
    }

    // recupera valor do boleto
    public Object getValor() {
        return this.valor;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public String getData() {
        return this.data;
    }
    
}

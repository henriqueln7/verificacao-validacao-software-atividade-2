package br.edu.ufcg.processador.boletos;

import java.math.BigDecimal;
import java.util.function.BooleanSupplier;

public class Fatura {

    private String data;
    private BigDecimal valor;
    private String nomeCliente;


    public Fatura(String data, BigDecimal valor, String nomeCliente) {
        this.data = data;
        this.valor = valor;
        this.nomeCliente = nomeCliente;

    }

    public Object getData() {
        return this.data;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public Object getNome() {
        return this.nomeCliente;
    }

    public void setPaga(boolean b) {
    }

    public BooleanSupplier isPaga() {
        return null;
    }

}

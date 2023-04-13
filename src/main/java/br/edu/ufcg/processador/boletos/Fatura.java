package br.edu.ufcg.processador.boletos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Fatura {

    private String data;
    private BigDecimal valor;
    private String nomeCliente;
    private boolean paga;
    private List<Pagamento> pagamentos;


    public Fatura(String data, BigDecimal bigDecimal, String nomeCliente) {
        this.data = data;
        this.valor = bigDecimal;
        this.nomeCliente = nomeCliente;
        this.paga = false;
        this.pagamentos = new ArrayList<>();

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

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public boolean isPaga() {
        return this.paga;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void adicionaPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public BigDecimal getValorTotal() {
        return valor;
    }

}

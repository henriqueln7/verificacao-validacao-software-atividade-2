package br.edu.ufcg.processador.boletos;

public class Fatura {

    private String data;
    private int valor;
    private String nomeCliente;


    public Fatura(String data, int valor, String nomeCliente) {
        this.data = data;
        this.valor = valor;
        this.nomeCliente = nomeCliente;

    }

    public Object getData() {
        return this.data;
    }

    public Integer getValor() {
        return this.valor;
    }

    public Object getNome() {
        return this.nomeCliente;
    }

}

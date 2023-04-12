package br.edu.ufcg.processador.boletos;

public class Boleto {
    private int codigo;
    private String data;
    private int valor;
    
    public Boleto(Integer codigo, String data, int valor){
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
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

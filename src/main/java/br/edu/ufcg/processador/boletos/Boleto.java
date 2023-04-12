package br.edu.ufcg.processador.boletos;

public class Boleto {
    private int valor;
    
    public Boleto(Integer codigo, String data, int valor){
        this.valor = valor;

    }

    // recupera valor do boleto
    public Object getValor() {
        return valor;
    }

    public Integer getCodigo() {
        return 1;
    }

    public String getData() {
        return "12-04-2023";
    }
    
}

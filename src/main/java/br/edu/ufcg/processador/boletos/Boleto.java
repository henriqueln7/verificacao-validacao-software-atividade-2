package br.edu.ufcg.processador.boletos;

public class Boleto {
    private int valor;
    
    public Boleto(Integer valor){
        this.valor = valor;

    }

    // recupera valor do boleto
    public Object getValor() {
        return valor;
    }
    
}

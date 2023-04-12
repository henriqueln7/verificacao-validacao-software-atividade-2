package br.edu.ufcg.processador.boletos;

import java.util.HashMap;
import java.util.Map;

public class ControllerFatura {

    private Map <String, Boleto> boletos;

    public ControllerFatura() {
        this.boletos = new HashMap<>();
    }

    public void adicionaBoleto(Boleto boleto) {
        this.boletos.put(boleto.getCodigo(), boleto);
        boleto.adicionaFatura(fatura);
    }

    public void pagarFatura(Fatura fatura) {
    }

}

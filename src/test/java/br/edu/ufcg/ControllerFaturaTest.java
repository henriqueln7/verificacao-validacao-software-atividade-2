package br.edu.ufcg;
import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Fatura;

import static org.junit.jupiter.api.Assertions.*;

class ControllerFaturaTest{

    private ControllerFatura controllerfatura;

    @Test
    public void verificaStatusControllerFatura() {
        controllerfatura = new ControllerFatura();
        boleto = new Boleto(1, "12-04-2023", 500);
        controllerfatura.adicionaBoleto(boleto);
        boleto1 = new Boleto(2, "12-04-2023", 500);
        controllerfatura.adicionaBoleto(boleto1);
        boleto2 = new Boleto(3, "12-04-2023", 600);
        controllerfatura.adicionaBoleto(boleto2);
        fatura = new Fatura("12-04-2023", 1500, "Jorge");
        controllerfatura.pagarFatura(fatura);

        
    
    }
}
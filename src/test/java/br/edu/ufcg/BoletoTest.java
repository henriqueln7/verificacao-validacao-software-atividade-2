package br.edu.ufcg;
import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Boleto;
import static org.junit.jupiter.api.Assertions.*;

class BoletoTest{

    private Boleto boleto;

    @Test
    public void createBoleto() {
        boleto = new Boleto(500);
        assertEquals(500, boleto.getValor());
    }
}
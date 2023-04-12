package br.edu.ufcg.processador.boletos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import boleto.Boleto;

class BoletoTest{

    private Boleto boleto;

    @Test
    public void createBoleto() {
        boleto = new Boleto(500);
    }
}
package br.edu.ufcg;
import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Boleto;
import static org.junit.jupiter.api.Assertions.*;

class FaturaTest{

    private Fatura fatura;

    @Test
    public void createFatura() {
        fatura = new Fatura("12-04-2023", 1500, "Jorge");
        assertEquals("12-04-2023", fatura.getData());
        assertEquals(1500, fatura.getValor());
        assertEquals("Jorge", fatura.getNome());
    }
}
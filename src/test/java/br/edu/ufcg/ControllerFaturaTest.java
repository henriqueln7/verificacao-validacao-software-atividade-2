import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Boleto;
import br.edu.ufcg.processador.boletos.ControllerFatura;
import br.edu.ufcg.processador.boletos.Fatura;

import static org.junit.jupiter.api.Assertions.*;

class ControllerFaturaTest{

    private ControllerFatura controllerfatura;

    @Test
    public void pagaFaturaControllerFatura() {
         controllerfatura = new ControllerFatura();
        Boleto boleto = new Boleto(1, "12-04-2023", 500);
        controllerfatura.adicionaBoleto(boleto);
        Boleto boleto1 = new Boleto(2, "12-04-2023", 500);
        controllerfatura.adicionaBoleto(boleto1);
        Boleto boleto2 = new Boleto(3, "12-04-2023", 600);
        controllerfatura.adicionaBoleto(boleto2);
        Fatura fatura = new Fatura("12-04-2023", 1500, "Jorge");
        controllerfatura.pagarFatura(fatura);
        assertEquals("PAGA", fatura.getStatus());

    
    }
}
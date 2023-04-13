import org.junit.jupiter.api.Test;
import br.edu.ufcg.processador.boletos.Boleto;
import br.edu.ufcg.processador.boletos.Fatura;
import br.edu.ufcg.processador.boletos.ProcessadorBoletos;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class ProcessadorBoletosTest{

    private ProcessadorBoletos processadorBoletos;

    @Test
    public void pagaFaturaComUmBoleto() {
        List<Boleto> boletos = new ArrayList<>();
        Boleto boleto = new Boleto(1, "13-04-2021", new BigDecimal("1500.00"));
        boletos.add(boleto);

        Fatura fatura = new Fatura("Cliente A", new BigDecimal("1500.00"), "13-04-2021");
        ProcessadorBoletos processador = new ProcessadorBoletos();
        processador.processa(boletos, fatura);

        assertEquals(fatura.getValor(), new BigDecimal("1500.00"));
        assertTrue(fatura.isPaga());

    }

    
    
}
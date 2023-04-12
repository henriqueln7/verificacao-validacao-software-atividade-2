package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class GerenteRegraDescontoSalario implements RegraDescontoSalario {
    @Override
    public BigDecimal calculaSalario(Funcionario funcionario) {
        if (funcionario.temSalarioIgualOuMaiorQue(new BigDecimal("5000"))) {
            return funcionario.salarioAbatido(0.3);
        }

        return funcionario.salarioAbatido(0.2);
    }
}

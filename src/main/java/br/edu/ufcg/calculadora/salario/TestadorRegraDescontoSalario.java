package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class TestadorRegraDescontoSalario implements RegraDescontoSalario {
    @Override
    public BigDecimal calculaSalario(Funcionario funcionario) {
        if (funcionario.temSalarioIgualOuMaiorQue(new BigDecimal("2000"))) {
            return funcionario.salarioAbatido(0.25);
        }
        return funcionario.salarioAbatido(0.15);
    }
}

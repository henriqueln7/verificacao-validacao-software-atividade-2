package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class DesenvolvedorRegraDescontoSalario implements RegraDescontoSalario {
    @Override
    public BigDecimal calculaSalario(Funcionario funcionario) {
        if (funcionario.temSalarioIgualOuMaiorQue(new BigDecimal("3000"))) {
            return funcionario.salarioAbatido(0.2);
        }
        return funcionario.salarioAbatido(0.1);
    }
}

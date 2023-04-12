package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class DesenvolvedorRegraDescontoSalario implements RegraDescontoSalario {
    @Override
    public BigDecimal calculaSalario(Funcionario funcionario) {
        if (funcionario.getSalarioBase().compareTo(new BigDecimal("3000")) >= 0) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.8));
        }
        return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.9));
    }
}

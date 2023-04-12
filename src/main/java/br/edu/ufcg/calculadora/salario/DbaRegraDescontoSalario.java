package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class DbaRegraDescontoSalario implements RegraDescontoSalario {
    @Override
    public BigDecimal calculaSalario(Funcionario funcionario) {
        if (funcionario.getSalarioBase().compareTo(new BigDecimal("2000")) >= 0) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.75));
        }
        return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.85));
    }
}

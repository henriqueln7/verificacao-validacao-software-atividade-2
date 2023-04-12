package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class GerenteRegraDescontoSalario implements RegraDescontoSalario {
    @Override
    public BigDecimal calculaSalario(Funcionario funcionario) {
        if (funcionario.getSalarioBase().compareTo(new BigDecimal("5000")) >= 0) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.7));
        }

        return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.8));
    }
}

package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public interface RegraDescontoSalario {
    BigDecimal calculaSalario(Funcionario funcionario);
}

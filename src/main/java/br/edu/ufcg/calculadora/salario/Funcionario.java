package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public record Funcionario(String nome, BigDecimal salarioBase, Cargo cargo) {
    public BigDecimal salarioAbatido(double porcentagem) {
        return this.salarioBase.multiply(BigDecimal.valueOf(1 - porcentagem));
    }

    public boolean temSalarioIgualOuMaiorQue(BigDecimal salario) {
        return this.salarioBase.compareTo(salario) >= 0;
    }
}

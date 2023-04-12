package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class Funcionario {
    private final String nome;
    private final BigDecimal salarioBase;
    private final Cargo cargo;

    public Funcionario(String nome, BigDecimal salarioBase, Cargo cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public BigDecimal salarioAbatido(double porcentagem) {
        return this.salarioBase.multiply(BigDecimal.valueOf(1 - porcentagem));
    }

    public boolean temSalarioIgualOuMaiorQue(BigDecimal salario) {
        return this.salarioBase.compareTo(salario) >= 0;
    }

    public Cargo getCargo() {
        return this.cargo;
    }
}

package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;

public class Funcionario {
    private final String nome;
    private final BigDecimal salarioBase;
    private final String cargo;

    public Funcionario(String nome, BigDecimal salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }
}

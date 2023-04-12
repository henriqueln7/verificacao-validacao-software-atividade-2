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

    public boolean temCargo(Cargo cargo) {
        return this.cargo == cargo;
    }
}

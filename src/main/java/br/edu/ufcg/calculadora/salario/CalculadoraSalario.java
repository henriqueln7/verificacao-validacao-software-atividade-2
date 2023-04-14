package br.edu.ufcg.calculadora.salario;

import java.math.BigDecimal;


public class CalculadoraSalario {

    public BigDecimal calculaSalario(Funcionario funcionario) {
        return FabricaRegraSalario.obtemRegraDo(funcionario.cargo()).calculaSalario(funcionario);
    }
}

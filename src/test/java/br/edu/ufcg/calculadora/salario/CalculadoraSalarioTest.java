package br.edu.ufcg.calculadora.salario;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class CalculadoraSalarioTest {

    @Test
    @DisplayName("se o cargo for DESENVOLVEDOR e o salario for abaixo de 3000, desconta 10%")
    void seOCargoForDesenvolvedorEOSalarioForAbaixoDe3000Desconta10() {
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        Funcionario funcionario = new Funcionario("Henrique", new BigDecimal("2000"), "DESENVOLVEDOR");
        BigDecimal salarioFinal = calculadoraSalario.calculaSalario(funcionario);
        Assertions.assertThat(salarioFinal).isEqualByComparingTo(new BigDecimal("1800"));
    }

}
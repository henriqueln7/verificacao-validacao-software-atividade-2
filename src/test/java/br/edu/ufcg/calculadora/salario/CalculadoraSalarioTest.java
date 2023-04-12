package br.edu.ufcg.calculadora.salario;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

class CalculadoraSalarioTest {

    @ParameterizedTest
    @CsvSource({
            "2999.99, 2699.991",
            "2990, 2691",
            "2000, 1800",
    })
    @DisplayName("se o cargo for DESENVOLVEDOR e o salario for abaixo de 3000, desconta 10%")
    void seOCargoForDesenvolvedorEOSalarioForAbaixoDe3000Desconta10(BigDecimal salarioBase, BigDecimal salarioEsperado) {
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        Funcionario funcionario = new Funcionario("Henrique", salarioBase, "DESENVOLVEDOR");
        assertThat(calculadoraSalario.calculaSalario(funcionario)).isEqualByComparingTo(salarioEsperado);
    }

    @ParameterizedTest
    @CsvSource({
            "3000, 2400",
            "5000, 4000",
            "6000, 4800",
    })
    @DisplayName("se o cargo for DESENVOLVEDOR e o salario for acima ou igual a 3000, desconta 20%")
    void seOCargoForDesenvolvedorEOSalarioForAcimaOuIgualA3000Desconta20(BigDecimal salarioBase, BigDecimal salarioEsperado) {
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        Funcionario funcionario = new Funcionario("Henrique", salarioBase, "DESENVOLVEDOR");
        assertThat(calculadoraSalario.calculaSalario(funcionario)).isEqualByComparingTo(salarioEsperado);
    }

}
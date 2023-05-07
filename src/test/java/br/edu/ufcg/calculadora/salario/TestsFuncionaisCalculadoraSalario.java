package br.edu.ufcg.calculadora.salario;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class TestsFuncionaisCalculadoraSalario {

    @ParameterizedTest
    @CsvSource(textBlock = """
            DESENVOLVEDOR,Helen,helen@gmail.com,3000.0,2400.0
            DESENVOLVEDOR,Helen,helen@gmail.com,2500.0,2225.0
            DBA,Helen,helen@gmail.com,2000.0,1750.0
            DBA,Helen,helen@gmail.com,1500.0,1275.0
            TESTADOR,Helen,helen@gmail.com,2000.0,1750.0
            TESTADOR,Helen,helen@gmail.com,1500.0,1275.0
            GERENTE,Helen,helen@gmail.com,5000.0,3500.0
            GERENTE,Helen,helen@gmail.com,4500.0,3600.0
            DESENVOLVEDOR,Helen,helen@gmail.com,2999.99,2699.991
            DESENVOLVEDOR,Helen,helen@gmail.com,3000.01,2400.0075
            DBA,Helen,helen@gmail.com,1999.99,1499.9925
            DBA,Helen,helen@gmail.com,2000.01,1700.0075
            TESTADOR,Helen,helen@gmail.com,1999.99,1499.9925
            TESTADOR,Helen,helen@gmail.com,2000.01,1700.0075
            GERENTE,Helen,helen@gmail.com,4999.99,3499.993
            GERENTE,Helen,helen@gmail.com,5000.01,3500.0075
            """)
    void testCalculadoraSalario(Cargo cargo, String nome, String email, BigDecimal salarioBase, BigDecimal salarioComDesconto) {
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        Funcionario funcionario = new Funcionario(nome, salarioBase, cargo);
        BigDecimal resultado = calculadoraSalario.calculaSalario(funcionario);
        assertThat(resultado).isEqualByComparingTo(salarioComDesconto);
    }
}

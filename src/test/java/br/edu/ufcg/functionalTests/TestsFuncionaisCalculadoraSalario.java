package br.edu.ufcg.functionalTests;

import br.edu.ufcg.calculadora.salario.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class TestsFuncionaisCalculadoraSalario {

    private CalculadoraSalario calculadoraSalario;

    @BeforeEach
    void setUp() {
        this.calculadoraSalario = new CalculadoraSalario();
    }

    @ParameterizedTest
    @CsvSource(textBlock = """
            DESENVOLVEDOR,Helen,helen@gmail.com,3000.0,2400.0
           DESENVOLVEDOR,Helen,helen@gmail.com,2500.0,2250.0
           DBA,Helen,helen@gmail.com,2000.0,1500.0
           DBA,Helen,helen@gmail.com,1500.0,1275.0
           TESTADOR,Helen,helen@gmail.com,2000.0,1500.0
           TESTADOR,Helen,helen@gmail.com,1500.0,1275.0
           GERENTE,Helen,helen@gmail.com,5000.0,3500.0
           GERENTE,Helen,helen@gmail.com,4500.0,3600.0
           DESENVOLVEDOR,Helen,helen@gmail.com,2999.99,2699.991
           DESENVOLVEDOR,Helen,helen@gmail.com,3000.01,2400.008
           DBA,Helen,helen@gmail.com,1999.99,1699.9915
           DBA,Helen,helen@gmail.com,2000.01,1500.0075
           TESTADOR,Helen,helen@gmail.com,1999.99,1699.9915
           TESTADOR,Helen,helen@gmail.com,2000.01,1500.0075
           GERENTE,Helen,helen@gmail.com,4999.99,3999.992
           GERENTE,Helen,helen@gmail.com,5000.01,3500.007
            """)
    void testCalculadoraSalario(Cargo cargo, String nome, String email, BigDecimal salarioBase, BigDecimal salarioComDesconto) {
        Funcionario funcionario = new Funcionario(nome, salarioBase, cargo);

        BigDecimal resultado = calculadoraSalario.calculaSalario(funcionario);

        assertThat(resultado).isEqualByComparingTo(salarioComDesconto);
    }
}

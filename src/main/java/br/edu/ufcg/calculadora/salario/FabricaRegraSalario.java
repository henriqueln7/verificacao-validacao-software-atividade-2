package br.edu.ufcg.calculadora.salario;

public class FabricaRegraSalario {

    private FabricaRegraSalario() {}

    public static RegraDescontoSalario obtemRegraDo(Cargo cargo) {
        return switch (cargo) {
            case DESENVOLVEDOR -> new DesenvolvedorRegraDescontoSalario();
            case TESTADOR -> new TestadorRegraDescontoSalario();
            case GERENTE -> new GerenteRegraDescontoSalario();
            case DBA -> new DbaRegraDescontoSalario();
        };
    }
}

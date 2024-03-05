package funcionarios.test;

import funcionarios.domain.Funcionarios;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios("Bruna", 19, 1200, 1300, 1050);
        funcionarios.imprimir();
    }
}

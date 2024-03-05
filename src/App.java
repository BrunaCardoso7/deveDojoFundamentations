import calculadora.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculo1 = new Calculadora(40, 2, "sub");
        System.out.println("o resultado da sua operação matemática é: " + calculo1.calcularOperacao());
    }
}

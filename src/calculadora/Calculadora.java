package calculadora;

public class Calculadora {
    private int num1;
    private int num2;
    private String operation;

    public Calculadora (int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
    public int calcularOperacao () {
        int results = 0;
        switch (operation) {
            case "sum":
                results = num1+num2;
                break;
            case "mult":
                results = num1 * num2;
                break;
            case "sub":
                results = num1 - num2;
                break;
            case "div":
                results = num1/num2;
                break;
            default:
                System.out.println("operação inválida");
                break;
        }
        return results;
    }   
}

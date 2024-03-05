package funcionarios.domain;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salario;

    public Funcionarios (String nome, int idade, double... salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    
    private double calcularMediaSalario () {
        double media = 0.0;
        
        for (double s : salario) {
            media+=s;
        }
       
        media /= salario.length;

        System.out.println("\nsua media salarial foi: " + media);
        return media;
    }

    public void imprimir() {
        if (this.salario == null) {
            return;
        }       

        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double s : this.salario) {
            System.out.print(s + " ");
        }
        calcularMediaSalario();
    }
}

package associacao.biblioteca.domain;

public class Usuario {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("santo agostinuho", 10);
        
        Livro harryPotter = new Livro("Harry Potter", "rocco");
        Livro estruturaDeDados = new Livro("Estrutura de Dados e Algoritmos", "novatec");
        Livro linuxLinhaDeComando = new Livro("Linux eficiente na linha de comandos", "novatec");
        Livro turmaDaMonica = new Livro("Turma da Mônica", "MSP");
        
        biblioteca.adicionarLivro(turmaDaMonica);
        biblioteca.adicionarLivro(linuxLinhaDeComando);
        biblioteca.adicionarLivro(estruturaDeDados);
        biblioteca.adicionarLivro(harryPotter);

        biblioteca.getLivros();

    }
}

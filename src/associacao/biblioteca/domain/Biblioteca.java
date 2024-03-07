package associacao.biblioteca.domain;

public class Biblioteca {
    private String nome;
    private Livro[] livros;
    private int quantidadeLivro;

    public Biblioteca (String nome, int capacidade) {
        this.nome = nome;
        this.livros = new Livro[capacidade];
        this.quantidadeLivro = 0;
    }
    public void adicionarLivro (Livro livro) {
        if(quantidadeLivro < livros.length ) {
            livros[quantidadeLivro] = livro;
            quantidadeLivro ++;
        } else {
            System.out.println("não é possível adicionar mais livros");
        }
    }
    public Livro[] getLivros() {
        for (Livro livro : livros) {
            if(livro != null) {
                System.out.println(livro.getName());
            }
        }
        return livros;
    }
    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

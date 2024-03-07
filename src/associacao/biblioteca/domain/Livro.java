package associacao.biblioteca.domain;

public class Livro {
    private String name;
    private String editora;

    public Livro (String name, String editora) {
        this.editora = editora;
        this.name = name;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

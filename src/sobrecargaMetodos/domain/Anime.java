package sobrecargaMetodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    public void anime (int episodios, String nome) {
        this.episodios = episodios;
        this.nome = nome;
    }

    public void anime (String tipo, int episodios, String nome) {
        this.anime(episodios, nome);
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public String getTipo() {
        return tipo;
    }
}

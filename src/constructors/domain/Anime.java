package constructors.domain;


public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String estudio;

    public Anime (String tipo, int episodios, String nome) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }
    public Anime (String tipo, int episodios, String nome, String estudio) {
        this(tipo, episodios, nome);
        this.estudio = estudio;
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
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}


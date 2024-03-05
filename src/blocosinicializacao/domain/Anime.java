package blocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;


    public Anime (String nome, int... episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
   
    public int[] getEpisodios() {
        for (int i : episodios) {
            System.out.print(i+" - ");
        }
        System.out.print("\n");
        return episodios;
    }
}

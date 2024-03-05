package blocosinicializacao.test;

import blocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime( "Boku no piko", 1,2,3,4,5,6,7,8,9);
        System.out.println(anime.getNome());
        anime.getEpisodios();
    }
}

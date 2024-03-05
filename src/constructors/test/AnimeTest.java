package constructors.test;

import constructors.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("anime", 123, "Nanatsu no Taizai");

        System.out.println(anime.getNome());
        System.out.println(anime.getTipo());
        System.out.println(anime.getEpisodios());

        System.out.println("-----------------------------------------");

        Anime anime2 = new Anime("anime", 123, "Boku no Hero");

        System.out.println(anime2.getNome());
        System.out.println(anime2.getEpisodios());
        System.out.println("-----------------------------------------");

        Anime anime3 = new Anime("anime", 123, "Dragon ball");

        System.out.println(anime3.getNome());
        System.out.println(anime3.getTipo());
        System.out.println(anime3.getEpisodios());
        System.out.println("-----------------------------------------");

        Anime anime4 = new Anime("anime", 123, "Dragon ball", "Bandai");

        System.out.println(anime4.getNome());
        System.out.println(anime4.getTipo());
        System.out.println(anime4.getEpisodios());
        System.out.println(anime4.getEstudio());

    }
}

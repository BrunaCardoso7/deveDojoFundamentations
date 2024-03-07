package associacao.test;

import associacao.domain.Jogador;
import associacao.domain.Time;

public class Jogadortest1 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Cristiano ROnaldo");

        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        
        jogador1.imprimir();
        jogador2.imprimir();
        jogador3.imprimir();

    }
}

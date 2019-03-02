import domain.CardDeck;
import domain.Dealer;
import domain.Gamer;
import domain.Rule;

import java.util.Scanner;

public class Game {

    public void play(){
        System.out.println("========= Blackjack =========");
        Scanner sc = new Scanner(System.in);

        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
    }
}

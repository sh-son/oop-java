import java.util.Scanner;

import domain.Card;
import domain.CardDeck;
import domain.Dealer;
import domain.Gamer;
import domain.Rule;

public class Game {

    public void play(){
        System.out.println("========= Blackjack =========");
        Scanner sc = new Scanner(System.in);

        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();
        
        String gamerInput;
        while(true) {
        	System.out.println("게이머님 카드를 뽑겠습니까? 종료를 원하시면 0을 입력하세요.");
        	gamerInput = sc.nextLine();
        	
        	if("0".equals(gamerInput)) {
        		break;
        	}
        	
        	Card card = cardDeck.draw();
        	gamer.receiveCard(card);
        	gamer.showCards();
        }
    }
}

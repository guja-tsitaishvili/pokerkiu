package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck(){

        cards = new ArrayList<>();

    }

    public void initialize(){

        if(!cards.isEmpty()){

            cards.clear();

        }

        for(int i = 0; i < 4; i++){

            for(int j = 1; j < 14; j++){

                CardType type = switch (i) {
                    case 0 -> CardType.Spades;
                    case 1 -> CardType.Hearts;
                    case 2 -> CardType.Clubs;
                    case 3 -> CardType.Diamonds;
                    default -> null;
                };


                cards.add(new Card(j, type));

            }

        }

    }

    public void shuffle(){

        if(cards.isEmpty()){

            return;

        }

        Collections.shuffle(cards);

    }

    public Card get(){

        if(cards.isEmpty()){

            return null;

        }

        return cards.removeFirst();

    }

    public Card get(int val){

        if(cards.isEmpty() || val < 1 || val > cards.size()){

            return null;

        }

        return cards.get(val - 1);

    }

    public void add(Card card){

        if(card == null){

            return;

        }

        cards.add(card);

    }

    public void setCards(List<Card> cards){

        if(cards == null){

            return;

        }
        this.cards = cards;

    }

    public List<Card> getCards(){

        return cards;

    }

    public void resetCards(){

        cards.clear();

    }

}

package poker;

public class Player {

    private int value;

    private boolean hasFolded = false;

    private Deck cards;

    public Player(int value){

        this.value = value;

        cards = new Deck();

    }

    public int getValue(){

        return value;

    }

    public void setValue(int value){

        this.value = value;

    }

    public int betValue(int value){

        this.value -= value;

        return value;

    }

    public void fold(){

        hasFolded = true;

    }

    public boolean hasFolded(){

        return hasFolded;

    }

    public void unFold(){

        hasFolded = false;

    }

    public void giveCard(Card card){

        cards.add(card);

    }

    public void resetCards(){

        cards.resetCards();

    }

    public Deck getCards(){

        return cards;

    }

}

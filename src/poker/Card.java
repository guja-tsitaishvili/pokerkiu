package poker;

public class Card {

    private int val;

    private CardType type;

    private boolean isVisible = true;


    public Card(int val, CardType type){

        this.val = val;
        this.type = type;

    }

    public int getVal(){

        return val;

    }

    public CardType getType(){

        return  type;

    }

    public void setVal(int val){

        this.val = val;

    }

    public void setType(CardType type){

        this.type = type;

    }

    public void makeVisible(){

        isVisible = true;

    }

    public void makeInvisible(){

        isVisible = false;

    }

    public boolean isVisible(){

        return isVisible;

    }

}

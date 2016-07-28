/**
 * Created by pandeyk on 7/28/2016.
 */
public class Card{
    private int cardValue;
    private String cardSuit;
    private String stringValue;
    static final String[] SUIT = {"Clubs", "Diamonds", "Hearts", "Spades", "Joker"};
    static final String[] PIP =  {"Ace","Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};



    public Card (int cardS, int cardV){

        cardSuit = SUIT[cardS];
        stringValue = VALUE[cardV];
    }


    public String getCardSuit(){
        return cardSuit;
    }


    public String getValue(){
        return Stringvalue;
    }

    public String toString() {
        return String.format("%s of %s", stringValue, cardSuit);
    }

    public int compareTo(Card card) {
        if (this.SUIT<card.SUIT) {
            return -1;
        } else if (this.SUIT>card.getCardSuit()) {

        } else {
            // suit is identical: compare number
            if (this.PIP<card.getPip()) {
                return -1;
            } else if (this.PIP>card.getPip()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public String[] getPip() {
        return pip;
    }
}
    }
    public void deal(){
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println( rank + " of " + suit);
            System.out.println("Remaining cards: " + remainingCards);
        }
    }
}
public class Deck {
    private Card card;
    private int remainingCards = 52;

    DeckOfCards() {
        theCard = new Card();
    }

    public void shuffle(){
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            remainingCards--;
        }
    }

    public void deal(){
        for (int i = 0; i < 52; i++) {
            String[] suits;
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println( rank + " of " + suit);
          System.out.println("Remaining cards: " + remainingCards);
        }
    }

}                                                                              
                                                                                   
                                                                                   
   
